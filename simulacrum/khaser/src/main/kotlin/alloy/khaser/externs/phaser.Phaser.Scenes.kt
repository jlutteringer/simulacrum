//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Scenes")]
//package Phaser.Scenes
//
//import alloy.khaser.externs.Game
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//import org.w3c.dom.*
//
//external var PENDING: Number = definedExternally
//external var INIT: Number = definedExternally
//external var START: Number = definedExternally
//external var LOADING: Number = definedExternally
//external var CREATING: Number = definedExternally
//external var RUNNING: Number = definedExternally
//external var PAUSED: Number = definedExternally
//external var SLEEPING: Number = definedExternally
//external var SHUTDOWN: Number = definedExternally
//external var DESTROYED: Number = definedExternally
//external fun GetPhysicsPlugins(sys: Systems): Array<Any> = definedExternally
//external fun GetScenePlugins(sys: Systems): Array<Any> = definedExternally
//external open class SceneManager(game: Game, sceneConfig: Any) {
//    open var game: Game = definedExternally
//    open var keys: Any = definedExternally
//    open var scenes: Array<Any> = definedExternally
//    open var isProcessing: Boolean = definedExternally
//    open var isBooted: Boolean = definedExternally
//    open fun processQueue(): Unit = definedExternally
//    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean? = definedExternally /* null */, data: Any? = definedExternally /* null */): Scene = definedExternally
//    open fun add(key: String, sceneConfig: Scene, autoStart: Boolean? = definedExternally /* null */, data: Any? = definedExternally /* null */): Scene = definedExternally
//    open fun add(key: String, sceneConfig: Phaser.Scenes.Settings.Config, autoStart: Boolean? = definedExternally /* null */, data: Any? = definedExternally /* null */): Scene = definedExternally
//    open fun remove(scene: String): SceneManager = definedExternally
//    open fun remove(scene: Scene): SceneManager = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open fun resize(width: Number, height: Number): Unit = definedExternally
//    open fun render(renderer: Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
//    open fun render(renderer: Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
//    open fun getScene(key: String): Scene = definedExternally
//    open fun getScene(key: Scene): Scene = definedExternally
//    open fun isActive(key: String): Boolean = definedExternally
//    open fun isVisible(key: String): Boolean = definedExternally
//    open fun isSleeping(key: String): Boolean = definedExternally
//    open fun pause(key: String): SceneManager = definedExternally
//    open fun resume(key: String): SceneManager = definedExternally
//    open fun sleep(key: String): SceneManager = definedExternally
//    open fun wake(key: String): SceneManager = definedExternally
//    open fun start(key: String, data: Any? = definedExternally /* null */): SceneManager = definedExternally
//    open fun stop(key: String): SceneManager = definedExternally
//    open fun switch(from: String, to: String): SceneManager = definedExternally
//    open fun getAt(index: Number): Scene? = definedExternally
//    open fun getIndex(key: String): Number = definedExternally
//    open fun getIndex(key: Scene): Number = definedExternally
//    open fun bringToTop(key: String): SceneManager = definedExternally
//    open fun bringToTop(key: Scene): SceneManager = definedExternally
//    open fun sendToBack(key: String): SceneManager = definedExternally
//    open fun sendToBack(key: Scene): SceneManager = definedExternally
//    open fun moveDown(key: String): SceneManager = definedExternally
//    open fun moveDown(key: Scene): SceneManager = definedExternally
//    open fun moveUp(key: String): SceneManager = definedExternally
//    open fun moveUp(key: Scene): SceneManager = definedExternally
//    open fun moveAbove(keyA: String, keyB: String): SceneManager = definedExternally
//    open fun moveAbove(keyA: String, keyB: Scene): SceneManager = definedExternally
//    open fun moveAbove(keyA: Scene, keyB: String): SceneManager = definedExternally
//    open fun moveAbove(keyA: Scene, keyB: Scene): SceneManager = definedExternally
//    open fun moveBelow(keyA: String, keyB: String): SceneManager = definedExternally
//    open fun moveBelow(keyA: String, keyB: Scene): SceneManager = definedExternally
//    open fun moveBelow(keyA: Scene, keyB: String): SceneManager = definedExternally
//    open fun moveBelow(keyA: Scene, keyB: Scene): SceneManager = definedExternally
//    open fun swapPosition(keyA: String, keyB: String): SceneManager = definedExternally
//    open fun swapPosition(keyA: String, keyB: Scene): SceneManager = definedExternally
//    open fun swapPosition(keyA: Scene, keyB: String): SceneManager = definedExternally
//    open fun swapPosition(keyA: Scene, keyB: Scene): SceneManager = definedExternally
//    open fun dump(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class ScenePlugin(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Systems = definedExternally
//    open var settings: Phaser.Scenes.Settings.Object = definedExternally
//    open var key: String = definedExternally
//    open var manager: SceneManager = definedExternally
//    open var transitionProgress: Number = definedExternally
//    open fun start(key: String, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
//    open fun restart(data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
//    open fun transition(config: Phaser.Scenes.ScenePlugin.SceneTransitionConfig): Boolean = definedExternally
//    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean): ScenePlugin = definedExternally
//    open fun add(key: String, sceneConfig: Scene, autoStart: Boolean): ScenePlugin = definedExternally
//    open fun add(key: String, sceneConfig: Phaser.Scenes.Settings.Config, autoStart: Boolean): ScenePlugin = definedExternally
//    open fun launch(key: String, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
//    open fun pause(key: String): ScenePlugin = definedExternally
//    open fun resume(key: String): ScenePlugin = definedExternally
//    open fun sleep(key: String): ScenePlugin = definedExternally
//    open fun wake(key: String): ScenePlugin = definedExternally
//    open fun switch(key: String): ScenePlugin = definedExternally
//    open fun stop(key: String): ScenePlugin = definedExternally
//    open fun setActive(value: Boolean): ScenePlugin = definedExternally
//    open fun setVisible(value: Boolean): ScenePlugin = definedExternally
//    open fun isSleeping(key: String): Boolean = definedExternally
//    open fun isActive(key: String): Boolean = definedExternally
//    open fun isVisible(key: String): Boolean = definedExternally
//    open fun swapPosition(keyA: String, keyB: String? = definedExternally /* null */): ScenePlugin = definedExternally
//    open fun moveAbove(keyA: String, keyB: String? = definedExternally /* null */): ScenePlugin = definedExternally
//    open fun moveBelow(keyA: String, keyB: String? = definedExternally /* null */): ScenePlugin = definedExternally
//    open fun remove(key: String): SceneManager = definedExternally
//    open fun remove(key: Scene): SceneManager = definedExternally
//    open fun moveUp(key: String): ScenePlugin = definedExternally
//    open fun moveDown(key: String): ScenePlugin = definedExternally
//    open fun bringToTop(key: String): ScenePlugin = definedExternally
//    open fun sendToBack(key: String): ScenePlugin = definedExternally
//    open fun get(key: String): Scene = definedExternally
//    interface SceneTransitionConfig {
//        var target: String
//        var duration: Number? get() = definedExternally; set(value) = definedExternally
//        var sleep: Boolean? get() = definedExternally; set(value) = definedExternally
//        var allowInput: Boolean? get() = definedExternally; set(value) = definedExternally
//        var moveAbove: Boolean? get() = definedExternally; set(value) = definedExternally
//        var moveBelow: Boolean? get() = definedExternally; set(value) = definedExternally
//        var onUpdate: Function<*>? get() = definedExternally; set(value) = definedExternally
//        var onUpdateScope: Any? get() = definedExternally; set(value) = definedExternally
//        var data: Any? get() = definedExternally; set(value) = definedExternally
//    }
//}
//external open class Systems {
//    constructor(scene: Scene, config: String)
//    constructor(scene: Scene, config: Phaser.Scenes.Settings.Config)
//    open var scene: Scene = definedExternally
//    open var game: Game = definedExternally
//    open var config: dynamic /* String | Phaser.Scenes.Settings.Config */ = definedExternally
//    open var settings: Phaser.Scenes.Settings.Object = definedExternally
//    open var canvas: HTMLCanvasElement = definedExternally
//    open var context: CanvasRenderingContext2D = definedExternally
//    open var anims: Phaser.Animations.AnimationManager = definedExternally
//    open var cache: Phaser.Cache.CacheManager = definedExternally
//    open var plugins: Phaser.Boot.PluginManager = definedExternally
//    open var registry: Phaser.Data.DataManager = definedExternally
//    open var sound: Phaser.Sound.BaseSoundManager = definedExternally
//    open var textures: Phaser.Textures.TextureManager = definedExternally
//    open var add: Phaser.GameObjects.GameObjectFactory = definedExternally
//    open var cameras: Phaser.Cameras.Scene2D.CameraManager = definedExternally
//    open var displayList: Phaser.GameObjects.DisplayList = definedExternally
//    open var events: Phaser.Events.EventEmitter = definedExternally
//    open var make: Phaser.GameObjects.GameObjectCreator = definedExternally
//    open var scenePlugin: ScenePlugin = definedExternally
//    open var updateList: Phaser.GameObjects.UpdateList = definedExternally
//    open fun init(game: Game): Unit = definedExternally
//    open fun step(time: Number, delta: Number): Unit = definedExternally
//    open fun render(renderer: Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
//    open fun render(renderer: Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
//    open fun queueDepthSort(): Unit = definedExternally
//    open fun depthSort(): Unit = definedExternally
//    open fun pause(): Systems = definedExternally
//    open fun resume(): Systems = definedExternally
//    open fun sleep(): Systems = definedExternally
//    open fun wake(): Systems = definedExternally
//    open fun isSleeping(): Boolean = definedExternally
//    open fun isActive(): Boolean = definedExternally
//    open fun isTransitioning(): Boolean = definedExternally
//    open fun isTransitionOut(): Boolean = definedExternally
//    open fun isTransitionIn(): Boolean = definedExternally
//    open fun isVisible(): Boolean = definedExternally
//    open fun setVisible(value: Boolean): Systems = definedExternally
//    open fun setActive(value: Boolean): Systems = definedExternally
//    open fun start(data: Any): Unit = definedExternally
//    open fun resize(width: Number, height: Number): Unit = definedExternally
//    open fun shutdown(): Unit = definedExternally
//}
