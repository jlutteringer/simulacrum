package alloy.simulacrum.api.game

import alloy.simulacrum.api.user.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.messaging.simp.stomp.StompHeaderAccessor
import org.springframework.messaging.simp.user.SimpUserRegistry
import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.web.socket.messaging.SessionDisconnectEvent
import org.springframework.web.socket.messaging.SessionSubscribeEvent

class CampaignSessionHandlers {

    @Autowired
    lateinit var messagingTemplate: SimpMessagingTemplate

    @Autowired
    lateinit var userRegistry: SimpUserRegistry

//    private val campaignUsers = ConcurrentHashMap<String, MutableList<String>>()
    private val campaignEndpointRegex = """/api/ws/topic/campaigns/([0-9]*)""".toRegex()

    @EventListener
    fun connectionEstablished(sce: SessionSubscribeEvent) {
        val msgHeaders = sce.message.headers
        val user = (msgHeaders["simpUser"] as OAuth2Authentication).userAuthentication.principal as User
        val sha = StompHeaderAccessor.wrap(sce.message)
        handleCampaignJoin(sce, sha, user)
    }

    private fun handleCampaignJoin(sce: SessionSubscribeEvent, sha: StompHeaderAccessor, user: User): Boolean {
        val campaignId = getCampaignId(sha) ?: return false
        val campaignActionDto = CampaignActionDTO("join")
        campaignActionDto.userId = user.id.value
        messagingTemplate.convertAndSend("/api/ws/topic/campaigns/$campaignId", campaignActionDto)

//        campaignUsers.compute(campaignId) { campId, list ->
//            if (list != null) {
//                list.add(campId)
//                list
//            } else {
//                mutableListOf(campId)
//            }
//        }
        // TODO send all existing users to new user
//        var subscriptions = userRegistry.findSubscriptions { it.destination.matches(campaignEndpointRegex) }
//        messagingTemplate.convertAndSendToUser(sce.user!!.name , "/api/user/campaign/$campaignId", CampaignActionDTO("test!"))
        return true
    }

    private fun getCampaignId(sha: StompHeaderAccessor): String? {
        val destination = sha.destination!!
        val regex = campaignEndpointRegex
        val matchResult = regex.find(destination)
        if(matchResult != null) {
            val (campaignId) = matchResult.destructured
            return campaignId
        }
        return null
    }

    @EventListener
    fun webSockectDisconnect(sde: SessionDisconnectEvent) {
        val msgHeaders = sde.message.headers
        val user = (msgHeaders["simpUser"] as OAuth2Authentication).userAuthentication.principal as User
        val sha = StompHeaderAccessor.wrap(sde.message)
    }
}