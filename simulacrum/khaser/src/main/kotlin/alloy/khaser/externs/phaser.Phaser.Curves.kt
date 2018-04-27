//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Curves")]
//package Phaser.Curves
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
//external open class CubicBezierCurve : Curve {
//    constructor(p0: Phaser.Math.Vector2, p1: Phaser.Math.Vector2, p2: Phaser.Math.Vector2, p3: Phaser.Math.Vector2)
//    constructor(p0: Array<Phaser.Math.Vector2>, p1: Phaser.Math.Vector2, p2: Phaser.Math.Vector2, p3: Phaser.Math.Vector2)
//    open var p0: Phaser.Math.Vector2 = definedExternally
//    open var p1: Phaser.Math.Vector2 = definedExternally
//    open var p2: Phaser.Math.Vector2 = definedExternally
//    open var p3: Phaser.Math.Vector2 = definedExternally
//    open fun <O : Phaser.Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun getResolution(divisions: Number): Number = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun <G : Phaser.GameObjects.Graphics> draw(graphics: G, pointsTotal: Number? = definedExternally /* null */): G = definedExternally
//    open fun toJSON(): JSONCurve = definedExternally
//    companion object {
//        fun fromJSON(data: JSONCurve): CubicBezierCurve = definedExternally
//    }
//}
//external open class Curve(type: String) {
//    open var type: String = definedExternally
//    open var defaultDivisions: Number = definedExternally
//    open var arcLengthDivisions: Number = definedExternally
//    open var cacheArcLengths: Array<Number> = definedExternally
//    open var needsUpdate: Boolean = definedExternally
//    open var active: Boolean = definedExternally
//    open fun <G : Phaser.GameObjects.Graphics> draw(graphics: G, pointsTotal: Number? = definedExternally /* null */): G = definedExternally
//    open fun getBounds(out: Phaser.Geom.Rectangle? = definedExternally /* null */, accuracy: Number? = definedExternally /* null */): Phaser.Geom.Rectangle = definedExternally
//    open fun getDistancePoints(distance: Number): Array<Phaser.Geom.Point> = definedExternally
//    open fun getEndPoint(out: Phaser.Math.Vector2): Phaser.Math.Vector2 = definedExternally
//    open fun getLength(): Number = definedExternally
//    open fun getLengths(divisions: Number? = definedExternally /* null */): Array<Number> = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPointAt(u: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun getPoints(divisions: Number? = definedExternally /* null */): Array<Phaser.Math.Vector2> = definedExternally
//    open fun <O : Phaser.Math.Vector2> getRandomPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun getSpacedPoints(divisions: Number? = definedExternally /* null */): Array<Phaser.Math.Vector2> = definedExternally
//    open fun <O : Phaser.Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTangent(t: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTangentAt(u: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun getTFromDistance(distance: Number, divisions: Number? = definedExternally /* null */): Number = definedExternally
//    open fun getUtoTmapping(u: Number, distance: Number, divisions: Number? = definedExternally /* null */): Number = definedExternally
//    open fun updateArcLengths(): Unit = definedExternally
//}
//external open class EllipseCurve : Curve {
//    constructor(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, xRadius: Number? = definedExternally /* null */, yRadius: Number? = definedExternally /* null */, startAngle: Number? = definedExternally /* null */, endAngle: Number? = definedExternally /* null */, clockwise: Boolean? = definedExternally /* null */, rotation: Number? = definedExternally /* null */)
//    constructor(x: EllipseCurveConfig? = definedExternally /* null */, y: Number? = definedExternally /* null */, xRadius: Number? = definedExternally /* null */, yRadius: Number? = definedExternally /* null */, startAngle: Number? = definedExternally /* null */, endAngle: Number? = definedExternally /* null */, clockwise: Boolean? = definedExternally /* null */, rotation: Number? = definedExternally /* null */)
//    open var p0: Phaser.Math.Vector2 = definedExternally
//    open fun <O : Phaser.Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun getResolution(divisions: Number): Number = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun setXRadius(value: Number): EllipseCurve = definedExternally
//    open fun setYRadius(value: Number): EllipseCurve = definedExternally
//    open fun setWidth(value: Number): EllipseCurve = definedExternally
//    open fun setHeight(value: Number): EllipseCurve = definedExternally
//    open fun setStartAngle(value: Number): EllipseCurve = definedExternally
//    open fun setEndAngle(value: Number): EllipseCurve = definedExternally
//    open fun setClockwise(value: Boolean): EllipseCurve = definedExternally
//    open fun setRotation(value: Number): EllipseCurve = definedExternally
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var xRadius: Number = definedExternally
//    open var yRadius: Number = definedExternally
//    open var startAngle: Number = definedExternally
//    open var endAngle: Number = definedExternally
//    open var clockwise: Boolean = definedExternally
//    open var rotation: Number = definedExternally
//    open fun toJSON(): JSONEllipseCurve = definedExternally
//    companion object {
//        fun fromJSON(data: JSONEllipseCurve): EllipseCurve = definedExternally
//    }
//}
//external open class LineCurve : Curve {
//    constructor(p0: Array<Number>, p1: Phaser.Math.Vector2? = definedExternally /* null */)
//    constructor(p0: Phaser.Math.Vector2, p1: Phaser.Math.Vector2? = definedExternally /* null */)
//    open var p0: Phaser.Math.Vector2 = definedExternally
//    open var p1: Phaser.Math.Vector2 = definedExternally
//    open fun <O : Phaser.Geom.Rectangle> getBounds(out: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun getResolution(divisions: Number? = definedExternally /* null */): Number = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPointAt(u: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getTangent(): O = definedExternally
//    open fun <G : Phaser.GameObjects.Graphics> draw(graphics: G): G = definedExternally
//    open fun toJSON(): JSONCurve = definedExternally
//    companion object {
//        fun fromJSON(data: JSONCurve): LineCurve = definedExternally
//    }
//}
//external open class MoveTo(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) {
//    open var active: Boolean = definedExternally
//    open var p0: Phaser.Math.Vector2 = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPointAt(u: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun getResolution(): Number = definedExternally
//    open fun getLength(): Number = definedExternally
//    open fun toJSON(): JSONCurve = definedExternally
//}
//external open class Path(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) {
//    open var name: String = definedExternally
//    open var curves: Array<Curve> = definedExternally
//    open var cacheLengths: Array<Number> = definedExternally
//    open var autoClose: Boolean = definedExternally
//    open var startPoint: Phaser.Math.Vector2 = definedExternally
//    open fun add(curve: Curve): Path = definedExternally
//    open fun circleTo(radius: Number, clockwise: Boolean? = definedExternally /* null */, rotation: Number? = definedExternally /* null */): Path = definedExternally
//    open fun closePath(): Path = definedExternally
//    open fun cubicBezierTo(x: Number, y: Number, control1X: Phaser.Math.Vector2, control1Y: Phaser.Math.Vector2, control2X: Phaser.Math.Vector2, control2Y: Phaser.Math.Vector2): Path = definedExternally
//    open fun quadraticBezierTo(x: Number, y: Number? = definedExternally /* null */, controlX: Number? = definedExternally /* null */, controlY: Number? = definedExternally /* null */): Path = definedExternally
//    open fun quadraticBezierTo(x: Array<Phaser.Math.Vector2>, y: Number? = definedExternally /* null */, controlX: Number? = definedExternally /* null */, controlY: Number? = definedExternally /* null */): Path = definedExternally
//    open fun <G : Phaser.GameObjects.Graphics> draw(graphics: Phaser.GameObjects.Graphics, pointsTotal: Number? = definedExternally /* null */): G = definedExternally
//    open fun ellipseTo(xRadius: Number, yRadius: Number, startAngle: Number, endAngle: Number, clockwise: Boolean, rotation: Number): Path = definedExternally
//    open fun fromJSON(data: Any): Path = definedExternally
//    open fun <O : Phaser.Math.Vector2> getBounds(out: O? = definedExternally /* null */, accuracy: Number? = definedExternally /* null */): O = definedExternally
//    open fun getCurveLengths(): Array<Number> = definedExternally
//    open fun <O : Phaser.Math.Vector2> getEndPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun getLength(): Number = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun getPoints(divisions: Number? = definedExternally /* null */): Array<Phaser.Math.Vector2> = definedExternally
//    open fun <O : Phaser.Math.Vector2> getRandomPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun getSpacedPoints(divisions: Number? = definedExternally /* null */): Array<Phaser.Math.Vector2> = definedExternally
//    open fun <O : Phaser.Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun lineTo(x: Number, y: Number? = definedExternally /* null */): Path = definedExternally
//    open fun lineTo(x: Phaser.Math.Vector2, y: Number? = definedExternally /* null */): Path = definedExternally
//    open fun splineTo(points: Array<Phaser.Math.Vector2>): Path = definedExternally
//    open fun moveTo(x: Number, y: Number): Path = definedExternally
//    open fun toJSON(): JSONPath = definedExternally
//    open fun updateArcLengths(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class QuadraticBezier : Curve {
//    constructor(p0: Array<Number>, p1: Phaser.Math.Vector2, p2: Phaser.Math.Vector2)
//    constructor(p0: Phaser.Math.Vector2, p1: Phaser.Math.Vector2, p2: Phaser.Math.Vector2)
//    open var p0: Phaser.Math.Vector2 = definedExternally
//    open var p1: Phaser.Math.Vector2 = definedExternally
//    open var p2: Phaser.Math.Vector2 = definedExternally
//    open fun <O : Phaser.Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun getResolution(divisions: Number): Number = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun <G : Phaser.GameObjects.Graphics> draw(graphics: G, pointsTotal: Number? = definedExternally /* null */): G = definedExternally
//    open fun toJSON(): JSONCurve = definedExternally
//    companion object {
//        fun fromJSON(data: JSONCurve): QuadraticBezier = definedExternally
//    }
//}
//external open class SplineCurve(points: Array<Phaser.Math.Vector2>? = definedExternally /* null */) : Curve {
//    open var points: Array<Phaser.Math.Vector2> = definedExternally
//    open fun addPoints(points: Array<Number>): SplineCurve = definedExternally
//    open fun addPoints(points: Array<Phaser.Math.Vector2>): SplineCurve = definedExternally
//    open fun addPoints(points: Array<Array<Number>>): SplineCurve = definedExternally
//    open fun addPoint(x: Number, y: Number): Phaser.Math.Vector2 = definedExternally
//    open fun <O : Phaser.Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
//    open fun getResolution(divisions: Number): Number = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun toJSON(): JSONCurve = definedExternally
//    companion object {
//        fun fromJSON(data: JSONCurve): SplineCurve = definedExternally
//    }
//}
