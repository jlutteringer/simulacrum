//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Boot")]
//package Phaser.Boot
//
//import alloy.khaser.externs.Game
//import alloy.khaser.externs.GameConfig
//import kotlin.js.*
//
//external open class Config(GameConfig: GameConfig? = definedExternally /* null */)
//external fun CreateRenderer(game: Game): Unit = definedExternally
//external fun DebugHeader(game: Game): Unit = definedExternally
//external open class PluginManager(game: Game) {
//    open var game: Game = definedExternally
//    open fun boot(): Unit = definedExternally
//    open fun installGlobal(sys: Phaser.Scenes.Systems, globalPlugins: Array<Any>): Unit = definedExternally
//    open fun installLocal(sys: Phaser.Scenes.Systems, scenePlugins: Array<Any>): Unit = definedExternally
//    open fun remove(key: String): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//    companion object {
//        fun register(key: String, plugin: Any, mapping: String): Unit = definedExternally
//    }
//}
//external open class TimeStep(game: Game, config: FPSConfig) {
//    open var game: Game = definedExternally
//    open var raf: Phaser.DOM.RequestAnimationFrame = definedExternally
//    open var started: Boolean = definedExternally
//    open var running: Boolean = definedExternally
//    open var minFps: Number = definedExternally
//    open var targetFps: Number = definedExternally
//    open var actualFps: Number = definedExternally
//    open var nextFpsUpdate: Number = definedExternally
//    open var framesThisSecond: Number = definedExternally
//    open var callback: (time: Number, average: Number, interpolation: Number) -> Unit = definedExternally
//    open var forceSetTimeOut: Boolean = definedExternally
//    open var time: Number = definedExternally
//    open var startTime: Number = definedExternally
//    open var lastTime: Number = definedExternally
//    open var frame: Number = definedExternally
//    open var inFocus: Boolean = definedExternally
//    open var delta: Number = definedExternally
//    open var deltaIndex: Number = definedExternally
//    open var deltaHistory: Array<Any> = definedExternally
//    open var deltaSmoothingMax: Number = definedExternally
//    open var panicMax: Number = definedExternally
//    open var rawDelta: Number = definedExternally
//    open fun blur(): Unit = definedExternally
//    open fun focus(): Unit = definedExternally
//    open fun pause(): Unit = definedExternally
//    open fun resume(): Unit = definedExternally
//    open fun resetDelta(): Unit = definedExternally
//    open fun start(callback: (time: Number, average: Number, interpolation: Number) -> Unit): Unit = definedExternally
//    open fun step(time: Number): Unit = definedExternally
//    open fun tick(): Unit = definedExternally
//    open fun sleep(): Unit = definedExternally
//    open fun wake(seamless: Boolean? = definedExternally /* null */): Unit = definedExternally
//    open fun stop(): TimeStep = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external fun VisibilityHandler(eventEmitter: Phaser.Events.EventEmitter): Unit = definedExternally
