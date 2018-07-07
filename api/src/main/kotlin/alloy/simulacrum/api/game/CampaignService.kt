package alloy.simulacrum.api.game

import alloy.simulacrum.api.Page
import alloy.simulacrum.api.Pageable
import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.UserService
import alloy.simulacrum.api.user.Users
import alloy.simulacrum.api.user.notification.NotificationDTO
import alloy.simulacrum.api.user.notification.NotificationService
import alloy.simulacrum.api.withPageable
import org.jetbrains.exposed.sql.and
import org.jetbrains.exposed.sql.or
import org.jetbrains.exposed.sql.select
import org.joda.time.DateTime
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.UUID.randomUUID
import java.util.concurrent.ConcurrentHashMap

@Service
class CampaignService(val notificationService: NotificationService, val userService: UserService) {

    @Transactional(readOnly = true)
    fun findAllActiveCampaigns(user: User): List<CampaignSummaryDTO> {
        return Campaigns.leftJoin(CampaignPlayers)
                .slice(Campaigns.columns)
                .select { ((CampaignPlayers.player eq user.id) or (Campaigns.creator eq user.id)) and Campaigns.archived.eq(false) }
                .orderBy(CampaignPlayers.lastAccessed to false)
                .map { Campaign.wrapRow(it) }
                .map { CampaignSummaryDTO(it) }
    }

    @Transactional
    fun create(user: User, campaignDTO: CampaignDTO): CampaignDTO {
        val currentUser = User.findById(user.id)!!

        val newCampaign = Campaign.new {
            name = campaignDTO.name
            creator = currentUser
            archived = campaignDTO.archived ?: false
        }

        return CampaignDTO(newCampaign)
    }

    // TODO validate user can update this campaign
    @Transactional
    fun update(user: User, campaignDTO: CampaignDTO): CampaignDTO {

        val campaign = Campaign.find {
            Campaigns.id eq campaignDTO.id
        }.forUpdate().first()

        campaign.name = campaignDTO.name
        campaign.archived = campaignDTO.archived ?: false
        if (campaignDTO.playerIds != null) {
            val players = User.wrapRows(Users.select { Users.id.inList(campaignDTO.playerIds!!) })
            campaign.players = players
        }
        return CampaignDTO(campaign)
    }

    @Transactional
    fun archive(user: User, campaignId: Long) {
        val campaign = Campaign.find {
            Campaigns.creator eq user.id and (Campaigns.id eq campaignId)
        }.forUpdate().first()

        campaign.archived = true
    }

    @Transactional
    fun getCampaign(campaignId: Long): CampaignDTO {
        val campaign = Campaign.find {
            Campaigns.id eq campaignId
        }.first()

        return CampaignDTO(campaign)
    }

    @Transactional
    fun findConfig(playerId: Long, campaignId: Long): CampaignDTO {
        val campaign = Campaign.find {
            Campaigns.id eq campaignId
        }.first()

        // TODO Should this change
        if(campaign.creator.id.value == playerId) {
            return CampaignDTO(campaign)
        }

        val campaignPlayer = CampaignPlayer.find {
            CampaignPlayers.player eq playerId and(CampaignPlayers.campaign eq campaignId)
        }.forUpdate().first()
        campaignPlayer.lastAccessDate = DateTime.now()

        return CampaignDTO(campaign, campaignPlayer)
    }

    @Transactional(readOnly = true)
    fun findAllCampaigns(pageable: Pageable): Page<CampaignDTO> {
        val campaigns = Campaigns.
                withPageable(pageable)
                .map { Campaign.wrapRow(it) }
                .map { CampaignDTO(it) }

        // TODO this doesn't take into account the total number of filtered records
        val total = Campaign.all().count()

        return Page(campaigns, total, pageable.offset, pageable.limit)
    }

    fun userCanAccess(user: User, campaignDTO: CampaignDTO): Boolean {
        // TODO check for if user is a player
        return campaignDTO.creator == user.id.value
    }

    // TODO check if user can invite player
    @Transactional
    fun invitePlayer(user: User, campaignInviteDTO: CampaignController.CampaignInviteDTO): NotificationDTO {
        val toUser = userService.loadUserByUsername(campaignInviteDTO.username) as User
        val campaign = getCampaign(campaignInviteDTO.campaignId)

        val token = saveInvite(campaignInviteDTO)

        // TODO prevent duplication invites
        return notificationService.createInvitationNotification(
                to = toUser,
                toMessage = user.userName + " invited you to their campaign \"" + campaign.name + "\"",
                toToken = token,
                toLinkMessage = "Join"
        )
    }

    private val map = ConcurrentHashMap<String, CampaignController.CampaignInviteDTO>()

    private fun saveInvite(campaignInviteDTO: CampaignController.CampaignInviteDTO): String {
        // TODO persist invite to DB
        val token = randomUUID().toString()
        map.put(token, campaignInviteDTO)
        return token
    }

    @Transactional
    fun acceptInvite(user: User, token: String): CampaignSummaryDTO {
        // TODO update to use DB
        val invite = map[token]!!
        if(user.userName != invite.username) {
            throw IllegalStateException()
        }
        map.remove(token)

        val newCampaign = Campaign.find {
            Campaigns.id eq invite.campaignId
        }.first()

        CampaignPlayer.new {
            campaign = newCampaign.id
            player = user.id
        }

        return CampaignSummaryDTO(newCampaign)
    }

    @Transactional
    fun declineInvite(user: User, token: String) {
        // TODO update to use DB
        if(!map.containsKey(token)) {
            throw IllegalStateException()
        }
        val invite = map[token]!!
        if(user.userName != invite.username) {
            throw IllegalStateException()
        }
        map.remove(token)

        // TODO Send a message to the creator with decline

    }
}
