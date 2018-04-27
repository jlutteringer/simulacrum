//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Geom.Intersects")]
//package Phaser.Geom.Intersects
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
//external fun CircleToCircle(circleA: Phaser.Geom.Circle, circleB: Phaser.Geom.Circle): Boolean = definedExternally
//external fun CircleToRectangle(circle: Phaser.Geom.Circle, rect: Phaser.Geom.Rectangle): Boolean = definedExternally
//external fun <O : Phaser.Geom.Rectangle> GetRectangleIntersection(rectA: Phaser.Geom.Rectangle, rectB: Phaser.Geom.Rectangle, output: O? = definedExternally /* null */): O = definedExternally
//external fun LineToCircle(line: Phaser.Geom.Line, circle: Phaser.Geom.Circle, nearest: Phaser.Geom.Point? = definedExternally /* null */): Boolean = definedExternally
//external fun LineToLine(line1: Phaser.Geom.Line, line2: Phaser.Geom.Line, out: Phaser.Geom.Point? = definedExternally /* null */): Boolean = definedExternally
//external fun LineToRectangle(line: Phaser.Geom.Line, rect: Any?): Boolean = definedExternally
//external fun LineToRectangle(line: Phaser.Geom.Line, rect: Phaser.Geom.Rectangle): Boolean = definedExternally
//external fun PointToLine(point: Phaser.Geom.Point, line: Phaser.Geom.Line): Boolean = definedExternally
//external fun PointToLineSegment(point: Phaser.Geom.Point, line: Phaser.Geom.Line): Boolean = definedExternally
//external fun RectangleToRectangle(rectA: Phaser.Geom.Rectangle, rectB: Phaser.Geom.Rectangle): Boolean = definedExternally
//external fun RectangleToTriangle(rect: Phaser.Geom.Rectangle, triangle: Phaser.Geom.Triangle): Boolean = definedExternally
//external fun RectangleToValues(rect: Phaser.Geom.Rectangle, left: Number, right: Number, top: Number, bottom: Number, tolerance: Number? = definedExternally /* null */): Boolean = definedExternally
//external fun TriangleToCircle(triangle: Phaser.Geom.Triangle, circle: Phaser.Geom.Circle): Boolean = definedExternally
//external fun TriangleToLine(triangle: Phaser.Geom.Triangle, line: Phaser.Geom.Line): Boolean = definedExternally
//external fun TriangleToTriangle(triangleA: Phaser.Geom.Triangle, triangleB: Phaser.Geom.Triangle): Boolean = definedExternally
