//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("GameObjects.Particles")]
//package Phaser.GameObjects.Particles
//
//import alloy.khaser.externs.BlendModes
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//
//external open class EmitterOp(config: Any, key: String, defaultValue: Number, emitOnly: Boolean? = definedExternally /* null */) {
//    open var propertyKey: String = definedExternally
//    open var propertyValue: Number = definedExternally
//    open var defaultValue: Number = definedExternally
//    open var steps: Number = definedExternally
//    open var counter: Number = definedExternally
//    open var start: Number = definedExternally
//    open var end: Number = definedExternally
//    open var ease: Function<*> = definedExternally
//    open var emitOnly: Boolean = definedExternally
//    open var onEmit: (particle: Particle, key: String, value: Number) -> Unit = definedExternally
//    open var onUpdate: (particle: Particle, key: String, t: Number, value: Number) -> Unit = definedExternally
//    open fun loadConfig(config: Any? = definedExternally /* null */, newKey: String? = definedExternally /* null */): Unit = definedExternally
//    open fun toJSON(): Any = definedExternally
//    open fun onChange(value: Number): EmitterOp = definedExternally
//    open fun setMethods(): EmitterOp = definedExternally
//    open fun has(`object`: Any, key: String): Boolean = definedExternally
//    open fun hasBoth(`object`: Any, key1: String, key2: String): Boolean = definedExternally
//    open fun hasEither(`object`: Any, key1: String, key2: String): Boolean = definedExternally
//    open fun defaultEmit(particle: Particle, key: String, value: Number): Number = definedExternally
//    open fun defaultUpdate(particle: Particle, key: String, t: Number, value: Number): Number = definedExternally
//    open fun staticValueEmit(): Number = definedExternally
//    open fun staticValueUpdate(): Number = definedExternally
//    open fun randomStaticValueEmit(): Number = definedExternally
//    open fun randomRangedValueEmit(particle: Particle, key: String): Number = definedExternally
//    open fun steppedEmit(): Number = definedExternally
//    open fun easedValueEmit(particle: Particle, key: String): Number = definedExternally
//    open fun easeValueUpdate(particle: Particle, key: String, t: Number): Number = definedExternally
//}
//external open class GravityWell {
//    constructor(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, power: Number? = definedExternally /* null */, epsilon: Number? = definedExternally /* null */, gravity: Number? = definedExternally /* null */)
//    constructor(x: GravityWellConfig? = definedExternally /* null */, y: Number? = definedExternally /* null */, power: Number? = definedExternally /* null */, epsilon: Number? = definedExternally /* null */, gravity: Number? = definedExternally /* null */)
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var active: Boolean = definedExternally
//    open var power: Number = definedExternally
//    open var epsilon: Number = definedExternally
//    open fun update(particle: Particle, delta: Number, step: Number): Unit = definedExternally
//}
//external open class Particle(emitter: ParticleEmitter) {
//    open var emitter: ParticleEmitter = definedExternally
//    open var frame: Phaser.Textures.Frame = definedExternally
//    open var index: Number = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var velocityX: Number = definedExternally
//    open var velocityY: Number = definedExternally
//    open var accelerationX: Number = definedExternally
//    open var accelerationY: Number = definedExternally
//    open var maxVelocityX: Number = definedExternally
//    open var maxVelocityY: Number = definedExternally
//    open var bounce: Number = definedExternally
//    open var scaleX: Number = definedExternally
//    open var scaleY: Number = definedExternally
//    open var alpha: Number = definedExternally
//    open var angle: Number = definedExternally
//    open var rotation: Number = definedExternally
//    open var tint: Number = definedExternally
//    open var color: Number = definedExternally
//    open var life: Number = definedExternally
//    open var lifeCurrent: Number = definedExternally
//    open var delayCurrent: Number = definedExternally
//    open var lifeT: Number = definedExternally
//    open var data: Any = definedExternally
//    open fun isAlive(): Boolean = definedExternally
//    open fun fire(x: Number, y: Number): Unit = definedExternally
//    open fun computeVelocity(emitter: ParticleEmitter, delta: Number, step: Number, processors: Array<Any>): Unit = definedExternally
//    open fun checkBounds(emitter: ParticleEmitter): Unit = definedExternally
//    open fun update(delta: Number, step: Number, processors: Array<Any>): Boolean = definedExternally
//}
//external open class ParticleEmitter(manager: ParticleEmitterManager, config: Any) : Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Visible {
//    open var manager: ParticleEmitterManager = definedExternally
//    open var texture: Phaser.Textures.Texture = definedExternally
//    open var frames: Array<Phaser.Textures.Frame> = definedExternally
//    open var defaultFrame: Phaser.Textures.Frame = definedExternally
//    open var configFastMap: Any = definedExternally
//    open var configOpMap: Any = definedExternally
//    open var name: String = definedExternally
//    open var particleClass: Particle = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var radial: Boolean = definedExternally
//    open var gravityX: Number = definedExternally
//    open var gravityY: Number = definedExternally
//    open var acceleration: Boolean = definedExternally
//    open var accelerationX: Number = definedExternally
//    open var accelerationY: Number = definedExternally
//    open var maxVelocityX: Number = definedExternally
//    open var maxVelocityY: Number = definedExternally
//    open var speedX: Number = definedExternally
//    open var speedY: Number = definedExternally
//    open var moveTo: Boolean = definedExternally
//    open var moveToX: Number = definedExternally
//    open var moveToY: Number = definedExternally
//    open var bounce: Number = definedExternally
//    open var scaleX: Number = definedExternally
//    open var scaleY: Number = definedExternally
//    open var tint: Number = definedExternally
//    open var alpha: Number = definedExternally
//    open var lifespan: Number = definedExternally
//    open var angle: Number = definedExternally
//    open var rotate: Number = definedExternally
//    open var emitCallback: (particle: Particle, emitter: ParticleEmitter) -> Unit = definedExternally
//    open var emitCallbackScope: Any = definedExternally
//    open var deathCallback: (particle: Particle) -> Unit = definedExternally
//    open var deathCallbackScope: Any = definedExternally
//    open var maxParticles: Number = definedExternally
//    open var quantity: Number = definedExternally
//    open var delay: Number = definedExternally
//    open var frequency: Number = definedExternally
//    open var on: Boolean = definedExternally
//    open var particleBringToTop: Boolean = definedExternally
//    open var timeScale: Number = definedExternally
//    open var emitZone: Any = definedExternally
//    open var deathZone: Any = definedExternally
//    open var bounds: Phaser.Geom.Rectangle = definedExternally
//    open var collideLeft: Boolean = definedExternally
//    open var collideRight: Boolean = definedExternally
//    open var collideTop: Boolean = definedExternally
//    open var collideBottom: Boolean = definedExternally
//    open var active: Boolean = definedExternally
//    override var visible: Boolean = definedExternally
//    override var blendMode: Number = definedExternally
//    open var follow: Particle = definedExternally
//    open var followOffset: Phaser.Math.Vector2 = definedExternally
//    open var trackVisible: Boolean = definedExternally
//    open var currentFrame: Number = definedExternally
//    open var randomFrame: Boolean = definedExternally
//    open var frameQuantity: Number = definedExternally
//    open fun fromJSON(config: Any): ParticleEmitter = definedExternally
//    open fun toJSON(output: Any): Any = definedExternally
//    open fun startFollow(target: Particle, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */, trackVisible: Boolean? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun stopFollow(): ParticleEmitter = definedExternally
//    open fun getFrame(): Phaser.Textures.Frame = definedExternally
//    open fun setFrame(frames: String, pickRandom: Boolean? = definedExternally /* null */, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun setFrame(frames: Number, pickRandom: Boolean? = definedExternally /* null */, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun setFrame(frames: Any?, pickRandom: Boolean? = definedExternally /* null */, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun setFrame(frames: Array<Any>, pickRandom: Boolean? = definedExternally /* null */, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun setRadial(value: Boolean): ParticleEmitter = definedExternally
//    open fun setPosition(x: Number, y: Number): ParticleEmitter = definedExternally
//    open fun setBounds(x: Number, y: Number, width: Number, height: Number): ParticleEmitter = definedExternally
//    open fun setBounds(x: Any?, y: Number, width: Number, height: Number): ParticleEmitter = definedExternally
//    open fun setSpeedX(value: Number): ParticleEmitter = definedExternally
//    open fun setSpeedY(value: Number): ParticleEmitter = definedExternally
//    open fun setSpeed(value: Number): ParticleEmitter = definedExternally
//    open fun setScaleX(value: Number): ParticleEmitter = definedExternally
//    open fun setScaleY(value: Number): ParticleEmitter = definedExternally
//    open fun setScale(value: Number): ParticleEmitter = definedExternally
//    open fun setGravityX(value: Number): ParticleEmitter = definedExternally
//    open fun setGravityY(value: Number): ParticleEmitter = definedExternally
//    open fun setGravity(x: Number, y: Number): ParticleEmitter = definedExternally
//    open fun setAlpha(value: Number): ParticleEmitter = definedExternally
//    open fun setEmitterAngle(value: Number): ParticleEmitter = definedExternally
//    open fun setAngle(value: Number): ParticleEmitter = definedExternally
//    open fun setLifespan(value: Number): ParticleEmitter = definedExternally
//    open fun setQuantity(quantity: Number): ParticleEmitter = definedExternally
//    open fun setFrequency(frequency: Number, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun setEmitZone(zoneConfig: Any? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun setDeathZone(zoneConfig: Any? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun reserve(particleCount: Number): ParticleEmitter = definedExternally
//    open fun getAliveParticleCount(): Number = definedExternally
//    open fun getDeadParticleCount(): Number = definedExternally
//    open fun getParticleCount(): Number = definedExternally
//    open fun atLimit(): Boolean = definedExternally
//    open fun onParticleEmit(callback: (particle: Particle, emitter: ParticleEmitter) -> Unit, context: Any? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun onParticleDeath(callback: (particle: Particle) -> Unit, context: Any? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun killAll(): ParticleEmitter = definedExternally
//    open fun forEachAlive(callback: (particle: Particle, emitter: ParticleEmitter) -> Unit, thisArg: Any): ParticleEmitter = definedExternally
//    open fun forEachDead(callback: (particle: Particle, emitter: ParticleEmitter) -> Unit, thisArg: Any): ParticleEmitter = definedExternally
//    open fun start(): ParticleEmitter = definedExternally
//    open fun pause(): ParticleEmitter = definedExternally
//    open fun resume(): ParticleEmitter = definedExternally
//    open fun depthSort(): ParticleEmitter = definedExternally
//    open fun flow(frequency: Number, count: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
//    open fun explode(count: Number, x: Number, y: Number): Particle = definedExternally
//    open fun emitParticleAt(x: Number, y: Number, count: Number): Particle = definedExternally
//    open fun emitParticle(count: Number, x: Number, y: Number): Particle = definedExternally
//    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
//    open fun depthSortCallback(a: Any, b: Any): Number = definedExternally
//    open fun indexSortCallback(a: Any, b: Any): Number = definedExternally
//    override fun setBlendMode(value: String): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): Phaser.GameObjects.GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVisible(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class ParticleEmitterManager : Phaser.GameObjects.GameObject {
//    constructor(scene: Scene, texture: String, frame: String, emitters: Array<ParticleEmitter>)
//    constructor(scene: Scene, texture: String, frame: Number, emitters: Array<ParticleEmitter>)
//    open var timeScale: Number = definedExternally
//    open var texture: Phaser.Textures.Texture = definedExternally
//    open var frame: Phaser.Textures.Frame = definedExternally
//    open var frameNames: Array<Phaser.Textures.Frame> = definedExternally
//    open var emitters: Phaser.Structs.List<ParticleEmitter> = definedExternally
//    open var wells: Phaser.Structs.List<GravityWell> = definedExternally
//    open fun setTexture(key: String, frame: String? = definedExternally /* null */): ParticleEmitterManager = definedExternally
//    open fun setTexture(key: String, frame: Number? = definedExternally /* null */): ParticleEmitterManager = definedExternally
//    open fun setFrame(frame: String? = definedExternally /* null */): ParticleEmitterManager = definedExternally
//    open fun setFrame(frame: Number? = definedExternally /* null */): ParticleEmitterManager = definedExternally
//    open fun setEmitterFrames(frames: Phaser.Textures.Frame, emitter: ParticleEmitter): ParticleEmitterManager = definedExternally
//    open fun setEmitterFrames(frames: Array<Phaser.Textures.Frame>, emitter: ParticleEmitter): ParticleEmitterManager = definedExternally
//    open fun addEmitter(emitter: ParticleEmitter): ParticleEmitter = definedExternally
//    open fun createEmitter(config: Any): ParticleEmitter = definedExternally
//    open fun addGravityWell(well: GravityWell): GravityWell = definedExternally
//    open fun createGravityWell(config: Any): GravityWell = definedExternally
//    open fun emitParticle(count: Number, x: Number, y: Number): ParticleEmitterManager = definedExternally
//    open fun emitParticleAt(x: Number, y: Number, count: Number): ParticleEmitterManager = definedExternally
//    open fun pause(): ParticleEmitterManager = definedExternally
//    open fun resume(): ParticleEmitterManager = definedExternally
//    open fun getProcessors(): Array<GravityWell> = definedExternally
//    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
//    open fun setTexture(key: String): ParticleEmitterManager = definedExternally
//    open fun setFrame(): ParticleEmitterManager = definedExternally
//}
