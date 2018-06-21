package alloy.simulacrum.api.user

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction
import org.joda.time.DateTime
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import javax.sql.DataSource

@Service
class SimUserDetailsService(val dataSource: DataSource) : UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails? {
        Database.connect(dataSource)
        return transaction {
            return@transaction (Users innerJoin Authorities)
                    .select{ Users.username.eq(username!!) }
                    .mapNotNull{ User.wrapRow(it) }
                    .firstOrNull()
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
}
