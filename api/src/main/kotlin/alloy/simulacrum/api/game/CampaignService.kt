package alloy.simulacrum.api.game

import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.Users
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.and
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction
import org.joda.time.DateTime
import org.springframework.stereotype.Service
import javax.sql.DataSource

@Service
class CampaignService(val dataSource: DataSource) {
    fun findAllActiveCampaigns(user: User): List<CampaignSummaryDTO> {
        Database.connect(dataSource)
        return transaction {
            logger.addLogger(StdOutSqlLogger)

            // TODO find all campaign as creator and player
            return@transaction Campaigns.innerJoin(Users)
                    .select { Campaigns.creator eq user.id }
                    .orderBy(Campaigns.lastAccessed to false)
                    .map { Campaign.wrapRow(it) }
                    .map { CampaignSummaryDTO(it) }
        }
    }

    fun save(user: User, campaignSummaryDTO: CampaignSummaryDTO): CampaignSummaryDTO {
        Database.connect(dataSource)
        return transaction {
            val currentUser = User.findById(user.id)!!

            val newCampaign = Campaign.new {
                name = campaignSummaryDTO.name
                creator = currentUser
                lastAccessDate = DateTime.now()
            }

            return@transaction CampaignSummaryDTO(newCampaign)
        }
    }

    fun archive(user: User, campaignSummaryDTO: CampaignSummaryDTO) {
        Database.connect(dataSource)
        return transaction {
            val campaign = Campaign.find {
                Campaigns.creator eq user.id and (Campaigns.id eq campaignSummaryDTO.campaignId)
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
}