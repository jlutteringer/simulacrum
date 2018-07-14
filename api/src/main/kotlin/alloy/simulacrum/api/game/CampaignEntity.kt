package alloy.simulacrum.api.game

import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.LongIdTable

object CampaignEntities: LongIdTable() {
    val visibleToPlayers = bool("visibile_to_player").default(false)
//    val player = reference("player", CampaignPlayers).nullable()
    val name = varchar("name", 50)
    val type = varchar("type", 50)
    val campaign = reference("campaign_id", Campaigns)
}

class CampaignEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<CampaignEntity>(CampaignEntities)

    var name by CampaignEntities.name
    var visibleToPlayers by CampaignEntities.visibleToPlayers
//    var player by CampaignPlayer referencedOn CampaignEntities.player
    var type by CampaignEntities.type
}

data class CampaignEntityDTO(val name: String) {
    var id: Long? = null
    var playerId: Long? = null
    var type: String? = null

    constructor(campaignEntity: CampaignEntity): this(campaignEntity.name) {
        id = campaignEntity.id.value
        type = campaignEntity.type
//        id = campaignEntity.player.id.value
    }
}
