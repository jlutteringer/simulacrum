package alloy.simulacrum.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class GameStatController {
    @GetMapping("/greeting")
    fun greeting(principal: Principal) =
        "${principal.name}"
}