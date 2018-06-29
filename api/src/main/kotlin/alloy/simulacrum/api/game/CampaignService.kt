package alloy.simulacrum.api.game

import alloy.simulacrum.api.*
import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.Users
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import org.joda.time.DateTime
import org.springframework.stereotype.Service
import javax.sql.DataSource

@Service
class CampaignService(val dataSource: DataSource) {
    // TODO replace usage with findAllCampaigns
    fun findAllActiveCampaigns(user: User): List<CampaignSummaryDTO> {
        Database.connect(dataSource)
        return transaction {
            logger.addLogger(StdOutSqlLogger)

            // TODO find all campaign as creator and player
            return@transaction Campaigns.leftJoin(CampaignPlayers)
                    .select { ((CampaignPlayers.player eq user.id) or (Campaigns.creator eq user.id)) and Campaigns.archived.eq(false)  }
                    .orderBy(Campaigns.lastAccessed to false)
                    .map { Campaign.wrapRow(it) }
                    .map { CampaignSummaryDTO(it) }
        }
    }

    fun create(user: User, campaignDTO: CampaignDTO): CampaignDTO {
        Database.connect(dataSource)
        return transaction {
            val currentUser = User.findById(user.id)!!

            val newCampaign = Campaign.new {
                name = campaignDTO.name
                creator = currentUser
                lastAccessDate = DateTime.now()
                archived = campaignDTO.archived ?: false
            }

            return@transaction CampaignDTO(newCampaign)
        }
    }

    // TODO validate user can update this campaign
    fun update(user: User, campaignDTO: CampaignDTO): CampaignDTO {
        Database.connect(dataSource)
        return transaction {
            val campaign = Campaign.find {
                Campaigns.id eq campaignDTO.id
            }.forUpdate().first()

            campaign.name = campaignDTO.name
            campaign.archived = campaignDTO.archived ?: false
            if(campaignDTO.playerIds != null) {
                val players = User.wrapRows(Users.select { Users.id.inList(campaignDTO.playerIds!!) })
                campaign.players = players
            }
            return@transaction CampaignDTO(campaign)
        }
    }

    fun archive(user: User, campaignId: Long) {
        Database.connect(dataSource)
        return transaction {
            val campaign = Campaign.find {
                Campaigns.creator eq user.id and (Campaigns.id eq campaignId)
            }.forUpdate().first()

            campaign.archived = true
        }
    }

    fun findCampaign(campaignId: Long): CampaignDTO {
        Database.connect(dataSource)
        return transaction {
            logger.addLogger(StdOutSqlLogger)
            val campaign = Campaign.find {
                Campaigns.id eq campaignId
            }.forUpdate().first()
            campaign.lastAccessDate = DateTime.now()

            return@transaction CampaignDTO(campaign)
        }
    }

    fun findAllCampaigns(pageable: Pageable): Page<CampaignDTO> {
        Database.connect(dataSource)
        return transaction {
            logger.addLogger(StdOutSqlLogger)
            val campaigns = Campaigns
                    .withOptionalWhere(Campaigns, pageable.filterField, pageable.filterValues)
                    .withOptionalOrderBy(Campaigns, pageable.sortField, pageable.sortDirection)
                    .withOptionalLimit(pageable.limit, pageable.offset)
                    .map { Campaign.wrapRow(it) }
                    .map { CampaignDTO(it) }

            val total = Campaign.all().count()

            return@transaction Page(campaigns, total, pageable.offset, pageable.limit)
        }
    }

    fun userCanAccess(user: User, campaignDTO: CampaignDTO): Boolean {
        // TODO check for if user is a player
        return campaignDTO.creator == user.id.value
    }
}