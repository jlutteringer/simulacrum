//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Physics.Arcade.Components")]
//package Phaser.Physics.Arcade.Components
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
//external interface Acceleration {
//    fun setAcceleration(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setAccelerationX(value: Number): Phaser.GameObjects.GameObject
//    fun setAccelerationY(value: Number): Phaser.GameObjects.GameObject
//}
//external interface Angular {
//    fun setAngularVelocity(value: Number): Phaser.GameObjects.GameObject
//    fun setAngularAcceleration(value: Number): Phaser.GameObjects.GameObject
//    fun setAngularDrag(value: Number): Phaser.GameObjects.GameObject
//}
//external interface Bounce {
//    fun setBounce(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setBounceX(value: Number): Phaser.GameObjects.GameObject
//    fun setBounceY(value: Number): Phaser.GameObjects.GameObject
//    fun setCollideWorldBounds(value: Number): Phaser.GameObjects.GameObject
//}
//external interface Debug {
//    fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Phaser.GameObjects.GameObject
//    fun setDebugBodyColor(value: Number): Phaser.GameObjects.GameObject
//    var debugShowBody: Boolean
//    var debugShowVelocity: Boolean
//    var debugBodyColor: Number
//}
//external interface Drag {
//    fun setDrag(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setDragX(value: Number): Phaser.GameObjects.GameObject
//    fun setDragY(value: Number): Phaser.GameObjects.GameObject
//}
//external interface Enable {
//    fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Phaser.GameObjects.GameObject
//    fun disableBody(disableGameObject: Boolean? = definedExternally /* null */, hideGameObject: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun refreshBody(): Phaser.GameObjects.GameObject
//}
//external interface Friction {
//    fun setFriction(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setFrictionX(x: Number): Phaser.GameObjects.GameObject
//    fun setFrictionY(y: Number): Phaser.GameObjects.GameObject
//}
//external interface Gravity {
//    fun setGravity(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setGravityX(x: Number): Phaser.GameObjects.GameObject
//    fun setGravityY(y: Number): Phaser.GameObjects.GameObject
//}
//external interface Immovable {
//    fun setImmovable(value: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject
//}
//external interface Mass {
//    fun setMass(value: Number): Phaser.GameObjects.GameObject
//}
//external interface Size {
//    fun setOffset(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setSize(width: Number, height: Number, center: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setCircle(radius: Number, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//}
//external interface Velocity {
//    fun setVelocity(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setVelocityX(x: Number): Phaser.GameObjects.GameObject
//    fun setVelocityY(y: Number): Phaser.GameObjects.GameObject
//    fun setMaxVelocity(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//}
