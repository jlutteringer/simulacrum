package alloy.simulacrum.api.user

import org.jetbrains.exposed.dao.*
import org.springframework.security.core.GrantedAuthority


object Authorities:  IntIdTable() {
    val user = reference("user", Users)
    val authority = varchar("authority", 50)
}

class Authority(id: EntityID<Int>) : IntEntity(id), GrantedAuthority {
    companion object : IntEntityClass<Authority>(Authorities)

    var user by User referencedOn Authorities.user
    var auth by Authorities.authority

    override fun getAuthority(): String {
        return auth
    }
}
