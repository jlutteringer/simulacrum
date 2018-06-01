//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Time")]
//package Phaser.Time
//
//import alloy.khaser.externs.Scene
//import alloy.khaser.externs.TimerEventConfig
//import kotlin.js.*
//
//external open class Clock(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var now: Number = definedExternally
//    open var timeScale: Number = definedExternally
//    open var paused: Boolean = definedExternally
//    open fun addEvent(config: TimerEventConfig): TimerEvent = definedExternally
//    open fun delayedCall(delay: Number, callback: Function<*>, args: Array<Any>, callbackScope: Any): TimerEvent = definedExternally
//    open fun clearPendingEvents(): Clock = definedExternally
//    open fun removeAllEvents(): Clock = definedExternally
//    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//}
//external open class TimerEvent(config: TimerEventConfig) {
//    open var delay: Number = definedExternally
//    open var repeat: Number = definedExternally
//    open var repeatCount: Number = definedExternally
//    open var loop: Boolean = definedExternally
//    open var callback: Function<*> = definedExternally
//    open var callbackScope: Any = definedExternally
//    open var args: Array<Any> = definedExternally
//    open var timeScale: Number = definedExternally
//    open var startAt: Number = definedExternally
//    open var elapsed: Number = definedExternally
//    open var paused: Boolean = definedExternally
//    open var hasDispatched: Boolean = definedExternally
//    open fun reset(config: TimerEventConfig): TimerEvent = definedExternally
//    open fun getProgress(): Number = definedExternally
//    open fun getOverallProgress(): Number = definedExternally
//    open fun getRepeatCount(): Number = definedExternally
//    open fun getElapsed(): Number = definedExternally
//    open fun getElapsedSeconds(): Number = definedExternally
//    open fun remove(dispatchCallback: Function<*>): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
