//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Physics.Matter")]
//package Phaser.Physics.Matter
//
//import alloy.khaser.externs.BlendModes
//import alloy.khaser.externs.ScaleModes
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//
//external open class Factory(world: World) {
//    open var world: World = definedExternally
//    open var scene: Scene = definedExternally
//    open var sys: Phaser.Scenes.Systems = definedExternally
//    open fun rectangle(x: Number, y: Number, width: Number, height: Number, options: Any): MatterJS.Body = definedExternally
//    open fun trapezoid(x: Number, y: Number, width: Number, height: Number, slope: Number, options: Any): MatterJS.Body = definedExternally
//    open fun circle(x: Number, y: Number, radius: Number, options: Any, maxSides: Number): MatterJS.Body = definedExternally
//    open fun polygon(x: Number, y: Number, sides: Number, radius: Number, options: Any): MatterJS.Body = definedExternally
//    open fun fromVertices(x: Number, y: Number, vertexSets: Array<Any>, options: Any, flagInternal: Boolean, removeCollinear: Boolean, minimumArea: Number): MatterJS.Body = definedExternally
//    open fun imageStack(key: String, frame: String, x: Number, y: Number, columns: Number, rows: Number, columnGap: Number? = definedExternally /* null */, rowGap: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Composite = definedExternally
//    open fun imageStack(key: String, frame: Number, x: Number, y: Number, columns: Number, rows: Number, columnGap: Number? = definedExternally /* null */, rowGap: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Composite = definedExternally
//    open fun stack(x: Number, y: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, callback: Function<*>): MatterJS.Composite = definedExternally
//    open fun pyramid(x: Number, y: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, callback: Function<*>): MatterJS.Composite = definedExternally
//    open fun chain(composite: MatterJS.Composite, xOffsetA: Number, yOffsetA: Number, xOffsetB: Number, yOffsetB: Number, options: Any): MatterJS.Composite = definedExternally
//    open fun mesh(composite: MatterJS.Composite, columns: Number, rows: Number, crossBrace: Boolean, options: Any): MatterJS.Composite = definedExternally
//    open fun newtonsCradle(x: Number, y: Number, number: Number, size: Number, length: Number): MatterJS.Composite = definedExternally
//    open fun car(x: Number, y: Number, width: Number, height: Number, wheelSize: Number): MatterJS.Composite = definedExternally
//    open fun softBody(x: Number, y: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, crossBrace: Boolean, particleRadius: Number, particleOptions: Any, constraintOptions: Any): MatterJS.Composite = definedExternally
//    open fun joint(bodyA: MatterJS.Body, bodyB: MatterJS.Body, length: Number, stiffness: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Constraint = definedExternally
//    open fun spring(bodyA: MatterJS.Body, bodyB: MatterJS.Body, length: Number, stiffness: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Constraint = definedExternally
//    open fun constraint(bodyA: MatterJS.Body, bodyB: MatterJS.Body, length: Number, stiffness: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Constraint = definedExternally
//    open fun worldConstraint(bodyB: MatterJS.Body, length: Number, stiffness: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Constraint = definedExternally
//    open fun mouseSpring(options: Any): MatterJS.Constraint = definedExternally
//    open fun pointerConstraint(options: Any): MatterJS.Constraint = definedExternally
//    open fun image(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */, options: Any? = definedExternally /* null */): Image = definedExternally
//    open fun image(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): Image = definedExternally
//    open fun tileBody(tile: Phaser.Tilemaps.Tile, options: Any): TileBody = definedExternally
//    open fun sprite(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */, options: Any? = definedExternally /* null */): Sprite = definedExternally
//    open fun sprite(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): Sprite = definedExternally
//    open fun gameObject(gameObject: Phaser.GameObjects.GameObject, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun image(x: Number, y: Number, key: String): Image = definedExternally
//    open fun sprite(x: Number, y: Number, key: String): Sprite = definedExternally
//}
//external fun MatterGameObject(world: World, gameObject: Phaser.GameObjects.GameObject, options: Any): Phaser.GameObjects.GameObject = definedExternally
//external open class Image : Phaser.GameObjects.Image, Phaser.Physics.Matter.Components.Bounce, Phaser.Physics.Matter.Components.Collision, Phaser.Physics.Matter.Components.Force, Phaser.Physics.Matter.Components.Friction, Phaser.Physics.Matter.Components.Gravity, Phaser.Physics.Matter.Components.Mass, Phaser.Physics.Matter.Components.Sensor, Phaser.Physics.Matter.Components.SetBody, Phaser.Physics.Matter.Components.Sleep, Phaser.Physics.Matter.Components.Static, Phaser.Physics.Matter.Components.Transform, Phaser.Physics.Matter.Components.Velocity, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(world: World, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */, options: Any? = definedExternally /* null */)
//    constructor(world: World, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */)
//    open var world: World = definedExternally
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
//    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollisionCategory(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollisionGroup(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesWith(categories: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesWith(categories: Array<Number>): Phaser.GameObjects.GameObject = definedExternally
//    override fun applyForce(force: Phaser.Math.Vector2): Phaser.GameObjects.GameObject = definedExternally
//    override fun applyForceFrom(position: Phaser.Math.Vector2, force: Phaser.Math.Vector2): Phaser.GameObjects.GameObject = definedExternally
//    override fun thrust(speed: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun thrustLeft(speed: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun thrustRight(speed: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun thrustBack(speed: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFriction(value: Number, air: Number?, fstatic: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionAir(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionStatic(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setIgnoreGravity(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMass(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDensity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSensor(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun isSensor(): Boolean = definedExternally
//    override fun setRectangle(width: Number, height: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCircle(radius: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setPolygon(radius: Number, sides: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTrapezoid(width: Number, height: Number, slope: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setExistingBody(body: MatterJS.Body, addToWorld: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBody(config: Any, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepThreshold(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepEvents(start: Boolean, end: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepStartEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepEndEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setStatic(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun isStatic(): Boolean = definedExternally
//    override fun setFixedRotation(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngularVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTexture(key: String): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class MatterPhysics(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var config: Any = definedExternally
//    open var world: World = definedExternally
//    open var add: Factory = definedExternally
//    open fun getConfig(): Any = definedExternally
//    open fun enableAttractorPlugin(): MatterPhysics = definedExternally
//    open fun enableWrapPlugin(): MatterPhysics = definedExternally
//    open fun pause(): World = definedExternally
//    open fun resume(): World = definedExternally
//    open fun set60Hz(): MatterPhysics = definedExternally
//    open fun set30Hz(): MatterPhysics = definedExternally
//    open fun step(delta: Number? = definedExternally /* null */, correction: Number? = definedExternally /* null */): Unit = definedExternally
//}
//external open class Sprite : Phaser.GameObjects.Sprite, Phaser.Physics.Matter.Components.Bounce, Phaser.Physics.Matter.Components.Collision, Phaser.Physics.Matter.Components.Force, Phaser.Physics.Matter.Components.Friction, Phaser.Physics.Matter.Components.Gravity, Phaser.Physics.Matter.Components.Mass, Phaser.Physics.Matter.Components.Sensor, Phaser.Physics.Matter.Components.SetBody, Phaser.Physics.Matter.Components.Sleep, Phaser.Physics.Matter.Components.Static, Phaser.Physics.Matter.Components.Transform, Phaser.Physics.Matter.Components.Velocity, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(world: World, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */, options: Any? = definedExternally /* null */)
//    constructor(world: World, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */)
//    open var world: World = definedExternally
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
//    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollisionCategory(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollisionGroup(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesWith(categories: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesWith(categories: Array<Number>): Phaser.GameObjects.GameObject = definedExternally
//    override fun applyForce(force: Phaser.Math.Vector2): Phaser.GameObjects.GameObject = definedExternally
//    override fun applyForceFrom(position: Phaser.Math.Vector2, force: Phaser.Math.Vector2): Phaser.GameObjects.GameObject = definedExternally
//    override fun thrust(speed: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun thrustLeft(speed: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun thrustRight(speed: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun thrustBack(speed: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFriction(value: Number, air: Number?, fstatic: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionAir(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionStatic(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setIgnoreGravity(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMass(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDensity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSensor(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun isSensor(): Boolean = definedExternally
//    override fun setRectangle(width: Number, height: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCircle(radius: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setPolygon(radius: Number, sides: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTrapezoid(width: Number, height: Number, slope: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setExistingBody(body: MatterJS.Body, addToWorld: Boolean?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setBody(config: Any, options: Any): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepThreshold(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepEvents(start: Boolean, end: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepStartEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepEndEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setStatic(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun isStatic(): Boolean = definedExternally
//    override fun setFixedRotation(): Phaser.GameObjects.GameObject = definedExternally
//    override fun setAngularVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setTexture(key: String): Phaser.GameObjects.GameObject = definedExternally
//}
//external open class TileBody(world: World, tile: Phaser.Tilemaps.Tile, options: Any? = definedExternally /* null */) : Phaser.Physics.Matter.Components.Bounce, Phaser.Physics.Matter.Components.Collision, Phaser.Physics.Matter.Components.Friction, Phaser.Physics.Matter.Components.Gravity, Phaser.Physics.Matter.Components.Mass, Phaser.Physics.Matter.Components.Sensor, Phaser.Physics.Matter.Components.Sleep, Phaser.Physics.Matter.Components.Static {
//    open var tile: Phaser.Tilemaps.Tile = definedExternally
//    open var world: World = definedExternally
//    open fun setFromTileRectangle(options: Any? = definedExternally /* null */): TileBody = definedExternally
//    open fun setFromTileCollision(options: Any? = definedExternally /* null */): TileBody = definedExternally
//    open fun setBody(body: MatterJS.Body, addToWorld: Boolean? = definedExternally /* null */): TileBody = definedExternally
//    open fun removeBody(): TileBody = definedExternally
//    open fun destroy(): TileBody = definedExternally
//    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollisionCategory(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollisionGroup(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesWith(categories: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setCollidesWith(categories: Array<Number>): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFriction(value: Number, air: Number?, fstatic: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionAir(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setFrictionStatic(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setIgnoreGravity(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setMass(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setDensity(value: Number): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSensor(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun isSensor(): Boolean = definedExternally
//    override fun setSleepThreshold(value: Number?): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepEvents(start: Boolean, end: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepStartEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setSleepEndEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun setStatic(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
//    override fun isStatic(): Boolean = definedExternally
//}
//external open class PointerConstraint(scene: Scene, world: World, options: Any) {
//    open var scene: Scene = definedExternally
//    open var world: World = definedExternally
//    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
//    open var pointer: Phaser.Input.Pointer = definedExternally
//    open var active: Boolean = definedExternally
//    open var position: Phaser.Math.Vector2 = definedExternally
//    open var constraint: Any = definedExternally
//    open fun onDown(pointer: Phaser.Input.Pointer): Unit = definedExternally
//    open fun onUp(): Unit = definedExternally
//    open fun getBodyPart(body: MatterJS.Body, position: Phaser.Math.Vector2): Boolean = definedExternally
//    open fun update(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class World(scene: Scene, config: Any) : Phaser.Events.EventEmitter {
//    open var scene: Scene = definedExternally
//    open var engine: MatterJS.Engine = definedExternally
//    open var localWorld: MatterJS.World = definedExternally
//    open var walls: Any = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var correction: Number = definedExternally
//    open var getDelta: Function<*> = definedExternally
//    open var autoUpdate: Boolean = definedExternally
//    open var drawDebug: Boolean = definedExternally
//    open var debugGraphic: Phaser.GameObjects.Graphics = definedExternally
//    open var defaults: Any = definedExternally
//    open fun setEventsProxy(): Unit = definedExternally
//    open fun setBounds(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, thickness: Number? = definedExternally /* null */, left: Boolean? = definedExternally /* null */, right: Boolean? = definedExternally /* null */, top: Boolean? = definedExternally /* null */, bottom: Boolean? = definedExternally /* null */): World = definedExternally
//    open fun updateWall(add: Boolean, position: String, x: Number, y: Number, width: Number, height: Number): Unit = definedExternally
//    open fun createDebugGraphic(): Phaser.GameObjects.Graphics = definedExternally
//    open fun disableGravity(): World = definedExternally
//    open fun setGravity(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, scale: Number? = definedExternally /* null */): World = definedExternally
//    open fun create(x: Number, y: Number, width: Number, height: Number, options: Any): MatterJS.Body = definedExternally
//    open fun add(`object`: Any?): World = definedExternally
//    open fun add(`object`: Array<Any?>): World = definedExternally
//    open fun remove(`object`: Any, deep: Boolean): World = definedExternally
//    open fun removeConstraint(constraint: MatterJS.Constraint, deep: Boolean): World = definedExternally
//    open fun convertTilemapLayer(tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, options: Any? = definedExternally /* null */): World = definedExternally
//    open fun convertTilemapLayer(tilemapLayer: Phaser.Tilemaps.StaticTilemapLayer, options: Any? = definedExternally /* null */): World = definedExternally
//    open fun convertTiles(tiles: Array<Phaser.Tilemaps.Tile>, options: Any? = definedExternally /* null */): World = definedExternally
//    open fun nextGroup(isNonColliding: Boolean): Number = definedExternally
//    open fun nextCategory(): Number = definedExternally
//    open fun pause(): World = definedExternally
//    open fun resume(): World = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open fun step(delta: Number? = definedExternally /* null */, correction: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun update60Hz(): Number = definedExternally
//    open fun update30Hz(): Number = definedExternally
//    open fun postUpdate(): Unit = definedExternally
//    open fun fromPath(path: String, points: Array<Any>): Array<Any> = definedExternally
//    override fun shutdown(): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//}
