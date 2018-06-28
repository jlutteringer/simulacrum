package alloy.simulacrum.api

import alloy.simulacrum.api.user.Users
import org.jetbrains.exposed.sql.Column
import org.springframework.security.core.context.SecurityContextHolder
import javax.servlet.http.HttpServletResponse

class RestUtils {
    companion object {
        fun setHeaders(response: HttpServletResponse, page: Page<*>) {
            response.setHeader("Content-Range", "entries " + page.offset + "-" + (page.limit + page.offset) + "/" + page.total)
        }

        fun shouldPopulateAdminFields(): Boolean {
            return SecurityContextHolder.getContext().authentication.authorities.map { it.authority == "ROLE_ADMIN" }.isNotEmpty()
        }
    }
}

fun Users.field(sortField: String): Column<*> {
    return this.columns.first { it.name == sortField }
}

data class Page<T>(val entries: List<T>, val total: Int, val offset: Int, val limit: Int)

val RANGE_REGEX = """.([0-9]*),([0-9]*).""".toRegex()
val SORT_REGEX = """..(\w*).,.(DESC|ASC)..""".toRegex()

class Pageable {
    var filter: String?

    var offset: Int
    var limit: Int
    var sortField: String
    var sortDirection: String

    constructor(filter: String?, range: String, sort: String) {
        // TODO parse filter
        this.filter = filter
        // TODO parse sort

        val (sortField, sortDirection) = SORT_REGEX.matchEntire(sort)!!.destructured
        this.sortField = sortField
        this.sortDirection = sortDirection

        val (firstIndex, lastIndex) = RANGE_REGEX.matchEntire(range)!!.destructured
        this.offset = firstIndex.toInt()
        this.limit = lastIndex.toInt() - this.offset
    }
}
