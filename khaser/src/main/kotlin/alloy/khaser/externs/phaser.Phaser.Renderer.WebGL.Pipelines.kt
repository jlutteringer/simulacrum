//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Renderer.WebGL.Pipelines")]
//package Phaser.Renderer.WebGL.Pipelines
//
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//import org.khronos.webgl.*
//
//external open class BitmapMaskPipeline(config: Any) : Phaser.Renderer.WebGL.WebGLPipeline {
//    open var vertexViewF32: Float32Array = definedExternally
//    open var maxQuads: Number = definedExternally
//    open var resolutionDirty: Boolean = definedExternally
//    override fun onBind(): BitmapMaskPipeline = definedExternally
//    override fun resize(width: Number, height: Number, resolution: Number): BitmapMaskPipeline = definedExternally
//    open fun beginMask(mask: Phaser.GameObjects.GameObject, maskedObject: Phaser.GameObjects.GameObject, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun endMask(mask: Phaser.GameObjects.GameObject): Unit = definedExternally
//}
//external open class FlatTintPipeline(config: Any) : Phaser.Renderer.WebGL.WebGLPipeline {
//    open var vertexViewF32: Float32Array = definedExternally
//    open var vertexViewU32: Uint32Array = definedExternally
//    open var tempTriangle: Array<Any> = definedExternally
//    open var polygonCache: Array<Any> = definedExternally
//    override fun onBind(): FlatTintPipeline = definedExternally
//    override fun resize(width: Number, height: Number, resolution: Number): FlatTintPipeline = definedExternally
//    open fun batchFillRect(srcX: Number, srcY: Number, srcScaleX: Number, srcScaleY: Number, srcRotation: Number, x: Number, y: Number, width: Number, height: Number, fillColor: Number, fillAlpha: Number, a1: Number, b1: Number, c1: Number, d1: Number, e1: Number, f1: Number, currentMatrix: Float32Array): Unit = definedExternally
//    open fun batchFillTriangle(srcX: Number, srcY: Number, srcScaleX: Number, srcScaleY: Number, srcRotation: Number, x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, fillColor: Number, fillAlpha: Number, a1: Number, b1: Number, c1: Number, d1: Number, e1: Number, f1: Number, currentMatrix: Float32Array): Unit = definedExternally
//    open fun batchStrokeTriangle(srcX: Number, srcY: Number, srcScaleX: Number, srcScaleY: Number, srcRotation: Number, x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, lineWidth: Number, lineColor: Number, lineAlpha: Number, a: Number, b: Number, c: Number, d: Number, e: Number, f: Number, currentMatrix: Float32Array): Unit = definedExternally
//    open fun batchFillPath(srcX: Number, srcY: Number, srcScaleX: Number, srcScaleY: Number, srcRotation: Number, path: Number, fillColor: Number, fillAlpha: Number, a1: Number, b1: Number, c1: Number, d1: Number, e1: Number, f1: Number, currentMatrix: Float32Array): Unit = definedExternally
//    open fun batchStrokePath(srcX: Number, srcY: Number, srcScaleX: Number, srcScaleY: Number, srcRotation: Number, path: Array<Any>, lineWidth: Number, lineColor: Number, lineAlpha: Number, a: Number, b: Number, c: Number, d: Number, e: Number, f: Number, isLastPath: Boolean, currentMatrix: Float32Array): Unit = definedExternally
//    open fun batchLine(srcX: Number, srcY: Number, srcScaleX: Number, srcScaleY: Number, srcRotation: Number, ax: Number, ay: Number, bx: Number, by: Number, aLineWidth: Number, bLineWidth: Number, aLineColor: Number, bLineColor: Number, lineAlpha: Number, a1: Number, b1: Number, c1: Number, d1: Number, e1: Number, f1: Number, currentMatrix: Float32Array): Unit = definedExternally
//    open fun batchGraphics(graphics: Phaser.GameObjects.Graphics, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun drawStaticTilemapLayer(tilemap: Phaser.Tilemaps.StaticTilemapLayer, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun drawEmitterManager(emitterManager: Phaser.GameObjects.Particles.ParticleEmitterManager, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun drawBlitter(blitter: Phaser.GameObjects.Blitter, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun batchSprite(sprite: Phaser.GameObjects.Sprite, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun batchMesh(mesh: Phaser.GameObjects.Mesh, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun batchBitmapText(bitmapText: Phaser.GameObjects.BitmapText, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun batchDynamicBitmapText(bitmapText: Phaser.GameObjects.DynamicBitmapText, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun batchText(text: Phaser.GameObjects.Text, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun batchDynamicTilemapLayer(tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun batchTileSprite(tileSprite: Phaser.GameObjects.TileSprite, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//}
//external open class ForwardDiffuseLightPipeline(config: Any) : TextureTintPipeline {
//    override fun onRender(scene: Scene, camera: Phaser.Cameras.Scene2D.Camera): ForwardDiffuseLightPipeline = definedExternally
//    override fun drawEmitterManager(emitterManager: Phaser.GameObjects.Particles.ParticleEmitterManager, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    override fun drawBlitter(blitter: Phaser.GameObjects.Blitter, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    override fun batchSprite(sprite: Phaser.GameObjects.Sprite, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    override fun batchMesh(mesh: Phaser.GameObjects.Mesh, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    override fun batchBitmapText(bitmapText: Phaser.GameObjects.BitmapText, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    override fun batchDynamicBitmapText(bitmapText: Phaser.GameObjects.DynamicBitmapText, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    override fun batchText(text: Phaser.GameObjects.Text, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    override fun batchDynamicTilemapLayer(tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    override fun batchTileSprite(tileSprite: Phaser.GameObjects.TileSprite, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//}
//external open class TextureTintPipeline(config: Any) : Phaser.Renderer.WebGL.WebGLPipeline {
//    open var vertexViewF32: Float32Array = definedExternally
//    open var vertexViewU32: Uint32Array = definedExternally
//    open var maxQuads: Number = definedExternally
//    open var batches: Array<Any> = definedExternally
//    open fun setTexture2D(texture: WebGLTexture, textureUnit: Number): TextureTintPipeline = definedExternally
//    open fun pushBatch(): Unit = definedExternally
//    override fun flush(): TextureTintPipeline = definedExternally
//    override fun onBind(): TextureTintPipeline = definedExternally
//    override fun resize(width: Number, height: Number, resolution: Number): TextureTintPipeline = definedExternally
//    open fun drawStaticTilemapLayer(tilemap: Phaser.Tilemaps.StaticTilemapLayer, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun drawEmitterManager(emitterManager: Phaser.GameObjects.Particles.ParticleEmitterManager, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun drawBlitter(blitter: Phaser.GameObjects.Blitter, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun batchSprite(sprite: Phaser.GameObjects.Sprite, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun batchMesh(mesh: Phaser.GameObjects.Mesh, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun batchBitmapText(bitmapText: Phaser.GameObjects.BitmapText, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun batchDynamicBitmapText(bitmapText: Phaser.GameObjects.DynamicBitmapText, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun batchText(text: Phaser.GameObjects.Text, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun batchDynamicTilemapLayer(tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun batchTileSprite(tileSprite: Phaser.GameObjects.TileSprite, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun batchTexture(gameObject: Phaser.GameObjects.GameObject, texture: WebGLTexture, textureWidth: Number, textureHeight: Number, srcX: Number, srcY: Number, srcWidth: Number, srcHeight: Number, scaleX: Number, scaleY: Number, rotation: Number, flipX: Boolean, flipY: Boolean, scrollFactorX: Number, scrollFactorY: Number, displayOriginX: Number, displayOriginY: Number, frameX: Number, frameY: Number, frameWidth: Number, frameHeight: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, uOffset: Number, vOffset: Number, camera: Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
//    open fun drawTexture(texture: WebGLTexture, srcX: Number, srcY: Number, tint: Number, alpha: Number, frameX: Number, frameY: Number, frameWidth: Number, frameHeight: Number, transformMatrix: Phaser.GameObjects.Components.TransformMatrix, parentTransformMatrix: Phaser.GameObjects.Components.TransformMatrix): TextureTintPipeline = definedExternally
//    open fun batchGraphics(graphics: Phaser.GameObjects.Graphics, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//}
