package alloy.simulacrum.api.user.notification

import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.Users
import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.LongIdTable
import org.joda.time.DateTime


object Notifications: LongIdTable() {
    val created =  datetime("created").default(DateTime.now())
    val user = reference("user", Users)
    val message = varchar("message", 100)
    val token = varchar("token", 100)
    val type = varchar("type", 50)
    val title = varchar("title", 50)
    val read = bool("is_read").default(false)
}

class Notification(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<Notification>(Notifications)

    var user by User referencedOn Notifications.user
    var title by Notifications.title
    var message by Notifications.message
    var token by Notifications.token
    var type by Notifications.type
    var read by Notifications.read
}

data class NotificationDTO(var title: String, var message: String) {
    var id: Long? = null
    var token: String? = null
    var type: String? = null
    var read: Boolean? = null

    constructor(notification: Notification): this(notification.title, notification.message) {
        this.id = notification.id.value
        this.token = notification.token
        this.type = notification.type
        this.read = notification.read
    }
}
