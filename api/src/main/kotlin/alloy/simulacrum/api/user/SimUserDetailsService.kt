package alloy.simulacrum.api.user

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils.create
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import javax.sql.DataSource

@Service
class SimUserDetailsService(val dataSource: DataSource) : UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails? {
        Database.connect(dataSource)
        transaction {
            create (Users, Authorities)
            return@transaction (Users innerJoin Authorities)
                    .select{ Users.username.eq(username!!) }
                    .mapNotNull{ User.wrapRow(it) }
        }
        return null
    }

    fun registerUser(userDTO: UserDTO): UserDTO {
        // TODO implement validation

        Database.connect(dataSource)
        return transaction {
            create (Users, Authorities)

            val newUser = User.new {
                userName = userDTO.username
            }

            Authority.new {
                user = newUser
                auth = "USER"
            }

            return@transaction userDTO
        }
    }
}
