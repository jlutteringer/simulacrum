//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Input")]
//package Phaser.Input
//
//import alloy.khaser.externs.Game
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//import org.w3c.dom.*
//import org.w3c.dom.events.*
//
//external interface InteractiveObject {
//    var gameObject: Phaser.GameObjects.GameObject
//    var enabled: Boolean
//    var draggable: Boolean
//    var dropZone: Boolean
//    var target: Phaser.GameObjects.GameObject
//    var camera: Phaser.Cameras.Scene2D.Camera
//    var hitArea: Any
//    var hitAreaCallback: (hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit
//    var localX: Number
//    var localY: Number
//    var dragState: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ */
//    var dragStartX: Number
//    var dragStartY: Number
//    var dragX: Number
//    var dragY: Number
//}
//external fun CreateInteractiveObject(gameObject: Phaser.GameObjects.GameObject, hitArea: Any, hitAreaCallback: (hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit): Phaser.Input.InteractiveObject = definedExternally
//external open class InputManager(game: Game, config: Any) {
//    open var game: Game = definedExternally
//    open var canvas: HTMLCanvasElement = definedExternally
//    open var config: Any = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var events: Phaser.Events.EventEmitter = definedExternally
//    open var queue: Array<Any> = definedExternally
//    open var keyboard: Phaser.Input.Keyboard.KeyboardManager = definedExternally
//    open var mouse: Phaser.Input.Mouse.MouseManager = definedExternally
//    open var touch: Phaser.Input.Touch.TouchManager = definedExternally
//    open var gamepad: Phaser.Input.Gamepad.GamepadManager = definedExternally
//    open var activePointer: Pointer = definedExternally
//    open var scale: Any = definedExternally
//    open var globalTopOnly: Boolean = definedExternally
//    open var ignoreEvents: Boolean = definedExternally
//    open var bounds: Phaser.Geom.Rectangle = definedExternally
//    open fun boot(): Unit = definedExternally
//    open fun updateBounds(): Unit = definedExternally
//    open fun resize(): Unit = definedExternally
//    open fun update(time: Number): Unit = definedExternally
//    open fun hitTest(x: Number, y: Number, gameObjects: Array<Any>, camera: Phaser.Cameras.Scene2D.Camera, output: Array<Any>): Array<Any> = definedExternally
//    open fun pointWithinHitArea(gameObject: Phaser.GameObjects.GameObject, x: Number, y: Number): Boolean = definedExternally
//    open fun pointWithinInteractiveObject(`object`: Phaser.Input.InteractiveObject, x: Number, y: Number): Boolean = definedExternally
//    open fun transformX(pageX: Number): Number = definedExternally
//    open fun transformY(pageY: Number): Number = definedExternally
//    open fun getOffsetX(): Number = definedExternally
//    open fun getOffsetY(): Number = definedExternally
//    open fun getScaleX(): Number = definedExternally
//    open fun getScaleY(): Number = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class InputPlugin(scene: Scene) : Phaser.Events.EventEmitter {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var settings: Phaser.Scenes.Settings.Object = definedExternally
//    open var manager: InputManager = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var displayList: Phaser.GameObjects.DisplayList = definedExternally
//    open var cameras: Nothing? = definedExternally
//    open var keyboard: Phaser.Input.Keyboard.KeyboardManager = definedExternally
//    open var mouse: Phaser.Input.Mouse.MouseManager = definedExternally
//    open var gamepad: Phaser.Input.Gamepad.GamepadManager = definedExternally
//    open var topOnly: Boolean = definedExternally
//    open var pollRate: Number = definedExternally
//    open var dragDistanceThreshold: Number = definedExternally
//    open var dragTimeThreshold: Number = definedExternally
//    open fun preUpdate(): Unit = definedExternally
//    open fun clear(gameObject: Phaser.GameObjects.GameObject): Phaser.GameObjects.GameObject = definedExternally
//    open fun disable(gameObject: Phaser.GameObjects.GameObject): Unit = definedExternally
//    open fun enable(gameObject: Phaser.GameObjects.GameObject, shape: Any, callback: (hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit, dropZone: Boolean? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun hitTestPointer(pointer: Pointer): Array<Any> = definedExternally
//    open fun processDownEvents(pointer: Pointer): Number = definedExternally
//    open fun processDragEvents(pointer: Number, time: Number): Number = definedExternally
//    open fun processMoveEvents(pointer: Pointer): Number = definedExternally
//    open fun processOverOutEvents(pointer: Pointer): Number = definedExternally
//    open fun processUpEvents(pointer: Pointer): Unit = definedExternally
//    open fun queueForInsertion(child: Phaser.GameObjects.GameObject): InputPlugin = definedExternally
//    open fun queueForRemoval(child: Phaser.GameObjects.GameObject): InputPlugin = definedExternally
//    open fun setDraggable(gameObjects: Phaser.GameObjects.GameObject, value: Boolean? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setDraggable(gameObjects: Array<Phaser.GameObjects.GameObject>, value: Boolean? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitArea(gameObjects: Phaser.GameObjects.GameObject, shape: Any? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitArea(gameObjects: Array<Phaser.GameObjects.GameObject>, shape: Any? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaCircle(gameObjects: Phaser.GameObjects.GameObject, x: Number, y: Number, radius: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaCircle(gameObjects: Array<Phaser.GameObjects.GameObject>, x: Number, y: Number, radius: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaEllipse(gameObjects: Phaser.GameObjects.GameObject, x: Number, y: Number, width: Number, height: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaEllipse(gameObjects: Array<Phaser.GameObjects.GameObject>, x: Number, y: Number, width: Number, height: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaFromTexture(gameObjects: Phaser.GameObjects.GameObject, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaFromTexture(gameObjects: Array<Phaser.GameObjects.GameObject>, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaRectangle(gameObjects: Phaser.GameObjects.GameObject, x: Number, y: Number, width: Number, height: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaRectangle(gameObjects: Array<Phaser.GameObjects.GameObject>, x: Number, y: Number, width: Number, height: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaTriangle(gameObjects: Phaser.GameObjects.GameObject, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setHitAreaTriangle(gameObjects: Array<Phaser.GameObjects.GameObject>, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
//    open fun setPollAlways(): InputPlugin = definedExternally
//    open fun setPollOnMove(): InputPlugin = definedExternally
//    open fun setPollRate(value: Number): InputPlugin = definedExternally
//    open fun setGlobalTopOnly(value: Boolean): InputPlugin = definedExternally
//    open fun setTopOnly(value: Boolean): InputPlugin = definedExternally
//    open fun sortGameObjects(gameObjects: Array<Phaser.GameObjects.GameObject>): Array<Phaser.GameObjects.GameObject> = definedExternally
//    open fun sortHandlerGO(childA: Phaser.GameObjects.GameObject, childB: Phaser.GameObjects.GameObject): Number = definedExternally
//    open fun stopPropagation(): InputPlugin = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open var activePointer: Pointer = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//}
//external open class Pointer(manager: InputManager, id: Number) {
//    open var manager: InputManager = definedExternally
//    open var id: Number = definedExternally
//    open var event: Nothing? = definedExternally
//    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
//    open var buttons: Number = definedExternally
//    open var position: Phaser.Math.Vector2 = definedExternally
//    open var downX: Number = definedExternally
//    open var downY: Number = definedExternally
//    open var downTime: Number = definedExternally
//    open var upX: Number = definedExternally
//    open var upY: Number = definedExternally
//    open var upTime: Number = definedExternally
//    open var primaryDown: Boolean = definedExternally
//    open var dragState: Number = definedExternally
//    open var isDown: Boolean = definedExternally
//    open var dirty: Boolean = definedExternally
//    open var justDown: Boolean = definedExternally
//    open var justUp: Boolean = definedExternally
//    open var justMoved: Boolean = definedExternally
//    open var wasTouch: Boolean = definedExternally
//    open var movementX: Number = definedExternally
//    open var movementY: Number = definedExternally
//    open fun positionToCamera(camera: Phaser.Cameras.Scene2D.Camera, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 */ = definedExternally
//    open fun positionToCamera(camera: Phaser.Cameras.Scene2D.Camera, output: Phaser.Math.Vector2? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 */ = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open fun reset(): Unit = definedExternally
//    open fun touchmove(event: TouchEvent, time: Number): Unit = definedExternally
//    open fun move(event: MouseEvent, time: Number): Unit = definedExternally
//    open fun down(event: MouseEvent, time: Number): Unit = definedExternally
//    open fun touchstart(event: TouchEvent, time: Number): Unit = definedExternally
//    open fun up(event: MouseEvent, time: Number): Unit = definedExternally
//    open fun touchend(event: TouchEvent, time: Number): Unit = definedExternally
//    open fun noButtonDown(): Boolean = definedExternally
//    open fun leftButtonDown(): Boolean = definedExternally
//    open fun rightButtonDown(): Boolean = definedExternally
//    open fun middleButtonDown(): Boolean = definedExternally
//    open fun backButtonDown(): Boolean = definedExternally
//    open fun forwardButtonDown(): Boolean = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun positionToCamera(camera: Phaser.Cameras.Scene2D.Camera): dynamic /* Any? | Phaser.Math.Vector2 */ = definedExternally
//}
