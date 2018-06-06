package alloy.simulacrum.api.user

import org.jetbrains.exposed.dao.*
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.security.Principal

object Users: LongIdTable() {
    val username = varchar("username", 50).uniqueIndex()
    val firstName = varchar("first_name", 50).nullable()
    val lastName = varchar("last_name", 50).nullable()
    val password = varchar("password", 50).nullable()
    val enabled = bool("enabled").default(true)
    val expiredCredentials = bool("expired_credentials").default(false)
    val accountExpired = bool("account_expired").default(false)
    val accountLocked = bool("account_locked").default(false)
}

class User(id: EntityID<Long>) : LongEntity(id), UserDetails {
    companion object : LongEntityClass<User>(Users)

    var userName by Users.username
    var firstName by Users.firstName
    var lastName by Users.lastName
    var passWord by Users.password
    var enabled by Users.enabled
    var expiredCredentials by Users.expiredCredentials
    val accountExpired by Users.accountExpired
    val accountLocked by Users.accountLocked
    val authorities by Authority referrersOn Authorities.user

    override fun getUsername(): String {
        return userName
    }

    override fun getPassword(): String? {
        return passWord
    }

    override fun isEnabled(): Boolean {
        return this.enabled
    }

    override fun isCredentialsNonExpired(): Boolean {
        return !expiredCredentials
    }


    override fun isAccountNonExpired(): Boolean {
        return !accountExpired
    }

    override fun isAccountNonLocked(): Boolean {
        return !accountLocked
    }

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return authorities.toMutableList()
    }
}

data class UserDTO(val username: String) {
    constructor(user: User) : this(user.username)
}
//, val firstName: String = "", val lastName: String = "", val password: String = "", val email: String = "")
