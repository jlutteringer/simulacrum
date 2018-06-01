//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Actions")]
//package Phaser.Actions
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
//external fun <G : Array<Phaser.GameObjects.GameObject>> Angle(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> Call(items: G, callback: (item: Phaser.GameObjects.GameObject) -> Unit, context: Any): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> GetFirst(items: G, compare: Any, index: Number? = definedExternally /* null */): dynamic /* Any? | Phaser.GameObjects.GameObject */ = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> GetLast(items: G, compare: Any, index: Number? = definedExternally /* null */): dynamic /* Any? | Phaser.GameObjects.GameObject */ = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> GridAlign(items: G, options: GridAlignConfig): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> IncAlpha(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> IncX(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> IncXY(items: G, x: Number, y: Number? = definedExternally /* null */, stepX: Number? = definedExternally /* null */, stepY: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> IncY(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PlaceOnCircle(items: G, circle: Phaser.Geom.Circle, startAngle: Number? = definedExternally /* null */, endAngle: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PlaceOnEllipse(items: G, ellipse: Phaser.Geom.Ellipse, startAngle: Number? = definedExternally /* null */, endAngle: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PlaceOnLine(items: G, line: Phaser.Geom.Line): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PlaceOnRectangle(items: G, rect: Phaser.Geom.Rectangle, shift: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PlaceOnTriangle(items: G, triangle: Phaser.Geom.Triangle, stepRate: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PlayAnimation(items: G, key: String, startFrame: String? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PlayAnimation(items: G, key: String, startFrame: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PropertyValueInc(items: G, key: String, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PropertyValueSet(items: G, key: String, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> RandomCircle(items: G, circle: Phaser.Geom.Circle): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> RandomEllipse(items: G, ellipse: Phaser.Geom.Ellipse): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> RandomLine(items: G, line: Phaser.Geom.Line): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> RandomRectangle(items: G, rect: Phaser.Geom.Rectangle): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> RandomTriangle(items: G, triangle: Phaser.Geom.Triangle): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> Rotate(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> RotateAround(items: G, point: Any, angle: Number): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> RotateAroundDistance(items: G, point: Any, angle: Number, distance: Number): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> ScaleX(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> ScaleXY(items: G, scaleX: Number, scaleY: Number? = definedExternally /* null */, stepX: Number? = definedExternally /* null */, stepY: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> ScaleY(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetAlpha(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetBlendMode(items: G, value: Number, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetDepth(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetHitArea(items: G, hitArea: Any, hitAreaCallback: (hitArea: Any, x: Number, y: Number, gameObject: Phaser.GameObjects.GameObject) -> Unit): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetOrigin(items: G, originX: Number, originY: Number? = definedExternally /* null */, stepX: Number? = definedExternally /* null */, stepY: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetRotation(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetScale(items: G, scaleX: Number, scaleY: Number? = definedExternally /* null */, stepX: Number? = definedExternally /* null */, stepY: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetScaleX(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetScaleY(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetTint(items: G, topLeft: Number, topRight: Number? = definedExternally /* null */, bottomLeft: Number? = definedExternally /* null */, bottomRight: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetVisible(items: G, value: Boolean, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetX(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetXY(items: G, x: Number, y: Number? = definedExternally /* null */, stepX: Number? = definedExternally /* null */, stepY: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SetY(items: G, value: Number, step: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */, direction: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>, O : Phaser.Math.Vector2> ShiftPosition(items: G, x: Number, y: Number, direction: Number? = definedExternally /* null */, output: O? = definedExternally /* null */): O = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> Shuffle(items: G): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SmootherStep(items: G, property: String, min: Number, max: Number, inc: Number): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> SmoothStep(items: G, property: String, min: Number, max: Number, inc: Number): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> Spread(items: G, property: String, min: Number, max: Number, inc: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> ToggleVisible(items: G): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> WrapInRectangle(items: G, rect: Phaser.Geom.Rectangle, padding: Number? = definedExternally /* null */): G = definedExternally
//external fun <G : Array<Phaser.GameObjects.GameObject>> PlayAnimation(items: G, key: String): G = definedExternally
