//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Display")]
//package Phaser.Display
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
//external open class Color(red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, alpha: Number? = definedExternally /* null */) {
//    open var gl: Array<Number> = definedExternally
//    open fun transparent(): Color = definedExternally
//    open fun setTo(red: Number, green: Number, blue: Number, alpha: Number? = definedExternally /* null */): Color = definedExternally
//    open fun setGLTo(red: Number, green: Number, blue: Number, alpha: Number? = definedExternally /* null */): Color = definedExternally
//    open fun setFromRGB(color: InputColorObject): Color = definedExternally
//    open fun update(): Color = definedExternally
//    open fun clone(): Color = definedExternally
//    open var color: Number = definedExternally
//    open var color32: Number = definedExternally
//    open var rgba: String = definedExternally
//    open var redGL: Number = definedExternally
//    open var greenGL: Number = definedExternally
//    open var blueGL: Number = definedExternally
//    open var alphaGL: Number = definedExternally
//    open var red: Number = definedExternally
//    open var green: Number = definedExternally
//    open var blue: Number = definedExternally
//    open var alpha: Number = definedExternally
//    companion object {
//        fun ColorToRGBA(color: Number): () -> Unit = definedExternally
//        fun ComponentToHex(color: Number): String = definedExternally
//        fun GetColor(red: Number, green: Number, blue: Number): Number = definedExternally
//        fun GetColor32(red: Number, green: Number, blue: Number, alpha: Number): Number = definedExternally
//        fun HexStringToColor(hex: String): Color = definedExternally
//        fun HSLToColor(h: Number, s: Number, l: Number): Color = definedExternally
//        fun HSVColorWheel(s: Number? = definedExternally /* null */, v: Number? = definedExternally /* null */): Array<Any> = definedExternally
//        fun HSVToRGB(h: Number, s: Number, v: Number): () -> Unit = definedExternally
//        fun HueToComponent(p: Number, q: Number, t: Number): Number = definedExternally
//        fun IntegerToColor(input: Number): Color = definedExternally
//        fun IntegerToRGB(input: Number): () -> Unit = definedExternally
//        fun ObjectToColor(input: InputColorObject): Color = definedExternally
//        fun RandomRGB(min: Number? = definedExternally /* null */, max: Number? = definedExternally /* null */): Color = definedExternally
//        fun RGBStringToColor(rgb: String): Color = definedExternally
//        fun RGBToHSV(r: Number, g: Number, b: Number): HSLColorObject = definedExternally
//        fun RGBToString(r: Number, g: Number, b: Number, a: Number? = definedExternally /* null */, prefix: String? = definedExternally /* null */): String = definedExternally
//        fun ValueToColor(input: String): Color = definedExternally
//        fun ValueToColor(input: Number): Color = definedExternally
//        fun ValueToColor(input: InputColorObject): Color = definedExternally
//    }
//}
