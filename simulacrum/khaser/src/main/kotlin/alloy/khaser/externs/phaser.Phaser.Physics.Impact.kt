//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Physics.Impact")]
//package Phaser.Physics.Impact
//
//import alloy.khaser.externs.BlendModes
//import alloy.khaser.externs.ScaleModes
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//
//external open class Body(world: World, x: Number, y: Number, sx: Number? = definedExternally /* null */, sy: Number? = definedExternally /* null */) {
//    open var world: World = definedExternally
//    open var gameObject: Phaser.GameObjects.GameObject = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var parent: dynamic /* ImpactBody | ImpactImage | ImpactSprite */ = definedExternally
//    open var id: Number = definedExternally
//    open var name: String = definedExternally
//    open var size: Any = definedExternally
//    open var offset: Any = definedExternally
//    open var pos: Any = definedExternally
//    open var last: Any = definedExternally
//    open var vel: Any = definedExternally
//    open var accel: Any = definedExternally
//    open var friction: Any = definedExternally
//    open var maxVel: Any = definedExternally
//    open var standing: Boolean = definedExternally
//    open var gravityFactor: Number = definedExternally
//    open var bounciness: Number = definedExternally
//    open var minBounceVelocity: Number = definedExternally
//    open var accelGround: Number = definedExternally
//    open var accelAir: Number = definedExternally
//    open var jumpSpeed: Number = definedExternally
//    open var type: TYPE = definedExternally
//    open var checkAgainst: TYPE = definedExternally
//    open var collides: COLLIDES = definedExternally
//    open var debugShowBody: Boolean = definedExternally
//    open var debugShowVelocity: Boolean = definedExternally
//    open var debugBodyColor: Number = definedExternally
//    open var updateCallback: (body: Body) -> Unit = definedExternally
//    open var slopeStanding: Any = definedExternally
//    open fun reset(x: Number, y: Number): Unit = definedExternally
//    open fun update(delta: Number): Unit = definedExternally
//    open fun drawDebug(graphic: Phaser.GameObjects.Graphics): Unit = definedExternally
//    open fun willDrawDebug(): Boolean = definedExternally
//    open fun skipHash(): Boolean = definedExternally
//    open fun touches(other: Body): Boolean = definedExternally
//    open fun resetSize(x: Number, y: Number, width: Number, height: Number): Body = definedExternally
//    open fun toJSON(): JSONImpactBody = definedExternally
//    open fun fromJSON(config: Any): Unit = definedExternally
//    open fun check(other: Body): Unit = definedExternally
//    open fun collideWith(other: Body, axis: String): Unit = definedExternally
//    open fun handleMovementTrace(res: Number): Boolean = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external enum class COLLIDES {
//    NEVER,
//    LITE,
//    PASSIVE,
//    ACTIVE,
//    FIXED
//}
//external open class CollisionMap(tilesize: Number? = definedExternally /* null */, data: Array<Any>? = definedExternally /* null */) {
//    open var tilesize: Number = definedExternally
//    open var data: Array<Any> = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var lastSlope: Number = definedExternally
//    open var tiledef: Any = definedExternally
//    open fun trace(x: Number, y: Number, vx: Number, vy: Number, objectWidth: Number, objectHeight: Number): Boolean = definedExternally
//    open fun step(res: Any, x: Number, y: Number, vx: Number, vy: Number, width: Number, height: Number, rvx: Number, rvy: Number, step: Number): Unit = definedExternally
//    open fun checkDef(res: Any, t: Number, x: Number, y: Number, vx: Number, vy: Number, width: Number, height: Number, tileX: Number, tileY: Number): Boolean = definedExternally
//}
//external open class Factory(world: World) {
//    open var world: World = definedExternally
//    open var sys: Phaser.Scenes.Systems = definedExternally
//    open fun body(x: Number, y: Number, width: Number, height: Number): ImpactBody = definedExternally
//    open fun existing(gameObject: Phaser.GameObjects.GameObject): Phaser.GameObjects.GameObject = definedExternally
//    open fun image(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */): ImpactImage = definedExternally
//    open fun image(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */): ImpactImage = definedExternally
//    open fun sprite(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */): ImpactSprite = definedExternally
//    open fun sprite(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */): ImpactSprite = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun image(x: Number, y: Number, key: String): ImpactImage = definedExternally
//    open fun sprite(x: Number, y: Number, key: String): ImpactSprite = definedExternally
//}
//external fun GetVelocity(delta: Number, vel: Number, accel: Number, friction: Number, max: Number): Number = definedExternally
//external open class ImpactBody(world: World, x: Number, y: Number, width: Number, height: Number) : Phaser.Physics.Impact.Components.Acceleration, Phaser.Physics.Impact.Components.BodyScale, Phaser.Physics.Impact.Components.BodyType, Phaser.Physics.Impact.Components.Bounce, Phaser.Physics.Impact.Components.CheckAgainst, Phaser.Physics.Impact.Components.Collides, Phaser.Physics.Impact.Components.Debug, Phaser.Physics.Impact.Components.Friction, Phaser.Physics.Impact.Components.Gravity, Phaser.Physics.Impact.Components.Offset, Phaser.Physics.Impact.Components.SetGameObject, Phaser.Physics.Impact.Components.Velocity {
//    open var body: Body = definedExternally
//    open var size: Any = definedExternally
//    open var offset: Any = definedExternally
//    open var vel: Any = definedExternally
//    open var accel: Any = definedExternally
//    open var friction: Any = definedExternally
//    open var maxVel: Any = definedExternally
//    override fun setAccelerationX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAcceleration(x: Number, y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBodySize(width: Number, height: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBodyScale(scaleX: Number, scaleY: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun getBodyType(): Number = definedExternally
//    override fun setTypeNone(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTypeA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTypeB(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMinBounceVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var bounce: Number = definedExternally
//    override fun setAvsB(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBvsA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstNone(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstB(): Phaser.GameObjects.GameObject = definedExternally
//    override var checkAgainst: Number = definedExternally
//    override fun setCollideCallback(callback: (body: Body, other: Body, axis: String) -> Unit, scope: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesNever(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setLiteCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setPassiveCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setActiveCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFixedCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override var collides: Number = definedExternally
//    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDebugBodyColor(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var debugShowBody: Boolean = definedExternally
//    override var debugShowVelocity: Boolean = definedExternally
//    override var debugBodyColor: Number = definedExternally
//    override fun setFrictionX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFriction(x: Number, y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var gravity: Number = definedExternally
//    override fun setOffset(x: Number, y: Number, width: Number?, height: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGameObject(gameObject: Phaser.GameObjects.GameObject, sync: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun syncGameObject(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMaxVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class ImpactImage : Phaser.GameObjects.Image, Phaser.Physics.Impact.Components.Acceleration, Phaser.Physics.Impact.Components.BodyScale, Phaser.Physics.Impact.Components.BodyType, Phaser.Physics.Impact.Components.Bounce, Phaser.Physics.Impact.Components.CheckAgainst, Phaser.Physics.Impact.Components.Collides, Phaser.Physics.Impact.Components.Debug, Phaser.Physics.Impact.Components.Friction, Phaser.Physics.Impact.Components.Gravity, Phaser.Physics.Impact.Components.Offset, Phaser.Physics.Impact.Components.SetGameObject, Phaser.Physics.Impact.Components.Velocity, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(world: World, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(world: World, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)
//    override var body: Body = definedExternally
//    open var size: Any = definedExternally
//    open var offset: Any = definedExternally
//    open var vel: Any = definedExternally
//    open var accel: Any = definedExternally
//    open var friction: Any = definedExternally
//    open var maxVel: Any = definedExternally
//    override fun clearAlpha(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): Phaser.GameObjects.GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): Phaser.GameObjects.GameObject = definedExternally
//    override fun toggleFlipY(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipX(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipY(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun resetFlip(): Phaser.GameObjects.GameObject = definedExternally
//    open fun <O : Phaser.Math.Vector2> getCenter(output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBounds(output: O? = definedExternally /* null */): O = definedExternally
//    override var originX: Number = definedExternally
//    override var originY: Number = definedExternally
//    override var displayOriginX: Number = definedExternally
//    override var displayOriginY: Number = definedExternally
//    override fun setOrigin(x: Number?, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setOriginFromFrame(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun updateDisplayOrigin(): Phaser.GameObjects.GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): Phaser.GameObjects.GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun clearTint(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var tintTopLeft: Number = definedExternally
//    override var tintTopRight: Number = definedExternally
//    override var tintBottomLeft: Number = definedExternally
//    override var tintBottomRight: Number = definedExternally
//    override var tint: Number = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setRotation(radians: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngle(degrees: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setX(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setY(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setZ(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setW(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAcceleration(x: Number, y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBodySize(width: Number, height: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBodyScale(scaleX: Number, scaleY: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun getBodyType(): Number = definedExternally
//    override fun setTypeNone(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTypeA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTypeB(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMinBounceVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var bounce: Number = definedExternally
//    override fun setAvsB(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBvsA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstNone(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstB(): Phaser.GameObjects.GameObject = definedExternally
//    override var checkAgainst: Number = definedExternally
//    override fun setCollideCallback(callback: (body: Body, other: Body, axis: String) -> Unit, scope: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesNever(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setLiteCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setPassiveCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setActiveCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFixedCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override var collides: Number = definedExternally
//    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDebugBodyColor(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var debugShowBody: Boolean = definedExternally
//    override var debugShowVelocity: Boolean = definedExternally
//    override var debugBodyColor: Number = definedExternally
//    override fun setFrictionX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFriction(x: Number, y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var gravity: Number = definedExternally
//    override fun setOffset(x: Number, y: Number, width: Number?, height: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGameObject(gameObject: Phaser.GameObjects.GameObject, sync: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun syncGameObject(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMaxVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTexture(key: String): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class ImpactPhysics(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var config: Any = definedExternally
//    open var world: World = definedExternally
//    open var add: Factory = definedExternally
//    open fun getConfig(): Any = definedExternally
//    open fun pause(): World = definedExternally
//    open fun resume(): World = definedExternally
//}
//external open class ImpactSprite : Phaser.GameObjects.Sprite, Phaser.Physics.Impact.Components.Acceleration, Phaser.Physics.Impact.Components.BodyScale, Phaser.Physics.Impact.Components.BodyType, Phaser.Physics.Impact.Components.Bounce, Phaser.Physics.Impact.Components.CheckAgainst, Phaser.Physics.Impact.Components.Collides, Phaser.Physics.Impact.Components.Debug, Phaser.Physics.Impact.Components.Friction, Phaser.Physics.Impact.Components.Gravity, Phaser.Physics.Impact.Components.Offset, Phaser.Physics.Impact.Components.SetGameObject, Phaser.Physics.Impact.Components.Velocity, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(world: World, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(world: World, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)
//    override var body: Body = definedExternally
//    open var size: Any = definedExternally
//    open var offset: Any = definedExternally
//    open var vel: Any = definedExternally
//    open var accel: Any = definedExternally
//    open var friction: Any = definedExternally
//    open var maxVel: Any = definedExternally
//    override fun clearAlpha(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): Phaser.GameObjects.GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): Phaser.GameObjects.GameObject = definedExternally
//    override fun toggleFlipY(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipX(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlipY(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun resetFlip(): Phaser.GameObjects.GameObject = definedExternally
//    open fun <O : Phaser.Math.Vector2> getCenter(output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBounds(output: O? = definedExternally /* null */): O = definedExternally
//    override var originX: Number = definedExternally
//    override var originY: Number = definedExternally
//    override var displayOriginX: Number = definedExternally
//    override var displayOriginY: Number = definedExternally
//    override fun setOrigin(x: Number?, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setOriginFromFrame(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun updateDisplayOrigin(): Phaser.GameObjects.GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): Phaser.GameObjects.GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun clearTint(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override var tintTopLeft: Number = definedExternally
//    override var tintTopRight: Number = definedExternally
//    override var tintBottomLeft: Number = definedExternally
//    override var tintBottomRight: Number = definedExternally
//    override var tint: Number = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setRotation(radians: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngle(degrees: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setX(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setY(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setZ(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setW(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAcceleration(x: Number, y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBodySize(width: Number, height: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBodyScale(scaleX: Number, scaleY: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun getBodyType(): Number = definedExternally
//    override fun setTypeNone(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTypeA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTypeB(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMinBounceVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var bounce: Number = definedExternally
//    override fun setAvsB(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBvsA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstNone(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstA(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCheckAgainstB(): Phaser.GameObjects.GameObject = definedExternally
//    override var checkAgainst: Number = definedExternally
//    override fun setCollideCallback(callback: (body: Body, other: Body, axis: String) -> Unit, scope: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesNever(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setLiteCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setPassiveCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setActiveCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFixedCollision(): Phaser.GameObjects.GameObject = definedExternally
//    override var collides: Number = definedExternally
//    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDebugBodyColor(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var debugShowBody: Boolean = definedExternally
//    override var debugShowVelocity: Boolean = definedExternally
//    override var debugBodyColor: Number = definedExternally
//    override fun setFrictionX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFriction(x: Number, y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var gravity: Number = definedExternally
//    override fun setOffset(x: Number, y: Number, width: Number?, height: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGameObject(gameObject: Phaser.GameObjects.GameObject, sync: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun syncGameObject(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMaxVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTexture(key: String): Phaser.GameObjects.GameObject = definedExternally
//}
//external fun SeperateX(world: World, left: Body, right: Body, weak: Body? = definedExternally /* null */): Unit = definedExternally
//external fun SeperateY(world: World, top: Body, bottom: Body, weak: Body? = definedExternally /* null */): Unit = definedExternally
//external fun Solver(world: World, bodyA: Body, bodyB: Body): Unit = definedExternally
//external enum class TYPE {
//    NONE,
//    A,
//    B,
//    BOTH
//}
//external fun UpdateMotion(body: Body, res: Any): Unit = definedExternally
//external interface WorldConfig {
//    var gravity: Number? get() = definedExternally; set(value) = definedExternally
//    var cellSize: Number? get() = definedExternally; set(value) = definedExternally
//    var timeScale: Number? get() = definedExternally; set(value) = definedExternally
//    var maxStep: Number? get() = definedExternally; set(value) = definedExternally
//    var debug: Boolean? get() = definedExternally; set(value) = definedExternally
//    var maxVelocity: Number? get() = definedExternally; set(value) = definedExternally
//    var debugShowBody: Boolean? get() = definedExternally; set(value) = definedExternally
//    var debugShowVelocity: Boolean? get() = definedExternally; set(value) = definedExternally
//    var debugBodyColor: Number? get() = definedExternally; set(value) = definedExternally
//    var debugVelocityColor: Number? get() = definedExternally; set(value) = definedExternally
//    var maxVelocityX: Number? get() = definedExternally; set(value) = definedExternally
//    var maxVelocityY: Number? get() = definedExternally; set(value) = definedExternally
//    var minBounceVelocity: Number? get() = definedExternally; set(value) = definedExternally
//    var gravityFactor: Number? get() = definedExternally; set(value) = definedExternally
//    var bounciness: Number? get() = definedExternally; set(value) = definedExternally
//    var setBounds: dynamic /* Boolean | Any? */ get() = definedExternally; set(value) = definedExternally
//}
//external interface WorldDefaults {
//    var debugShowBody: Boolean
//    var debugShowVelocity: Boolean
//    var bodyDebugColor: Number
//    var velocityDebugColor: Number
//    var maxVelocityX: Number
//    var maxVelocityY: Number
//    var minBounceVelocity: Number
//    var gravityFactor: Number
//    var bounciness: Number
//}
//external interface WorldWalls {
//    var left: Body
//    var right: Body
//    var top: Body
//    var bottom: Body
//}
//external open class World(scene: Scene, config: Phaser.Physics.Impact.WorldConfig) : Phaser.Events.EventEmitter {
//    open var scene: Scene = definedExternally
//    open var bodies: Phaser.Structs.Set<Body> = definedExternally
//    open var gravity: Number = definedExternally
//    open var cellSize: Number = definedExternally
//    open var collisionMap: CollisionMap = definedExternally
//    open var timeScale: Number = definedExternally
//    open var maxStep: Number = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var drawDebug: Boolean = definedExternally
//    open var debugGraphic: Phaser.GameObjects.Graphics = definedExternally
//    open var defaults: Phaser.Physics.Impact.WorldDefaults = definedExternally
//    open var walls: Phaser.Physics.Impact.WorldWalls = definedExternally
//    open var delta: Number = definedExternally
//    open fun setCollisionMap(key: String, tileSize: Number): CollisionMap = definedExternally
//    open fun setCollisionMap(key: Array<Array<Number>>, tileSize: Number): CollisionMap = definedExternally
//    open fun setCollisionMapFromTilemapLayer(tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, options: Any? = definedExternally /* null */): CollisionMap = definedExternally
//    open fun setCollisionMapFromTilemapLayer(tilemapLayer: Phaser.Tilemaps.StaticTilemapLayer, options: Any? = definedExternally /* null */): CollisionMap = definedExternally
//    open fun setBounds(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, thickness: Number? = definedExternally /* null */, left: Boolean? = definedExternally /* null */, right: Boolean? = definedExternally /* null */, top: Boolean? = definedExternally /* null */, bottom: Boolean? = definedExternally /* null */): World = definedExternally
//    open fun updateWall(add: Boolean, position: String, x: Number, y: Number, width: Number, height: Number): Unit = definedExternally
//    open fun createDebugGraphic(): Phaser.GameObjects.Graphics = definedExternally
//    open fun getNextID(): Number = definedExternally
//    open fun create(x: Number, y: Number, sizeX: Number, sizeY: Number): Body = definedExternally
//    open fun remove(`object`: Body): Unit = definedExternally
//    open fun pause(): World = definedExternally
//    open fun resume(): World = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open fun checkHash(body: Body, hash: Any, size: Number): Unit = definedExternally
//    open fun checkBodies(bodyA: Body, bodyB: Body): Unit = definedExternally
//    open fun setCollidesNever(bodies: Array<Body>): World = definedExternally
//    open fun setLite(bodies: Array<Body>): World = definedExternally
//    open fun setPassive(bodies: Array<Body>): World = definedExternally
//    open fun setActive(bodies: Array<Body>): World = definedExternally
//    open fun setFixed(bodies: Array<Body>): World = definedExternally
//    open fun setTypeNone(bodies: Array<Body>): World = definedExternally
//    open fun setTypeA(bodies: Array<Body>): World = definedExternally
//    open fun setTypeB(bodies: Array<Body>): World = definedExternally
//    open fun setAvsB(bodies: Array<Body>): World = definedExternally
//    open fun setBvsA(bodies: Array<Body>): World = definedExternally
//    open fun setCheckAgainstNone(bodies: Array<Body>): World = definedExternally
//    open fun setCheckAgainstA(bodies: Array<Body>): World = definedExternally
//    open fun setCheckAgainstB(bodies: Array<Body>): World = definedExternally
//    override fun shutdown(): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//}
