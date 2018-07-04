package alloy.simulacrum.api.user.notification

import alloy.simulacrum.api.user.User
import org.jetbrains.exposed.sql.select
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional



@Service
class NotificationService {

    @Autowired
    lateinit var template: SimpMessagingTemplate

    @Transactional
    fun getNotifications(user: User): List<NotificationDTO> {
        return Notifications
                .select { Notifications.user eq user.id }
                .orderBy(Notifications.created to false)
                .map { Notification.wrapRow(it) }
                .map { NotificationDTO(it) }
    }

    /**
     * Sending the invite needs to happen outside the transaction that creates the notification to prevent race conditions
     */
    fun sendPlayerInvite(notificationDTO: NotificationDTO) {
        // TODO send message to user with websockets
//        template.convertAndSend()
    }

    @Transactional
    fun createInvitationNotification(to: User, toMessage: String, toToken: String, toLinkMessage: String): NotificationDTO {
        val notification = Notification.new {
            user = to
            message = toMessage
            token = toToken
            title = "Campaign Invitation"
            type = "INVITATION"
        }

        return NotificationDTO(notification)
    }

    @Transactional
    fun markNotificationRead(user: User, notificationId: Long): NotificationDTO {
        val notification = Notification.findById(notificationId)!!
        notification.read = true

        return NotificationDTO(notification)
    }
}