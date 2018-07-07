package alloy.simulacrum.api.user

import alloy.simulacrum.api.*
import org.jetbrains.exposed.sql.select
import org.joda.time.DateTime
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService : UserDetailsService {

    @Transactional
    override fun loadUserByUsername(username: String?): UserDetails? {
        return Users
                .select { Users.username.eq(username!!) }
                .mapNotNull { User.wrapRow(it) }
                .firstOrNull()
    }

    /**
     * TODO Implement caching
     */
    @Transactional
    fun loadAuthoritiesForUser(username: String): List<GrantedAuthority> {
        val roles = (Roles innerJoin Users)
                .select { Users.username.eq(username) }
                .mapNotNull { Role.wrapRow(it) }

        val allAuths = mutableListOf<GrantedAuthority>()
        allAuths.addAll(roles)
        allAuths.addAll(
                Permissions
                        .select { Permissions.role inList roles.map { it.id } }
                        .mapNotNull { Permission.wrapRow(it) }
        )

        return allAuths
    }

    fun registerUser(userDTO: UserDTO): User {
        val newUser = User.new {
            userName = userDTO.username
            email = userDTO.username
            firstName = userDTO.firstName
            lastName = userDTO.lastName
        }

        Role.new {
            user = newUser
            roleName = "ROLE_USER"
        }

        return newUser
    }

    @Transactional
    fun registerLogin(user: User): User {
        user.lastLogin = DateTime.now()
        return user
    }

    @Transactional
    fun findAllUsers(pageable: Pageable): Page<UserDTO> {
        val users = Users
                .withPageable(pageable)
                .map { User.wrapRow(it) }
                .map { UserDTO(it) }

        val total = User.all().count()

        return Page(users, total, pageable.offset, pageable.limit)
    }

    @Transactional
    fun read(userId: Long): UserDTO {
        return UserDTO(User.findById(userId)!!)
    }

    @Transactional
    fun delete(userId: Long): UserDTO {
        val user = User.findById(userId)!!
        user.enabled = false
        return UserDTO(user)
    }

    @Transactional
    fun update(userId: Long, userDTO: UserDTO): UserDTO {
        val user = User.findById(userId)!!
        user.enabled = userDTO.enabled!!
        return UserDTO(user)
    }
}
