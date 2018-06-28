package alloy.simulacrum.api.user

import alloy.simulacrum.api.Page
import alloy.simulacrum.api.Pageable
import alloy.simulacrum.api.field
import alloy.simulacrum.api.user.notification.Notification
import alloy.simulacrum.api.user.notification.NotificationDTO
import alloy.simulacrum.api.user.notification.Notifications
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import org.joda.time.DateTime
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import javax.sql.DataSource

@Service
class UserService(val dataSource: DataSource) : UserDetailsService {


    override fun loadUserByUsername(username: String?): UserDetails? {
        Database.connect(dataSource)
        return transaction {
            return@transaction (Users)
                    .select{ Users.username.eq(username!!) }
                    .mapNotNull{ User.wrapRow(it) }
                    .firstOrNull()
        }
    }

    fun loadAuthoritiesForUser(username: String): List<GrantedAuthority> {
        Database.connect(dataSource)
        return transaction {
            return@transaction (Authorities innerJoin Users)
                    .select{ Users.username.eq(username) }
                    .mapNotNull{ Authority.wrapRow(it) }
        }
    }

    fun registerUser(userDTO: UserDTO): User {
        Database.connect(dataSource)
        return transaction {
            val newUser = User.new {
                userName = userDTO.username
                email = userDTO.username
                firstName = userDTO.firstName
                lastName = userDTO.lastName
            }

            Authority.new {
                user = newUser
                auth = "ROLE_USER"
            }

            return@transaction newUser
        }
    }

    fun registerLogin(user: User): User {
        Database.connect(dataSource)
        return transaction {
            user.lastLogin = DateTime.now()

            return@transaction user
        }
    }

    fun getNotifications(user: User): List<NotificationDTO> {
        Database.connect(dataSource)
        return transaction {

            return@transaction Notifications.innerJoin(Users)
                    .select { Notifications.user eq user.id }
                    .orderBy(Notifications.created to false)
                    .map { Notification.wrapRow(it) }
                    .map { NotificationDTO(it) }
        }
    }

    fun findAllUsers(page: Pageable): Page<UserDTO> {
        Database.connect(dataSource)
        return transaction {
            logger.addLogger(StdOutSqlLogger)
            val users = Users
                    .selectAll()
                    .orderBy( Users.field(page.sortField) to (page.sortDirection != "DESC"))
                    .limit(page.limit, page.offset)
                    .map { User.wrapRow(it) }
                    .map { UserDTO(it) }

            val total = User.all().count()

            return@transaction Page(users, total, page.offset, page.limit)
        }
    }

    fun read(userId: Long): UserDTO {
        return UserDTO(User.findById(userId)!!)
    }
}
