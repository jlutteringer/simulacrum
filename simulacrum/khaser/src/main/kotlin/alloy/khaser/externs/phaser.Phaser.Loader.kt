//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Loader")]
//package Phaser.Loader
//
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//import org.w3c.dom.*
//import org.w3c.files.*
//import org.w3c.xhr.*
//
//external var LOADER_IDLE: Number = definedExternally
//external var LOADER_LOADING: Number = definedExternally
//external var LOADER_PROCESSING: Number = definedExternally
//external var LOADER_COMPLETE: Number = definedExternally
//external var LOADER_SHUTDOWN: Number = definedExternally
//external var LOADER_DESTROYED: Number = definedExternally
//external var FILE_PENDING: Number = definedExternally
//external var FILE_LOADING: Number = definedExternally
//external var FILE_LOADED: Number = definedExternally
//external var FILE_FAILED: Number = definedExternally
//external var FILE_PROCESSING: Number = definedExternally
//external var FILE_WAITING_LINKFILE: Number = definedExternally
//external var FILE_ERRORED: Number = definedExternally
//external var FILE_COMPLETE: Number = definedExternally
//external var FILE_DESTROYED: Number = definedExternally
//external var FILE_POPULATED: Number = definedExternally
//external var TEXTURE_ATLAS_JSON_ARRAY: Number = definedExternally
//external var TEXTURE_ATLAS_JSON_HASH: Number = definedExternally
//external open class File(fileConfig: FileConfig) {
//    open var type: String = definedExternally
//    open var key: String = definedExternally
//    open var url: String = definedExternally
//    open var src: String = definedExternally
//    open var xhrSettings: XHRSettingsObject = definedExternally
//    open var loader: LoaderPlugin = definedExternally
//    open var xhrLoader: XMLHttpRequest = definedExternally
//    open var state: Number = definedExternally
//    open var bytesTotal: Number = definedExternally
//    open var bytesLoaded: Number = definedExternally
//    open var percentComplete: Number = definedExternally
//    open var crossOrigin: String? = definedExternally
//    open var data: Any = definedExternally
//    open var config: Any = definedExternally
//    open var linkFile: File = definedExternally
//    open var linkType: String = definedExternally
//    open var linkParent: Boolean = definedExternally
//    open fun setLinkFile(fileB: File, linkType: String): Unit = definedExternally
//    open fun resetXHR(): Unit = definedExternally
//    open fun load(loader: LoaderPlugin): Unit = definedExternally
//    open fun onLoad(event: ProgressEvent): Unit = definedExternally
//    open fun onError(event: ProgressEvent): Unit = definedExternally
//    open fun onProgress(event: ProgressEvent): Unit = definedExternally
//    open fun onProcess(callback: (file: File) -> Unit): Unit = definedExternally
//    open fun onComplete(): Unit = definedExternally
//    companion object {
//        fun createObjectURL(image: HTMLImageElement, blob: Blob, defaultType: String): Unit = definedExternally
//        fun revokeObjectURL(image: HTMLImageElement): Unit = definedExternally
//    }
//}
//external fun GetURL(file: File, baseURL: String): String = definedExternally
//external open class LoaderPlugin(scene: Scene) : Phaser.Events.EventEmitter {
//    open fun animation(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun animation(key: Any?, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun animation(key: Array<Any>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun atlas(key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun audio(key: String, urls: String, config: Any, xhrSettings: Any? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun audio(key: String, urls: Array<String>, config: Any, xhrSettings: Any? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun audioSprite(key: String, urls: String, json: Any, config: Any, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun audioSprite(key: String, urls: Array<String>, json: Any, config: Any, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun binary(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun bitmapFont(key: String, textureURL: String, xmlURL: String, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, xmlXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun glsl(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun html(key: String, url: String, width: Number, height: Number, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun image(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun json(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun multiatlas(key: String, textureURLs: Array<String>, atlasURLs: Array<String>, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun plugin(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun script(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun spritesheet(key: String, url: String, config: Any, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun svg(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun text(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun tilemapCSV(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun tilemapTiledJSON(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun tilemapWeltmeister(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun unityAtlas(key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun xml(key: String, url: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var path: String = definedExternally
//    open var baseURL: String = definedExternally
//    open var enableParallel: Boolean = definedExternally
//    open var maxParallelDownloads: Number = definedExternally
//    open var xhr: XHRSettingsObject = definedExternally
//    open var crossOrigin: String = definedExternally
//    open var totalToLoad: Number = definedExternally
//    open var progress: Number = definedExternally
//    open var list: Phaser.Structs.Set<File> = definedExternally
//    open var inflight: Phaser.Structs.Set<File> = definedExternally
//    open var failed: Phaser.Structs.Set<File> = definedExternally
//    open var queue: Phaser.Structs.Set<File> = definedExternally
//    open var storage: Phaser.Structs.Set<dynamic /* File | LinkFileObject */> = definedExternally
//    open var state: Number = definedExternally
//    open fun setBaseURL(url: String): LoaderPlugin = definedExternally
//    open fun setPath(path: String): LoaderPlugin = definedExternally
//    open fun setCORS(crossOrigin: String): LoaderPlugin = definedExternally
//    open fun addFile(file: File): File = definedExternally
//    open fun isLoading(): Boolean = definedExternally
//    open fun isReady(): Boolean = definedExternally
//    open fun start(): Unit = definedExternally
//    open fun updateProgress(): Unit = definedExternally
//    open fun processLoadQueue(): Unit = definedExternally
//    open fun loadFile(file: File): Unit = definedExternally
//    open fun nextFile(previousFile: File, success: Boolean): Unit = definedExternally
//    open fun finishedLoading(): Unit = definedExternally
//    open fun processUpdate(file: File): Unit = definedExternally
//    open fun removeFromQueue(file: File): Unit = definedExternally
//    open fun processComplete(): Unit = definedExternally
//    open fun processCallback(): Unit = definedExternally
//    open fun saveJSON(data: Any, filename: String? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun save(data: Any, filename: String? = definedExternally /* null */, filetype: String? = definedExternally /* null */): LoaderPlugin = definedExternally
//    open fun reset(): Unit = definedExternally
//    open fun loadArray(files: Array<LoaderFileObject>): Boolean = definedExternally
//    open fun file(file: LoaderFileObject): File = definedExternally
//}
//external fun MergeXHRSettings(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject = definedExternally
//external fun XHRLoader(file: File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest = definedExternally
//external fun XHRSettings(responseType: String? /* "" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
//external fun XHRSettings(responseType: String? /* "arraybuffer" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
//external fun XHRSettings(responseType: String? /* "blob" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
//external fun XHRSettings(responseType: String? /* "document" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
//external fun XHRSettings(responseType: String? /* "json" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
//external fun XHRSettings(responseType: String? /* "text" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
//external fun XHRSettings(): XHRSettingsObject = definedExternally
