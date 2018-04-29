package alloy.simulacrum.api.assets

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.core.io.Resource
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Path
import java.util.*
import java.util.stream.Stream
import javax.validation.constraints.NotNull

@ConfigurationProperties("assets")
@Service
open class FileAssetService: AssetService {

    @NotNull
    lateinit var directory: String

    val random = Random()

    val filenames = mutableListOf<String>()

    override fun store(file: MultipartFile) {
        val uuid = UUID.randomUUID().toString()

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadAll(): Stream<Path> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun load(filename: String): Path {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadAsResource(filename: String): Resource {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteAll() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun init() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
