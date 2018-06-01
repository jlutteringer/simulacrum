//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Renderer.WebGL")]
//package Phaser.Renderer.WebGL
//
//import alloy.khaser.externs.Game
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//import org.khronos.webgl.*
//import org.w3c.dom.*
//
//external open class WebGLPipeline(config: Any) {
//    open var name: String = definedExternally
//    open var game: Game = definedExternally
//    open var view: HTMLCanvasElement = definedExternally
//    open var resolution: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var gl: WebGLRenderingContext = definedExternally
//    open var vertexCount: Number = definedExternally
//    open var vertexCapacity: Number = definedExternally
//    open var renderer: WebGLRenderer = definedExternally
//    open var vertexData: ArrayBuffer = definedExternally
//    open var vertexBuffer: WebGLBuffer = definedExternally
//    open var program: WebGLProgram = definedExternally
//    open var attributes: Any = definedExternally
//    open var vertexSize: Number = definedExternally
//    open var topology: Number = definedExternally
//    open var bytes: Uint8Array = definedExternally
//    open var vertexComponentCount: Number = definedExternally
//    open var flushLocked: Boolean = definedExternally
//    open fun addAttribute(name: String, size: Number, type: Number, normalized: Boolean, offset: Number): WebGLPipeline = definedExternally
//    open fun shouldFlush(): Boolean = definedExternally
//    open fun resize(width: Number, height: Number, resolution: Number): WebGLPipeline = definedExternally
//    open fun bind(): WebGLPipeline = definedExternally
//    open fun onBind(): WebGLPipeline = definedExternally
//    open fun onPreRender(): WebGLPipeline = definedExternally
//    open fun onRender(scene: Scene, camera: Phaser.Cameras.Scene2D.Camera): WebGLPipeline = definedExternally
//    open fun onPostRender(): WebGLPipeline = definedExternally
//    open fun flush(): WebGLPipeline = definedExternally
//    open fun destroy(): WebGLPipeline = definedExternally
//    open fun setFloat1(name: String, x: Number): WebGLPipeline = definedExternally
//    open fun setFloat2(name: String, x: Number, y: Number): WebGLPipeline = definedExternally
//    open fun setFloat3(name: String, x: Number, y: Number, z: Number): WebGLPipeline = definedExternally
//    open fun setFloat4(name: String, x: Number, y: Number, z: Number, w: Number): WebGLPipeline = definedExternally
//    open fun setInt1(name: String, x: Number): WebGLPipeline = definedExternally
//    open fun setInt2(name: String, x: Number, y: Number): WebGLPipeline = definedExternally
//    open fun setInt3(name: String, x: Number, y: Number, z: Number): WebGLPipeline = definedExternally
//    open fun setInt4(name: String, x: Number, y: Number, z: Number, w: Number): WebGLPipeline = definedExternally
//    open fun setMatrix2(name: String, transpose: Boolean, matrix: Float32Array): WebGLPipeline = definedExternally
//    open fun setMatrix3(name: String, transpose: Boolean, matrix: Float32Array): WebGLPipeline = definedExternally
//    open fun setMatrix4(name: String, transpose: Boolean, matrix: Float32Array): WebGLPipeline = definedExternally
//}
//external open class WebGLRenderer(game: Game) {
//    open var config: RendererConfig = definedExternally
//    open var game: Game = definedExternally
//    open var type: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open var canvas: HTMLCanvasElement = definedExternally
//    open var lostContextCallbacks: Array<(renderer: WebGLRenderer) -> Unit> = definedExternally
//    open var restoredContextCallbacks: Array<(renderer: WebGLRenderer) -> Unit> = definedExternally
//    open var blendModes: Array<Any> = definedExternally
//    open var nativeTextures: Array<Any> = definedExternally
//    open var contextLost: Boolean = definedExternally
//    open var pipelines: Any = definedExternally
//    open var snapshotState: SnapshotState = definedExternally
//    open var currentActiveTextureUnit: Number = definedExternally
//    open var currentTextures: Array<Any> = definedExternally
//    open var currentFramebuffer: WebGLFramebuffer = definedExternally
//    open var currentPipeline: WebGLPipeline = definedExternally
//    open var currentProgram: WebGLProgram = definedExternally
//    open var currentVertexBuffer: WebGLBuffer = definedExternally
//    open var currentIndexBuffer: WebGLBuffer = definedExternally
//    open var currentBlendMode: Number = definedExternally
//    open var currentScissorEnabled: Boolean = definedExternally
//    open var currentScissor: Uint32Array = definedExternally
//    open var currentScissorIdx: Number = definedExternally
//    open var scissorStack: Uint32Array = definedExternally
//    open var gl: WebGLRenderingContext = definedExternally
//    open var supportedExtensions: Any = definedExternally
//    open var extensions: Any = definedExternally
//    open var glFormats: Array<Any> = definedExternally
//    open fun init(config: Any): WebGLRenderer = definedExternally
//    open fun resize(width: Number, height: Number): WebGLRenderer = definedExternally
//    open fun onContextRestored(callback: (renderer: WebGLRenderer) -> Unit, target: Any): WebGLRenderer = definedExternally
//    open fun onContextLost(callback: (renderer: WebGLRenderer) -> Unit, target: Any): WebGLRenderer = definedExternally
//    open fun hasExtension(extensionName: String): Boolean = definedExternally
//    open fun getExtension(extensionName: String): Any = definedExternally
//    open fun flush(): Unit = definedExternally
//    open fun hasPipeline(pipelineName: String): Boolean = definedExternally
//    open fun getPipeline(pipelineName: String): WebGLPipeline = definedExternally
//    open fun removePipeline(pipelineName: String): WebGLRenderer = definedExternally
//    open fun addPipeline(pipelineName: String, pipelineInstance: WebGLPipeline): WebGLPipeline = definedExternally
//    open fun setScissor(x: Number, y: Number, w: Number, h: Number): WebGLRenderer = definedExternally
//    open fun pushScissor(x: Number, y: Number, w: Number, h: Number): WebGLRenderer = definedExternally
//    open fun popScissor(): WebGLRenderer = definedExternally
//    open fun setPipeline(pipelineInstance: WebGLPipeline): WebGLPipeline = definedExternally
//    open fun setBlendMode(blendModeId: Number): WebGLRenderer = definedExternally
//    open fun addBlendMode(func: Function<*>, equation: Function<*>): Number = definedExternally
//    open fun updateBlendMode(index: Number, func: Function<*>, equation: Function<*>): WebGLRenderer = definedExternally
//    open fun removeBlendMode(index: Number): WebGLRenderer = definedExternally
//    open fun setTexture2D(texture: WebGLTexture, textureUnit: Number): WebGLRenderer = definedExternally
//    open fun setFramebuffer(framebuffer: WebGLFramebuffer): WebGLRenderer = definedExternally
//    open fun setProgram(program: WebGLProgram): WebGLRenderer = definedExternally
//    open fun setVertexBuffer(vertexBuffer: WebGLBuffer): WebGLRenderer = definedExternally
//    open fun setIndexBuffer(indexBuffer: WebGLBuffer): WebGLRenderer = definedExternally
//    open fun createTextureFromSource(source: Any, width: Number, height: Number, scaleMode: Number): WebGLTexture = definedExternally
//    open fun createTexture2D(mipLevel: Number, minFilter: Number, magFilter: Number, wrapT: Number, wrapS: Number, format: Number, pixels: Any, width: Number, height: Number, pma: Boolean): WebGLTexture = definedExternally
//    open fun createFramebuffer(width: Number, height: Number, renderTexture: WebGLFramebuffer, addDepthStencilBuffer: Boolean): WebGLFramebuffer = definedExternally
//    open fun createProgram(vertexShader: String, fragmentShader: String): WebGLProgram = definedExternally
//    open fun createVertexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: Number): WebGLBuffer = definedExternally
//    open fun createIndexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: Number): WebGLBuffer = definedExternally
//    open fun deleteTexture(texture: WebGLTexture): WebGLRenderer = definedExternally
//    open fun deleteFramebuffer(framebuffer: WebGLFramebuffer): WebGLRenderer = definedExternally
//    open fun deleteProgram(program: WebGLProgram): WebGLRenderer = definedExternally
//    open fun deleteBuffer(vertexBuffer: WebGLBuffer): WebGLRenderer = definedExternally
//    open fun preRenderCamera(camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun postRenderCamera(camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun preRender(): Unit = definedExternally
//    open fun render(scene: Scene, children: Phaser.GameObjects.GameObject, interpolationPercentage: Number, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
//    open fun postRender(): Unit = definedExternally
//    open fun snapshot(callback: (snapshot: HTMLImageElement) -> Unit, type: String, encoderOptions: Number): WebGLRenderer = definedExternally
//    open fun canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, shouldReallocate: Boolean, scaleMode: Number): WebGLTexture = definedExternally
//    open fun setTextureFilter(texture: Number, filter: Number): WebGLRenderer = definedExternally
//    open fun setFloat1(program: WebGLProgram, name: String, x: Number): WebGLRenderer = definedExternally
//    open fun setFloat2(program: WebGLProgram, name: String, x: Number, y: Number): WebGLRenderer = definedExternally
//    open fun setFloat3(program: WebGLProgram, name: String, x: Number, y: Number, z: Number): WebGLRenderer = definedExternally
//    open fun setFloat4(program: WebGLProgram, name: String, x: Number, y: Number, z: Number, w: Number): WebGLRenderer = definedExternally
//    open fun setInt1(program: WebGLProgram, name: String, x: Number): WebGLRenderer = definedExternally
//    open fun setInt2(program: WebGLProgram, name: String, x: Number, y: Number): WebGLRenderer = definedExternally
//    open fun setInt3(program: WebGLProgram, name: String, x: Number, y: Number, z: Number): WebGLRenderer = definedExternally
//    open fun setInt4(program: WebGLProgram, name: String, x: Number, y: Number, z: Number, w: Number): WebGLRenderer = definedExternally
//    open fun setMatrix2(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): WebGLRenderer = definedExternally
//    open fun setMatrix3(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): WebGLRenderer = definedExternally
//    open fun setMatrix4(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): WebGLRenderer = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
