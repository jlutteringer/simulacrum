//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Tweens")]
//package Phaser.Tweens
//
//import alloy.khaser.externs.Scene
//import alloy.khaser.externs.TweenDataGenConfig
//import kotlin.js.*
//
//external open class Timeline(manager: TweenManager) : Phaser.Events.EventEmitter {
//    open var manager: TweenManager = definedExternally
//    open var isTimeline: Boolean = definedExternally
//    open var data: Array<Any> = definedExternally
//    open var totalData: Number = definedExternally
//    open var useFrames: Boolean = definedExternally
//    open var timeScale: Number = definedExternally
//    open var loop: Number = definedExternally
//    open var loopDelay: Number = definedExternally
//    open var loopCounter: Number = definedExternally
//    open var completeDelay: Number = definedExternally
//    open var countdown: Number = definedExternally
//    open var state: Number = definedExternally
//    open var paused: Boolean = definedExternally
//    open var elapsed: Number = definedExternally
//    open var totalElapsed: Number = definedExternally
//    open var duration: Number = definedExternally
//    open var progress: Number = definedExternally
//    open var totalDuration: Number = definedExternally
//    open var totalProgress: Number = definedExternally
//    open fun setTimeScale(value: Number): Timeline = definedExternally
//    open fun getTimeScale(): Number = definedExternally
//    open fun isPlaying(): Boolean = definedExternally
//    open fun add(config: Any): Timeline = definedExternally
//    open fun queue(tween: Tween): Timeline = definedExternally
//    open fun hasOffset(tween: Tween): Boolean = definedExternally
//    open fun isOffsetAbsolute(value: Number): Boolean = definedExternally
//    open fun isOffsetRelative(value: String): Boolean = definedExternally
//    open fun getRelativeOffset(value: String, base: Number): Number = definedExternally
//    open fun calcDuration(): Unit = definedExternally
//    open fun init(): Boolean = definedExternally
//    open fun resetTweens(resetFromLoop: Boolean): Unit = definedExternally
//    open fun setCallback(type: String, callback: Function<*>, params: Array<Any>? = definedExternally /* null */, scope: Any? = definedExternally /* null */): Timeline = definedExternally
//    open fun makeActive(tween: Tween): TweenManager = definedExternally
//    open fun play(): Unit = definedExternally
//    open fun nextState(): Unit = definedExternally
//    open fun update(timestamp: Number, delta: Number): Boolean = definedExternally
//    open fun stop(): Unit = definedExternally
//    open fun pause(): Timeline = definedExternally
//    open fun resume(): Timeline = definedExternally
//    open fun hasTarget(target: Any): Boolean = definedExternally
//    override fun destroy(): Unit = definedExternally
//}
//external var CREATED: Number = definedExternally
//external var INIT: Number = definedExternally
//external var DELAY: Number = definedExternally
//external var OFFSET_DELAY: Number = definedExternally
//external var PENDING_RENDER: Number = definedExternally
//external var PLAYING_FORWARD: Number = definedExternally
//external var PLAYING_BACKWARD: Number = definedExternally
//external var HOLD_DELAY: Number = definedExternally
//external var REPEAT_DELAY: Number = definedExternally
//external var COMPLETE: Number = definedExternally
//external var PENDING_ADD: Number = definedExternally
//external var PAUSED: Number = definedExternally
//external var LOOP_DELAY: Number = definedExternally
//external var ACTIVE: Number = definedExternally
//external var COMPLETE_DELAY: Number = definedExternally
//external var PENDING_REMOVE: Number = definedExternally
//external var REMOVED: Number = definedExternally
//external interface TweenConfigDefaults {
//    var targets: dynamic /* Any? | Array<Any?> */
//    var delay: Number? get() = definedExternally; set(value) = definedExternally
//    var duration: Number? get() = definedExternally; set(value) = definedExternally
//    var ease: String? get() = definedExternally; set(value) = definedExternally
//    var easeParams: Array<Any>? get() = definedExternally; set(value) = definedExternally
//    var hold: Number? get() = definedExternally; set(value) = definedExternally
//    var repeat: Number? get() = definedExternally; set(value) = definedExternally
//    var repeatDelay: Number? get() = definedExternally; set(value) = definedExternally
//    var yoyo: Boolean? get() = definedExternally; set(value) = definedExternally
//    var flipX: Boolean? get() = definedExternally; set(value) = definedExternally
//    var flipY: Boolean? get() = definedExternally; set(value) = definedExternally
//}
//external open class Tween {
//    constructor(parent: TweenManager, data: Array<Phaser.Tweens.TweenDataConfig>, targets: Array<Any>)
//    constructor(parent: Timeline, data: Array<Phaser.Tweens.TweenDataConfig>, targets: Array<Any>)
//    open var parent: dynamic /* TweenManager | Timeline */ = definedExternally
//    open var parentIsTimeline: Boolean = definedExternally
//    open var data: Array<Phaser.Tweens.TweenDataConfig> = definedExternally
//    open var totalData: Number = definedExternally
//    open var targets: Array<Any?> = definedExternally
//    open var totalTargets: Number = definedExternally
//    open var useFrames: Boolean = definedExternally
//    open var timeScale: Number = definedExternally
//    open var loop: Number = definedExternally
//    open var loopDelay: Number = definedExternally
//    open var loopCounter: Number = definedExternally
//    open var completeDelay: Number = definedExternally
//    open var countdown: Number = definedExternally
//    open var offset: Number = definedExternally
//    open var calculatedOffset: Number = definedExternally
//    open var state: Number = definedExternally
//    open var paused: Boolean = definedExternally
//    open var elapsed: Number = definedExternally
//    open var totalElapsed: Number = definedExternally
//    open var duration: Number = definedExternally
//    open var progress: Number = definedExternally
//    open var totalDuration: Number = definedExternally
//    open var totalProgress: Number = definedExternally
//    open var callbacks: Any = definedExternally
//    open fun getValue(): Number = definedExternally
//    open fun setTimeScale(value: Number): Tween = definedExternally
//    open fun getTimeScale(): Number = definedExternally
//    open fun isPlaying(): Boolean = definedExternally
//    open fun isPaused(): Boolean = definedExternally
//    open fun hasTarget(target: Any): Boolean = definedExternally
//    open fun updateTo(key: String, value: Any, startToCurrent: Boolean): Tween = definedExternally
//    open fun restart(): Unit = definedExternally
//    open fun calcDuration(): Unit = definedExternally
//    open fun init(): Boolean = definedExternally
//    open fun nextState(): Unit = definedExternally
//    open fun pause(): Tween = definedExternally
//    open fun play(resetFromTimeline: Boolean): Unit = definedExternally
//    open fun resetTweenData(resetFromLoop: Boolean): Unit = definedExternally
//    open fun resume(): Tween = definedExternally
//    open fun seek(toPosition: Number): Unit = definedExternally
//    open fun setCallback(type: String, callback: Function<*>, params: Array<Any>? = definedExternally /* null */, scope: Any? = definedExternally /* null */): Tween = definedExternally
//    open fun complete(delay: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun stop(resetTo: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun update(timestamp: Number, delta: Number): Boolean = definedExternally
//    open fun setStateFromEnd(tween: Tween, tweenData: Phaser.Tweens.TweenDataConfig, diff: Number): Number = definedExternally
//    open fun setStateFromStart(tween: Tween, tweenData: Phaser.Tweens.TweenDataConfig, diff: Number): Number = definedExternally
//    open fun updateTweenData(tween: Tween, tweenData: Phaser.Tweens.TweenDataConfig, delta: Number): Boolean = definedExternally
//}
//external interface TweenDataConfig {
//    var target: Any
//    var key: String
//    var getEndValue: Function<*>
//    var getStartValue: Function<*>
//    var ease: Function<*>
//    var duration: Number? get() = definedExternally; set(value) = definedExternally
//    var totalDuration: Number? get() = definedExternally; set(value) = definedExternally
//    var delay: Number? get() = definedExternally; set(value) = definedExternally
//    var yoyo: Boolean? get() = definedExternally; set(value) = definedExternally
//    var hold: Number? get() = definedExternally; set(value) = definedExternally
//    var repeat: Number? get() = definedExternally; set(value) = definedExternally
//    var repeatDelay: Number? get() = definedExternally; set(value) = definedExternally
//    var flipX: Boolean? get() = definedExternally; set(value) = definedExternally
//    var flipY: Boolean? get() = definedExternally; set(value) = definedExternally
//    var progress: Number? get() = definedExternally; set(value) = definedExternally
//    var elapsed: Number? get() = definedExternally; set(value) = definedExternally
//    var repeatCounter: Number? get() = definedExternally; set(value) = definedExternally
//    var start: Number? get() = definedExternally; set(value) = definedExternally
//    var current: Number? get() = definedExternally; set(value) = definedExternally
//    var end: Number? get() = definedExternally; set(value) = definedExternally
//    var t1: Number? get() = definedExternally; set(value) = definedExternally
//    var t2: Number? get() = definedExternally; set(value) = definedExternally
//    var gen: TweenDataGenConfig? get() = definedExternally; set(value) = definedExternally
//    var state: Number? get() = definedExternally; set(value) = definedExternally
//}
//external fun TweenData(target: Any, key: String, getEnd: Function<*>, getStart: Function<*>, ease: Function<*>, delay: Number, duration: Number, yoyo: Boolean, hold: Number, repeat: Number, repeatDelay: Number, flipX: Boolean, flipY: Boolean): Phaser.Tweens.TweenDataConfig = definedExternally
//external open class TweenManager(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var timeScale: Number = definedExternally
//    open fun createTimeline(config: Any): Timeline = definedExternally
//    open fun timeline(config: Any): Timeline = definedExternally
//    open fun create(config: Any): Tween = definedExternally
//    open fun add(config: Any): Tween = definedExternally
//    open fun existing(tween: Tween): TweenManager = definedExternally
//    open fun addCounter(config: Any): Tween = definedExternally
//    open fun preUpdate(): Unit = definedExternally
//    open fun update(timestamp: Number, delta: Number): Unit = definedExternally
//    open fun makeActive(tween: Tween): TweenManager = definedExternally
//    open fun each(callback: Function<*>, scope: Any? = definedExternally /* null */, vararg args: Any): Unit = definedExternally
//    open fun getAllTweens(): Array<Tween> = definedExternally
//    open fun getGlobalTimeScale(): Number = definedExternally
//    open fun getTweensOf(target: Any?): Array<Tween> = definedExternally
//    open fun getTweensOf(target: Array<Any>): Array<Tween> = definedExternally
//    open fun isTweening(target: Any): Boolean = definedExternally
//    open fun killAll(): TweenManager = definedExternally
//    open fun killTweensOf(target: Any?): TweenManager = definedExternally
//    open fun killTweensOf(target: Array<Any>): TweenManager = definedExternally
//    open fun pauseAll(): TweenManager = definedExternally
//    open fun resumeAll(): TweenManager = definedExternally
//    open fun setGlobalTimeScale(value: Number): TweenManager = definedExternally
//    open fun shutdown(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
