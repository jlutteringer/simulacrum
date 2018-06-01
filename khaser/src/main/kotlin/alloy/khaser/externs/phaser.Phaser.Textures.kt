//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Textures")]
//package Phaser.Textures
//
//import alloy.khaser.externs.Game
//import kotlin.js.*
//import org.khronos.webgl.*
//import org.w3c.dom.*
//
//external enum class FilterMode {
//    LINEAR,
//    NEAREST
//}
//external open class Frame {
//    constructor(texture: Texture, name: String, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number)
//    constructor(texture: Texture, name: Number, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number)
//    open var texture: Texture = definedExternally
//    open var name: String = definedExternally
//    open var source: TextureSource = definedExternally
//    open var sourceIndex: Number = definedExternally
//    open var cutX: Number = definedExternally
//    open var cutY: Number = definedExternally
//    open var cutWidth: Number = definedExternally
//    open var cutHeight: Number = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var halfWidth: Number = definedExternally
//    open var halfHeight: Number = definedExternally
//    open var centerX: Number = definedExternally
//    open var centerY: Number = definedExternally
//    open var pivotX: Number = definedExternally
//    open var pivotY: Number = definedExternally
//    open var customPivot: Boolean = definedExternally
//    open var rotated: Boolean = definedExternally
//    open var autoRound: Number = definedExternally
//    open var customData: Any = definedExternally
//    open fun setTrim(actualWidth: Number, actualHeight: Number, destX: Number, destY: Number, destWidth: Number, destHeight: Number): Frame = definedExternally
//    open fun updateUVs(): Frame = definedExternally
//    open fun updateUVsInverted(): Frame = definedExternally
//    open fun clone(): Frame = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open var realWidth: Number = definedExternally
//    open var realHeight: Number = definedExternally
//    open var uvs: Any = definedExternally
//    open var radius: Number = definedExternally
//    open var trimmed: Boolean = definedExternally
//    open var canvasData: Any = definedExternally
//}
//external var LINEAR: Any = definedExternally
//external var NEAREST: Any = definedExternally
//external open class Texture {
//    constructor(manager: TextureManager, key: String, source: HTMLCanvasElement, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */)
//    constructor(manager: TextureManager, key: String, source: HTMLImageElement, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */)
//    open var manager: TextureManager = definedExternally
//    open var key: String = definedExternally
//    open var source: Array<TextureSource> = definedExternally
//    open var dataSource: Array<Any> = definedExternally
//    open var frames: Any = definedExternally
//    open var customData: Any = definedExternally
//    open var firstFrame: String = definedExternally
//    open var frameTotal: Number = definedExternally
//    open fun add(name: String, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number): Frame = definedExternally
//    open fun add(name: Number, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number): Frame = definedExternally
//    open fun has(name: String): Boolean = definedExternally
//    open fun get(name: String? = definedExternally /* null */): Frame = definedExternally
//    open fun get(name: Number? = definedExternally /* null */): Frame = definedExternally
//    open fun getTextureSourceIndex(source: TextureSource): Number = definedExternally
//    open fun getFramesFromTextureSource(sourceIndex: Number): Array<Frame> = definedExternally
//    open fun getFrameNames(includeBase: Boolean? = definedExternally /* null */): Array<String> = definedExternally
//    open fun getSourceImage(name: String? = definedExternally /* null */): dynamic /* HTMLCanvasElement | HTMLImageElement */ = definedExternally
//    open fun getSourceImage(name: Number? = definedExternally /* null */): dynamic /* HTMLCanvasElement | HTMLImageElement */ = definedExternally
//    open fun setDataSource(data: HTMLCanvasElement): Unit = definedExternally
//    open fun setDataSource(data: HTMLImageElement): Unit = definedExternally
//    open fun setFilter(filterMode: FilterMode): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun get(): Frame = definedExternally
//    open fun getSourceImage(): dynamic /* HTMLCanvasElement | HTMLImageElement */ = definedExternally
//}
//external open class TextureManager(game: Game) : Phaser.Events.EventEmitter {
//    open var game: Game = definedExternally
//    open var name: String = definedExternally
//    open var list: Any = definedExternally
//    open fun boot(): Unit = definedExternally
//    open fun updatePending(): Unit = definedExternally
//    open fun addBase64(key: String, data: Any): Unit = definedExternally
//    open fun addImage(key: String, source: HTMLImageElement, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
//    open fun generate(key: String, config: Any): Texture = definedExternally
//    open fun createCanvas(key: String, width: Number, height: Number): Texture = definedExternally
//    open fun addCanvas(key: String, source: HTMLCanvasElement): Texture = definedExternally
//    open fun addAtlas(key: String, source: HTMLImageElement, data: Any): Texture = definedExternally
//    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Any): Texture = definedExternally
//    open fun addAtlasJSONHash(key: String, source: HTMLImageElement, data: Any): Texture = definedExternally
//    open fun addUnityAtlas(key: String, source: HTMLImageElement, data: Any): Texture = definedExternally
//    open fun addSpriteSheet(key: String, source: HTMLImageElement, config: SpriteSheetConfig): Texture = definedExternally
//    open fun addSpriteSheetFromAtlas(key: String, config: SpriteSheetFromAtlasConfig): Texture = definedExternally
//    open fun addAtlasStarlingXML(key: String, source: HTMLImageElement, data: Any): Texture = definedExternally
//    open fun addAtlasPyxel(key: String, source: HTMLImageElement, data: Any): Texture = definedExternally
//    open fun create(key: String, source: HTMLImageElement, width: Number, height: Number): Texture = definedExternally
//    open fun exists(key: String): Boolean = definedExternally
//    open fun get(key: String): Texture = definedExternally
//    open fun cloneFrame(key: String, frame: String): Frame = definedExternally
//    open fun cloneFrame(key: String, frame: Number): Frame = definedExternally
//    open fun getFrame(key: String, frame: String): Frame = definedExternally
//    open fun getFrame(key: String, frame: Number): Frame = definedExternally
//    open fun getTextureKeys(): Array<String> = definedExternally
//    open fun getPixel(x: Number, y: Number, key: String, frame: String): Phaser.Display.Color = definedExternally
//    open fun getPixel(x: Number, y: Number, key: String, frame: Number): Phaser.Display.Color = definedExternally
//    open fun setTexture(gameObject: Phaser.GameObjects.GameObject, key: String, frame: String): Phaser.GameObjects.GameObject = definedExternally
//    open fun setTexture(gameObject: Phaser.GameObjects.GameObject, key: String, frame: Number): Phaser.GameObjects.GameObject = definedExternally
//    open fun each(callback: (texture: Texture, args: Any) -> Unit, scope: Any, vararg args: Any): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//}
//external open class TextureSource {
//    constructor(texture: Texture, source: HTMLCanvasElement, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */)
//    constructor(texture: Texture, source: HTMLImageElement, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */)
//    open var texture: String = definedExternally
//    open var image: dynamic /* HTMLCanvasElement | HTMLImageElement */ = definedExternally
//    open var compressionAlgorithm: Number = definedExternally
//    open var resolution: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var scaleMode: Number = definedExternally
//    open var isCanvas: Boolean = definedExternally
//    open var isPowerOf2: Boolean = definedExternally
//    open var glTexture: WebGLTexture = definedExternally
//    open fun init(game: Game): Unit = definedExternally
//    open fun setFilter(filterMode: FilterMode): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
