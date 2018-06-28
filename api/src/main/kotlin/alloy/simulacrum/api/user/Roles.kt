package alloy.simulacrum.api.user

import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.IntIdTable
import org.springframework.security.core.GrantedAuthority


object Roles:  IntIdTable() {
    val user = reference("user", Users)
    val roleName = varchar("role_name", 50)
}

class Role(id: EntityID<Int>) : IntEntity(id), GrantedAuthority {
    companion object : IntEntityClass<Role>(Roles)

    var user by User referencedOn Roles.user
    var roleName by Roles.roleName
    val permissions by Permission.referrersOn(Permissions.role)

    override fun getAuthority(): String {
        return roleName
    }

    fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return permissions.toMutableList()
    }
}
