//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Physics.Impact.Components")]
//package Phaser.Physics.Impact.Components
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
//    fun setAccelerationX(x: Number): Phaser.GameObjects.GameObject
//    fun setAccelerationY(y: Number): Phaser.GameObjects.GameObject
//    fun setAcceleration(x: Number, y: Number): Phaser.GameObjects.GameObject
//}
//external interface BodyScale {
//    fun setBodySize(width: Number, height: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setBodyScale(scaleX: Number, scaleY: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//}
//external interface BodyType {
//    fun getBodyType(): Number
//    fun setTypeNone(): Phaser.GameObjects.GameObject
//    fun setTypeA(): Phaser.GameObjects.GameObject
//    fun setTypeB(): Phaser.GameObjects.GameObject
//}
//external interface Bounce {
//    fun setBounce(value: Number): Phaser.GameObjects.GameObject
//    fun setMinBounceVelocity(value: Number): Phaser.GameObjects.GameObject
//    var bounce: Number
//}
//external interface CheckAgainst {
//    fun setAvsB(): Phaser.GameObjects.GameObject
//    fun setBvsA(): Phaser.GameObjects.GameObject
//    fun setCheckAgainstNone(): Phaser.GameObjects.GameObject
//    fun setCheckAgainstA(): Phaser.GameObjects.GameObject
//    fun setCheckAgainstB(): Phaser.GameObjects.GameObject
//    var checkAgainst: Number
//}
//external interface Collides {
//    fun setCollideCallback(callback: (body: Phaser.Physics.Impact.Body, other: Phaser.Physics.Impact.Body, axis: String) -> Unit, scope: Any): Phaser.GameObjects.GameObject
//    fun setCollidesNever(): Phaser.GameObjects.GameObject
//    fun setLiteCollision(): Phaser.GameObjects.GameObject
//    fun setPassiveCollision(): Phaser.GameObjects.GameObject
//    fun setActiveCollision(): Phaser.GameObjects.GameObject
//    fun setFixedCollision(): Phaser.GameObjects.GameObject
//    var collides: Number
//}
//external interface Debug {
//    fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Phaser.GameObjects.GameObject
//    fun setDebugBodyColor(value: Number): Phaser.GameObjects.GameObject
//    var debugShowBody: Boolean
//    var debugShowVelocity: Boolean
//    var debugBodyColor: Number
//}
//external interface Friction {
//    fun setFrictionX(x: Number): Phaser.GameObjects.GameObject
//    fun setFrictionY(y: Number): Phaser.GameObjects.GameObject
//    fun setFriction(x: Number, y: Number): Phaser.GameObjects.GameObject
//}
//external interface Gravity {
//    fun setGravity(value: Number): Phaser.GameObjects.GameObject
//    var gravity: Number
//}
//external interface Offset {
//    fun setOffset(x: Number, y: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//}
//external interface SetGameObject {
//    fun setGameObject(gameObject: Phaser.GameObjects.GameObject, sync: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun syncGameObject(): Phaser.GameObjects.GameObject
//}
//external interface Velocity {
//    fun setVelocityX(x: Number): Phaser.GameObjects.GameObject
//    fun setVelocityY(y: Number): Phaser.GameObjects.GameObject
//    fun setVelocity(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setMaxVelocity(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//}
