//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Renderer.Canvas")]
//package Phaser.Renderer.Canvas
//
//import alloy.khaser.externs.Game
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//import org.w3c.dom.*
//
//external open class CanvasRenderer(game: Game) {
//    open var game: Game = definedExternally
//    open var type: Number = definedExternally
//    open var drawCount: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var config: RendererConfig = definedExternally
//    open var scaleMode: Number = definedExternally
//    open var gameCanvas: HTMLCanvasElement = definedExternally
//    open var gameContext: CanvasRenderingContext2D = definedExternally
//    open var currentContext: CanvasRenderingContext2D = definedExternally
//    open var drawImage: Function<*> = definedExternally
//    open var blitImage: Function<*> = definedExternally
//    open var blendModes: Array<Any> = definedExternally
//    open var currentAlpha: Number = definedExternally
//    open var currentBlendMode: Number = definedExternally
//    open var currentScaleMode: Number = definedExternally
//    open var snapshotCallback: (snapshot: HTMLImageElement) -> Unit = definedExternally
//    open var snapshotType: String = definedExternally
//    open var snapshotEncoder: Number = definedExternally
//    open fun init(): Unit = definedExternally
//    open fun resize(width: Number, height: Number): Unit = definedExternally
//    open fun onContextLost(callback: Function<*>): Unit = definedExternally
//    open fun onContextRestored(callback: Function<*>): Unit = definedExternally
//    open fun resetTransform(): Unit = definedExternally
//    open fun setBlendMode(blendMode: Number): Number = definedExternally
//    open fun setAlpha(alpha: Number): Number = definedExternally
//    open fun preRender(): Unit = definedExternally
//    open fun render(scene: Scene, children: Phaser.GameObjects.DisplayList, interpolationPercentage: Number, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun postRender(): Unit = definedExternally
//    open fun snapshot(callback: (snapshot: HTMLImageElement) -> Unit, type: String, encoderOptions: Number): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external fun BlitImage(dx: Number, dy: Number, frame: Phaser.Textures.Frame): Unit = definedExternally
//external fun DrawImage(src: Phaser.GameObjects.GameObject, camera: Phaser.Cameras.Scene2D.Camera, parentMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//external fun GetBlendModes(): Array<Any> = definedExternally
