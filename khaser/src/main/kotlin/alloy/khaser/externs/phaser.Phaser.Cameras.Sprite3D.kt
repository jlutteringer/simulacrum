//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Cameras.Sprite3D")]
//package Phaser.Cameras.Sprite3D
//
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//
//external open class Camera(scene: Scene) {
//    open fun setPosition(x: Number, y: Number, z: Number): Camera = definedExternally
//    open fun setScene(scene: Scene): Camera = definedExternally
//    open fun setPixelScale(value: Number): Camera = definedExternally
//    open fun add(sprite3D: Phaser.GameObjects.Sprite3D): Phaser.GameObjects.Sprite3D = definedExternally
//    open fun remove(child: Phaser.GameObjects.GameObject): Camera = definedExternally
//    open fun clear(): Camera = definedExternally
//    open fun getChildren(): Array<Any> = definedExternally
//    open fun create(x: Number, y: Number, z: Number, key: String, frame: String, visible: Boolean? = definedExternally /* null */): Phaser.GameObjects.Sprite3D = definedExternally
//    open fun create(x: Number, y: Number, z: Number, key: String, frame: Number, visible: Boolean? = definedExternally /* null */): Phaser.GameObjects.Sprite3D = definedExternally
//    open fun createMultiple(quantity: Number, key: String, frame: String, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createMultiple(quantity: Number, key: String, frame: Number, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Number, spacing: Number, key: String, frame: String? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Number, spacing: Number, key: String, frame: Number? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Number, spacing: Any, key: String, frame: String? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Number, spacing: Any, key: String, frame: Number? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Any, spacing: Number, key: String, frame: String? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Any, spacing: Number, key: String, frame: Number? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Any, spacing: Any, key: String, frame: String? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Any, spacing: Any, key: String, frame: Number? = definedExternally /* null */): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun randomSphere(radius: Number? = definedExternally /* null */, sprites: Array<Phaser.GameObjects.Sprite3D>? = definedExternally /* null */): Camera = definedExternally
//    open fun randomCube(scale: Number? = definedExternally /* null */, sprites: Array<Phaser.GameObjects.Sprite3D>? = definedExternally /* null */): Camera = definedExternally
//    open fun translateChildren(vec3: Phaser.Math.Vector3, sprites: Array<Phaser.GameObjects.Sprite3D>): Camera = definedExternally
//    open fun transformChildren(mat4: Phaser.Math.Matrix4, sprites: Array<Phaser.GameObjects.Sprite3D>): Camera = definedExternally
//    open fun setViewport(width: Number, height: Number): Camera = definedExternally
//    open fun translate(x: Number, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun translate(x: Any?, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun lookAt(x: Number, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun lookAt(x: Any?, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */): Camera = definedExternally
//    open fun rotate(radians: Number, axis: Phaser.Math.Vector3): Camera = definedExternally
//    open fun rotateAround(point: Phaser.Math.Vector3, radians: Number, axis: Phaser.Math.Vector3): Camera = definedExternally
//    open fun project(vec: Phaser.Math.Vector3, out: Phaser.Math.Vector4): Phaser.Math.Vector4 = definedExternally
//    open fun unproject(vec: Phaser.Math.Vector4, out: Phaser.Math.Vector3): Phaser.Math.Vector3 = definedExternally
//    open fun getPickRay(x: Number, y: Number? = definedExternally /* null */): RayDef = definedExternally
//    open fun updateChildren(): Camera = definedExternally
//    open fun update(): Camera = definedExternally
//    open fun updateBillboardMatrix(): Unit = definedExternally
//    open fun getPointSize(vec: Phaser.Math.Vector2, size: Phaser.Math.Vector2, out: Phaser.Math.Vector2): Phaser.Math.Vector2 = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open fun setX(value: Number): Camera = definedExternally
//    open fun setY(value: Number): Camera = definedExternally
//    open fun setZ(value: Number): Camera = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var z: Number = definedExternally
//    open fun createRect(size: Number, spacing: Number, key: String): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Number, spacing: Any, key: String): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Any, spacing: Number, key: String): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//    open fun createRect(size: Any, spacing: Any, key: String): Array<Phaser.GameObjects.Sprite3D> = definedExternally
//}
//external var scene: Scene = definedExternally
//external var displayList: Phaser.GameObjects.DisplayList = definedExternally
//external var updateList: Phaser.GameObjects.UpdateList = definedExternally
//external var name: String = definedExternally
//external var direction: Phaser.Math.Vector3 = definedExternally
//external var up: Phaser.Math.Vector3 = definedExternally
//external var position: Phaser.Math.Vector3 = definedExternally
//external var pixelScale: Number = definedExternally
//external var projection: Phaser.Math.Matrix4 = definedExternally
//external var view: Phaser.Math.Matrix4 = definedExternally
//external var combined: Phaser.Math.Matrix4 = definedExternally
//external var invProjectionView: Phaser.Math.Matrix4 = definedExternally
//external var near: Number = definedExternally
//external var far: Number = definedExternally
//external var ray: RayDef = definedExternally
//external var viewportWidth: Number = definedExternally
//external var viewportHeight: Number = definedExternally
//external var billboardMatrixDirty: Boolean = definedExternally
//external var children: Phaser.Structs.Set<Phaser.GameObjects.GameObject> = definedExternally
//external open class CameraManager(scene: Scene) {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    open var cameras: Array<Camera> = definedExternally
//    open fun add(fieldOfView: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): PerspectiveCamera = definedExternally
//    open fun addOrthographicCamera(width: Number, height: Number): OrthographicCamera = definedExternally
//    open fun addPerspectiveCamera(fieldOfView: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): PerspectiveCamera = definedExternally
//    open fun getCamera(name: String): dynamic /* PerspectiveCamera | OrthographicCamera */ = definedExternally
//    open fun removeCamera(camera: PerspectiveCamera): Unit = definedExternally
//    open fun removeCamera(camera: OrthographicCamera): Unit = definedExternally
//    open fun removeAll(): dynamic /* PerspectiveCamera | OrthographicCamera */ = definedExternally
//    open fun update(timestep: Number, delta: Number): Unit = definedExternally
//}
//external open class OrthographicCamera(scene: Scene, viewportWidth: Number? = definedExternally /* null */, viewportHeight: Number? = definedExternally /* null */) : Camera {
//    open var viewportWidth: Number = definedExternally
//    open var viewportHeight: Number = definedExternally
//    open var near: Number = definedExternally
//    open fun setToOrtho(yDown: Number, viewportWidth: Number? = definedExternally /* null */, viewportHeight: Number? = definedExternally /* null */): OrthographicCamera = definedExternally
//    override fun update(): OrthographicCamera = definedExternally
//    open var zoom: Number = definedExternally
//}
//external open class PerspectiveCamera(scene: Scene, fieldOfView: Number? = definedExternally /* null */, viewportWidth: Number? = definedExternally /* null */, viewportHeight: Number? = definedExternally /* null */) : Camera {
//    open var viewportWidth: Number = definedExternally
//    open var viewportHeight: Number = definedExternally
//    open var fieldOfView: Number = definedExternally
//    open fun setFOV(value: Number): PerspectiveCamera = definedExternally
//    override fun update(): PerspectiveCamera = definedExternally
//}
