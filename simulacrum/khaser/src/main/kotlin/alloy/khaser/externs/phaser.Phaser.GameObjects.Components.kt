//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("GameObjects.Components")]
//package Phaser.GameObjects.Components
//
//import alloy.khaser.externs.BlendModes
//import alloy.khaser.externs.JSONGameObject
//import alloy.khaser.externs.ScaleModes
//import kotlin.js.*
//import org.khronos.webgl.*
//
//external interface Alpha {
//    fun clearAlpha(): Phaser.GameObjects.GameObject
//    fun setAlpha(topLeft: Number? = definedExternally /* null */, topRight: Number? = definedExternally /* null */, bottomLeft: Number? = definedExternally /* null */, bottomRight: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    var alpha: Number
//    var alphaTopLeft: Number
//    var alphaTopRight: Number
//    var alphaBottomLeft: Number
//    var alphaBottomRight: Number
//}
//external interface Animation {
//    var parent: Phaser.GameObjects.GameObject
//    var animationManager: Phaser.Animations.AnimationManager
//    var isPlaying: Boolean
//    var currentAnim: Phaser.Animations.Animation
//    var currentFrame: Phaser.Animations.AnimationFrame
//    var frameRate: Number
//    var duration: Number
//    var msPerFrame: Number
//    var skipMissedFrames: Boolean
//    var forward: Boolean
//    var accumulator: Number
//    var nextTick: Number
//    var repeatCounter: Number
//    var pendingRepeat: Boolean
//    fun setDelay(value: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun getDelay(): Number
//    fun delayedPlay(delay: Number, key: String, startFrame: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun getCurrentKey(): String
//    fun load(key: String, startFrame: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun pause(atFrame: Phaser.Animations.AnimationFrame? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun resume(fromFrame: Phaser.Animations.AnimationFrame? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    var isPaused: Boolean
//    fun play(key: String, ignoreIfPlaying: Boolean? = definedExternally /* null */, startFrame: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun getProgress(): Number
//    fun setProgress(value: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun remove(event: Phaser.Animations.Animation? = definedExternally /* null */)
//    fun getRepeat(): Number
//    fun setRepeat(value: Number): Phaser.GameObjects.GameObject
//    fun getRepeatDelay(): Number
//    fun setRepeatDelay(value: Number): Phaser.GameObjects.GameObject
//    fun restart(includeDelay: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun stop(): Phaser.GameObjects.GameObject
//    fun stopAfterDelay(delay: Number): Phaser.GameObjects.GameObject
//    fun stopOnRepeat(): Phaser.GameObjects.GameObject
//    fun stopOnFrame(delay: Phaser.Animations.AnimationFrame): Phaser.GameObjects.GameObject
//    fun setTimeScale(value: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun getTimeScale(): Number
//    fun getTotalFrames(): Number
//    fun update(timestamp: Number, delta: Number)
//    fun setCurrentFrame(animationFrame: Phaser.Animations.AnimationFrame): Phaser.GameObjects.GameObject
//    fun setYoyo(value: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun getYoyo(): Boolean
//    fun destroy()
//}
//external interface BlendMode {
//    var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */
//    fun setBlendMode(value: String): Phaser.GameObjects.GameObject
//    fun setBlendMode(value: BlendModes): Phaser.GameObjects.GameObject
//}
//external interface ComputedSize {
//    var width: Number
//    var height: Number
//    var displayWidth: Number
//    var displayHeight: Number
//    fun setSize(width: Number, height: Number): Phaser.GameObjects.GameObject
//    fun setDisplaySize(width: Number, height: Number): Phaser.GameObjects.GameObject
//}
//external interface Depth {
//    var depth: Number
//    fun setDepth(value: Number): Phaser.GameObjects.GameObject
//}
//external interface Flip {
//    var flipX: Boolean
//    var flipY: Boolean
//    fun toggleFlipX(): Phaser.GameObjects.GameObject
//    fun toggleFlipY(): Phaser.GameObjects.GameObject
//    fun setFlipX(value: Boolean): Phaser.GameObjects.GameObject
//    fun setFlipY(value: Boolean): Phaser.GameObjects.GameObject
//    fun setFlip(x: Boolean, y: Boolean): Phaser.GameObjects.GameObject
//    fun resetFlip(): Phaser.GameObjects.GameObject
//}
//external interface GetBounds {
//    fun <O : Phaser.Math.Vector2> getCenter(output: O? = definedExternally /* null */): O
//    fun <O : Phaser.Math.Vector2> getTopLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O
//    fun <O : Phaser.Math.Vector2> getTopRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O
//    fun <O : Phaser.Math.Vector2> getBottomLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O
//    fun <O : Phaser.Math.Vector2> getBottomRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O
//    fun <O : Phaser.Math.Vector2> getBounds(output: O? = definedExternally /* null */): O
//}
//external interface MatrixStack {
//    fun initMatrixStack(): Phaser.GameObjects.GameObject
//    fun save(): Phaser.GameObjects.GameObject
//    fun restore(): Phaser.GameObjects.GameObject
//    fun loadIdentity(): Phaser.GameObjects.GameObject
//    fun transform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): Phaser.GameObjects.GameObject
//    fun setTransform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): Phaser.GameObjects.GameObject
//    fun translate(x: Number, y: Number): Phaser.GameObjects.GameObject
//    fun scale(x: Number, y: Number): Phaser.GameObjects.GameObject
//    fun rotate(t: Number): Phaser.GameObjects.GameObject
//}
//external interface Origin {
//    var originX: Number
//    var originY: Number
//    var displayOriginX: Number
//    var displayOriginY: Number
//    fun setOrigin(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setOriginFromFrame(): Phaser.GameObjects.GameObject
//    fun setDisplayOrigin(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun updateDisplayOrigin(): Phaser.GameObjects.GameObject
//}
//external interface Pipeline {
//    var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline
//    var pipeline: Phaser.Renderer.WebGL.WebGLPipeline
//    fun initPipeline(pipelineName: String): Boolean
//    fun setPipeline(pipelineName: String): Boolean
//    fun resetPipeline(): Boolean
//    fun getPipelineName(): String
//}
//external interface ScaleMode {
//    var scaleMode: ScaleModes
//    fun setScaleMode(value: ScaleModes): Phaser.GameObjects.GameObject
//}
//external interface ScrollFactor {
//    var scrollFactorX: Number
//    var scrollFactorY: Number
//    fun setScrollFactor(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//}
//external interface Size {
//    var width: Number
//    var height: Number
//    var displayWidth: Number
//    var displayHeight: Number
//    fun setSizeToFrame(frame: Phaser.Textures.Frame): Phaser.GameObjects.GameObject
//    fun setSize(width: Number, height: Number): Phaser.GameObjects.GameObject
//    fun setDisplaySize(width: Number, height: Number): Phaser.GameObjects.GameObject
//}
//external interface Texture {
//    var texture: Phaser.Textures.Texture
//    var frame: Phaser.Textures.Frame
//    fun setTexture(key: String, frame: String? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setTexture(key: String, frame: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setFrame(frame: String, updateSize: Boolean? = definedExternally /* null */, updateOrigin: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setFrame(frame: Number, updateSize: Boolean? = definedExternally /* null */, updateOrigin: Boolean? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setTexture(key: String): Phaser.GameObjects.GameObject
//}
//external interface Tint {
//    fun clearTint(): Phaser.GameObjects.GameObject
//    fun setTint(topLeft: Number? = definedExternally /* null */, topRight: Number? = definedExternally /* null */, bottomLeft: Number? = definedExternally /* null */, bottomRight: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    var tintTopLeft: Number
//    var tintTopRight: Number
//    var tintBottomLeft: Number
//    var tintBottomRight: Number
//    var tint: Number
//}
//external fun ToJSON(gameObject: Phaser.GameObjects.GameObject): JSONGameObject = definedExternally
//external interface Transform {
//    var x: Number
//    var y: Number
//    var z: Number
//    var w: Number
//    var scaleX: Number
//    var scaleY: Number
//    var angle: Number
//    var rotation: Number
//    fun setPosition(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setRotation(radians: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setAngle(degrees: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setScale(x: Number, y: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setX(value: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setY(value: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setZ(value: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun setW(value: Number? = definedExternally /* null */): Phaser.GameObjects.GameObject
//    fun getLocalTransformMatrix(tempMatrix: TransformMatrix? = definedExternally /* null */): TransformMatrix
//    fun getWorldTransformMatrix(tempMatrix: TransformMatrix? = definedExternally /* null */): TransformMatrix
//}
//external open class TransformMatrix(a: Number? = definedExternally /* null */, b: Number? = definedExternally /* null */, c: Number? = definedExternally /* null */, d: Number? = definedExternally /* null */, tx: Number? = definedExternally /* null */, ty: Number? = definedExternally /* null */) {
//    open var matrix: Float32Array = definedExternally
//    open var decomposedMatrix: Any = definedExternally
//    open var a: Number = definedExternally
//    open var b: Number = definedExternally
//    open var c: Number = definedExternally
//    open var d: Number = definedExternally
//    open var tx: Number = definedExternally
//    open var ty: Number = definedExternally
//    open var rotation: Number = definedExternally
//    open var scaleX: Number = definedExternally
//    open var scaleY: Number = definedExternally
//    open fun loadIdentity(): TransformMatrix = definedExternally
//    open fun translate(x: Number, y: Number): TransformMatrix = definedExternally
//    open fun scale(x: Number, y: Number): TransformMatrix = definedExternally
//    open fun rotate(radian: Number): TransformMatrix = definedExternally
//    open fun multiply(rhs: TransformMatrix): TransformMatrix = definedExternally
//    open fun transform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): TransformMatrix = definedExternally
//    open fun transformPoint(x: Number, y: Number, point: Any?): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun transformPoint(x: Number, y: Number, point: Phaser.Math.Vector2): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun transformPoint(x: Number, y: Number, point: Phaser.Geom.Point): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun invert(): TransformMatrix = definedExternally
//    open fun setTransform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): TransformMatrix = definedExternally
//    open fun decomposeMatrix(): Any = definedExternally
//    open fun applyITRS(x: Number, y: Number, rotation: Number, scaleX: Number, scaleY: Number): TransformMatrix = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external interface Visible {
//    var visible: Boolean
//    fun setVisible(value: Boolean): Phaser.GameObjects.GameObject
//}
