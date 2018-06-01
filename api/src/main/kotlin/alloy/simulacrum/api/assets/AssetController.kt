package alloy.simulacrum.api.assets

import org.springframework.core.io.Resource
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import java.io.IOException
import java.util.stream.Collectors


@RestController("/asset")
class AssetController(private val assetService: AssetService) {

    @GetMapping("/")
    @Throws(IOException::class)
    fun listUploadedFiles(): List<String> {
        return assetService.loadAll().map(
                { path ->
                    MvcUriComponentsBuilder.fromMethodName(AssetController::class.java,
                            "serveFile", path.getFileName().toString()).build().toString()
                })
                .collect(Collectors.toList())
    }

    @GetMapping("/{filename:.+}")
    @ResponseBody
    fun serveFile(@PathVariable filename: String): ResponseEntity<Resource> {

        val file = assetService.loadAsResource(filename)
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.filename + "\"").body<Resource>(file)
    }

    @PutMapping("/")
    fun handleFileUpload(@RequestParam("file") file: MultipartFile,
                         redirectAttributes: RedirectAttributes): ResponseEntity<*> {

        val fileName = assetService.store(file)
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.originalFilename + "!")
        return ResponseEntity.ok().body(fileName)
    }

    @ExceptionHandler(AssetNotFoundException::class)
    fun handleAssetNotFound(exc: AssetNotFoundException): ResponseEntity<*> {
        return ResponseEntity.notFound().build<Any>()
    }
}

