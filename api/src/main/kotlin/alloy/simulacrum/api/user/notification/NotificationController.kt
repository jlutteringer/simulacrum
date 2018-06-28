package alloy.simulacrum.api.user.notification

import alloy.simulacrum.api.user.User
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/api/notifications")
class NotificationController(val notificationService: NotificationService) {

    @GetMapping("/currentUser")
    fun getNotifications(@AuthenticationPrincipal user: User): List<NotificationDTO> {
        return notificationService.getNotifications(user)
    }
}