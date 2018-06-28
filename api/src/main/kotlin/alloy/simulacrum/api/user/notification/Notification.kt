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
    val link = varchar("link", 100)
    val linkMessage = varchar("link_message", 100)
}

class Notification(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<Notification>(Notifications)

    var user by User referencedOn Notifications.user
    var message by Notifications.message
    var link by Notifications.link
    var linkMessage by Notifications.linkMessage
}

data class NotificationDTO(val message: String) {
    constructor(notification: Notification) : this(notification.message) {

    }

    var userId: Long? = null
    var created: DateTime? = null
}
