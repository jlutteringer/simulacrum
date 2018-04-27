//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Animations")]
//package Phaser.Animations
//
//import alloy.khaser.externs.*
//import kotlin.js.*
//
//external open class Animation(manager: AnimationManager, key: String, config: AnimationConfig) {
//    open var manager: AnimationManager = definedExternally
//    open var key: String = definedExternally
//    open var type: String = definedExternally
//    open var frames: Array<AnimationFrame> = definedExternally
//    open var frameRate: Number = definedExternally
//    open var duration: Number = definedExternally
//    open var msPerFrame: Number = definedExternally
//    open var skipMissedFrames: Boolean = definedExternally
//    open var delay: Number = definedExternally
//    open var repeat: Number = definedExternally
//    open var repeatDelay: Number = definedExternally
//    open var yoyo: Boolean = definedExternally
//    open var showOnStart: Boolean = definedExternally
//    open var hideOnComplete: Boolean = definedExternally
//    open var paused: Boolean = definedExternally
//    open fun addFrame(config: String): Animation = definedExternally
//    open fun addFrame(config: Array<AnimationFrameConfig>): Animation = definedExternally
//    open fun addFrameAt(index: Number, config: String): Animation = definedExternally
//    open fun addFrameAt(index: Number, config: Array<AnimationFrameConfig>): Animation = definedExternally
//    open fun checkFrame(index: Number): Boolean = definedExternally
//    open fun completeAnimation(component: Phaser.GameObjects.Components.Animation): Unit = definedExternally
//    open fun getFirstTick(component: Phaser.GameObjects.Components.Animation, includeDelay: Boolean? = definedExternally /* null */): Unit = definedExternally
//    open fun getFrameAt(index: Number): AnimationFrame = definedExternally
//    open fun getFrames(textureManager: Phaser.Textures.TextureManager, frames: String, defaultTextureKey: String? = definedExternally /* null */): Array<AnimationFrame> = definedExternally
//    open fun getFrames(textureManager: Phaser.Textures.TextureManager, frames: Array<AnimationFrameConfig>, defaultTextureKey: String? = definedExternally /* null */): Array<AnimationFrame> = definedExternally
//    open fun getNextTick(component: Phaser.GameObjects.Components.Animation): Unit = definedExternally
//    open fun getFrameByProgress(value: Number): AnimationFrame = definedExternally
//    open fun nextFrame(component: Phaser.GameObjects.Components.Animation): Unit = definedExternally
//    open fun previousFrame(component: Phaser.GameObjects.Components.Animation): Unit = definedExternally
//    open fun removeFrame(frame: AnimationFrame): Animation = definedExternally
//    open fun removeFrameAt(index: Number): Animation = definedExternally
//    open fun repeatAnimation(component: Phaser.GameObjects.Components.Animation): Unit = definedExternally
//    open fun setFrame(component: Phaser.GameObjects.Components.Animation): Unit = definedExternally
//    open fun toJSON(): JSONAnimation = definedExternally
//    open fun updateFrameSequence(): Animation = definedExternally
//    open fun pause(): Animation = definedExternally
//    open fun resume(): Animation = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class AnimationFrame {
//    constructor(textureKey: String, textureFrame: String, index: Number, frame: Phaser.Textures.Frame)
//    constructor(textureKey: String, textureFrame: Number, index: Number, frame: Phaser.Textures.Frame)
//    open var textureKey: String = definedExternally
//    open var textureFrame: dynamic /* String | Number */ = definedExternally
//    open var index: Number = definedExternally
//    open var frame: Phaser.Textures.Frame = definedExternally
//    open var isFirst: Boolean = definedExternally
//    open var isLast: Boolean = definedExternally
//    open var prevFrame: AnimationFrame = definedExternally
//    open var nextFrame: AnimationFrame = definedExternally
//    open var duration: Number = definedExternally
//    open var progress: Number = definedExternally
//    open fun toJSON(): JSONAnimationFrame = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class AnimationManager(game: Game) : Phaser.Events.EventEmitter {
//    open var game: Game = definedExternally
//    open var textureManager: Phaser.Textures.TextureManager = definedExternally
//    open var globalTimeScale: Number = definedExternally
//    open var anims: Phaser.Structs.Map<String, Animation> = definedExternally
//    open var paused: Boolean = definedExternally
//    open var name: String = definedExternally
//    open fun boot(): Unit = definedExternally
//    open fun add(key: String, animation: Animation): AnimationManager = definedExternally
//    open fun create(config: AnimationConfig): Animation = definedExternally
//    open fun fromJSON(data: String, clearCurrentAnimations: Boolean? = definedExternally /* null */): Array<Animation> = definedExternally
//    open fun fromJSON(data: JSONAnimation, clearCurrentAnimations: Boolean? = definedExternally /* null */): Array<Animation> = definedExternally
//    open fun fromJSON(data: JSONAnimationManager, clearCurrentAnimations: Boolean? = definedExternally /* null */): Array<Animation> = definedExternally
//    open fun generateFrameNames(key: String, config: GenerateFrameNamesConfig): Array<AnimationFrameConfig> = definedExternally
//    open fun generateFrameNumbers(key: String, config: GenerateFrameNumbersConfig): Array<AnimationFrameConfig> = definedExternally
//    open fun get(key: String): Animation = definedExternally
//    open fun load(child: Phaser.GameObjects.GameObject, key: String, startFrame: String? = definedExternally /* null */): Phaser.GameObjects.GameObject = definedExternally
//    open fun load(child: Phaser.GameObjects.GameObject, key: String, startFrame: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject = definedExternally
//    open fun pauseAll(): AnimationManager = definedExternally
//    open fun play(key: String, child: Phaser.GameObjects.GameObject): AnimationManager = definedExternally
//    open fun remove(key: String): Animation = definedExternally
//    open fun resumeAll(): AnimationManager = definedExternally
//    open fun <G : Array<Phaser.GameObjects.GameObject>> staggerPlay(key: String, children: Array<Phaser.GameObjects.GameObject>, stagger: Number? = definedExternally /* null */): G = definedExternally
//    open fun toJSON(key: String): JSONAnimationManager = definedExternally
//    override fun destroy(): Unit = definedExternally
//    open fun load(child: Phaser.GameObjects.GameObject, key: String): Phaser.GameObjects.GameObject = definedExternally
//}
