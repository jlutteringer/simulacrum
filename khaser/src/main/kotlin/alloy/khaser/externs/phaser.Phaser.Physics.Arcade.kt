//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Physics.Arcade")]
//package Phaser.Physics.Arcade
//
//import alloy.khaser.externs.BlendModes
//import alloy.khaser.externs.ScaleModes
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//
//external open class Image : Phaser.GameObjects.Image, Phaser.Physics.Arcade.Components.Acceleration, Phaser.Physics.Arcade.Components.Angular, Phaser.Physics.Arcade.Components.Bounce, Phaser.Physics.Arcade.Components.Debug, Phaser.Physics.Arcade.Components.Drag, Phaser.Physics.Arcade.Components.Enable, Phaser.Physics.Arcade.Components.Friction, Phaser.Physics.Arcade.Components.Gravity, Phaser.Physics.Arcade.Components.Immovable, Phaser.Physics.Arcade.Components.Mass, Phaser.Physics.Arcade.Components.Size, Phaser.Physics.Arcade.Components.Velocity, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)
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
//    override fun setAcceleration(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationX(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationY(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngularVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngularAcceleration(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngularDrag(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounce(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounceX(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounceY(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollideWorldBounds(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDebugBodyColor(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var debugShowBody: Boolean = definedExternally
//    override var debugShowVelocity: Boolean = definedExternally
//    override var debugBodyColor: Number = definedExternally
//    override fun setDrag(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDragX(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDragY(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun disableBody(disableGameObject: Boolean?, hideGameObject: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun refreshBody(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFriction(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setImmovable(value: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMass(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setOffset(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCircle(radius: Number, offsetX: Number?, offsetY: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMaxVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTexture(key: String): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class ArcadePhysics(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var config: Any = definedExternally
//    open var world: World = definedExternally
//    open var add: Factory = definedExternally
//    open fun getConfig(): Any = definedExternally
//    open fun overlap(object1: Array<Any>, object2: Array<Any>, overlapCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun overlap(object1: Array<Any>, object2: Phaser.GameObjects.GameObject, overlapCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun overlap(object1: Phaser.GameObjects.GameObject, object2: Array<Any>, overlapCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun overlap(object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject, overlapCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun collide(object1: Array<Any>, object2: Array<Any>, collideCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun collide(object1: Array<Any>, object2: Phaser.GameObjects.GameObject, collideCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun collide(object1: Phaser.GameObjects.GameObject, object2: Array<Any>, collideCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun collide(object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject, collideCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun pause(): World = definedExternally
//    open fun resume(): World = definedExternally
//    open fun accelerateTo(gameObject: Phaser.GameObjects.GameObject, x: Number, y: Number, speed: Number? = definedExternally /* null */, xSpeedMax: Number? = definedExternally /* null */, ySpeedMax: Number? = definedExternally /* null */): Number = definedExternally
//    open fun accelerateToObject(gameObject: Phaser.GameObjects.GameObject, destination: Phaser.GameObjects.GameObject, speed: Number? = definedExternally /* null */, xSpeedMax: Number? = definedExternally /* null */, ySpeedMax: Number? = definedExternally /* null */): Number = definedExternally
//    open fun closest(source: Any): Body = definedExternally
//    open fun furthest(source: Any): Body = definedExternally
//    open fun moveTo(gameObject: Phaser.GameObjects.GameObject, x: Number, y: Number, speed: Number? = definedExternally /* null */, maxTime: Number? = definedExternally /* null */): Number = definedExternally
//    open fun moveToObject(gameObject: Phaser.GameObjects.GameObject, destination: Any, speed: Number? = definedExternally /* null */, maxTime: Number? = definedExternally /* null */): Number = definedExternally
//    open fun velocityFromAngle(angle: Number, speed: Number? = definedExternally /* null */, vec2: Phaser.Math.Vector2? = definedExternally /* null */): Phaser.Math.Vector2 = definedExternally
//    open fun velocityFromRotation(rotation: Number, speed: Number? = definedExternally /* null */, vec2: Phaser.Math.Vector2? = definedExternally /* null */): Phaser.Math.Vector2 = definedExternally
//    open fun shutdown(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class Sprite : Phaser.GameObjects.Sprite, Phaser.Physics.Arcade.Components.Acceleration, Phaser.Physics.Arcade.Components.Angular, Phaser.Physics.Arcade.Components.Bounce, Phaser.Physics.Arcade.Components.Debug, Phaser.Physics.Arcade.Components.Drag, Phaser.Physics.Arcade.Components.Enable, Phaser.Physics.Arcade.Components.Friction, Phaser.Physics.Arcade.Components.Gravity, Phaser.Physics.Arcade.Components.Immovable, Phaser.Physics.Arcade.Components.Mass, Phaser.Physics.Arcade.Components.Size, Phaser.Physics.Arcade.Components.Velocity, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)
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
//    override fun setAcceleration(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationX(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAccelerationY(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngularVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngularAcceleration(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngularDrag(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounce(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounceX(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBounceY(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollideWorldBounds(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDebugBodyColor(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override var debugShowBody: Boolean = definedExternally
//    override var debugShowVelocity: Boolean = definedExternally
//    override var debugBodyColor: Number = definedExternally
//    override fun setDrag(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDragX(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDragY(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun disableBody(disableGameObject: Boolean?, hideGameObject: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun refreshBody(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFriction(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setGravityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setImmovable(value: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMass(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setOffset(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCircle(radius: Number, offsetX: Number?, offsetY: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMaxVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTexture(key: String): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class Body(world: World, gameObject: Phaser.GameObjects.GameObject) {
//    open var world: World = definedExternally
//    open var gameObject: Phaser.GameObjects.GameObject = definedExternally
//    open var transform: Any = definedExternally
//    open var debugShowBody: Boolean = definedExternally
//    open var debugShowVelocity: Boolean = definedExternally
//    open var debugBodyColor: Number = definedExternally
//    open var enable: Boolean = definedExternally
//    open var isCircle: Boolean = definedExternally
//    open var radius: Number = definedExternally
//    open var offset: Phaser.Math.Vector2 = definedExternally
//    open var position: Phaser.Math.Vector2 = definedExternally
//    open var prev: Phaser.Math.Vector2 = definedExternally
//    open var allowRotation: Boolean = definedExternally
//    open var rotation: Number = definedExternally
//    open var preRotation: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var sourceWidth: Number = definedExternally
//    open var sourceHeight: Number = definedExternally
//    open var halfWidth: Number = definedExternally
//    open var halfHeight: Number = definedExternally
//    open var center: Phaser.Math.Vector2 = definedExternally
//    open var velocity: Phaser.Math.Vector2 = definedExternally
//    open var newVelocity: Phaser.Math.Vector2 = definedExternally
//    open var deltaMax: Phaser.Math.Vector2 = definedExternally
//    open var acceleration: Phaser.Math.Vector2 = definedExternally
//    open var allowDrag: Boolean = definedExternally
//    open var drag: Phaser.Math.Vector2 = definedExternally
//    open var allowGravity: Boolean = definedExternally
//    open var gravity: Phaser.Math.Vector2 = definedExternally
//    open var bounce: Phaser.Math.Vector2 = definedExternally
//    open var worldBounce: Phaser.Math.Vector2 = definedExternally
//    open var onWorldBounds: Boolean = definedExternally
//    open var onCollide: Boolean = definedExternally
//    open var onOverlap: Boolean = definedExternally
//    open var maxVelocity: Phaser.Math.Vector2 = definedExternally
//    open var friction: Phaser.Math.Vector2 = definedExternally
//    open var angularVelocity: Number = definedExternally
//    open var angularAcceleration: Number = definedExternally
//    open var angularDrag: Number = definedExternally
//    open var maxAngular: Number = definedExternally
//    open var mass: Number = definedExternally
//    open var angle: Number = definedExternally
//    open var speed: Number = definedExternally
//    open var facing: Number = definedExternally
//    open var immovable: Boolean = definedExternally
//    open var moves: Boolean = definedExternally
//    open var customSeparateX: Boolean = definedExternally
//    open var customSeparateY: Boolean = definedExternally
//    open var overlapX: Number = definedExternally
//    open var overlapY: Number = definedExternally
//    open var overlapR: Number = definedExternally
//    open var embedded: Boolean = definedExternally
//    open var collideWorldBounds: Boolean = definedExternally
//    open var checkCollision: ArcadeBodyCollision = definedExternally
//    open var touching: ArcadeBodyCollision = definedExternally
//    open var wasTouching: ArcadeBodyCollision = definedExternally
//    open var blocked: ArcadeBodyCollision = definedExternally
//    open var dirty: Boolean = definedExternally
//    open var syncBounds: Boolean = definedExternally
//    open var isMoving: Boolean = definedExternally
//    open var stopVelocityOnCollide: Boolean = definedExternally
//    open var physicsType: Number = definedExternally
//    open fun updateBounds(): Unit = definedExternally
//    open fun updateCenter(): Unit = definedExternally
//    open fun update(delta: Number): Unit = definedExternally
//    open fun postUpdate(): Unit = definedExternally
//    open fun checkWorldBounds(): Boolean = definedExternally
//    open fun setOffset(x: Number, y: Number): Body = definedExternally
//    open fun setSize(width: Number, height: Number, center: Boolean? = definedExternally /* null */): Body = definedExternally
//    open fun setCircle(radius: Number, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): Body = definedExternally
//    open fun reset(x: Number, y: Number): Unit = definedExternally
//    open fun stop(): Body = definedExternally
//    open fun getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds = definedExternally
//    open fun hitTest(x: Number, y: Number): Boolean = definedExternally
//    open fun onFloor(): Boolean = definedExternally
//    open fun onCeiling(): Boolean = definedExternally
//    open fun onWall(): Boolean = definedExternally
//    open fun deltaAbsX(): Number = definedExternally
//    open fun deltaAbsY(): Number = definedExternally
//    open fun deltaX(): Number = definedExternally
//    open fun deltaY(): Number = definedExternally
//    open fun deltaZ(): Number = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun drawDebug(graphic: Phaser.GameObjects.Graphics): Unit = definedExternally
//    open fun willDrawDebug(): Boolean = definedExternally
//    open fun setCollideWorldBounds(value: Boolean): Body = definedExternally
//    open fun setVelocity(x: Number, y: Number): Body = definedExternally
//    open fun setVelocityX(value: Number): Body = definedExternally
//    open fun setVelocityY(value: Number): Body = definedExternally
//    open fun setBounce(x: Number, y: Number): Body = definedExternally
//    open fun setBounceX(value: Number): Body = definedExternally
//    open fun setBounceY(value: Number): Body = definedExternally
//    open fun setAcceleration(x: Number, y: Number): Body = definedExternally
//    open fun setAccelerationX(value: Number): Body = definedExternally
//    open fun setAccelerationY(value: Number): Body = definedExternally
//    open fun setDrag(x: Number, y: Number): Body = definedExternally
//    open fun setDragX(value: Number): Body = definedExternally
//    open fun setDragY(value: Number): Body = definedExternally
//    open fun setGravity(x: Number, y: Number): Body = definedExternally
//    open fun setGravityX(value: Number): Body = definedExternally
//    open fun setGravityY(value: Number): Body = definedExternally
//    open fun setFriction(x: Number, y: Number): Body = definedExternally
//    open fun setFrictionX(value: Number): Body = definedExternally
//    open fun setFrictionY(value: Number): Body = definedExternally
//    open fun setAngularVelocity(value: Number): Body = definedExternally
//    open fun setAngularAcceleration(value: Number): Body = definedExternally
//    open fun setAngularDrag(value: Number): Body = definedExternally
//    open fun setMass(value: Number): Body = definedExternally
//    open fun setImmovable(value: Boolean): Body = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var left: Number = definedExternally
//    open var right: Number = definedExternally
//    open var top: Number = definedExternally
//    open var bottom: Number = definedExternally
//}
//external open class Collider(world: World, overlapOnly: Boolean, object1: Body, object2: Body, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any) {
//    open var world: World = definedExternally
//    open var name: String = definedExternally
//    open var active: Boolean = definedExternally
//    open var overlapOnly: Boolean = definedExternally
//    open var object1: Body = definedExternally
//    open var object2: Body = definedExternally
//    open var collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit = definedExternally
//    open var processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit = definedExternally
//    open var callbackContext: Any = definedExternally
//    open fun setName(name: String): Collider = definedExternally
//    open fun update(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external var DYNAMIC_BODY: Number = definedExternally
//external var STATIC_BODY: Number = definedExternally
//external var GROUP: Number = definedExternally
//external var TILEMAPLAYER: Number = definedExternally
//external var FACING_NONE: Number = definedExternally
//external var FACING_UP: Number = definedExternally
//external var FACING_DOWN: Number = definedExternally
//external var FACING_LEFT: Number = definedExternally
//external var FACING_RIGHT: Number = definedExternally
//external interface `T$3` {
//    var collideWorldBounds: Any? get() = definedExternally; set(value) = definedExternally
//    var accelerationX: Number? get() = definedExternally; set(value) = definedExternally
//    var accelerationY: Number? get() = definedExternally; set(value) = definedExternally
//    var bounceX: Number? get() = definedExternally; set(value) = definedExternally
//    var bounceY: Number? get() = definedExternally; set(value) = definedExternally
//    var dragX: Number? get() = definedExternally; set(value) = definedExternally
//    var dragY: Number? get() = definedExternally; set(value) = definedExternally
//    var gravityX: Number? get() = definedExternally; set(value) = definedExternally
//    var gravityY: Number? get() = definedExternally; set(value) = definedExternally
//    var frictionX: Number? get() = definedExternally; set(value) = definedExternally
//    var frictionY: Number? get() = definedExternally; set(value) = definedExternally
//    var velocityX: Number? get() = definedExternally; set(value) = definedExternally
//    var velocityY: Number? get() = definedExternally; set(value) = definedExternally
//    var angularVelocity: Number? get() = definedExternally; set(value) = definedExternally
//    var angularAcceleration: Number? get() = definedExternally; set(value) = definedExternally
//    var angularDrag: Number? get() = definedExternally; set(value) = definedExternally
//    var mass: Number? get() = definedExternally; set(value) = definedExternally
//    var immovable: Boolean? get() = definedExternally; set(value) = definedExternally
//}
//external open class Factory(world: World) {
//    open var world: World = definedExternally
//    open var scene: Scene = definedExternally
//    open var sys: Phaser.Scenes.Systems = definedExternally
//    open fun collider(object1: Body, object2: Body, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any): Collider = definedExternally
//    open fun overlap(object1: Body, object2: Body, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any): Collider = definedExternally
//    open fun existing(gameObject: Phaser.GameObjects.GameObject, isStatic: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject = definedExternally
//    open fun staticImage(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Image = definedExternally
//    open fun staticImage(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Image = definedExternally
//    open fun image(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Image = definedExternally
//    open fun image(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Image = definedExternally
//    open fun staticSprite(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Sprite = definedExternally
//    open fun staticSprite(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Sprite = definedExternally
//    open fun sprite(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */): Sprite = definedExternally
//    open fun sprite(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */): Sprite = definedExternally
//    open fun staticGroup(children: Array<Any>? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */): StaticGroup = definedExternally
//    open fun group(children: Array<Any>? = definedExternally /* null */, config: GroupConfig? /* GroupConfig & `T$3` */ = definedExternally /* null */): Group = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun staticImage(x: Number, y: Number, texture: String): Image = definedExternally
//    open fun image(x: Number, y: Number, texture: String): Image = definedExternally
//    open fun staticSprite(x: Number, y: Number, texture: String): Sprite = definedExternally
//    open fun sprite(x: Number, y: Number, key: String): Sprite = definedExternally
//}
//external fun GetOverlapX(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Number = definedExternally
//external fun GetOverlapY(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Number = definedExternally
//external open class Group(world: World, scene: Scene, children: Array<Any>, config: GroupConfig? /* GroupConfig & `T$3` */ = definedExternally /* null */) : Phaser.GameObjects.Group {
//    open var world: World = definedExternally
//    open var physicsType: Number = definedExternally
//    open var defaults: PhysicsGroupDefaults = definedExternally
//    open fun createCallbackHandler(child: Phaser.GameObjects.GameObject): Unit = definedExternally
//    open fun removeCallbackHandler(child: Phaser.GameObjects.GameObject): Unit = definedExternally
//    open fun setVelocity(x: Number, y: Number, step: Number): Group = definedExternally
//    open fun setVelocityX(value: Number, step: Number): Group = definedExternally
//    open fun setVelocityY(value: Number, step: Number): Group = definedExternally
//}
//external fun SeparateX(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean = definedExternally
//external fun SeparateY(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean = definedExternally
//external open class StaticBody(world: World, gameObject: Phaser.GameObjects.GameObject) {
//    open var world: World = definedExternally
//    open var gameObject: Phaser.GameObjects.GameObject = definedExternally
//    open var debugShowBody: Boolean = definedExternally
//    open var debugBodyColor: Number = definedExternally
//    open var enable: Boolean = definedExternally
//    open var isCircle: Boolean = definedExternally
//    open var radius: Number = definedExternally
//    open var offset: Phaser.Math.Vector2 = definedExternally
//    open var position: Phaser.Math.Vector2 = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var halfWidth: Number = definedExternally
//    open var halfHeight: Number = definedExternally
//    open var center: Phaser.Math.Vector2 = definedExternally
//    open var velocity: Phaser.Math.Vector2 = definedExternally
//    open var allowGravity: Boolean = definedExternally
//    open var gravity: Phaser.Math.Vector2 = definedExternally
//    open var bounce: Phaser.Math.Vector2 = definedExternally
//    open var onWorldBounds: Boolean = definedExternally
//    open var onCollide: Boolean = definedExternally
//    open var onOverlap: Boolean = definedExternally
//    open var mass: Number = definedExternally
//    open var immovable: Boolean = definedExternally
//    open var customSeparateX: Boolean = definedExternally
//    open var customSeparateY: Boolean = definedExternally
//    open var overlapX: Number = definedExternally
//    open var overlapY: Number = definedExternally
//    open var overlapR: Number = definedExternally
//    open var embedded: Boolean = definedExternally
//    open var collideWorldBounds: Boolean = definedExternally
//    open var checkCollision: ArcadeBodyCollision = definedExternally
//    open var touching: ArcadeBodyCollision = definedExternally
//    open var wasTouching: ArcadeBodyCollision = definedExternally
//    open var blocked: ArcadeBodyCollision = definedExternally
//    open var physicsType: Number = definedExternally
//    open fun setGameObject(gameObject: Phaser.GameObjects.GameObject, update: Boolean? = definedExternally /* null */): StaticBody = definedExternally
//    open fun updateFromGameObject(): StaticBody = definedExternally
//    open fun setOffset(x: Number, y: Number): StaticBody = definedExternally
//    open fun setSize(width: Number, height: Number, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): StaticBody = definedExternally
//    open fun setCircle(radius: Number, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): StaticBody = definedExternally
//    open fun updateCenter(): Unit = definedExternally
//    open fun reset(x: Number, y: Number): Unit = definedExternally
//    open fun stop(): StaticBody = definedExternally
//    open fun getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds = definedExternally
//    open fun hitTest(x: Number, y: Number): Boolean = definedExternally
//    open fun deltaAbsX(): Number = definedExternally
//    open fun deltaAbsY(): Number = definedExternally
//    open fun deltaX(): Number = definedExternally
//    open fun deltaY(): Number = definedExternally
//    open fun deltaZ(): Number = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun drawDebug(graphic: Phaser.GameObjects.Graphics): Unit = definedExternally
//    open fun willDrawDebug(): Boolean = definedExternally
//    open fun setMass(value: Number): StaticBody = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var left: Number = definedExternally
//    open var right: Number = definedExternally
//    open var top: Number = definedExternally
//    open var bottom: Number = definedExternally
//}
//external open class StaticGroup(world: World, scene: Scene, children: Array<Any>, config: GroupConfig) : Phaser.GameObjects.Group {
//    open var world: World = definedExternally
//    open var physicsType: Number = definedExternally
//    open fun createCallbackHandler(child: Phaser.GameObjects.GameObject): Unit = definedExternally
//    open fun removeCallbackHandler(child: Phaser.GameObjects.GameObject): Unit = definedExternally
//    open fun createMultipleCallbackHandler(entries: Any): Unit = definedExternally
//    open fun refresh(): StaticGroup = definedExternally
//}
//external open class World(scene: Scene, config: ArcadeWorldConfig) : Phaser.Events.EventEmitter {
//    open var scene: Scene = definedExternally
//    open var bodies: Phaser.Structs.Set<Body> = definedExternally
//    open var staticBodies: Phaser.Structs.Set<StaticBody> = definedExternally
//    open var pendingDestroy: Phaser.Structs.Set<dynamic /* Body | StaticBody */> = definedExternally
//    open var colliders: Phaser.Structs.ProcessQueue<Collider> = definedExternally
//    open var gravity: Phaser.Math.Vector2 = definedExternally
//    open var bounds: Phaser.Geom.Rectangle = definedExternally
//    open var checkCollision: CheckCollisionObject = definedExternally
//    open var OVERLAP_BIAS: Number = definedExternally
//    open var TILE_BIAS: Number = definedExternally
//    open var forceX: Boolean = definedExternally
//    open var isPaused: Boolean = definedExternally
//    open var drawDebug: Boolean = definedExternally
//    open var debugGraphic: Phaser.GameObjects.Graphics = definedExternally
//    open var defaults: ArcadeWorldDefaults = definedExternally
//    open var maxEntries: Number = definedExternally
//    open var tree: Phaser.Structs.RTree = definedExternally
//    open var staticTree: Phaser.Structs.RTree = definedExternally
//    open var treeMinMax: ArcadeWorldTreeMinMax = definedExternally
//    open fun enable(`object`: Phaser.GameObjects.GameObject, bodyType: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun enable(`object`: Array<Phaser.GameObjects.GameObject>, bodyType: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun enableBody(`object`: Phaser.GameObjects.GameObject, bodyType: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject = definedExternally
//    open fun remove(`object`: Body): Unit = definedExternally
//    open fun disable(`object`: Phaser.GameObjects.GameObject): Unit = definedExternally
//    open fun disable(`object`: Array<Phaser.GameObjects.GameObject>): Unit = definedExternally
//    open fun disableGameObjectBody(`object`: Phaser.GameObjects.GameObject): Phaser.GameObjects.GameObject = definedExternally
//    open fun disableBody(body: Body): Unit = definedExternally
//    open fun createDebugGraphic(): Phaser.GameObjects.Graphics = definedExternally
//    open fun setBounds(x: Number, y: Number, width: Number, height: Number, checkLeft: Boolean? = definedExternally /* null */, checkRight: Boolean? = definedExternally /* null */, checkUp: Boolean? = definedExternally /* null */, checkDown: Boolean? = definedExternally /* null */): World = definedExternally
//    open fun setBoundsCollision(left: Boolean? = definedExternally /* null */, right: Boolean? = definedExternally /* null */, up: Boolean? = definedExternally /* null */, down: Boolean? = definedExternally /* null */): World = definedExternally
//    open fun pause(): World = definedExternally
//    open fun resume(): World = definedExternally
//    open fun addCollider(object1: Body, object2: Body, collideCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
//    open fun addOverlap(object1: Body, object2: Body, collideCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
//    open fun removeCollider(collider: Collider): World = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open fun postUpdate(): Unit = definedExternally
//    open fun updateMotion(body: Body): Unit = definedExternally
//    open fun computeVelocity(axis: Number, body: Body, velocity: Number, acceleration: Number, drag: Number, max: Number): Number = definedExternally
//    open fun separate(body1: Body, body2: Body, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */, overlapOnly: Boolean? = definedExternally /* null */): Boolean = definedExternally
//    open fun separateCircle(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean = definedExternally
//    open fun intersects(body1: Body, body2: Body): Boolean = definedExternally
//    open fun circleBodyIntersects(circle: Body, body: Body): Boolean = definedExternally
//    open fun overlap(object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject, overlapCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun collide(object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject, collideCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
//    open fun collideObjects(object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun collideHandler(object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun collideSpriteVsSprite(sprite1: Phaser.GameObjects.GameObject, sprite2: Phaser.GameObjects.GameObject, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun collideSpriteVsGroup(sprite: Phaser.GameObjects.GameObject, group: Phaser.GameObjects.Group, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun collideGroupVsTilemapLayer(group: Phaser.GameObjects.Group, tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun collideGroupVsTilemapLayer(group: Phaser.GameObjects.Group, tilemapLayer: Phaser.Tilemaps.StaticTilemapLayer, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun collideSpriteVsTilemapLayer(sprite: Phaser.GameObjects.GameObject, tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun collideSpriteVsTilemapLayer(sprite: Phaser.GameObjects.GameObject, tilemapLayer: Phaser.Tilemaps.StaticTilemapLayer, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun collideGroupVsGroup(group1: Phaser.GameObjects.Group, group2: Phaser.GameObjects.Group, collideCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
//    open fun wrap(`object`: Any, padding: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun wrapArray(arr: Array<Any>, padding: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun wrapObject(`object`: Any, padding: Number? = definedExternally /* null */): Unit = definedExternally
//    override fun shutdown(): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//}
