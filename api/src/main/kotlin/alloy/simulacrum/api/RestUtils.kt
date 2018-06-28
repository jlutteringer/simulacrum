package alloy.simulacrum.api

import com.fasterxml.jackson.annotation.JsonInclude
import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.LongIdTable
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Query
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.springframework.security.core.context.SecurityContextHolder
import javax.servlet.http.HttpServletResponse

class RestUtils {
    companion object {
        fun setHeaders(response: HttpServletResponse, page: Page<*>) {
            if(page.offset != null && page.limit != null) {
                response.setHeader("Content-Range", "entries " + page.offset + "-" + (page.limit + page.offset) + "/" + page.total)
            }
        }

        fun shouldPopulateAdminFields(): Boolean {
            return  isAdminUser()
        }

        fun isAdminUser(): Boolean {
            return SecurityContextHolder.getContext().authentication.authorities.map { it.authority == "ROLE_ADMIN" }.isNotEmpty()
        }
    }
}

fun LongIdTable.field(sortField: String): Column<*> {
    return this.columns.first { it.name == sortField }
}

fun LongIdTable.withOptionalWhere(table: LongIdTable, filterField: String?, filterValues: List<String>?): Query {
    if(filterField != null && filterValues != null) {
        val field = table.field(filterField)
        var coercedField = field as? Column<EntityID<Long>>
        if(coercedField != null) {
            return this.select { coercedField.inList(filterValues.map { it.toLong() }) }
        }
        IllegalStateException("Unhandled filter clause $filterField and $filterValues")
    }
    return this.selectAll()
}

fun Query.withOptionalOrderBy(table: LongIdTable, sortField: String?, sortDirection: String?): Query {
    if(sortField != null && sortDirection != null) {
        return this.orderBy(table.field(sortField) to (sortDirection == "DESC"))
    }
    return this
}

fun Query.withOptionalLimit(limit: Int?, offset: Int?): Query {
    if(limit != null) {
        return if(offset != null) {
            this.limit(limit, offset)
        } else {
            this.limit(limit)
        }
    }
    return this
}

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Page<T>(val entries: List<T>, val total: Int, val offset: Int?, val limit: Int?)

val RANGE_REGEX = """.([0-9]*),([0-9]*).""".toRegex()
val SORT_REGEX = """..(\w*).,.(DESC|ASC)..""".toRegex()
val FILTER_REGEX = """\{.(\w*).:\[?([^]]*)]?}""".toRegex()

class Pageable {
    var filterField: String? = null
    var filterValues: List<String>? = null
    var offset: Int? = null
    var limit: Int? = null
    var sortField: String? = null
    var sortDirection: String? = null

    constructor(filter: String?, range: String?, sort: String?) {
        if(filter != null) {
            val match = FILTER_REGEX.matchEntire(filter)
            if(match != null) {
                val (filterField, filterValues) = match.destructured
                this.filterField = filterField
                this.filterValues = filterValues.split(",")
            }
        }

        if(sort != null) {
            val (sortField, sortDirection) = SORT_REGEX.matchEntire(sort)!!.destructured
            this.sortField = sortField
            this.sortDirection = sortDirection
        }

        if(range != null) {
            val (firstIndex, lastIndex) = RANGE_REGEX.matchEntire(range)!!.destructured
            this.offset = firstIndex.toInt()
            this.limit = lastIndex.toInt() - this.offset!!
        }
    }
}
