//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Cameras.Scene2D.Effects")]
//package Phaser.Cameras.Scene2D.Effects
//
//import kotlin.js.*
//import kotlin.js.Json
//import org.khronos.webgl.*
//import org.w3c.dom.*
//import org.w3c.dom.events.*
//import org.w3c.dom.parsing.*
//import org.w3c.dom.svg.*
//import org.w3c.dom.url.*
//import org.w3c.fetch.*
//import org.w3c.files.*
//import org.w3c.notifications.*
//import org.w3c.performance.*
//import org.w3c.workers.*
//import org.w3c.xhr.*
//
//external open class Fade(camera: Phaser.Cameras.Scene2D.Camera) {
//    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
//    open var isRunning: Boolean = definedExternally
//    open var isComplete: Boolean = definedExternally
//    open var direction: Boolean = definedExternally
//    open var duration: Number = definedExternally
//    open var progress: Number = definedExternally
//    open fun start(direction: Boolean? = definedExternally /* null */, duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open fun postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean = definedExternally
//    open fun postRenderWebGL(pipeline: Phaser.Renderer.WebGL.Pipelines.FlatTintPipeline, getTintFunction: Function<*>): Boolean = definedExternally
//    open fun effectComplete(): Unit = definedExternally
//    open fun reset(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class Flash(camera: Phaser.Cameras.Scene2D.Camera) {
//    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
//    open var isRunning: Boolean = definedExternally
//    open var duration: Number = definedExternally
//    open var progress: Number = definedExternally
//    open fun start(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open fun postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean = definedExternally
//    open fun postRenderWebGL(pipeline: Phaser.Renderer.WebGL.Pipelines.FlatTintPipeline, getTintFunction: Function<*>): Boolean = definedExternally
//    open fun effectComplete(): Unit = definedExternally
//    open fun reset(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class Shake(camera: Phaser.Cameras.Scene2D.Camera) {
//    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
//    open var isRunning: Boolean = definedExternally
//    open var duration: Number = definedExternally
//    open var intensity: Phaser.Math.Vector2 = definedExternally
//    open var progress: Number = definedExternally
//    open fun start(duration: Number? = definedExternally /* null */, intensity: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
//    open fun preRender(): Unit = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open fun effectComplete(): Unit = definedExternally
//    open fun reset(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
