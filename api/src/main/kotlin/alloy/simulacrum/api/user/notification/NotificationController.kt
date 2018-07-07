package alloy.simulacrum.api.user.notification

import alloy.simulacrum.api.Pageable
import alloy.simulacrum.api.user.User
import mu.KLogging
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/api/notifications")
class NotificationController(val notificationService: NotificationService) {
    companion object : KLogging()

    @GetMapping("/currentUser")
    fun getNotifications(
            @AuthenticationPrincipal user: User,
            @RequestParam(defaultValue = "[0,9]") range: String?,
            @RequestParam filter: String?,
            @RequestParam sort: String?
    ): List<NotificationDTO> {
        // TODO can we accommadate an additional filter?
        val adjustedFilter = "{\"id\":[${user.id}]}"
        return notificationService.getNotifications(user, Pageable(adjustedFilter, range, sort))
    }

    @PostMapping("/{notificationId}/read")
    fun markNotificationRead(@AuthenticationPrincipal user: User, @PathVariable notificationId: Long): NotificationDTO {
        return notificationService.markNotificationRead(user, notificationId)
    }
}
