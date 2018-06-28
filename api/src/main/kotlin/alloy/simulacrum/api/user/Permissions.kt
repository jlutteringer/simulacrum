package alloy.simulacrum.api.user

import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.IntIdTable
import org.springframework.security.core.GrantedAuthority

object Permissions:  IntIdTable() {
    val role = reference("role", Roles)
    val permissionName = varchar("permission_name", 50)
}

class Permission(id: EntityID<Int>) : IntEntity(id), GrantedAuthority {
    companion object : IntEntityClass<Permission>(Permissions)

    var role by Role referencedOn Permissions.role
    var permissionName by Permissions.permissionName

    override fun getAuthority(): String {
        return permissionName
    }
}
