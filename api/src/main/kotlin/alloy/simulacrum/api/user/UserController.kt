package alloy.simulacrum.api.user

import alloy.simulacrum.api.Pageable
import alloy.simulacrum.api.RestUtils
import alloy.simulacrum.api.user.notification.NotificationDTO
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletResponse

@RestController()
@RequestMapping("/api")
class UserController(private val userService: UserService) {

    @GetMapping("/user")
    fun getUser(@AuthenticationPrincipal user: User): UserDTO {
        return UserDTO(user)
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/user/:userId")
    fun getUser(@AuthenticationPrincipal user: User, @PathVariable userId: Long): UserDTO {
        return userService.read(userId)
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/users")
    fun Any.getUsers(
            @AuthenticationPrincipal user: User,
            response: HttpServletResponse,
            @RequestParam range: String,
            @RequestParam filter: String?,
            @RequestParam sort: String
    ): List<UserDTO> {
        val users = userService.findAllUsers(Pageable(filter, range, sort))
        RestUtils.setHeaders(response, users)
        return users.entries
    }

    @GetMapping("/notifications")
    fun getNotifications(@AuthenticationPrincipal user: User): List<NotificationDTO> {
        return userService.getNotifications(user)
    }
}