//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Geom")]
//package Phaser.Geom
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
//external open class Circle(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, radius: Number? = definedExternally /* null */) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open fun contains(x: Number, y: Number): Boolean = definedExternally
//    open fun <O : Point> getPoint(position: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Array<Point>> getPoints(quantity: Number, stepRate: Number? = definedExternally /* null */, output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Point> getRandomPoint(point: O? = definedExternally /* null */): O = definedExternally
//    open fun setTo(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, radius: Number? = definedExternally /* null */): Circle = definedExternally
//    open fun setEmpty(): Circle = definedExternally
//    open fun setPosition(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Circle = definedExternally
//    open fun isEmpty(): Boolean = definedExternally
//    open var radius: Number = definedExternally
//    open var diameter: Number = definedExternally
//    open var left: Number = definedExternally
//    open var right: Number = definedExternally
//    open var top: Number = definedExternally
//    open var bottom: Number = definedExternally
//    companion object {
//        fun Area(circle: Circle): Number = definedExternally
//        fun Circumference(circle: Circle): Number = definedExternally
//        fun <O : Point> CircumferencePoint(circle: Circle, angle: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun Clone(source: Any?): Circle = definedExternally
//        fun Clone(source: Circle): Circle = definedExternally
//        fun Contains(circle: Circle, x: Number, y: Number): Boolean = definedExternally
//        fun ContainsPoint(circle: Circle, point: Any?): Boolean = definedExternally
//        fun ContainsPoint(circle: Circle, point: Point): Boolean = definedExternally
//        fun ContainsRect(circle: Circle, rect: Any?): Boolean = definedExternally
//        fun ContainsRect(circle: Circle, rect: Rectangle): Boolean = definedExternally
//        fun <O : Circle> CopyFrom(source: Circle, dest: O): O = definedExternally
//        fun Equals(circle: Circle, toCompare: Circle): Boolean = definedExternally
//        fun <O : Rectangle> GetBounds(circle: Circle, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> GetPoint(circle: Circle, position: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun GetPoints(circle: Circle, quantity: Number, stepRate: Number? = definedExternally /* null */, output: Array<Any>? = definedExternally /* null */): Array<Point> = definedExternally
//        fun <O : Circle> Offset(circle: O, x: Number, y: Number): O = definedExternally
//        fun <O : Circle> OffsetPoint(circle: O, point: Any?): O = definedExternally
//        fun <O : Circle> OffsetPoint(circle: O, point: Point): O = definedExternally
//        fun <O : Point> Random(circle: Circle, out: O? = definedExternally /* null */): O = definedExternally
//    }
//}
//external open class Ellipse(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open fun contains(x: Number, y: Number): Boolean = definedExternally
//    open fun <O : Point> getPoint(position: Number, out: O? = definedExternally /* null */): O = definedExternally
//    open fun getPoints(quantity: Number, stepRate: Number? = definedExternally /* null */, output: Array<Any>? = definedExternally /* null */): Array<Point> = definedExternally
//    open fun <O : Point> getRandomPoint(point: O? = definedExternally /* null */): O = definedExternally
//    open fun setTo(x: Number, y: Number, width: Number, height: Number): Ellipse = definedExternally
//    open fun setEmpty(): Ellipse = definedExternally
//    open fun setPosition(x: Number, y: Number): Ellipse = definedExternally
//    open fun setSize(width: Number, height: Number? = definedExternally /* null */): Ellipse = definedExternally
//    open fun isEmpty(): Boolean = definedExternally
//    open fun getMinorRadius(): Number = definedExternally
//    open fun getMajorRadius(): Number = definedExternally
//    open var left: Number = definedExternally
//    open var right: Number = definedExternally
//    open var top: Number = definedExternally
//    open var bottom: Number = definedExternally
//    companion object {
//        fun Area(ellipse: Ellipse): Number = definedExternally
//        fun Circumference(ellipse: Ellipse): Number = definedExternally
//        fun <O : Point> CircumferencePoint(ellipse: Ellipse, angle: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun Clone(source: Ellipse): Ellipse = definedExternally
//        fun Contains(ellipse: Ellipse, x: Number, y: Number): Boolean = definedExternally
//        fun ContainsPoint(ellipse: Ellipse, point: Any?): Boolean = definedExternally
//        fun ContainsPoint(ellipse: Ellipse, point: Point): Boolean = definedExternally
//        fun ContainsRect(ellipse: Ellipse, rect: Any?): Boolean = definedExternally
//        fun ContainsRect(ellipse: Ellipse, rect: Rectangle): Boolean = definedExternally
//        fun <O : Ellipse> CopyFrom(source: Ellipse, dest: O): O = definedExternally
//        fun Equals(ellipse: Ellipse, toCompare: Ellipse): Boolean = definedExternally
//        fun <O : Rectangle> GetBounds(ellipse: Ellipse, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> GetPoint(ellipse: Ellipse, position: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Array<Point>> GetPoints(ellipse: Ellipse, quantity: Number, stepRate: Number? = definedExternally /* null */, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Ellipse> Offset(ellipse: O, x: Number, y: Number): O = definedExternally
//        fun <O : Ellipse> OffsetPoint(ellipse: O, point: Any?): O = definedExternally
//        fun <O : Ellipse> OffsetPoint(ellipse: O, point: Point): O = definedExternally
//        fun <O : Point> Random(ellipse: Ellipse, out: O? = definedExternally /* null */): O = definedExternally
//    }
//}
//external open class Line(x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */) {
//    open var x1: Number = definedExternally
//    open var y1: Number = definedExternally
//    open var x2: Number = definedExternally
//    open var y2: Number = definedExternally
//    open fun <O : Point> getPoint(position: Number, output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Point> getPoints(quantity: Number, stepRate: Number? = definedExternally /* null */, output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Point> getRandomPoint(point: O? = definedExternally /* null */): O = definedExternally
//    open fun setTo(x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */): Line = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPointA(vec2: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Phaser.Math.Vector2> getPointB(vec2: O? = definedExternally /* null */): O = definedExternally
//    open var left: Number = definedExternally
//    open var right: Number = definedExternally
//    open var top: Number = definedExternally
//    open var bottom: Number = definedExternally
//    companion object {
//        fun Angle(line: Line): Number = definedExternally
//        fun BresenhamPoints(line: Line, stepRate: Number? = definedExternally /* null */, results: Array<Any>? = definedExternally /* null */): Array<Any> = definedExternally
//        fun CenterOn(line: Line, x: Number, y: Number): Line = definedExternally
//        fun Clone(source: Line): Line = definedExternally
//        fun <O : Line> CopyFrom(source: Line, dest: O): O = definedExternally
//        fun Equals(line: Line, toCompare: Line): Boolean = definedExternally
//        fun <O : Point> GetMidPoint(line: Line, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> GetNormal(line: Line, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> GetPoint(line: Line, position: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Array<Point>> GetPoints(line: Line, quantity: Number, stepRate: Number? = definedExternally /* null */, out: O? = definedExternally /* null */): O = definedExternally
//        fun Height(line: Line): Number = definedExternally
//        fun Length(line: Line): Number = definedExternally
//        fun NormalAngle(line: Line): Number = definedExternally
//        fun NormalX(line: Line): Number = definedExternally
//        fun NormalY(line: Line): Number = definedExternally
//        fun <O : Line> Offset(line: O, x: Number, y: Number): O = definedExternally
//        fun PerpSlope(line: Line): Number = definedExternally
//        fun <O : Point> Random(line: Line, out: O? = definedExternally /* null */): O = definedExternally
//        fun ReflectAngle(lineA: Line, lineB: Line): Number = definedExternally
//        fun <O : Line> Rotate(line: O, angle: Number): O = definedExternally
//        fun <O : Line> RotateAroundPoint(line: O, point: Any?, angle: Number): O = definedExternally
//        fun <O : Line> RotateAroundPoint(line: O, point: Point, angle: Number): O = definedExternally
//        fun <O : Line> RotateAroundXY(line: O, x: Number, y: Number, angle: Number): O = definedExternally
//        fun <O : Line> SetToAngle(line: O, x: Number, y: Number, angle: Number, length: Number): O = definedExternally
//        fun Slope(line: Line): Number = definedExternally
//        fun Width(line: Line): Number = definedExternally
//    }
//}
//external open class Point(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open fun setTo(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Point = definedExternally
//    companion object {
//        fun <O : Point> Ceil(point: O): O = definedExternally
//        fun Clone(source: Point): Point = definedExternally
//        fun <O : Point> CopyFrom(source: Point, dest: O): O = definedExternally
//        fun Equals(point: Point, toCompare: Point): Boolean = definedExternally
//        fun <O : Point> Floor(point: O): O = definedExternally
//        fun <O : Point> GetCentroid(points: Array<Point>, out: O? = definedExternally /* null */): O = definedExternally
//        fun GetMagnitude(point: Point): Number = definedExternally
//        fun GetMagnitudeSq(point: Point): Number = definedExternally
//        fun <O : Rectangle> GetRectangleFromPoints(points: Array<Point>, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> Interpolate(pointA: Point, pointB: Point, t: Number? = definedExternally /* null */, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> Invert(point: O): O = definedExternally
//        fun <O : Point> Negative(point: Point, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> Project(pointA: Point, pointB: Point, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> ProjectUnit(pointA: Point, pointB: Point, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> SetMagnitude(point: O, magnitude: Number): O = definedExternally
//    }
//}
//external open class Polygon(points: Array<Point>? = definedExternally /* null */) {
//    open var area: Number = definedExternally
//    open var points: Array<Point> = definedExternally
//    open fun contains(x: Number, y: Number): Boolean = definedExternally
//    open fun setTo(points: Array<Any>): Polygon = definedExternally
//    open fun calculateArea(): Number = definedExternally
//    companion object {
//        fun Clone(polygon: Polygon): Polygon = definedExternally
//        fun Contains(polygon: Polygon, x: Number, y: Number): Boolean = definedExternally
//        fun ContainsPoint(polygon: Polygon, point: Point): Boolean = definedExternally
//        fun <O : Rectangle> GetAABB(polygon: Polygon, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Array<Number>> GetNumberArray(polygon: Polygon, output: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Polygon> Reverse(polygon: O): O = definedExternally
//    }
//}
//external open class Rectangle(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */) {
//    open var x: Number = definedExternally
//    open var y: Number = definedExternally
//    open var width: Number = definedExternally
//    open var height: Number = definedExternally
//    open fun contains(x: Number, y: Number): Boolean = definedExternally
//    open fun <O : Point> getPoint(position: Number, output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Array<Point>> getPoints(quantity: Number, stepRate: Number? = definedExternally /* null */, output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Point> getRandomPoint(point: O? = definedExternally /* null */): O = definedExternally
//    open fun setTo(x: Number, y: Number, width: Number, height: Number): Rectangle = definedExternally
//    open fun setEmpty(): Rectangle = definedExternally
//    open fun setPosition(x: Number, y: Number? = definedExternally /* null */): Rectangle = definedExternally
//    open fun setSize(width: Number, height: Number? = definedExternally /* null */): Rectangle = definedExternally
//    open fun isEmpty(): Boolean = definedExternally
//    open fun <O : Line> getLineA(line: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Line> getLineB(line: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Line> getLineC(line: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Line> getLineD(line: O? = definedExternally /* null */): O = definedExternally
//    open var left: Number = definedExternally
//    open var right: Number = definedExternally
//    open var top: Number = definedExternally
//    open var bottom: Number = definedExternally
//    open var centerX: Number = definedExternally
//    open var centerY: Number = definedExternally
//    companion object {
//        fun Area(rect: Rectangle): Number = definedExternally
//        fun <O : Rectangle> Ceil(rect: O): O = definedExternally
//        fun <O : Rectangle> CeilAll(rect: O): O = definedExternally
//        fun <O : Rectangle> CenterOn(rect: O, x: Number, y: Number): O = definedExternally
//        fun Clone(source: Rectangle): Rectangle = definedExternally
//        fun Contains(rect: Rectangle, x: Number, y: Number): Boolean = definedExternally
//        fun ContainsPoint(rect: Rectangle, point: Point): Boolean = definedExternally
//        fun ContainsRect(rectA: Rectangle, rectB: Rectangle): Boolean = definedExternally
//        fun <O : Rectangle> CopyFrom(source: Rectangle, dest: O): O = definedExternally
//        fun Decompose(rect: Rectangle, out: Array<Any>? = definedExternally /* null */): Array<Any> = definedExternally
//        fun Equals(rect: Rectangle, toCompare: Rectangle): Boolean = definedExternally
//        fun <O : Rectangle> FitInside(target: O, source: Rectangle): O = definedExternally
//        fun <O : Rectangle> FitOutside(target: O, source: Rectangle): O = definedExternally
//        fun <O : Rectangle> Floor(rect: O): O = definedExternally
//        fun <O : Rectangle> FloorAll(rect: O): O = definedExternally
//        fun <O : Rectangle> FromPoints(points: Array<Any>, out: O? = definedExternally /* null */): O = definedExternally
//        fun GetAspectRatio(rect: Rectangle): Number = definedExternally
//        fun <O : Point> GetCenter(rect: Rectangle, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> GetPoint(rectangle: Rectangle, position: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Array<Point>> GetPoints(rectangle: Rectangle, step: Number, quantity: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> GetSize(rect: Rectangle, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Rectangle> Inflate(rect: O, x: Number, y: Number): O = definedExternally
//        fun <O : Array<Point>> MarchingAnts(rect: Rectangle, step: Number, quantity: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Rectangle> MergePoints(target: O, points: Array<Point>): O = definedExternally
//        fun <O : Rectangle> MergeRect(target: O, source: Rectangle): O = definedExternally
//        fun <O : Rectangle> MergeXY(target: O, x: Number, y: Number): O = definedExternally
//        fun <O : Rectangle> Offset(rect: O, x: Number, y: Number): O = definedExternally
//        fun <O : Rectangle> OffsetPoint(rect: O, point: Point): O = definedExternally
//        fun Overlaps(rectA: Rectangle, rectB: Rectangle): Boolean = definedExternally
//        fun Perimeter(rect: Rectangle): Number = definedExternally
//        fun <O : Point> PerimeterPoint(rectangle: Rectangle, angle: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> Random(rect: Rectangle, out: O): O = definedExternally
//        fun <O : Rectangle> Scale(rect: O, x: Number, y: Number): O = definedExternally
//        fun <O : Rectangle> Union(rectA: Rectangle, rectB: Rectangle, out: O? = definedExternally /* null */): O = definedExternally
//    }
//}
//external open class Triangle(x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */, x3: Number? = definedExternally /* null */, y3: Number? = definedExternally /* null */) {
//    open var x1: Number = definedExternally
//    open var y1: Number = definedExternally
//    open var x2: Number = definedExternally
//    open var y2: Number = definedExternally
//    open var x3: Number = definedExternally
//    open var y3: Number = definedExternally
//    open fun contains(x: Number, y: Number): Boolean = definedExternally
//    open fun <O : Point> getPoint(position: Number, output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Array<Point>> getPoints(quantity: Number, stepRate: Number? = definedExternally /* null */, output: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Point> getRandomPoint(point: O? = definedExternally /* null */): O = definedExternally
//    open fun setTo(x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */, x3: Number? = definedExternally /* null */, y3: Number? = definedExternally /* null */): Triangle = definedExternally
//    open fun <O : Line> getLineA(line: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Line> getLineB(line: O? = definedExternally /* null */): O = definedExternally
//    open fun <O : Line> getLineC(line: O? = definedExternally /* null */): O = definedExternally
//    open var left: Number = definedExternally
//    open var right: Number = definedExternally
//    open var top: Number = definedExternally
//    open var bottom: Number = definedExternally
//    companion object {
//        fun Area(triangle: Triangle): Number = definedExternally
//        fun BuildEquilateral(x: Number, y: Number, length: Number): Triangle = definedExternally
//        fun <O : Array<Triangle>> BuildFromPolygon(data: Array<Any>, holes: Array<Any>? = definedExternally /* null */, scaleX: Number? = definedExternally /* null */, scaleY: Number? = definedExternally /* null */, out: O? = definedExternally /* null */): O = definedExternally
//        fun BuildRight(x: Number, y: Number, width: Number, height: Number): Triangle = definedExternally
//        fun <O : Triangle> CenterOn(triangle: O, x: Number, y: Number, centerFunc: ((triangle: Triangle) -> Unit)? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> Centroid(triangle: Triangle, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Phaser.Math.Vector2> CircumCenter(triangle: Triangle, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Circle> CircumCircle(triangle: Triangle, out: O? = definedExternally /* null */): O = definedExternally
//        fun Clone(source: Triangle): Triangle = definedExternally
//        fun Contains(triangle: Triangle, x: Number, y: Number): Boolean = definedExternally
//        fun ContainsArray(triangle: Triangle, points: Array<Point>, returnFirst: Boolean? = definedExternally /* null */, out: Array<Any>? = definedExternally /* null */): Array<Point> = definedExternally
//        fun ContainsPoint(triangle: Triangle, point: Point): Boolean = definedExternally
//        fun <O : Triangle> CopyFrom(source: Triangle, dest: O): O = definedExternally
//        fun Decompose(triangle: Triangle, out: Array<Any>? = definedExternally /* null */): Array<Any> = definedExternally
//        fun Equals(triangle: Triangle, toCompare: Triangle): Boolean = definedExternally
//        fun <O : Point> GetPoint(triangle: Triangle, position: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> GetPoints(triangle: Triangle, quantity: Number, stepRate: Number, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Point> InCenter(triangle: Triangle, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Triangle> Offset(triangle: O, x: Number, y: Number): O = definedExternally
//        fun Perimeter(triangle: Triangle): Number = definedExternally
//        fun <O : Point> Random(triangle: Triangle, out: O? = definedExternally /* null */): O = definedExternally
//        fun <O : Triangle> Rotate(triangle: O, angle: Number): O = definedExternally
//        fun <O : Triangle> RotateAroundPoint(triangle: O, point: Point, angle: Number): O = definedExternally
//        fun <O : Triangle> RotateAroundXY(triangle: O, x: Number, y: Number, angle: Number): O = definedExternally
//    }
//}
