package alloy.simulacrum.api.user

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/user")
class UserController(private val userDetailsService: SimUserDetailsService) {

    @GetMapping()
    fun getUser(@AuthenticationPrincipal user: User): UserDTO {
        return UserDTO(user)
    }
}