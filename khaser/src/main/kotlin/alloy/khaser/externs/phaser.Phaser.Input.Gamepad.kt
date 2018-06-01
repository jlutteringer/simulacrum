//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Input.Gamepad")]
//package Phaser.Input.Gamepad
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
//external open class Axis(pad: Gamepad, index: Number) {
//    open var pad: Gamepad = definedExternally
//    open var events: Phaser.Events.EventEmitter = definedExternally
//    open var index: Number = definedExternally
//    open var value: Number = definedExternally
//    open var threshold: Number = definedExternally
//    open fun update(value: Number): Unit = definedExternally
//    open fun getValue(): Number = definedExternally
//}
//external open class Button(pad: Gamepad, index: Number) {
//    open var pad: Gamepad = definedExternally
//    open var events: Phaser.Events.EventEmitter = definedExternally
//    open var index: Number = definedExternally
//    open var value: Number = definedExternally
//    open var threshold: Number = definedExternally
//    open var pressed: Boolean = definedExternally
//    open fun update(data: GamepadButton): Unit = definedExternally
//}
//external open class Gamepad(manager: GamepadManager, id: String, index: Number) {
//    open var manager: GamepadManager = definedExternally
//    open var id: String = definedExternally
//    open var index: Number = definedExternally
//    open var connected: Boolean = definedExternally
//    open var timestamp: Number = definedExternally
//    open var buttons: Array<Button> = definedExternally
//    open var axes: Array<Axis> = definedExternally
//    open fun update(data: Gamepad): Unit = definedExternally
//}
//external open class GamepadManager(inputManager: Phaser.Input.InputManager) : Phaser.Events.EventEmitter {
//    open var manager: Phaser.Input.InputManager = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var target: Any = definedExternally
//    open var handler: () -> Unit = definedExternally
//    open var gamepads: Array<Gamepad> = definedExternally
//    open var queue: Array<GamepadEvent> = definedExternally
//    open fun boot(): Unit = definedExternally
//    open fun startListeners(): Unit = definedExternally
//    open fun stopListeners(): Unit = definedExternally
//    open fun disconnectAll(): Unit = definedExternally
//    open fun addPad(pad: Pad): Gamepad = definedExternally
//    open fun removePad(index: Number, pad: Pad): Unit = definedExternally
//    open fun refreshPads(pads: Array<Pad>): Unit = definedExternally
//    open fun getAll(): Array<Gamepad> = definedExternally
//    open fun getPad(index: Number): Gamepad = definedExternally
//    open fun update(): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//    open var total: Number = definedExternally
//}
