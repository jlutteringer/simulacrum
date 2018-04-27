//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Cameras.Scene2D")]
//package Phaser.Cameras.Scene2D
//
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//
//external open class Camera(x: Number, y: Number, width: Number, height: Number) : Phaser.Events.EventEmitter {
//    open var scene: Scene = definedExternally
//    open var name: String = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var roundPixels: Boolean = definedExternally
//    open var useBounds: Boolean = definedExternally
//    open var inputEnabled: Boolean = definedExternally
//    open var scrollX: Number = definedExternally
//    open var scrollY: Number = definedExternally
//    open var zoom: Number = definedExternally
//    open var rotation: Number = definedExternally
//    open var matrix: Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    open var transparent: Boolean = definedExternally
//    open var backgroundColor: Phaser.Display.Color = definedExternally
//    open var fadeEffect: Phaser.Cameras.Scene2D.Effects.Fade = definedExternally
//    open var flashEffect: Phaser.Cameras.Scene2D.Effects.Flash = definedExternally
//    open var shakeEffect: Phaser.Cameras.Scene2D.Effects.Shake = definedExternally
//    open var disableCull: Boolean = definedExternally
//    open var culledObjects: Array<Phaser.GameObjects.GameObject> = definedExternally
//    open fun centerToBounds(): Camera = definedExternally
//    open fun centerToSize(): Camera = definedExternally
//    open fun <G : Array<Phaser.GameObjects.GameObject>> cull(renderableObjects: G): G = definedExternally
//    open fun fadeIn(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
//    open fun fadeOut(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
//    open fun fadeFrom(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
//    open fun fade(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
//    open fun flash(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
//    open fun shake(duration: Number? = definedExternally /* null */, intensity: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
//    open fun <O : Phaser.Math.Vector2> getWorldPoint(x: Number, y: Number, output: O? = definedExternally /* null */): O = definedExternally
//    open fun ignore(gameObject: Phaser.GameObjects.GameObject): Camera = definedExternally
//    open fun ignore(gameObject: Array<Phaser.GameObjects.GameObject>): Camera = definedExternally
//    open fun preRender(baseScale: Number, resolution: Number): Unit = definedExternally
//    open fun removeBounds(): Camera = definedExternally
//    open fun setAngle(value: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun setBackgroundColor(color: String? = definedExternally /* null */): Camera = definedExternally
//    open fun setBackgroundColor(color: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun setBackgroundColor(color: InputColorObject? = definedExternally /* null */): Camera = definedExternally
//    open fun setBounds(x: Number, y: Number, width: Number, height: Number): Camera = definedExternally
//    open fun setName(value: String? = definedExternally /* null */): Camera = definedExternally
//    open fun setPosition(x: Number, y: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun setRotation(value: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun setRoundPixels(value: Boolean): Camera = definedExternally
//    open fun setScene(scene: Scene): Camera = definedExternally
//    open fun setScroll(x: Number, y: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun setSize(width: Number, height: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun setViewport(x: Number, y: Number, width: Number, height: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun setZoom(value: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun startFollow(target: Any?, roundPx: Boolean? = definedExternally /* null */): Camera = definedExternally
//    open fun startFollow(target: Phaser.GameObjects.GameObject, roundPx: Boolean? = definedExternally /* null */): Camera = definedExternally
//    open fun stopFollow(): Camera = definedExternally
//    open fun toJSON(): JSONCamera = definedExternally
//    open fun resetFX(): Camera = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//    open fun setBackgroundColor(): Camera = definedExternally
//}
//external open class CameraManager(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var currentCameraId: Number = definedExternally
//    open var cameras: Array<Camera> = definedExternally
//    open var cameraPool: Array<Camera> = definedExternally
//    open var main: Camera = definedExternally
//    open var baseScale: Number = definedExternally
//    open fun add(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, makeMain: Boolean? = definedExternally /* null */, name: String? = definedExternally /* null */): Camera = definedExternally
//    open fun addExisting(camera: Camera): Camera = definedExternally
//    open fun fromJSON(config: InputJSONCameraObject): CameraManager = definedExternally
//    open fun fromJSON(config: Array<InputJSONCameraObject>): CameraManager = definedExternally
//    open fun getCamera(name: String): Camera = definedExternally
//    open fun getCameraBelowPointer(pointer: Phaser.Input.Pointer): Camera = definedExternally
//    open fun remove(camera: Camera): Unit = definedExternally
//    open fun render(renderer: Phaser.Renderer.Canvas.CanvasRenderer, children: Array<Phaser.GameObjects.GameObject>, interpolation: Number): Unit = definedExternally
//    open fun render(renderer: Phaser.Renderer.WebGL.WebGLRenderer, children: Array<Phaser.GameObjects.GameObject>, interpolation: Number): Unit = definedExternally
//    open fun resetAll(): Camera = definedExternally
//    open fun update(timestep: Number, delta: Number): Unit = definedExternally
//    open fun resize(width: Number, height: Number): Unit = definedExternally
//}
