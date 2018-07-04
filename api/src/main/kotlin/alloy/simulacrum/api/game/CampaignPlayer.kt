package alloy.simulacrum.api.game

import alloy.simulacrum.api.user.Users
import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.LongIdTable

object CampaignPlayers: LongIdTable() {
    val campaign = reference("campaign_id", Campaigns).primaryKey(2)
    val player = reference("player_id", Users).primaryKey(3)
    val lastAccessed = datetime("last_accessed").nullable()
}

class CampaignPlayer(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<CampaignPlayer>(CampaignPlayers)
    var campaign by CampaignPlayers.campaign
    var player by CampaignPlayers.player
    var lastAccessDate by CampaignPlayers.lastAccessed
}
