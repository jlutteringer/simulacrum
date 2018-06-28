package alloy.simulacrum.api.config

import alloy.simulacrum.api.game.Campaigns
import alloy.simulacrum.api.user.Authorities
import alloy.simulacrum.api.user.Users
import alloy.simulacrum.api.user.notification.Notifications
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils.createMissingTablesAndColumns
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct
import javax.sql.DataSource

@Configuration
class DatabaseConfig(private val dataSource: DataSource) {

    @PostConstruct
    fun init() {

        // TODO should this be disabled in production?
        Database.connect(dataSource)
        return transaction {
            createMissingTablesAndColumns(Users, Authorities, Campaigns, Notifications)
        }
    }
}