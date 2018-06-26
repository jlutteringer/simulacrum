package alloy.simulacrum.api.game

data class CampaignActionDTO(val type: String) {
    var userId: Long? = null
    var x: Int? = null
    var y: Int? = null
}
