package alloy.simulacrum.api.game

import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.Users
import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.LongIdTable
import org.joda.time.DateTime

object Campaigns: LongIdTable() {
    val creator = reference("creator", Users)
    val archived = bool("archived").default(false)
    val name = varchar("name", 100)
    val lastAccessed = datetime("last_accessed")
}

class Campaign(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<Campaign>(Campaigns)

    var creator by User referencedOn Campaigns.creator
    var name by Campaigns.name
    var archived by Campaigns.archived
    var lastAccessDate by Campaigns.lastAccessed
}

data class CampaignSummaryDTO(val name: String) {
    var id: Long? = null
    var lastAccessed: DateTime? = null

    constructor(campaign: Campaign): this(campaign.name) {
        id = campaign.id.value
        lastAccessed = campaign.lastAccessDate
    }
}

data class CampaignDTO(val name: String) {
    var id: Long? = null
    var creator: Long? = null
    var lastAccessed: DateTime? = null
    var gameConfig: GameConfig? = null
    var sceneConfigs: List<SceneConfig> = listOf()
    var archived: Boolean? = null

    constructor(campaign: Campaign): this(campaign.name) {
        this.id = campaign.id.value
        this.creator = campaign.creator.id.value
        this.lastAccessed = campaign.lastAccessDate
        this.archived = campaign.archived
        // TODO pull game config from DB
        gameConfig = GameConfig(0)

        // TODO pull scenes from DB
        sceneConfigs = listOf(SceneConfig(0, 20, 15, "SQUARE"))

    }
}

data class GameConfig(val currentSceneId: Int)
data class SceneConfig(val sceneId: Int, val width: Int, val height: Int, val pattern: String)