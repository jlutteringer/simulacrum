package alloy.simulacrum.api.config

import mu.KLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import javax.servlet.http.HttpServletResponse

@RestControllerAdvice
class GlobalRestControllerExceptionHandler {
    companion object: KLogging()

    @ExceptionHandler(Exception::class)
    fun unknownExpection(ex: Exception, req: WebRequest, resp: HttpServletResponse): ResponseEntity<Any>? {
        logger.error { ex }
        if(resp.isCommitted) {
            return null
        }
        // TODO What's a better response?
        return ResponseEntity.status(500).body(ex.message)
    }
}