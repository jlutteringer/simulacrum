package alloy.simulacrum.api.user

import org.springframework.web.bind.annotation.*
import java.security.Principal

@RestController()
@RequestMapping("/user")
class UserController(private val userDetailsService: SimUserDetailsService) {

    @PostMapping("/register")
    fun register(@RequestBody userDTO: UserDTO): UserDTO {
        return userDetailsService.registerUser(userDTO)
    }

    @GetMapping("/")
    fun getUser(user: Principal): UserDTO? {

        return null
    }
}