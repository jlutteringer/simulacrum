package alloy.simulacrum.api.config

import mu.KLogging
import org.springframework.http.ResponseEntity
import org.springframework.http.server.ServletServerHttpRequest
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.NoHandlerFoundException
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import org.springframework.web.util.WebUtils
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@ControllerAdvice
class GlobalRestControllerExceptionHandler: ResponseEntityExceptionHandler() {
    companion object: KLogging()

    @ExceptionHandler(Exception::class)
    fun unknownExpection(ex: Exception, req: HttpServletRequest, resp: HttpServletResponse): ResponseEntity<Any>? {
        logger.error ({ ex }, ex)
        if(resp.isCommitted) {
            return null
        }

        return ResponseEntity.status(500).body("An unexpected error occurred")
    }
}

@RestController
@RequestMapping("/api/[^w]?[^s]?**")
class RestControllerFourOhFour {
    @RequestMapping(method = arrayOf(RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE))
    fun catchAllAPIRequest(request: HttpServletRequest): Any? {
        throw NoHandlerFoundException(request.method, getRequestUri(request),
                ServletServerHttpRequest(request).headers)
    }

    private fun getRequestUri(request: HttpServletRequest): String {
        var uri = request.getAttribute(WebUtils.INCLUDE_REQUEST_URI_ATTRIBUTE) as? String
        if (uri == null) {
            uri = request.requestURI!!
        }
        return uri
    }
}