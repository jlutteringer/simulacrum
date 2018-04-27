@file:JsModule("phaser")
package alloy.khaser.externs

import kotlin.js.*
import org.w3c.dom.*

open external class Game(GameConfig: GameConfig? = definedExternally /* null */) {
//    open var config: Phaser.Boot.Config = definedExternally
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */ = definedExternally
    open var canvas: HTMLCanvasElement = definedExternally
    open var context: CanvasRenderingContext2D = definedExternally
    open var isBooted: Boolean = definedExternally
    open var isRunning: Boolean = definedExternally
    open var events: Phaser.Events.EventEmitter = definedExternally
//    open var anims: Phaser.Animations.AnimationManager = definedExternally
//    open var textures: Phaser.Textures.TextureManager = definedExternally
//    open var cache: Phaser.Cache.CacheManager = definedExternally
//    open var registry: Phaser.Data.DataManager = definedExternally
//    open var input: Phaser.Input.InputManager = definedExternally
//    open var scene: Phaser.Scenes.SceneManager = definedExternally
    open var device: DeviceConf = definedExternally
//    open var sound: Phaser.Sound.BaseSoundManager = definedExternally
//    open var loop: Phaser.Boot.TimeStep = definedExternally
//    open var plugins: Phaser.Boot.PluginManager = definedExternally
    open fun boot(): Unit = definedExternally
    open fun start(): Unit = definedExternally
    open fun step(time: Number, delta: Number): Unit = definedExternally
    open fun headlessStep(time: Number, delta: Number): Unit = definedExternally
    open fun onHidden(): Unit = definedExternally
    open fun onVisible(): Unit = definedExternally
    open fun onBlur(): Unit = definedExternally
    open fun onFocus(): Unit = definedExternally
    open fun resize(width: Number, height: Number): Unit = definedExternally
    open fun destroy(removeCanvas: Boolean): Unit = definedExternally
}

external var VERSION: String = definedExternally
external var AUTO: Number = definedExternally
external var CANVAS: Number = definedExternally
external var WEBGL: Number = definedExternally
external var HEADLESS: Number = definedExternally
external var FOREVER: Number = definedExternally
external var NONE: Number = definedExternally
external var UP: Number = definedExternally
external var DOWN: Number = definedExternally
external var LEFT: Number = definedExternally
external var RIGHT: Number = definedExternally
external interface DeviceConf {
    var os: Phaser.Device.OS
    var browser: Phaser.Device.Browser
    var features: Phaser.Device.Features
    var input: Phaser.Device.Input
    var audio: Phaser.Device.Audio
    var video: Phaser.Device.Video
    var fullscreen: Phaser.Device.Fullscreen
    var canvasFeatures: Phaser.Device.CanvasFeatures
}
external enum class BlendModes {
    SKIP_CHECK,
    NORMAL,
    ADD,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY
}
external enum class ScaleModes {
    DEFAULT,
    LINEAR,
    NEAREST
}
//external open class Scene {
//    constructor(config: String)
//    constructor(config: Phaser.Scenes.Settings.Config)
//
//    open var sys: Phaser.Scenes.Systems = definedExternally
//    open var game: Game = definedExternally
//    open var anims: Phaser.Animations.AnimationManager = definedExternally
//    open var cache: Phaser.Cache.CacheManager = definedExternally
//    open var registry: Phaser.Data.DataManager = definedExternally
//    open var sound: Phaser.Sound.BaseSoundManager = definedExternally
//    open var textures: Phaser.Textures.TextureManager = definedExternally
//    open var events: Phaser.Events.EventEmitter = definedExternally
//    open var cameras: Phaser.Cameras.Scene2D.CameraManager = definedExternally
//    open var cameras3d: Phaser.Cameras.Sprite3D.CameraManager = definedExternally
//    open var add: Phaser.GameObjects.GameObjectFactory = definedExternally
//    open var make: Phaser.GameObjects.GameObjectCreator = definedExternally
//    open var scene: Phaser.Scenes.ScenePlugin = definedExternally
//    open var children: Phaser.GameObjects.DisplayList = definedExternally
//    open var lights: Phaser.GameObjects.DisplayList = definedExternally
//    open var data: Phaser.Data.DataManager = definedExternally
//    open var input: Phaser.Input.InputPlugin = definedExternally
//    open var load: Phaser.Loader.LoaderPlugin = definedExternally
//    open var time: Phaser.Time.Clock = definedExternally
//    open var tweens: Phaser.Tweens.TweenManager = definedExternally
//    open var physics: Phaser.Physics.Arcade.ArcadePhysics = definedExternally
//    open var impact: Phaser.Physics.Impact.ImpactPhysics = definedExternally
//    open var matter: Phaser.Physics.Matter.MatterPhysics = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//}
