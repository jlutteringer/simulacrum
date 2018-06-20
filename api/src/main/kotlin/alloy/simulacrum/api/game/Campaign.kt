package alloy.simulacrum.api.game

import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.Users
import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.LongIdTable

object Campaigns: LongIdTable() {
    val creator = reference("user", Users)
    val archived = bool("archived").default(false)
    val name = varchar("name", 100)
}

class Campaign(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<Campaign>(Campaigns)

    var creator by User referencedOn Campaigns.creator
    var name by Campaigns.name
    var archived by Campaigns.archived
}

data class CampaignDTO(val name: String) {
    var id: Long? = null
    var creator: String? = null

    constructor(campaign: Campaign): this(campaign.name) {
        creator = campaign.creator.userName
    }
}

