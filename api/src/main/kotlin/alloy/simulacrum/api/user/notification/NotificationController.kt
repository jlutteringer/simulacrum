package alloy.simulacrum.api.user.notification

import alloy.simulacrum.api.user.User
import mu.KLogging
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/api/notifications")
class NotificationController(val notificationService: NotificationService) {
    companion object : KLogging()

    @GetMapping("/currentUser")
    fun getNotifications(@AuthenticationPrincipal user: User): List<NotificationDTO> {
        return notificationService.getNotifications(user)
    }

    @PostMapping("/{notificationId}/read")
    fun markNotificationRead(@AuthenticationPrincipal user: User, @PathVariable notificationId: Long): NotificationDTO {
        return notificationService.markNotificationRead(user, notificationId)
    }
}