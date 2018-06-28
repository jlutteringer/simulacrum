package alloy.simulacrum.api.user.notification

import alloy.simulacrum.api.user.User
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Service
import javax.sql.DataSource

@Service
class NotificationService(val dataSource: DataSource) {

    fun getNotifications(user: User): List<NotificationDTO> {
        Database.connect(dataSource)
        return transaction {

            return@transaction Notifications
                    .select { Notifications.user eq user.id }
                    .orderBy(Notifications.created to false)
                    .map { Notification.wrapRow(it) }
                    .map { NotificationDTO(it) }
        }
    }
}