//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("GameObjects")]
//package Phaser.GameObjects
//
//import alloy.khaser.externs.BlendModes
//import alloy.khaser.externs.ScaleModes
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//import org.khronos.webgl.*
//import org.w3c.dom.*
//
//external interface `T$1` {
//    var font: String
//    var text: String
//    var fontSize: Number
//    var letterSpacing: Number
//}
//external open class DynamicBitmapText : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number, y: Number, font: String, text: String? = definedExternally /* null */, size: Number? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, font: String, text: Array<String>? = definedExternally /* null */, size: Number? = definedExternally /* null */)
//    open var font: String = definedExternally
//    open var fontData: Any = definedExternally
//    open var text: String = definedExternally
//    open var fontSize: Number = definedExternally
//    open var letterSpacing: Number = definedExternally
//    open var scrollX: Number = definedExternally
//    open var scrollY: Number = definedExternally
//    open var cropWidth: Number = definedExternally
//    open var cropHeight: Number = definedExternally
//    open fun setSize(width: Number, height: Number): DynamicBitmapText = definedExternally
//    open fun setDisplayCallback(callback: (display: DisplayCallbackConfig) -> Unit): DynamicBitmapText = definedExternally
//    open fun setFontSize(size: Number): DynamicBitmapText = definedExternally
//    open fun setText(value: String): DynamicBitmapText = definedExternally
//    open fun setText(value: Array<String>): DynamicBitmapText = definedExternally
//    open fun setScrollX(value: Number): DynamicBitmapText = definedExternally
//    open fun setScrollY(value: Number): DynamicBitmapText = definedExternally
//    open fun getTextBounds(round: Boolean): TextBounds = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    override fun toJSON(): JSONGameObject /* JSONGameObject & `T$1` */ = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var originX: Number = definedExternally
//    override var originY: Number = definedExternally
//    override var displayOriginX: Number = definedExternally
//    override var displayOriginY: Number = definedExternally
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun clearTint(): GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
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
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external open class BitmapText : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number, y: Number, font: String, text: String? = definedExternally /* null */, size: Number? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, font: String, text: Array<String>? = definedExternally /* null */, size: Number? = definedExternally /* null */)
//    open var font: String = definedExternally
//    open var fontData: Any = definedExternally
//    open var text: String = definedExternally
//    open var fontSize: Number = definedExternally
//    open var letterSpacing: Number = definedExternally
//    open fun setFontSize(size: Number): BitmapText = definedExternally
//    open fun setLetterSpacing(spacing: Number? = definedExternally /* null */): BitmapText = definedExternally
//    open fun setText(value: String): BitmapText = definedExternally
//    open fun setText(value: Array<String>): BitmapText = definedExternally
//    open fun getTextBounds(round: Boolean): TextBounds = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    override fun toJSON(): JSONGameObject /* JSONGameObject & `T$1` */ = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var originX: Number = definedExternally
//    override var originY: Number = definedExternally
//    override var displayOriginX: Number = definedExternally
//    override var displayOriginY: Number = definedExternally
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun clearTint(): GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
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
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external open class Blitter : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, texture: String? = definedExternally /* null */, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, texture: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */)
//    open var children: Phaser.Structs.List<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open var renderList: Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun create(x: Number, y: Number, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, index: Number? = definedExternally /* null */): Phaser.GameObjects.Blitter.Bob = definedExternally
//    open fun create(x: Number, y: Number, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, index: Number? = definedExternally /* null */): Phaser.GameObjects.Blitter.Bob = definedExternally
//    open fun create(x: Number, y: Number, frame: Phaser.Textures.Frame? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, index: Number? = definedExternally /* null */): Phaser.GameObjects.Blitter.Bob = definedExternally
//    open fun createFromCallback(callback: (blitter: Blitter, index: Number) -> Unit, quantity: Number, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createFromCallback(callback: (blitter: Blitter, index: Number) -> Unit, quantity: Number, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createFromCallback(callback: (blitter: Blitter, index: Number) -> Unit, quantity: Number, frame: Array<String>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createFromCallback(callback: (blitter: Blitter, index: Number) -> Unit, quantity: Number, frame: Array<Number>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createFromCallback(callback: (blitter: Blitter, index: Number) -> Unit, quantity: Number, frame: Phaser.Textures.Frame? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createFromCallback(callback: (blitter: Blitter, index: Number) -> Unit, quantity: Number, frame: Array<Phaser.Textures.Frame>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createMultiple(quantity: Number, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createMultiple(quantity: Number, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createMultiple(quantity: Number, frame: Array<String>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createMultiple(quantity: Number, frame: Array<Number>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createMultiple(quantity: Number, frame: Phaser.Textures.Frame? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createMultiple(quantity: Number, frame: Array<Phaser.Textures.Frame>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun childCanRender(child: Phaser.GameObjects.Blitter.Bob): Boolean = definedExternally
//    open fun getRenderList(): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun clear(): Unit = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    open class Bob {
//        constructor(blitter: Phaser.GameObjects.Blitter, x: Number, y: Number, frame: String, visible: Boolean)
//        constructor(blitter: Phaser.GameObjects.Blitter, x: Number, y: Number, frame: Number, visible: Boolean)
//        open var parent: Phaser.GameObjects.Blitter = definedExternally
//        open var x: Number = definedExternally
//        open var y: Number = definedExternally
//        open var frame: dynamic /* String | Number */ = definedExternally
//        open var data: Any = definedExternally
//        open var flipX: Boolean = definedExternally
//        open var flipY: Boolean = definedExternally
//        open fun setFrame(frame: Phaser.Textures.Frame? = definedExternally /* null */): Bob = definedExternally
//        open fun resetFlip(): Bob = definedExternally
//        open fun reset(x: Number, y: Number, frame: Phaser.Textures.Frame): Bob = definedExternally
//        open fun setFlipX(value: Number): Bob = definedExternally
//        open fun setFlipY(value: Number): Bob = definedExternally
//        open fun setFlip(x: Number, y: Number): Bob = definedExternally
//        open fun setVisible(value: Boolean): Bob = definedExternally
//        open fun setAlpha(value: Number): Bob = definedExternally
//        open fun destroy(): Unit = definedExternally
//        open var visible: Boolean = definedExternally
//        open var alpha: Number = definedExternally
//    }
//    open fun create(x: Number, y: Number): Phaser.GameObjects.Blitter.Bob = definedExternally
//    open fun createFromCallback(callback: (blitter: Blitter, index: Number) -> Unit, quantity: Number): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    open fun createMultiple(quantity: Number): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external fun BuildGameObject(scene: Scene, gameObject: GameObject, config: GameObjectConfig): GameObject = definedExternally
//external fun BuildGameObjectAnimation(sprite: Sprite, config: Any): Sprite = definedExternally
//external open class Container(scene: Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, children: Array<GameObject>? = definedExternally /* null */) : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    open var list: Array<GameObject> = definedExternally
//    open var exclusive: Boolean = definedExternally
//    open var maxSize: Number = definedExternally
//    open var position: Number = definedExternally
//    open var localTransform: Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    open var _sortKey: String = definedExternally
//    open var originX: Number = definedExternally
//    open var originY: Number = definedExternally
//    open var displayOriginX: Number = definedExternally
//    open var displayOriginY: Number = definedExternally
//    open fun setExclusive(value: Boolean? = definedExternally /* null */): Container = definedExternally
//    open fun getBounds(output: Phaser.Geom.Rectangle? = definedExternally /* null */): Phaser.Geom.Rectangle = definedExternally
//    open fun pointToContainer(source: Any?, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Any?, output: Phaser.Math.Vector2? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Any?, output: Phaser.Geom.Point? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Phaser.Math.Vector2, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Phaser.Math.Vector2, output: Phaser.Math.Vector2? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Phaser.Math.Vector2, output: Phaser.Geom.Point? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Phaser.Geom.Point, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Phaser.Geom.Point, output: Phaser.Math.Vector2? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Phaser.Geom.Point, output: Phaser.Geom.Point? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun getBoundsTransformMatrix(): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    open fun add(child: GameObject): Container = definedExternally
//    open fun add(child: Array<GameObject>): Container = definedExternally
//    open fun addAt(child: GameObject, index: Number? = definedExternally /* null */): Container = definedExternally
//    open fun addAt(child: Array<GameObject>, index: Number? = definedExternally /* null */): Container = definedExternally
//    open fun getAt(index: Number): GameObject = definedExternally
//    open fun getIndex(child: GameObject): Number = definedExternally
//    open fun sort(property: String): Container = definedExternally
//    open fun getByName(name: String): GameObject = definedExternally
//    open fun getRandom(startIndex: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */): GameObject = definedExternally
//    open fun getFirst(property: String? = definedExternally /* null */, value: Any? = definedExternally /* null */, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): GameObject = definedExternally
//    open fun getAll(property: String? = definedExternally /* null */, value: Any? = definedExternally /* null */, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Array<GameObject> = definedExternally
//    open fun count(property: String, value: Any, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Number = definedExternally
//    open fun swap(child1: GameObject, child2: GameObject): Container = definedExternally
//    open fun moveTo(child: GameObject, index: Number): Container = definedExternally
//    open fun remove(child: GameObject, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
//    open fun remove(child: Array<GameObject>, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
//    open fun removeAt(index: Number, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
//    open fun removeBetween(startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
//    open fun removeAll(destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
//    open fun bringToTop(child: GameObject): Container = definedExternally
//    open fun sendToBack(child: GameObject): Container = definedExternally
//    open fun moveUp(child: GameObject): Container = definedExternally
//    open fun moveDown(child: GameObject): Container = definedExternally
//    open fun reverse(): Container = definedExternally
//    open fun shuffle(): Container = definedExternally
//    open fun replace(oldChild: GameObject, newChild: GameObject, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
//    open fun exists(child: GameObject): Boolean = definedExternally
//    open fun setAll(property: String, value: Any, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Container = definedExternally
//    open fun each(callback: Function<*>, context: Any? = definedExternally /* null */, vararg args: Any): Container = definedExternally
//    open fun iterate(callback: Function<*>, context: Any? = definedExternally /* null */, vararg args: Any): Container = definedExternally
//    open var length: Number = definedExternally
//    open var first: GameObject = definedExternally
//    open var last: GameObject = definedExternally
//    open var next: GameObject = definedExternally
//    open var previous: GameObject = definedExternally
//    override fun destroy(): Unit = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    open fun pointToContainer(source: Any?): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Phaser.Math.Vector2): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//    open fun pointToContainer(source: Phaser.Geom.Point): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
//}
//external open class DisplayList(scene: Scene) : Phaser.Structs.List<GameObject> {
//    open var sortChildrenFlag: Boolean = definedExternally
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open fun queueDepthSort(): Unit = definedExternally
//    open fun depthSort(): Unit = definedExternally
//    open fun sortByDepth(childA: GameObject, childB: GameObject): Number = definedExternally
//    open fun sortGameObjects(gameObjects: Array<GameObject>): Array<Any> = definedExternally
//    open fun getTopGameObject(gameObjects: Array<GameObject>): GameObject = definedExternally
//}
//external open class GameObject(scene: Scene, type: String) : Phaser.Events.EventEmitter {
//    open var scene: Scene = definedExternally
//    open var type: String = definedExternally
//    open var parentContainer: Container = definedExternally
//    open var name: String = definedExternally
//    open var active: Boolean = definedExternally
//    open var tabIndex: Number = definedExternally
//    open var data: Phaser.Data.DataManager = definedExternally
//    open var renderFlags: Number = definedExternally
//    open var cameraFilter: Number = definedExternally
//    open var input: Phaser.Input.InteractiveObject = definedExternally
//    open var body: Any = definedExternally
//    open var ignoreDestroy: Boolean = definedExternally
//    open fun setActive(value: Boolean): GameObject = definedExternally
//    open fun setName(value: String): GameObject = definedExternally
//    open fun setDataEnabled(): GameObject = definedExternally
//    open fun setData(key: String, value: Any): GameObject = definedExternally
//    open fun getData(key: String): Any = definedExternally
//    open fun setInteractive(shape: Any? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: GameObject) -> Unit)? = definedExternally /* null */, dropZone: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun update(): Unit = definedExternally
//    open fun toJSON(): JSONGameObject = definedExternally
//    open fun willRender(): Boolean = definedExternally
//    open fun getIndexList(): Array<Number> = definedExternally
//    override fun destroy(): Unit = definedExternally
//    companion object {
//        var RENDER_MASK: Number = definedExternally
//    }
//}
//external interface `T$2` {
//    var font: String? get() = definedExternally; set(value) = definedExternally
//    var text: String? get() = definedExternally; set(value) = definedExternally
//    var size: dynamic /* Number | Boolean */ get() = definedExternally; set(value) = definedExternally
//    var align: String? get() = definedExternally; set(value) = definedExternally
//}
//external open class GameObjectCreator(scene: Scene) {
//    open fun dynamicBitmapText(config: GameObjectConfig /* GameObjectConfig & `T$2` */): DynamicBitmapText = definedExternally
//    open fun bitmapText(config: GameObjectConfig /* GameObjectConfig & `T$2` */): BitmapText = definedExternally
//    open fun blitter(config: Any): Blitter = definedExternally
//    open fun container(config: Any): Container = definedExternally
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var displayList: DisplayList = definedExternally
//    open fun graphics(config: Any? = definedExternally /* null */): Graphics = definedExternally
//    open fun group(config: GroupConfig): Group = definedExternally
//    open fun image(config: Any): Image = definedExternally
//    open fun mesh(config: Any): Mesh = definedExternally
//    open fun particles(config: Any): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
//    open fun quad(config: Any): Quad = definedExternally
//    open fun renderTexture(config: RenderTextureConfig): RenderTexture = definedExternally
//    open fun sprite(config: Any): Sprite = definedExternally
//    open fun sprite3D(config: Any): Sprite3D = definedExternally
//    open fun text(config: Any): Text = definedExternally
//    open fun tileSprite(config: TileSprite): TileSprite = definedExternally
//    open fun zone(config: Any): Zone = definedExternally
//    open fun tilemap(config: TilemapConfig? = definedExternally /* null */): Phaser.Tilemaps.Tilemap = definedExternally
//    open fun tween(config: Any): Phaser.Tweens.Tween = definedExternally
//}
//external open class GameObjectFactory(scene: Scene) {
//    open fun path(x: Number, y: Number): Phaser.Curves.Path = definedExternally
//    open fun dynamicBitmapText(x: Number, y: Number, font: String, text: String? = definedExternally /* null */, size: Number? = definedExternally /* null */): DynamicBitmapText = definedExternally
//    open fun dynamicBitmapText(x: Number, y: Number, font: String, text: Array<String>? = definedExternally /* null */, size: Number? = definedExternally /* null */): DynamicBitmapText = definedExternally
//    open fun bitmapText(x: Number, y: Number, font: String, text: String? = definedExternally /* null */, size: Number? = definedExternally /* null */): BitmapText = definedExternally
//    open fun bitmapText(x: Number, y: Number, font: String, text: Array<String>? = definedExternally /* null */, size: Number? = definedExternally /* null */): BitmapText = definedExternally
//    open fun blitter(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */): Blitter = definedExternally
//    open fun blitter(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */): Blitter = definedExternally
//    open fun container(x: Number, y: Number, children: GameObject? = definedExternally /* null */): Container = definedExternally
//    open fun container(x: Number, y: Number, children: Array<GameObject>? = definedExternally /* null */): Container = definedExternally
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var displayList: DisplayList = definedExternally
//    open fun existing(child: GameObject): GameObject = definedExternally
//    open fun graphics(config: Any? = definedExternally /* null */): Graphics = definedExternally
//    open fun group(children: Array<GameObject>, config: GroupConfig? = definedExternally /* null */): Group = definedExternally
//    open fun group(children: GroupConfig, config: GroupConfig? = definedExternally /* null */): Group = definedExternally
//    open fun image(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Image = definedExternally
//    open fun image(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Image = definedExternally
//    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: String? = definedExternally /* null */): Mesh = definedExternally
//    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: Number? = definedExternally /* null */): Mesh = definedExternally
//    open fun particles(texture: String, frame: String? = definedExternally /* null */, emitters: Any? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
//    open fun particles(texture: String, frame: Number? = definedExternally /* null */, emitters: Any? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
//    open fun particles(texture: String, frame: Any? = definedExternally /* null */, emitters: Any? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
//    open fun follower(path: Phaser.Curves.Path, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): PathFollower = definedExternally
//    open fun follower(path: Phaser.Curves.Path, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): PathFollower = definedExternally
//    open fun quad(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Quad = definedExternally
//    open fun quad(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Quad = definedExternally
//    open fun renderTexture(x: Number, y: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): RenderTexture = definedExternally
//    open fun sprite(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Sprite = definedExternally
//    open fun sprite(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Sprite = definedExternally
//    open fun sprite3D(x: Number, y: Number, z: Number, texture: String, frame: String? = definedExternally /* null */): Sprite3D = definedExternally
//    open fun sprite3D(x: Number, y: Number, z: Number, texture: String, frame: Number? = definedExternally /* null */): Sprite3D = definedExternally
//    open fun text(x: Number, y: Number, text: String, style: Any? = definedExternally /* null */): Text = definedExternally
//    open fun text(x: Number, y: Number, text: Array<String>, style: Any? = definedExternally /* null */): Text = definedExternally
//    open fun tileSprite(x: Number, y: Number, width: Number, height: Number, texture: String, frame: String? = definedExternally /* null */): TileSprite = definedExternally
//    open fun tileSprite(x: Number, y: Number, width: Number, height: Number, texture: String, frame: Number? = definedExternally /* null */): TileSprite = definedExternally
//    open fun zone(x: Number, y: Number, width: Number, height: Number): Zone = definedExternally
//    open fun tilemap(key: String? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, data: Array<Array<Number>>? = definedExternally /* null */, insertNull: Boolean? = definedExternally /* null */): Phaser.Tilemaps.Tilemap = definedExternally
//    open fun tween(config: Any): Phaser.Tweens.Tween = definedExternally
//    open fun dynamicBitmapText(x: Number, y: Number, font: String): DynamicBitmapText = definedExternally
//    open fun bitmapText(x: Number, y: Number, font: String): BitmapText = definedExternally
//    open fun blitter(x: Number, y: Number, key: String): Blitter = definedExternally
//    open fun container(x: Number, y: Number): Container = definedExternally
//    open fun image(x: Number, y: Number, texture: String): Image = definedExternally
//    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String): Mesh = definedExternally
//    open fun particles(texture: String): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
//    open fun follower(path: Phaser.Curves.Path, x: Number, y: Number, texture: String): PathFollower = definedExternally
//    open fun quad(x: Number, y: Number, texture: String): Quad = definedExternally
//    open fun sprite(x: Number, y: Number, texture: String): Sprite = definedExternally
//    open fun sprite3D(x: Number, y: Number, z: Number, texture: String): Sprite3D = definedExternally
//    open fun tileSprite(x: Number, y: Number, width: Number, height: Number, texture: String): TileSprite = definedExternally
//}
//external open class Graphics(scene: Scene, options: Any) : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible, Phaser.GameObjects.Components.ScrollFactor {
//    open var displayOriginX: Number = definedExternally
//    open var displayOriginY: Number = definedExternally
//    open var commandBuffer: Array<Any> = definedExternally
//    open var defaultFillColor: Number = definedExternally
//    open var defaultFillAlpha: Number = definedExternally
//    open var defaultStrokeWidth: Number = definedExternally
//    open var defaultStrokeColor: Number = definedExternally
//    open var defaultStrokeAlpha: Number = definedExternally
//    open fun setDefaultStyles(options: Any): Graphics = definedExternally
//    open fun lineStyle(lineWidth: Number, color: Number, alpha: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillStyle(color: Number, alpha: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun beginPath(): Graphics = definedExternally
//    open fun closePath(): Graphics = definedExternally
//    open fun fillPath(): Graphics = definedExternally
//    open fun strokePath(): Graphics = definedExternally
//    open fun fillCircleShape(circle: Phaser.Geom.Circle): Graphics = definedExternally
//    open fun strokeCircleShape(circle: Phaser.Geom.Circle): Graphics = definedExternally
//    open fun fillCircle(x: Number, y: Number, radius: Number): Graphics = definedExternally
//    open fun strokeCircle(x: Number, y: Number, radius: Number): Graphics = definedExternally
//    open fun fillRectShape(rect: Phaser.Geom.Rectangle): Graphics = definedExternally
//    open fun strokeRectShape(rect: Phaser.Geom.Rectangle): Graphics = definedExternally
//    open fun fillRect(x: Number, y: Number, width: Number, height: Number): Graphics = definedExternally
//    open fun strokeRect(x: Number, y: Number, width: Number, height: Number): Graphics = definedExternally
//    open fun fillPointShape(point: Any?, size: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillPointShape(point: Phaser.Math.Vector2, size: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillPointShape(point: Phaser.Geom.Point, size: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillPoint(x: Number, y: Number, size: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillTriangleShape(triangle: Phaser.Geom.Triangle): Graphics = definedExternally
//    open fun strokeTriangleShape(triangle: Phaser.Geom.Triangle): Graphics = definedExternally
//    open fun fillTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number): Graphics = definedExternally
//    open fun strokeTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number): Graphics = definedExternally
//    open fun strokeLineShape(line: Phaser.Geom.Line): Graphics = definedExternally
//    open fun lineBetween(x1: Number, y1: Number, x2: Number, y2: Number): Graphics = definedExternally
//    open fun lineTo(x: Number, y: Number): Graphics = definedExternally
//    open fun moveTo(x: Number, y: Number): Graphics = definedExternally
//    open fun lineFxTo(x: Number, y: Number, width: Number, rgb: Number): Graphics = definedExternally
//    open fun moveFxTo(x: Number, y: Number, width: Number, rgb: Number): Graphics = definedExternally
//    open fun strokePoints(points: Array<Any>, autoClose: Boolean? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun strokePoints(points: Array<Phaser.Geom.Point>, autoClose: Boolean? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillPoints(points: Array<Any>, autoClose: Boolean? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillPoints(points: Array<Phaser.Geom.Point>, autoClose: Boolean? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun strokeEllipseShape(ellipse: Phaser.Geom.Ellipse, smoothness: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun strokeEllipse(x: Number, y: Number, width: Number, height: Number, smoothness: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillEllipseShape(ellipse: Phaser.Geom.Ellipse, smoothness: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun fillEllipse(x: Number, y: Number, width: Number, height: Number, smoothness: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun arc(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean): Graphics = definedExternally
//    open fun slice(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean? = definedExternally /* null */): Graphics = definedExternally
//    open fun save(): Graphics = definedExternally
//    open fun restore(): Graphics = definedExternally
//    open fun translate(x: Number, y: Number): Graphics = definedExternally
//    open fun scale(x: Number, y: Number): Graphics = definedExternally
//    open fun rotate(radians: Number): Graphics = definedExternally
//    open fun clear(): Graphics = definedExternally
//    open fun generateTexture(key: String, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Graphics = definedExternally
//    open fun generateTexture(key: HTMLCanvasElement, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Graphics = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    companion object {
//        var TargetCamera: Phaser.Cameras.Scene2D.Camera = definedExternally
//    }
//}
//external open class Group {
//    constructor(scene: Scene, children: Array<GameObject>? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */)
//    constructor(scene: Scene, children: Array<GameObject>? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
//    constructor(scene: Scene, children: GroupConfig? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */)
//    constructor(scene: Scene, children: GroupConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
//    open var scene: Scene = definedExternally
//    open var children: Phaser.Structs.Set<GameObject> = definedExternally
//    open var isParent: Boolean = definedExternally
//    open var classType: Any = definedExternally
//    open var active: Boolean = definedExternally
//    open var maxSize: Number = definedExternally
//    open var defaultKey: String = definedExternally
//    open var defaultFrame: dynamic /* String | Number */ = definedExternally
//    open var runChildUpdate: Boolean = definedExternally
//    open var createCallback: (item: GameObject) -> Unit = definedExternally
//    open var removeCallback: (item: GameObject) -> Unit = definedExternally
//    open var createMultipleCallback: (items: Array<GameObject>) -> Unit = definedExternally
//    open fun create(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, active: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun create(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, active: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun createMultiple(config: GroupCreateConfig): Array<GameObject> = definedExternally
//    open fun createMultiple(config: Array<GroupCreateConfig>): Array<GameObject> = definedExternally
//    open fun createFromConfig(options: GroupCreateConfig): Array<GameObject> = definedExternally
//    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
//    open fun add(child: GameObject, addToScene: Boolean? = definedExternally /* null */): Group = definedExternally
//    open fun addMultiple(children: Array<GameObject>, addToScene: Boolean? = definedExternally /* null */): Group = definedExternally
//    open fun remove(child: GameObject, removeFromScene: Boolean? = definedExternally /* null */, destroyChild: Boolean? = definedExternally /* null */): Group = definedExternally
//    open fun clear(removeFromScene: Boolean? = definedExternally /* null */, destroyChild: Boolean? = definedExternally /* null */): Group = definedExternally
//    open fun contains(child: GameObject): Boolean = definedExternally
//    open fun getChildren(): Array<GameObject> = definedExternally
//    open fun getLength(): Number = definedExternally
//    open fun getFirst(state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getFirst(state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getFirstNth(nth: Number, state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getFirstNth(nth: Number, state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getLast(state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getLast(state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getLastNth(nth: Number, state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getLastNth(nth: Number, state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun get(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun get(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getFirstAlive(createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getFirstAlive(createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getFirstDead(createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun getFirstDead(createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): GameObject = definedExternally
//    open fun playAnimation(key: String, startFrame: String? = definedExternally /* null */): Group = definedExternally
//    open fun isFull(): Boolean = definedExternally
//    open fun countActive(value: Boolean? = definedExternally /* null */): Number = definedExternally
//    open fun getTotalUsed(): Number = definedExternally
//    open fun getTotalFree(): Number = definedExternally
//    open fun setDepth(value: Number, step: Number): Group = definedExternally
//    open fun kill(gameObject: GameObject): Unit = definedExternally
//    open fun killAndHide(gameObject: GameObject): Unit = definedExternally
//    open fun toggleVisible(): Group = definedExternally
//    open fun destroy(destroyChildren: Boolean? = definedExternally /* null */): Unit = definedExternally
//    open fun create(): GameObject = definedExternally
//    open fun getFirst(): GameObject = definedExternally
//    open fun getFirstNth(nth: Number): GameObject = definedExternally
//    open fun getLast(): GameObject = definedExternally
//    open fun getLastNth(nth: Number): GameObject = definedExternally
//    open fun get(): GameObject = definedExternally
//    open fun getFirstAlive(): GameObject = definedExternally
//    open fun getFirstDead(): GameObject = definedExternally
//}
//external open class Image : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): GameObject = definedExternally
//    override fun toggleFlipY(): GameObject = definedExternally
//    override fun setFlipX(value: Boolean): GameObject = definedExternally
//    override fun setFlipY(value: Boolean): GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): GameObject = definedExternally
//    override fun resetFlip(): GameObject = definedExternally
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
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun clearTint(): GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
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
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external open class Light(x: Number, y: Number, radius: Number, r: Number, g: Number, b: Number, intensity: Number) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var radius: Number = definedExternally
//    open var r: Number = definedExternally
//    open var g: Number = definedExternally
//    open var b: Number = definedExternally
//    open var intensity: Number = definedExternally
//    open var scrollFactorX: Number = definedExternally
//    open var scrollFactorY: Number = definedExternally
//    open fun set(x: Number, y: Number, radius: Number, r: Number, g: Number, b: Number, intensity: Number): Light = definedExternally
//    open fun setScrollFactor(x: Number, y: Number): Light = definedExternally
//    open fun setColor(rgb: Number): Light = definedExternally
//    open fun setIntensity(intensity: Number): Light = definedExternally
//    open fun setPosition(x: Number, y: Number): Light = definedExternally
//    open fun setRadius(radius: Number): Light = definedExternally
//}
//external open class LightsManager {
//    open var lightPool: Array<Light> = definedExternally
//    open var lights: Array<Light> = definedExternally
//    open var culledLights: Array<Light> = definedExternally
//    open var ambientColor: Any = definedExternally
//    open var active: Boolean = definedExternally
//    open fun enable(): LightsManager = definedExternally
//    open fun disable(): LightsManager = definedExternally
//    open fun cull(camera: Phaser.Cameras.Scene2D.Camera): Array<Light> = definedExternally
//    open fun forEachLight(callback: (light: Light) -> Unit): LightsManager = definedExternally
//    open fun setAmbientColor(rgb: Number): LightsManager = definedExternally
//    open fun getMaxVisibleLights(): Number = definedExternally
//    open fun getLightCount(): Number = definedExternally
//    open fun addLight(x: Number, y: Number, radius: Number, rgb: Number, intensity: Number): Light = definedExternally
//    open fun removeLight(light: Light): LightsManager = definedExternally
//    open fun shutdown(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class LightsPlugin(scene: Scene) : LightsManager {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open fun boot(): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//}
//external open class Mesh : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible, Phaser.GameObjects.Components.ScrollFactor {
//    constructor(scene: Scene, x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: Number? = definedExternally /* null */)
//    open var vertices: Float32Array = definedExternally
//    open var uv: Float32Array = definedExternally
//    open var colors: Uint32Array = definedExternally
//    open var alphas: Float32Array = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): GameObject = definedExternally
//    override fun toggleFlipY(): GameObject = definedExternally
//    override fun setFlipX(value: Boolean): GameObject = definedExternally
//    override fun setFlipY(value: Boolean): GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): GameObject = definedExternally
//    override fun resetFlip(): GameObject = definedExternally
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
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external open class PathFollower : Sprite {
//    constructor(scene: Scene, path: Phaser.Curves.Path, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, path: Phaser.Curves.Path, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)
//    open var path: Phaser.Curves.Path = definedExternally
//    open var rotateToPath: Boolean = definedExternally
//    open var pathRotationVerticalAdjust: Boolean = definedExternally
//    open var pathRotationOffset: Number = definedExternally
//    open var pathOffset: Phaser.Math.Vector2 = definedExternally
//    open var pathVector: Phaser.Math.Vector2 = definedExternally
//    open var pathTween: Phaser.Tweens.Tween = definedExternally
//    open var pathConfig: PathConfig = definedExternally
//    open fun setPath(path: Phaser.Curves.Path, config: PathConfig? = definedExternally /* null */): PathFollower = definedExternally
//    open fun setRotateToPath(value: Number, offset: Number? = definedExternally /* null */, verticalAdjust: Boolean? = definedExternally /* null */): PathFollower = definedExternally
//    open fun isFollowing(): Boolean = definedExternally
//    open fun startFollow(config: Number? = definedExternally /* null */, startAt: Number? = definedExternally /* null */): PathFollower = definedExternally
//    open fun startFollow(config: PathConfig? = definedExternally /* null */, startAt: Number? = definedExternally /* null */): PathFollower = definedExternally
//    open fun pauseFollow(): PathFollower = definedExternally
//    open fun resumeFollow(): PathFollower = definedExternally
//    open fun stopFollow(): PathFollower = definedExternally
//    override fun preUpdate(time: Number, delta: Number): Unit = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): GameObject = definedExternally
//    override fun toggleFlipY(): GameObject = definedExternally
//    override fun setFlipX(value: Boolean): GameObject = definedExternally
//    override fun setFlipY(value: Boolean): GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): GameObject = definedExternally
//    override fun resetFlip(): GameObject = definedExternally
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
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun clearTint(): GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
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
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    open fun startFollow(): PathFollower = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external open class Quad : Mesh {
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)
//    open var topLeftX: Number = definedExternally
//    open var topLeftY: Number = definedExternally
//    open var topRightX: Number = definedExternally
//    open var topRightY: Number = definedExternally
//    open var bottomLeftX: Number = definedExternally
//    open var bottomLeftY: Number = definedExternally
//    open var bottomRightX: Number = definedExternally
//    open var bottomRightY: Number = definedExternally
//    open var topLeftAlpha: Number = definedExternally
//    open var topRightAlpha: Number = definedExternally
//    open var bottomLeftAlpha: Number = definedExternally
//    open var bottomRightAlpha: Number = definedExternally
//    open var topLeftColor: Number = definedExternally
//    open var topRightColor: Number = definedExternally
//    open var bottomLeftColor: Number = definedExternally
//    open var bottomRightColor: Number = definedExternally
//    open fun setTopLeft(x: Number, y: Number): Quad = definedExternally
//    open fun setTopRight(x: Number, y: Number): Quad = definedExternally
//    open fun setBottomLeft(x: Number, y: Number): Quad = definedExternally
//    open fun setBottomRight(x: Number, y: Number): Quad = definedExternally
//    open fun resetPosition(): Quad = definedExternally
//    open fun resetAlpha(): Quad = definedExternally
//    open fun resetColors(): Quad = definedExternally
//    open fun reset(): Quad = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): GameObject = definedExternally
//    override fun toggleFlipY(): GameObject = definedExternally
//    override fun setFlipX(value: Boolean): GameObject = definedExternally
//    override fun setFlipY(value: Boolean): GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): GameObject = definedExternally
//    override fun resetFlip(): GameObject = definedExternally
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
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external open class RenderTexture(scene: Scene, x: Number, y: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */) : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.MatrixStack, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */ = definedExternally
//    open var globalTint: Number = definedExternally
//    open var globalAlpha: Number = definedExternally
//    override fun destroy(): Unit = definedExternally
//    open fun setGlobalTint(tint: Number): RenderTexture = definedExternally
//    open fun setGlobalAlpha(alpha: Number): RenderTexture = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): GameObject = definedExternally
//    override fun toggleFlipY(): GameObject = definedExternally
//    override fun setFlipX(value: Boolean): GameObject = definedExternally
//    override fun setFlipY(value: Boolean): GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): GameObject = definedExternally
//    override fun resetFlip(): GameObject = definedExternally
//    open fun <O : Phaser.Math.Vector2> getCenter(output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTopRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBottomRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBounds(output: O? = definedExternally /* null */): O = definedExternally
//    override fun initMatrixStack(): GameObject = definedExternally
//    override fun save(): GameObject = definedExternally
//    override fun restore(): GameObject = definedExternally
//    override fun loadIdentity(): GameObject = definedExternally
//    override fun transform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): GameObject = definedExternally
//    override fun setTransform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): GameObject = definedExternally
//    override fun translate(x: Number, y: Number): GameObject = definedExternally
//    override fun scale(x: Number, y: Number): GameObject = definedExternally
//    override fun rotate(t: Number): GameObject = definedExternally
//    override var originX: Number = definedExternally
//    override var originY: Number = definedExternally
//    override var displayOriginX: Number = definedExternally
//    override var displayOriginY: Number = definedExternally
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override fun clearTint(): GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
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
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//}
//external open class Sprite : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)
//    open var anims: Phaser.GameObjects.Components.Animation = definedExternally
//    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
//    open fun play(key: String, ignoreIfPlaying: Boolean? = definedExternally /* null */, startFrame: Number? = definedExternally /* null */): Sprite = definedExternally
//    override fun toJSON(): JSONGameObject = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): GameObject = definedExternally
//    override fun toggleFlipY(): GameObject = definedExternally
//    override fun setFlipX(value: Boolean): GameObject = definedExternally
//    override fun setFlipY(value: Boolean): GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): GameObject = definedExternally
//    override fun resetFlip(): GameObject = definedExternally
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
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun clearTint(): GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
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
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external open class Sprite3D : GameObject {
//    constructor(scene: Scene, x: Number, y: Number, z: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, z: Number, texture: String, frame: Number? = definedExternally /* null */)
//    open var gameObject: GameObject = definedExternally
//    open var position: Phaser.Math.Vector4 = definedExternally
//    open var size: Phaser.Math.Vector2 = definedExternally
//    open var scale: Phaser.Math.Vector2 = definedExternally
//    open var adjustScaleX: Boolean = definedExternally
//    open var adjustScaleY: Boolean = definedExternally
//    open fun project(camera: Phaser.Cameras.Sprite3D.Camera): Unit = definedExternally
//    open fun setVisible(value: Boolean): Sprite3D = definedExternally
//    open var visible: Boolean = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var z: Number = definedExternally
//}
//external open class Text : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number, y: Number, text: String, style: Any)
//    constructor(scene: Scene, x: Number, y: Number, text: Array<String>, style: Any)
//    open var canvas: HTMLCanvasElement = definedExternally
//    open var context: CanvasRenderingContext2D = definedExternally
//    open var style: Phaser.GameObjects.Text.TextStyle = definedExternally
//    open var autoRound: Boolean = definedExternally
//    open var splitRegExp: Any = definedExternally
//    open var text: String = definedExternally
//    open var resolution: Number = definedExternally
//    open var padding: Any = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    open var canvasTexture: HTMLCanvasElement = definedExternally
//    open var dirty: Boolean = definedExternally
//    open fun initRTL(): Unit = definedExternally
//    open fun runWordWrap(text: String): String = definedExternally
//    open fun advancedWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Number): String = definedExternally
//    open fun basicWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Number): String = definedExternally
//    open fun getWrappedText(text: String): Array<String> = definedExternally
//    open fun setText(value: String): Text = definedExternally
//    open fun setText(value: Array<String>): Text = definedExternally
//    open fun setStyle(style: Any): Text = definedExternally
//    open fun setFont(font: String): Text = definedExternally
//    open fun setFontFamily(family: String): Text = definedExternally
//    open fun setFontSize(size: Number): Text = definedExternally
//    open fun setFontStyle(style: String): Text = definedExternally
//    open fun setFixedSize(width: Number, height: Number): Text = definedExternally
//    open fun setBackgroundColor(color: String): Text = definedExternally
//    open fun setFill(color: String): Text = definedExternally
//    open fun setColor(color: String): Text = definedExternally
//    open fun setStroke(color: String, thickness: Number): Text = definedExternally
//    open fun setShadow(x: Number, y: Number, color: String, blur: Number, shadowStroke: Boolean, shadowFill: Boolean): Text = definedExternally
//    open fun setShadowOffset(x: Number, y: Number): Text = definedExternally
//    open fun setShadowColor(color: String): Text = definedExternally
//    open fun setShadowBlur(blur: Number): Text = definedExternally
//    open fun setShadowStroke(enabled: Boolean): Text = definedExternally
//    open fun setShadowFill(enabled: Boolean): Text = definedExternally
//    open fun setWordWrapWidth(width: Number, useAdvancedWrap: Boolean? = definedExternally /* null */): Text = definedExternally
//    open fun setWordWrapCallback(callback: (text: String, textObject: Text) -> Unit, scope: Any? = definedExternally /* null */): Text = definedExternally
//    open fun setAlign(align: String): Text = definedExternally
//    open fun setPadding(left: Number, top: Number, right: Number, bottom: Number): Text = definedExternally
//    open fun setPadding(left: Any?, top: Number, right: Number, bottom: Number): Text = definedExternally
//    open fun setMaxLines(max: Number? = definedExternally /* null */): Text = definedExternally
//    open fun updateText(): Text = definedExternally
//    open fun getTextMetrics(): Any = definedExternally
//    override fun toJSON(): JSONGameObject = definedExternally
//    open fun preDestroy(): Unit = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): GameObject = definedExternally
//    override fun toggleFlipY(): GameObject = definedExternally
//    override fun setFlipX(value: Boolean): GameObject = definedExternally
//    override fun setFlipY(value: Boolean): GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): GameObject = definedExternally
//    override fun resetFlip(): GameObject = definedExternally
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
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override fun clearTint(): GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
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
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    companion object {
//        fun GetTextSize(text: Text, size: Number, lines: Array<Any>): Any = definedExternally
//        fun MeasureText(textStyle: Phaser.GameObjects.Text.TextStyle): Any = definedExternally
//    }
//    open class TextStyle(text: Phaser.GameObjects.Text, style: Any) {
//        open var parent: Phaser.GameObjects.Text = definedExternally
//        open var fontFamily: String = definedExternally
//        open var fontSize: String = definedExternally
//        open var fontStyle: String = definedExternally
//        open var backgroundColor: String = definedExternally
//        open var color: String = definedExternally
//        open var stroke: String = definedExternally
//        open var strokeThickness: Number = definedExternally
//        open var shadowOffsetX: Number = definedExternally
//        open var shadowOffsetY: Number = definedExternally
//        open var shadowColor: String = definedExternally
//        open var shadowBlur: Number = definedExternally
//        open var shadowStroke: Boolean = definedExternally
//        open var shadowFill: Boolean = definedExternally
//        open var align: String = definedExternally
//        open var maxLines: Number = definedExternally
//        open var fixedWidth: Number = definedExternally
//        open var fixedHeight: Number = definedExternally
//        open var rtl: Boolean = definedExternally
//        open var testString: String = definedExternally
//        open var baselineX: Number = definedExternally
//        open var baselineY: Number = definedExternally
//        open fun setStyle(style: CSSStyleRule, updateText: Boolean? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
//        open fun syncFont(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): Unit = definedExternally
//        open fun syncStyle(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): Unit = definedExternally
//        open fun syncShadow(context: CanvasRenderingContext2D, enabled: Boolean): Unit = definedExternally
//        open fun update(recalculateMetrics: Boolean): Phaser.GameObjects.Text = definedExternally
//        open fun setFont(font: String): Phaser.GameObjects.Text = definedExternally
//        open fun setFont(font: Any?): Phaser.GameObjects.Text = definedExternally
//        open fun setFontFamily(family: String): Phaser.GameObjects.Text = definedExternally
//        open fun setFontStyle(style: String): Phaser.GameObjects.Text = definedExternally
//        open fun setFontSize(size: String): Phaser.GameObjects.Text = definedExternally
//        open fun setFontSize(size: Number): Phaser.GameObjects.Text = definedExternally
//        open fun setTestString(string: String): Phaser.GameObjects.Text = definedExternally
//        open fun setFixedSize(width: Number, height: Number): Phaser.GameObjects.Text = definedExternally
//        open fun setBackgroundColor(color: String): Phaser.GameObjects.Text = definedExternally
//        open fun setFill(color: String): Phaser.GameObjects.Text = definedExternally
//        open fun setColor(color: String): Phaser.GameObjects.Text = definedExternally
//        open fun setStroke(color: String, thickness: Number): Phaser.GameObjects.Text = definedExternally
//        open fun setShadow(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, color: String? = definedExternally /* null */, blur: Number? = definedExternally /* null */, shadowStroke: Boolean? = definedExternally /* null */, shadowFill: Boolean? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
//        open fun setShadowOffset(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
//        open fun setShadowColor(color: String? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
//        open fun setShadowBlur(blur: Number? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
//        open fun setShadowStroke(enabled: Boolean): Phaser.GameObjects.Text = definedExternally
//        open fun setShadowFill(enabled: Boolean): Phaser.GameObjects.Text = definedExternally
//        open fun setWordWrapWidth(width: Number, useAdvancedWrap: Boolean? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
//        open fun setWordWrapCallback(callback: (text: String, textObject: Phaser.GameObjects.Text) -> Unit, scope: Any? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
//        open fun setAlign(align: String): Phaser.GameObjects.Text = definedExternally
//        open fun setMaxLines(max: Number? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
//        open fun getTextMetrics(): Any = definedExternally
//        open fun toJSON(): Any = definedExternally
//        open fun destroy(): Unit = definedExternally
//    }
//}
//external open class TileSprite : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
//    constructor(scene: Scene, x: Number, y: Number, width: Number, height: Number, texture: String, frame: String? = definedExternally /* null */)
//    constructor(scene: Scene, x: Number, y: Number, width: Number, height: Number, texture: String, frame: Number? = definedExternally /* null */)
//    open var tilePositionX: Number = definedExternally
//    open var tilePositionY: Number = definedExternally
//    open var dirty: Boolean = definedExternally
//    open var tileTexture: WebGLTexture = definedExternally
//    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */ = definedExternally
//    open var potWidth: Number = definedExternally
//    open var potHeight: Number = definedExternally
//    open var canvasPattern: CanvasPattern = definedExternally
//    open var canvasBuffer: HTMLCanvasElement = definedExternally
//    open var canvasBufferCtx: CanvasRenderingContext2D = definedExternally
//    open fun setTilePosition(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): TileSprite = definedExternally
//    open fun updateTileTexture(): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//    override fun clearAlpha(): GameObject = definedExternally
//    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
//    override var alpha: Number = definedExternally
//    override var alphaTopLeft: Number = definedExternally
//    override var alphaTopRight: Number = definedExternally
//    override var alphaBottomLeft: Number = definedExternally
//    override var alphaBottomRight: Number = definedExternally
//    override var blendMode: dynamic /* String | alloy.khaser.externs.BlendModes */ = definedExternally
//    override fun setBlendMode(value: String): GameObject = definedExternally
//    override fun setBlendMode(value: BlendModes): GameObject = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
//    override var flipX: Boolean = definedExternally
//    override var flipY: Boolean = definedExternally
//    override fun toggleFlipX(): GameObject = definedExternally
//    override fun toggleFlipY(): GameObject = definedExternally
//    override fun setFlipX(value: Boolean): GameObject = definedExternally
//    override fun setFlipY(value: Boolean): GameObject = definedExternally
//    override fun setFlip(x: Boolean, y: Boolean): GameObject = definedExternally
//    override fun resetFlip(): GameObject = definedExternally
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
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
//    override fun initPipeline(pipelineName: String): Boolean = definedExternally
//    override fun setPipeline(pipelineName: String): Boolean = definedExternally
//    override fun resetPipeline(): Boolean = definedExternally
//    override fun getPipelineName(): String = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var width: Number = definedExternally
//    override var height: Number = definedExternally
//    override var displayWidth: Number = definedExternally
//    override var displayHeight: Number = definedExternally
//    override fun setSizeToFrame(frame: Phaser.Textures.Frame): GameObject = definedExternally
//    override fun setSize(width: Number, height: Number): GameObject = definedExternally
//    override fun setDisplaySize(width: Number, height: Number): GameObject = definedExternally
//    override var texture: Phaser.Textures.Texture = definedExternally
//    override var frame: Phaser.Textures.Frame = definedExternally
//    override fun setTexture(key: String, frame: String?): GameObject = definedExternally
//    override fun setTexture(key: String, frame: Number?): GameObject = definedExternally
//    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): GameObject = definedExternally
//    override fun clearTint(): GameObject = definedExternally
//    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): GameObject = definedExternally
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
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//    override fun setTexture(key: String): GameObject = definedExternally
//}
//external open class UpdateList(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open fun add(child: GameObject): GameObject = definedExternally
//    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
//    open fun update(time: Number, delta: Number): Unit = definedExternally
//    open fun remove(child: GameObject): GameObject = definedExternally
//    open fun removeAll(): UpdateList = definedExternally
//    open fun shutdown(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class Zone(scene: Scene, x: Number, y: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */) : GameObject, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Visible {
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var blendMode: Number = definedExternally
//    open var displayWidth: Number = definedExternally
//    open var displayHeight: Number = definedExternally
//    open fun setSize(width: Number, height: Number, resizeInput: Boolean? = definedExternally /* null */): Zone = definedExternally
//    open fun setDisplaySize(width: Number, height: Number): Zone = definedExternally
//    open fun setCircleDropZone(radius: Number): Zone = definedExternally
//    open fun setRectangleDropZone(width: Number, height: Number): Zone = definedExternally
//    open fun setDropZone(shape: Any, callback: (hitArea: Any, x: Number, y: Number, gameObject: GameObject) -> Unit): Zone = definedExternally
//    override var depth: Number = definedExternally
//    override fun setDepth(value: Number): GameObject = definedExternally
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
//    override fun setOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun setOriginFromFrame(): GameObject = definedExternally
//    override fun setDisplayOrigin(x: Number?, y: Number?): GameObject = definedExternally
//    override fun updateDisplayOrigin(): GameObject = definedExternally
//    override var scaleMode: ScaleModes = definedExternally
//    override fun setScaleMode(value: ScaleModes): GameObject = definedExternally
//    override var x: Number = definedExternally
//    override var y: Number = definedExternally
//    override var z: Number = definedExternally
//    override var w: Number = definedExternally
//    override var scaleX: Number = definedExternally
//    override var scaleY: Number = definedExternally
//    override var angle: Number = definedExternally
//    override var rotation: Number = definedExternally
//    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): GameObject = definedExternally
//    override fun setRotation(radians: Number?): GameObject = definedExternally
//    override fun setAngle(degrees: Number?): GameObject = definedExternally
//    override fun setScale(x: Number, y: Number?): GameObject = definedExternally
//    override fun setX(value: Number?): GameObject = definedExternally
//    override fun setY(value: Number?): GameObject = definedExternally
//    override fun setZ(value: Number?): GameObject = definedExternally
//    override fun setW(value: Number?): GameObject = definedExternally
//    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
//    override var scrollFactorX: Number = definedExternally
//    override var scrollFactorY: Number = definedExternally
//    override fun setScrollFactor(x: Number, y: Number?): GameObject = definedExternally
//    override var visible: Boolean = definedExternally
//    override fun setVisible(value: Boolean): GameObject = definedExternally
//}
