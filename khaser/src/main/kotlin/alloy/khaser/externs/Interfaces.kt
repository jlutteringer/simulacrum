package alloy.khaser.externs

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface GridAlignConfig {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var cellWidth: Boolean? get() = definedExternally; set(value) = definedExternally
    var cellHeight: Number? get() = definedExternally; set(value) = definedExternally
    var position: Number? get() = definedExternally; set(value) = definedExternally
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
}
external interface JSONAnimation {
    var key: String
    var type: String
    var frames: Array<JSONAnimationFrame>
    var frameRate: Number
    var duration: Number
    var skipMissedFrames: Boolean
    var delay: Number
    var repeat: Number
    var repeatDelay: Number
    var yoyo: Boolean
    var showOnStart: Boolean
    var hideOnComplete: Boolean
}
external interface AnimationFrameConfig {
    var key: String
    var frame: dynamic /* String | Number */
    var duration: Number? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface AnimationConfig {
    var frames: Array<AnimationFrameConfig>? get() = definedExternally; set(value) = definedExternally
    var defaultTextureKey: String? get() = definedExternally; set(value) = definedExternally
    var frameRate: Number? get() = definedExternally; set(value) = definedExternally
    var duration: Number? get() = definedExternally; set(value) = definedExternally
    var skipMissedFrames: Boolean? get() = definedExternally; set(value) = definedExternally
    var delay: Number? get() = definedExternally; set(value) = definedExternally
    var repeat: Number? get() = definedExternally; set(value) = definedExternally
    var repeatDelay: Number? get() = definedExternally; set(value) = definedExternally
    var yoyo: Boolean? get() = definedExternally; set(value) = definedExternally
    var showOnStart: Boolean? get() = definedExternally; set(value) = definedExternally
    var hideOnComplete: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface JSONAnimationFrame {
    var key: String
    var frame: dynamic /* String | Number */
    var duration: Number
}
external interface JSONAnimationManager {
    var anims: Array<JSONAnimation>
    var globalTimeScale: Number
}
external interface GenerateFrameNamesConfig {
    var prefix: String? get() = definedExternally; set(value) = definedExternally
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var end: Number? get() = definedExternally; set(value) = definedExternally
    var suffix: String? get() = definedExternally; set(value) = definedExternally
    var zeroPad: Number? get() = definedExternally; set(value) = definedExternally
    var outputArray: Array<AnimationFrameConfig>? get() = definedExternally; set(value) = definedExternally
    var frames: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface GenerateFrameNumbersConfig {
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var end: Number? get() = definedExternally; set(value) = definedExternally
    var first: Boolean? get() = definedExternally; set(value) = definedExternally
    var outputArray: Array<AnimationFrameConfig>? get() = definedExternally; set(value) = definedExternally
    var frames: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface FPSConfig {
    var min: Number? get() = definedExternally; set(value) = definedExternally
    var target: Number? get() = definedExternally; set(value) = definedExternally
    var forceSetTimeOut: Boolean? get() = definedExternally; set(value) = definedExternally
    var deltaHistory: Number? get() = definedExternally; set(value) = definedExternally
    var panicMax: Number? get() = definedExternally; set(value) = definedExternally
}
external interface LoaderConfig {
    var baseURL: String? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var enableParallel: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxParallelDownloads: Number? get() = definedExternally; set(value) = definedExternally
    var crossOrigin: String? get() = definedExternally; set(value) = definedExternally
    var responseType: String? get() = definedExternally; set(value) = definedExternally
    var async: Boolean? get() = definedExternally; set(value) = definedExternally
    var user: String? get() = definedExternally; set(value) = definedExternally
    var password: String? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
}

class GameConfig(
        var width: dynamic = null, /* String | Number */
        var height: dynamic = null, /* String | Number */
        var zoom: Number? = null,
        var resolution: Number? = null,
        var type: Number? = null,
        var parent: Any? = null,
        var canvas: HTMLCanvasElement? = null,
        var canvasStyle: String? = null,
        var scene: Any? = null,
        var seed: Array<String>? = null,
        var title: String? = null,
        var url: String? = null,
        var version: String? = null,
        var input: dynamic = null,
        var disableContextMenu: Boolean? = null,
        var banner: dynamic = null,
        var fps: FPSConfig? = null,
        var antialias: Boolean? = null,
        var pixelArt: Boolean? = null,
        var autoResize: Boolean? = null,
        var roundPixels: Boolean? = null,
        var transparent: Boolean? = null,
        var clearBeforeRender: Boolean? = null,
        var premultipliedAlpha: Boolean? = null,
        var preserveDrawingBuffer: Boolean? = null,
        var failIfMajorPerformanceCaveat: Boolean? = null,
        var powerPreference: Boolean? = null,
        var backgroundColor: dynamic = null,
        var callbacks: Any? = null,
        var loader: LoaderConfig? = null,
        var images: Any? = null,
        var physics: PhysicsConfig? = null
)

class PhysicsConfig(
        var default: String? = null,
        var arcade: ArcadeConfig? = null
)

class ArcadeConfig(
        var gravity: GravityConfig? = null
)

class GravityConfig(var x: Number? = null, var y: Number? = null)

class SceneConfig(var preload: Any? = null, var create: Any? = null)

external interface PreloadContext {
    var load: AssetLoadContext
}

external interface AssetLoadContext {
    fun setBaseUrl(url: String)

    fun image(key: String, url: String)
}

class EmitterConfig(
        var speed: Number? = null,
        val scale: Number? = null,
        val blendMode: BlendModes? = null
)

external interface JSONCamera {
    var name: String
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var zoom: Number
    var rotation: Number
    var roundPixels: Boolean
    var scrollX: Number
    var scrollY: Number
    var backgroundColor: String
    var bounds: Any? get() = definedExternally; set(value) = definedExternally
}
external interface InputJSONCameraObject {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var zoom: Number? get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
    var roundPixels: Boolean? get() = definedExternally; set(value) = definedExternally
    var scrollX: Number? get() = definedExternally; set(value) = definedExternally
    var scrollY: Number? get() = definedExternally; set(value) = definedExternally
    var backgroundColor: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var bounds: Any? get() = definedExternally; set(value) = definedExternally
}
//external interface FixedKeyControlConfig {
//    var camera: Phaser.Cameras.Scene2D.Camera? get() = definedExternally; set(value) = definedExternally
//    var left: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var right: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var up: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var zoomIn: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var zoomOut: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var zoomSpeed: Number? get() = definedExternally; set(value) = definedExternally
//    var speed: dynamic /* Number | Any */ get() = definedExternally; set(value) = definedExternally
//}
//external interface SmoothedKeyControlConfig {
//    var camera: Phaser.Cameras.Scene2D.Camera? get() = definedExternally; set(value) = definedExternally
//    var left: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var right: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var up: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var zoomIn: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var zoomOut: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var zoomSpeed: Number? get() = definedExternally; set(value) = definedExternally
//    var acceleration: dynamic /* Number | Any */ get() = definedExternally; set(value) = definedExternally
//    var drag: dynamic /* Number | Any */ get() = definedExternally; set(value) = definedExternally
//    var maxSpeed: dynamic /* Number | Any */ get() = definedExternally; set(value) = definedExternally
//}
//external interface RayDef {
//    var origin: Phaser.Math.Vector3
//    var direction: Phaser.Math.Vector3
//}
external interface GenerateTextureConfig {
    var data: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var canvas: HTMLCanvasElement? get() = definedExternally; set(value) = definedExternally
    var palette: Palette? get() = definedExternally; set(value) = definedExternally
    var pixelWidth: Number? get() = definedExternally; set(value) = definedExternally
    var pixelHeight: Number? get() = definedExternally; set(value) = definedExternally
    var resizeCanvas: Boolean? get() = definedExternally; set(value) = definedExternally
    var clearCanvas: Boolean? get() = definedExternally; set(value) = definedExternally
    var preRender: ((canvas: HTMLCanvasElement, context: CanvasRenderingContext2D) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var postRender: ((canvas: HTMLCanvasElement, context: CanvasRenderingContext2D) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface Palette {
    var A: String
    var B: String
    var C: String
    var D: String
    var E: String
    var F: String
}
external interface JSONEllipseCurve {
    var type: String
    var x: Number
    var y: Number
    var xRadius: Number
    var yRadius: Number
    var startAngle: Number
    var endAngle: Number
    var clockwise: Boolean
    var rotation: Number
}
external interface EllipseCurveConfig {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var xRadius: Number? get() = definedExternally; set(value) = definedExternally
    var yRadius: Number? get() = definedExternally; set(value) = definedExternally
    var startAngle: Number? get() = definedExternally; set(value) = definedExternally
    var endAngle: Number? get() = definedExternally; set(value) = definedExternally
    var clockwise: Boolean? get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
}
external interface JSONCurve {
    var type: String
    var points: Array<Number>
}
external interface JSONPath {
    var type: String
    var x: Number
    var y: Number
    var autoClose: Boolean
    var curves: Array<JSONCurve>
}
external fun init(): Unit = definedExternally
external interface InputColorObject {
    var r: Number? get() = definedExternally; set(value) = definedExternally
    var g: Number? get() = definedExternally; set(value) = definedExternally
    var b: Number? get() = definedExternally; set(value) = definedExternally
    var a: Number? get() = definedExternally; set(value) = definedExternally
}
external interface HSLColorObject {
    var h: Number
    var s: Number
    var l: Number
}
external interface DisplayCallbackConfig {
    var tint: Any
    var index: Number
    var charCode: Number
    var x: Number
    var y: Number
    var scale: Number
    var rotation: Number
    var data: Any
}
external interface TextBounds {
    var local: Any
    var global: Any
}
external interface GameObjectConfig {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var depth: Number? get() = definedExternally; set(value) = definedExternally
    var flipX: Boolean? get() = definedExternally; set(value) = definedExternally
    var flipY: Boolean? get() = definedExternally; set(value) = definedExternally
    var scale: dynamic /* Number | Any? */ get() = definedExternally; set(value) = definedExternally
    var scrollFactor: dynamic /* Number | Any? */ get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
    var angle: Number? get() = definedExternally; set(value) = definedExternally
    var alpha: Number? get() = definedExternally; set(value) = definedExternally
    var origin: dynamic /* Number | Any? */ get() = definedExternally; set(value) = definedExternally
    var scaleMode: Number? get() = definedExternally; set(value) = definedExternally
    var blendMode: Number? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var add: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface JSONGameObject {
    var name: String
    var type: String
    var x: Number
    var y: Number
    var scale: Any
    var origin: Any
    var flipX: Boolean
    var flipY: Boolean
    var rotation: Number
    var alpha: Number
    var visible: Boolean
    var scaleMode: Number
    var blendMode: dynamic /* String | Number */
    var textureKey: String
    var frameKey: String
    var data: Any
}
//external interface GroupConfig {
//    var classType: Any? get() = definedExternally; set(value) = definedExternally
//    var active: Boolean? get() = definedExternally; set(value) = definedExternally
//    var maxSize: Number? get() = definedExternally; set(value) = definedExternally
//    var defaultKey: String? get() = definedExternally; set(value) = definedExternally
//    var defaultFrame: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
//    var runChildUpdate: Boolean? get() = definedExternally; set(value) = definedExternally
//    var createCallback: ((item: Phaser.GameObjects.GameObject) -> Unit)? get() = definedExternally; set(value) = definedExternally
//    var removeCallback: ((item: Phaser.GameObjects.GameObject) -> Unit)? get() = definedExternally; set(value) = definedExternally
//    var createMultipleCallback: ((items: Array<Phaser.GameObjects.GameObject>) -> Unit)? get() = definedExternally; set(value) = definedExternally
//}
//external interface GroupCreateConfig {
//    var classType: Any? get() = definedExternally; set(value) = definedExternally
//    var key: String? get() = definedExternally; set(value) = definedExternally
//    var frame: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
//    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
//    var active: Boolean? get() = definedExternally; set(value) = definedExternally
//    var repeat: Number? get() = definedExternally; set(value) = definedExternally
//    var randomKey: Boolean? get() = definedExternally; set(value) = definedExternally
//    var randomFrame: Boolean? get() = definedExternally; set(value) = definedExternally
//    var yoyo: Boolean? get() = definedExternally; set(value) = definedExternally
//    var frameQuantity: Number? get() = definedExternally; set(value) = definedExternally
//    var max: Number? get() = definedExternally; set(value) = definedExternally
//    var setXY: Any? get() = definedExternally; set(value) = definedExternally
//    var setRotation: Any? get() = definedExternally; set(value) = definedExternally
//    var setScale: Any? get() = definedExternally; set(value) = definedExternally
//    var setAlpha: Any? get() = definedExternally; set(value) = definedExternally
//    var hitArea: Any? get() = definedExternally; set(value) = definedExternally
//    var hitAreaCallback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? get() = definedExternally; set(value) = definedExternally
//    var gridAlign: dynamic /* Boolean | GridAlignConfig */ get() = definedExternally; set(value) = definedExternally
//}
external interface GravityWellConfig {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var power: Number? get() = definedExternally; set(value) = definedExternally
    var epsilon: Number? get() = definedExternally; set(value) = definedExternally
    var gravity: Number? get() = definedExternally; set(value) = definedExternally
}
external interface PathConfig {
    var duration: Number
    var from: Number
    var to: Number
    var positionOnPath: Boolean? get() = definedExternally; set(value) = definedExternally
    var rotateToPath: Boolean? get() = definedExternally; set(value) = definedExternally
    var rotationOffset: Number? get() = definedExternally; set(value) = definedExternally
    var verticalAdjust: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface RenderTextureConfig {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
}
external interface Pad {
    var id: String
    var index: Number
}
external interface KeyComboConfig {
    var resetOnWrongKey: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxKeyDelay: Number? get() = definedExternally; set(value) = definedExternally
    var resetOnMatch: Boolean? get() = definedExternally; set(value) = definedExternally
    var deleteOnMatch: Boolean? get() = definedExternally; set(value) = definedExternally
}
//external interface CursorKeys {
//    var up: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var down: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var left: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var right: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var space: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//    var shift: Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
//}
external interface FileConfig {
    var type: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var key: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var responseType: dynamic /* String /* "" */ | String /* "arraybuffer" */ | String /* "blob" */ | String /* "document" */ | String /* "json" */ | String /* "text" */ */ get() = definedExternally; set(value) = definedExternally
    var xhrSettings: dynamic /* Boolean | XHRSettingsObject */ get() = definedExternally; set(value) = definedExternally
    var config: Any? get() = definedExternally; set(value) = definedExternally
}
external interface XHRConfig {
    var key: String
    var texture: String
    var data: String? get() = definedExternally; set(value) = definedExternally
    var xhr: XHRConfig? get() = definedExternally; set(value) = definedExternally
}
external interface FileTypeConfig {
    var key: String
    var texture: String
    var data: String? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var responseType: String? get() = definedExternally; set(value) = definedExternally
    var config: Any? get() = definedExternally; set(value) = definedExternally
    var xhr: XHRConfig? get() = definedExternally; set(value) = definedExternally
}
//external interface LinkFileObject {
//    var type: String
//    var fileA: Phaser.Loader.File
//    var fileB: Phaser.Loader.File
//}
external interface LoaderFileObject {
    var key: String
    var type: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var urls: Array<String>? get() = definedExternally; set(value) = definedExternally
    var textureURL: String? get() = definedExternally; set(value) = definedExternally
    var atlasURL: String? get() = definedExternally; set(value) = definedExternally
    var xmlURL: String? get() = definedExternally; set(value) = definedExternally
    var textureURLs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var atlasURLs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var config: Any? get() = definedExternally; set(value) = definedExternally
    var json: Any? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var xmlXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var audioXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var jsonXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
external interface XHRSettingsObject {
    var responseType: dynamic /* String /* "" */ | String /* "arraybuffer" */ | String /* "blob" */ | String /* "document" */ | String /* "json" */ | String /* "text" */ */
    var async: Boolean
    var user: String
    var password: String
    var timeout: Number
    var header: String
    var headerValue: String
    var overrideMimeType: String?
}
external interface SinCosTable {
    var sin: Number
    var cos: Number
    var length: Number
}
external interface Vector2Like {
    var x: Number
    var y: Number
}
external interface ArcadeBodyBounds {
    var x: Number
    var y: Number
    var right: Number
    var bottom: Number
}
external interface ArcadeBodyCollision {
    var none: Boolean
    var up: Boolean
    var down: Boolean
    var left: Boolean
    var right: Boolean
}
external interface PhysicsGroupDefaults {
    var setCollideWorldBounds: Any
    var setAccelerationX: Number
    var setAccelerationY: Number
    var setBounceX: Number
    var setBounceY: Number
    var setDragX: Number
    var setDragY: Number
    var setGravityX: Number
    var setGravityY: Number
    var setFrictionX: Number
    var setFrictionY: Number
    var setVelocityX: Number
    var setVelocityY: Number
    var setAngularVelocity: Number
    var setAngularAcceleration: Number
    var setAngularDrag: Number
    var setMass: Number
    var setImmovable: Boolean
}
external interface ArcadeWorldConfig {
    var gravity: Any? get() = definedExternally; set(value) = definedExternally
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var checkCollision: Any? get() = definedExternally; set(value) = definedExternally
    var overlapBias: Number? get() = definedExternally; set(value) = definedExternally
    var tileBias: Number? get() = definedExternally; set(value) = definedExternally
    var forceX: Boolean? get() = definedExternally; set(value) = definedExternally
    var isPaused: Boolean? get() = definedExternally; set(value) = definedExternally
    var debug: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugShowBody: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugShowStaticBody: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugShowVelocity: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugBodyColor: Number? get() = definedExternally; set(value) = definedExternally
    var debugStaticBodyColor: Number? get() = definedExternally; set(value) = definedExternally
    var debugVelocityColor: Number? get() = definedExternally; set(value) = definedExternally
    var maxEntries: Number? get() = definedExternally; set(value) = definedExternally
}
external interface CheckCollisionObject {
    var up: Boolean
    var down: Boolean
    var left: Boolean
    var right: Boolean
}
external interface ArcadeWorldDefaults {
    var debugShowBody: Boolean
    var debugShowStaticBody: Boolean
    var debugShowVelocity: Boolean
    var bodyDebugColor: Number
    var staticBodyDebugColor: Number
    var velocityDebugColor: Number
}
external interface ArcadeWorldTreeMinMax {
    var minX: Number
    var minY: Number
    var maxX: Number
    var maxY: Number
}
//external interface JSONImpactBody {
//    var name: String
//    var size: Any
//    var pos: Any
//    var vel: Any
//    var accel: Any
//    var friction: Any
//    var maxVel: Any
//    var gravityFactor: Number
//    var bounciness: Number
//    var minBounceVelocity: Number
//    var type: Phaser.Physics.Impact.TYPE
//    var checkAgainst: Phaser.Physics.Impact.TYPE
//    var collides: Phaser.Physics.Impact.COLLIDES
//}
//external interface RendererConfig {
//    var clearBeforeRender: Boolean
//    var pixelArt: Boolean
//    var backgroundColor: Phaser.Display.Color
//    var resolution: Number
//    var autoResize: Boolean
//    var roundPixels: Boolean
//}
external interface SnapshotState {
    var callback: (snapshot: HTMLImageElement) -> Unit
    var type: String
    var encoder: Number
}
external interface SoundConfig {
    var mute: Boolean? get() = definedExternally; set(value) = definedExternally
    var volume: Number? get() = definedExternally; set(value) = definedExternally
    var rate: Number? get() = definedExternally; set(value) = definedExternally
    var detune: Number? get() = definedExternally; set(value) = definedExternally
    var seek: Number? get() = definedExternally; set(value) = definedExternally
    var loop: Boolean? get() = definedExternally; set(value) = definedExternally
    var delay: Number? get() = definedExternally; set(value) = definedExternally
}
external interface SoundMarker {
    var name: String
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var duration: Number? get() = definedExternally; set(value) = definedExternally
    var config: SoundConfig? get() = definedExternally; set(value) = definedExternally
}
external interface SpriteSheetConfig {
    var frameWidth: Number
    var frameHeight: Number? get() = definedExternally; set(value) = definedExternally
    var startFrame: Number? get() = definedExternally; set(value) = definedExternally
    var endFrame: Number? get() = definedExternally; set(value) = definedExternally
    var margin: Number? get() = definedExternally; set(value) = definedExternally
    var spacing: Number? get() = definedExternally; set(value) = definedExternally
}
external interface SpriteSheetFromAtlasConfig {
    var atlas: String
    var frame: String
    var frameWidth: Number
    var frameHeight: Number? get() = definedExternally; set(value) = definedExternally
    var startFrame: Number? get() = definedExternally; set(value) = definedExternally
    var endFrame: Number? get() = definedExternally; set(value) = definedExternally
    var margin: Number? get() = definedExternally; set(value) = definedExternally
    var spacing: Number? get() = definedExternally; set(value) = definedExternally
}
external interface GetTilesWithinFilteringOptions {
    var isNotEmpty: Boolean? get() = definedExternally; set(value) = definedExternally
    var isColliding: Boolean? get() = definedExternally; set(value) = definedExternally
    var hasInterestingFace: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TilemapConfig {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var data: Array<Array<Number>>? get() = definedExternally; set(value) = definedExternally
    var tileWidth: Number? get() = definedExternally; set(value) = definedExternally
    var tileHeight: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var insertNull: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TimerEventConfig {
    var delay: Number? get() = definedExternally; set(value) = definedExternally
    var repeat: Number? get() = definedExternally; set(value) = definedExternally
    var loop: Boolean? get() = definedExternally; set(value) = definedExternally
    var callback: Function<*>? get() = definedExternally; set(value) = definedExternally
    var callbackScope: Any? get() = definedExternally; set(value) = definedExternally
    var args: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var timeScale: Number? get() = definedExternally; set(value) = definedExternally
    var startAt: Number? get() = definedExternally; set(value) = definedExternally
    var paused: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface TweenDataGenConfig {
    var delay: Function<*>
    var duration: Function<*>
    var hold: Function<*>
    var repeat: Function<*>
    var repeatDelay: Function<*>
}
open external class Class(definition: Any)
