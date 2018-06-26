package alloy.simulacrum.api.config

import mu.KLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest

@RestControllerAdvice
class GlobalRestControllerExceptionHandler {
    companion object: KLogging()

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun unknownExpection(ex: Exception, req: WebRequest): String? {
        logger.error { ex }
        // TODO What's a better response?
        return ex.message
    }
}