//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("GameObjects.Particles.Zones")]
//package Phaser.GameObjects.Particles.Zones
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
//external open class DeathZone(source: Any, killOnEnter: Boolean) {
//    open var source: Any = definedExternally
//    open var killOnEnter: Boolean = definedExternally
//    open fun willKill(particle: Phaser.GameObjects.Particles.Particle): Boolean = definedExternally
//}
//external open class EdgeZone(source: Any, quantity: Number, stepRate: Number, yoyo: Boolean? = definedExternally /* null */, seamless: Boolean? = definedExternally /* null */) {
//    open var source: Any = definedExternally
//    open var points: Array<Phaser.Geom.Point> = definedExternally
//    open var quantity: Number = definedExternally
//    open var stepRate: Number = definedExternally
//    open var yoyo: Boolean = definedExternally
//    open var counter: Number = definedExternally
//    open var seamless: Boolean = definedExternally
//    open fun updateSource(): EdgeZone = definedExternally
//    open fun changeSource(source: Any): EdgeZone = definedExternally
//    open fun getPoint(particle: Phaser.GameObjects.Particles.Particle): Unit = definedExternally
//}
//external open class RandomZone(source: Any) {
//    open var source: Any = definedExternally
//    open fun getPoint(particle: Phaser.GameObjects.Particles.Particle): Unit = definedExternally
//}
