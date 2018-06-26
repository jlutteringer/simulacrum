package alloy.simulacrum.api.user

import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.LongIdTable
import org.joda.time.DateTime
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

object Users: LongIdTable() {
    val username = varchar("username", 100).uniqueIndex()
    val email = varchar("email", 250)
    val firstName = varchar("first_name", 50).nullable()
    val lastName = varchar("last_name", 50).nullable()
    val password = varchar("password", 50).nullable()
    val enabled = bool("enabled").default(true)
    val expiredCredentials = bool("expired_credentials").default(false)
    val accountExpired = bool("account_expired").default(false)
    val accountLocked = bool("account_locked").default(false)
    val lastLogin =  datetime("last_login").default(DateTime.now())
}

class User(id: EntityID<Long>) : LongEntity(id), UserDetails {
    companion object : LongEntityClass<User>(Users)

    var userName by Users.username
    var email by Users.email
    var firstName by Users.firstName
    var lastName by Users.lastName
    var passWord by Users.password
    var enabled by Users.enabled
    var expiredCredentials by Users.expiredCredentials
    var accountExpired by Users.accountExpired
    var accountLocked by Users.accountLocked
    val authorities by Authority referrersOn Authorities.user
    var lastLogin by Users.lastLogin

    override fun equals(other: Any?): Boolean {
        if (other is User) {
            return this.id == other.id
        }

        return false
    }

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
    val lastName: String? = null
    val firstName: String? = null
    var userId: Long? = null

    constructor(user: User) : this(user.username) {
        this.userId = user.id.value
    }
}
