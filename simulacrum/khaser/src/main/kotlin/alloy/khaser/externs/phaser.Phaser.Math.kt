//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Math")]
//package Phaser.Math
//
//import kotlin.js.*
//import kotlin.js.Json
//import org.khronos.webgl.*
//import org.w3c.dom.*
//import org.w3c.dom.events.*
//import org.w3c.dom.parsing.*
//import org.w3c.dom.svg.*
//import org.w3c.dom.url.*
//import org.w3c.fetch.*
//import org.w3c.files.*
//import org.w3c.notifications.*
//import org.w3c.performance.*
//import org.w3c.workers.*
//import org.w3c.xhr.*
//
//external fun Average(values: Array<Number>): Number = definedExternally
//external fun Bernstein(n: Number, i: Number): Number = definedExternally
//external fun Between(min: Number, max: Number): Number = definedExternally
//external fun CatmullRom(t: Number, p0: Number, p1: Number, p2: Number, p3: Number): Number = definedExternally
//external fun CeilTo(value: Number, place: Number? = definedExternally /* null */, base: Number? = definedExternally /* null */): Number = definedExternally
//external fun Clamp(value: Number, min: Number, max: Number): Number = definedExternally
//external var PI2: Number = definedExternally
//external var TAU: Number = definedExternally
//external var EPSILON: Number = definedExternally
//external var DEG_TO_RAD: Number = definedExternally
//external var RAD_TO_DEG: Number = definedExternally
//external var RND: RandomDataGenerator = definedExternally
//external fun DegToRad(degrees: Number): Number = definedExternally
//external fun Difference(a: Number, b: Number): Number = definedExternally
//external fun Factorial(value: Number): Number = definedExternally
//external fun FloatBetween(min: Number, max: Number): Number = definedExternally
//external fun FloorTo(value: Number, place: Number? = definedExternally /* null */, base: Number? = definedExternally /* null */): Number = definedExternally
//external fun FromPercent(percent: Number, min: Number, max: Number? = definedExternally /* null */): Number = definedExternally
//external fun GetSpeed(distance: Number, time: Number): Number = definedExternally
//external fun IsEven(value: Number): Boolean = definedExternally
//external fun IsEvenStrict(value: Number): Boolean = definedExternally
//external fun Linear(p0: Number, p1: Number, t: Number): Number = definedExternally
//external open class Matrix3(m: Matrix3? = definedExternally /* null */) {
//    open var `val`: Float32Array = definedExternally
//    open fun clone(): Matrix3 = definedExternally
//    open fun set(src: Matrix3): Matrix3 = definedExternally
//    open fun copy(src: Matrix3): Matrix3 = definedExternally
//    open fun fromMat4(m: Matrix4): Matrix3 = definedExternally
//    open fun fromArray(a: Array<Any>): Matrix3 = definedExternally
//    open fun identity(): Matrix3 = definedExternally
//    open fun transpose(): Matrix3 = definedExternally
//    open fun invert(): Matrix3 = definedExternally
//    open fun adjoint(): Matrix3 = definedExternally
//    open fun determinant(): Number = definedExternally
//    open fun multiply(src: Matrix3): Matrix3 = definedExternally
//    open fun translate(v: Vector3): Matrix3 = definedExternally
//    open fun translate(v: Vector2): Matrix3 = definedExternally
//    open fun translate(v: Vector4): Matrix3 = definedExternally
//    open fun rotate(rad: Number): Matrix3 = definedExternally
//    open fun scale(v: Vector3): Matrix3 = definedExternally
//    open fun scale(v: Vector2): Matrix3 = definedExternally
//    open fun scale(v: Vector4): Matrix3 = definedExternally
//    open fun fromQuat(q: Quaternion): Matrix3 = definedExternally
//    open fun normalFromMat4(m: Matrix4): Matrix3 = definedExternally
//}
//external open class Matrix4(m: Matrix4? = definedExternally /* null */) {
//    open var `val`: Float32Array = definedExternally
//    open fun clone(): Matrix4 = definedExternally
//    open fun set(src: Matrix4): Matrix4 = definedExternally
//    open fun copy(src: Matrix4): Matrix4 = definedExternally
//    open fun fromArray(a: Array<Any>): Matrix4 = definedExternally
//    open fun zero(): Matrix4 = definedExternally
//    open fun xyz(x: Number, y: Number, z: Number): Matrix4 = definedExternally
//    open fun scaling(x: Number, y: Number, z: Number): Matrix4 = definedExternally
//    open fun identity(): Matrix4 = definedExternally
//    open fun transpose(): Matrix4 = definedExternally
//    open fun invert(): Matrix4 = definedExternally
//    open fun adjoint(): Matrix4 = definedExternally
//    open fun determinant(): Number = definedExternally
//    open fun multiply(src: Matrix4): Matrix4 = definedExternally
//    open fun multiplyLocal(src: Matrix4): Matrix4 = definedExternally
//    open fun translate(v: Vector3): Matrix4 = definedExternally
//    open fun translate(v: Vector4): Matrix4 = definedExternally
//    open fun scale(v: Vector3): Matrix4 = definedExternally
//    open fun scale(v: Vector4): Matrix4 = definedExternally
//    open fun makeRotationAxis(axis: Vector3, angle: Number): Matrix4 = definedExternally
//    open fun makeRotationAxis(axis: Vector4, angle: Number): Matrix4 = definedExternally
//    open fun rotate(rad: Number, axis: Vector3): Matrix4 = definedExternally
//    open fun rotateX(rad: Number): Matrix4 = definedExternally
//    open fun rotateY(rad: Number): Matrix4 = definedExternally
//    open fun rotateZ(rad: Number): Matrix4 = definedExternally
//    open fun fromRotationTranslation(q: Quaternion, v: Vector3): Matrix4 = definedExternally
//    open fun fromQuat(q: Quaternion): Matrix4 = definedExternally
//    open fun frustum(left: Number, right: Number, bottom: Number, top: Number, near: Number, far: Number): Matrix4 = definedExternally
//    open fun perspective(fovy: Number, aspect: Number, near: Number, far: Number): Matrix4 = definedExternally
//    open fun perspectiveLH(width: Number, height: Number, near: Number, far: Number): Matrix4 = definedExternally
//    open fun ortho(left: Number, right: Number, bottom: Number, top: Number, near: Number, far: Number): Matrix4 = definedExternally
//    open fun lookAt(eye: Vector3, center: Vector3, up: Vector3): Matrix4 = definedExternally
//    open fun yawPitchRoll(yaw: Number, pitch: Number, roll: Number): Matrix4 = definedExternally
//    open fun setWorldMatrix(rotation: Vector3, position: Vector3, scale: Vector3, viewMatrix: Matrix4? = definedExternally /* null */, projectionMatrix: Matrix4? = definedExternally /* null */): Matrix4 = definedExternally
//}
//external fun MaxAdd(value: Number, amount: Number, max: Number): Number = definedExternally
//external fun MinSub(value: Number, amount: Number, min: Number): Number = definedExternally
//external fun Percent(value: Number, min: Number, max: Number? = definedExternally /* null */, upperMax: Number? = definedExternally /* null */): Number = definedExternally
//external open class Quaternion(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var z: Number = definedExternally
//    open var w: Number = definedExternally
//    open fun copy(src: Vector4): Quaternion = definedExternally
//    open fun copy(src: Quaternion): Quaternion = definedExternally
//    open fun set(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */): Quaternion = definedExternally
//    open fun set(x: Any? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */): Quaternion = definedExternally
//    open fun add(v: Vector4): Quaternion = definedExternally
//    open fun add(v: Quaternion): Quaternion = definedExternally
//    open fun subtract(v: Vector4): Quaternion = definedExternally
//    open fun subtract(v: Quaternion): Quaternion = definedExternally
//    open fun scale(scale: Number): Quaternion = definedExternally
//    open fun length(): Number = definedExternally
//    open fun lengthSq(): Number = definedExternally
//    open fun normalize(): Quaternion = definedExternally
//    open fun dot(v: Vector4): Number = definedExternally
//    open fun dot(v: Quaternion): Number = definedExternally
//    open fun lerp(v: Vector4, t: Number? = definedExternally /* null */): Quaternion = definedExternally
//    open fun lerp(v: Quaternion, t: Number? = definedExternally /* null */): Quaternion = definedExternally
//    open fun rotationTo(a: Vector3, b: Vector3): Quaternion = definedExternally
//    open fun setAxes(view: Vector3, right: Vector3, up: Vector3): Quaternion = definedExternally
//    open fun identity(): Quaternion = definedExternally
//    open fun setAxisAngle(axis: Vector3, rad: Number): Quaternion = definedExternally
//    open fun multiply(b: Vector4): Quaternion = definedExternally
//    open fun multiply(b: Quaternion): Quaternion = definedExternally
//    open fun slerp(b: Vector4, t: Number): Quaternion = definedExternally
//    open fun slerp(b: Quaternion, t: Number): Quaternion = definedExternally
//    open fun invert(): Quaternion = definedExternally
//    open fun conjugate(): Quaternion = definedExternally
//    open fun rotateX(rad: Number): Quaternion = definedExternally
//    open fun rotateY(rad: Number): Quaternion = definedExternally
//    open fun rotateZ(rad: Number): Quaternion = definedExternally
//    open fun calculateW(): Quaternion = definedExternally
//    open fun fromMat3(mat: Matrix3): Quaternion = definedExternally
//    open fun set(): Quaternion = definedExternally
//}
//external fun RadToDeg(radians: Number): Number = definedExternally
//external open class RandomDataGenerator(seeds: Array<String>? = definedExternally /* null */) {
//    open var signs: Array<Number> = definedExternally
//    open fun init(seeds: String): Unit = definedExternally
//    open fun init(seeds: Array<String>): Unit = definedExternally
//    open fun sow(seeds: Array<String>): Unit = definedExternally
//    open fun integer(): Number = definedExternally
//    open fun frac(): Number = definedExternally
//    open fun real(): Number = definedExternally
//    open fun integerInRange(min: Number, max: Number): Number = definedExternally
//    open fun between(min: Number, max: Number): Number = definedExternally
//    open fun realInRange(min: Number, max: Number): Number = definedExternally
//    open fun normal(): Number = definedExternally
//    open fun uuid(): String = definedExternally
//    open fun pick(array: Array<Any>): Any = definedExternally
//    open fun sign(): Number = definedExternally
//    open fun weightedPick(array: Array<Any>): Any = definedExternally
//    open fun timestamp(min: Number, max: Number): Number = definedExternally
//    open fun angle(): Number = definedExternally
//    open fun rotation(): Number = definedExternally
//    open fun state(state: String? = definedExternally /* null */): String = definedExternally
//}
//external fun RandomXY(vector: Vector2, scale: Number): Vector2 = definedExternally
//external fun RandomXYZ(vec3: Vector3, radius: Number? = definedExternally /* null */): Vector3 = definedExternally
//external fun RandomXYZW(vec4: Vector4, scale: Number? = definedExternally /* null */): Vector4 = definedExternally
//external fun Rotate(point: Any?, angle: Number): Phaser.Geom.Point = definedExternally
//external fun Rotate(point: Phaser.Geom.Point, angle: Number): Phaser.Geom.Point = definedExternally
//external fun RotateAround(point: Any?, x: Number, y: Number, angle: Number): Phaser.Geom.Point = definedExternally
//external fun RotateAround(point: Phaser.Geom.Point, x: Number, y: Number, angle: Number): Phaser.Geom.Point = definedExternally
//external fun RotateAroundDistance(point: Any?, x: Number, y: Number, angle: Number, distance: Number): Phaser.Geom.Point = definedExternally
//external fun RotateAroundDistance(point: Phaser.Geom.Point, x: Number, y: Number, angle: Number, distance: Number): Phaser.Geom.Point = definedExternally
//external fun RotateVec3(vec: Vector3, axis: Vector3, radians: Number): Vector3 = definedExternally
//external fun RoundAwayFromZero(value: Number): Number = definedExternally
//external fun RoundTo(value: Number, place: Number? = definedExternally /* null */, base: Number? = definedExternally /* null */): Number = definedExternally
//external fun SinCosTableGenerator(length: Number, sinAmp: Number, cosAmp: Number, frequency: Number): SinCosTable = definedExternally
//external fun SmootherStep(x: Number, min: Number, max: Number): Number = definedExternally
//external fun SmoothStep(x: Number, min: Number, max: Number): Number = definedExternally
//external fun TransformXY(x: Number, y: Number, positionX: Number, positionY: Number, rotation: Number, scaleX: Number, scaleY: Number, output: Any? = definedExternally /* null */): dynamic /* Any? | Vector2 | Phaser.Geom.Point */ = definedExternally
//external fun TransformXY(x: Number, y: Number, positionX: Number, positionY: Number, rotation: Number, scaleX: Number, scaleY: Number, output: Vector2? = definedExternally /* null */): dynamic /* Any? | Vector2 | Phaser.Geom.Point */ = definedExternally
//external fun TransformXY(x: Number, y: Number, positionX: Number, positionY: Number, rotation: Number, scaleX: Number, scaleY: Number, output: Phaser.Geom.Point? = definedExternally /* null */): dynamic /* Any? | Vector2 | Phaser.Geom.Point */ = definedExternally
//external open class Vector2(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open fun clone(): Vector2 = definedExternally
//    open fun copy(src: Vector2): Vector2 = definedExternally
//    open fun setFromObject(obj: Vector2Like): Vector2 = definedExternally
//    open fun set(x: Number, y: Number? = definedExternally /* null */): Vector2 = definedExternally
//    open fun setTo(x: Number, y: Number? = definedExternally /* null */): Vector2 = definedExternally
//    open fun setToPolar(azimuth: Number, radius: Number? = definedExternally /* null */): Vector2 = definedExternally
//    open fun equals(v: Vector2): Boolean = definedExternally
//    open fun angle(): Number = definedExternally
//    open fun add(src: Vector2): Vector2 = definedExternally
//    open fun subtract(src: Vector2): Vector2 = definedExternally
//    open fun multiply(src: Vector2): Vector2 = definedExternally
//    open fun scale(value: Number): Vector2 = definedExternally
//    open fun divide(src: Vector2): Vector2 = definedExternally
//    open fun negate(): Vector2 = definedExternally
//    open fun distance(src: Vector2): Number = definedExternally
//    open fun distanceSq(src: Vector2): Number = definedExternally
//    open fun length(): Number = definedExternally
//    open fun lengthSq(): Number = definedExternally
//    open fun normalize(): Vector2 = definedExternally
//    open fun normalizeRightHand(): Vector2 = definedExternally
//    open fun dot(src: Vector2): Number = definedExternally
//    open fun cross(src: Vector2): Number = definedExternally
//    open fun lerp(src: Vector2, t: Number? = definedExternally /* null */): Vector2 = definedExternally
//    open fun transformMat3(mat: Matrix3): Vector2 = definedExternally
//    open fun transformMat4(mat: Matrix4): Vector2 = definedExternally
//    open fun reset(): Vector2 = definedExternally
//    companion object {
//        fun ZERO(): Unit = definedExternally
//    }
//}
//external open class Vector3(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var z: Number = definedExternally
//    open fun up(): Vector3 = definedExternally
//    open fun clone(): Vector3 = definedExternally
//    open fun crossVectors(a: Vector3, b: Vector3): Vector3 = definedExternally
//    open fun equals(v: Vector3): Boolean = definedExternally
//    open fun copy(src: Vector3): Vector3 = definedExternally
//    open fun copy(src: Vector2): Vector3 = definedExternally
//    open fun set(x: Number, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */): Vector3 = definedExternally
//    open fun set(x: Any?, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */): Vector3 = definedExternally
//    open fun add(v: Vector3): Vector3 = definedExternally
//    open fun add(v: Vector2): Vector3 = definedExternally
//    open fun subtract(v: Vector3): Vector3 = definedExternally
//    open fun subtract(v: Vector2): Vector3 = definedExternally
//    open fun multiply(v: Vector3): Vector3 = definedExternally
//    open fun multiply(v: Vector2): Vector3 = definedExternally
//    open fun scale(scale: Number): Vector3 = definedExternally
//    open fun divide(v: Vector3): Vector3 = definedExternally
//    open fun divide(v: Vector2): Vector3 = definedExternally
//    open fun negate(): Vector3 = definedExternally
//    open fun distance(v: Vector3): Number = definedExternally
//    open fun distance(v: Vector2): Number = definedExternally
//    open fun distanceSq(v: Vector3): Number = definedExternally
//    open fun distanceSq(v: Vector2): Number = definedExternally
//    open fun length(): Number = definedExternally
//    open fun lengthSq(): Number = definedExternally
//    open fun normalize(v: Vector3): Vector3 = definedExternally
//    open fun normalize(v: Vector2): Vector3 = definedExternally
//    open fun dot(v: Vector3): Number = definedExternally
//    open fun cross(v: Vector3): Vector3 = definedExternally
//    open fun lerp(v: Vector3, t: Number? = definedExternally /* null */): Vector3 = definedExternally
//    open fun transformMat3(mat: Matrix3): Vector3 = definedExternally
//    open fun transformMat4(mat: Matrix4): Vector3 = definedExternally
//    open fun transformCoordinates(mat: Matrix4): Vector3 = definedExternally
//    open fun transformQuat(q: Quaternion): Vector3 = definedExternally
//    open fun project(mat: Matrix4): Vector3 = definedExternally
//    open fun unproject(viewport: Vector4, invProjectionView: Matrix4): Vector3 = definedExternally
//    open fun reset(): Vector3 = definedExternally
//}
//external open class Vector4(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var z: Number = definedExternally
//    open var w: Number = definedExternally
//    open fun clone(): Vector4 = definedExternally
//    open fun copy(src: Vector4): Vector4 = definedExternally
//    open fun equals(v: Vector4): Boolean = definedExternally
//    open fun set(x: Number, y: Number, z: Number, w: Number): Vector4 = definedExternally
//    open fun add(v: Vector3): Vector4 = definedExternally
//    open fun add(v: Vector2): Vector4 = definedExternally
//    open fun add(v: Vector4): Vector4 = definedExternally
//    open fun subtract(v: Vector3): Vector4 = definedExternally
//    open fun subtract(v: Vector2): Vector4 = definedExternally
//    open fun subtract(v: Vector4): Vector4 = definedExternally
//    open fun scale(scale: Number): Vector4 = definedExternally
//    open fun length(): Number = definedExternally
//    open fun lengthSq(): Number = definedExternally
//    open fun normalize(): Vector4 = definedExternally
//    open fun dot(v: Vector4): Number = definedExternally
//    open fun lerp(v: Vector4, t: Number? = definedExternally /* null */): Vector4 = definedExternally
//    open fun multiply(v: Vector3): Vector4 = definedExternally
//    open fun multiply(v: Vector2): Vector4 = definedExternally
//    open fun multiply(v: Vector4): Vector4 = definedExternally
//    open fun divide(v: Vector3): Vector4 = definedExternally
//    open fun divide(v: Vector2): Vector4 = definedExternally
//    open fun divide(v: Vector4): Vector4 = definedExternally
//    open fun distance(v: Vector3): Number = definedExternally
//    open fun distance(v: Vector2): Number = definedExternally
//    open fun distance(v: Vector4): Number = definedExternally
//    open fun distanceSq(v: Vector3): Number = definedExternally
//    open fun distanceSq(v: Vector2): Number = definedExternally
//    open fun distanceSq(v: Vector4): Number = definedExternally
//    open fun negate(): Vector4 = definedExternally
//    open fun transformMat4(mat: Matrix4): Vector4 = definedExternally
//    open fun transformQuat(q: Quaternion): Vector4 = definedExternally
//    open fun reset(): Vector4 = definedExternally
//}
//external fun Within(a: Number, b: Number, tolerance: Number): Boolean = definedExternally
//external fun Wrap(value: Number, min: Number, max: Number): Number = definedExternally
//external fun TransformXY(x: Number, y: Number, positionX: Number, positionY: Number, rotation: Number, scaleX: Number, scaleY: Number): dynamic /* Any? | Vector2 | Phaser.Geom.Point */ = definedExternally
