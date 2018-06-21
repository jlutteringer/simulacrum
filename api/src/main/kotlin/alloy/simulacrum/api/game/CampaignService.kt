package alloy.simulacrum.api.game

import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.Users
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.and
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction
import org.joda.time.DateTime
import org.springframework.stereotype.Service
import javax.sql.DataSource

@Service
class CampaignService(val dataSource: DataSource) {
    fun findAllActiveCampaigns(user: User): List<CampaignDTO> {
        Database.connect(dataSource)
        return transaction {
            return@transaction (Campaigns innerJoin Users)
                    .select{ Campaigns.creator.eq(user.id) }
                    .mapNotNull{ Campaign.wrapRow(it) }
                    .toList().map { CampaignDTO(it) }
        }
    }

    fun save(user: User, campaignDTO: CampaignDTO): CampaignDTO {
        Database.connect(dataSource)
        return transaction {
            val currentUser = User.findById(user.id)!!

            val newCampaign = Campaign.new {
                name = campaignDTO.name
                creator = currentUser
                lastAccessDate = DateTime.now()
            }

            return@transaction CampaignDTO(newCampaign)
        }
    }

    fun archive(user: User, campaignDTO: CampaignDTO) {
        Database.connect(dataSource)
        return transaction {
            val campaign = Campaign.find {
                Campaigns.creator eq user.id and (Campaigns.id eq campaignDTO.id)
            }.forUpdate().first()

            campaign.archived = true
        }
    }

    fun findCampaign(campaignId: Long): CampaignDTO {
        Database.connect(dataSource)
        return transaction {
            val campaign = Campaign.find {
                Campaigns.id eq campaignId
            }.forUpdate().first()
            campaign.lastAccessDate = DateTime.now()

            return@transaction CampaignDTO(campaign)
        }
    }
}