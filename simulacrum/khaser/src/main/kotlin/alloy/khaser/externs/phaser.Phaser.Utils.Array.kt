//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Utils.Array")]
//package Phaser.Utils.Array
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
//external fun Add(array: Array<Any>, item: Any, limit: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Array<Any> = definedExternally
//external fun Add(array: Array<Any>, item: Array<Any>, limit: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Array<Any> = definedExternally
//external fun AddAt(array: Array<Any>, item: Any, index: Number? = definedExternally /* null */, limit: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Array<Any> = definedExternally
//external fun AddAt(array: Array<Any>, item: Array<Any>, index: Number? = definedExternally /* null */, limit: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Array<Any> = definedExternally
//external fun BringToTop(array: Array<Any>, item: Any): Any = definedExternally
//external fun CountAllMatching(array: Array<Any>, property: String, value: Any, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Number = definedExternally
//external fun Each(array: Array<Any>, callback: Function<*>, context: Any, vararg args: Any): Array<Any> = definedExternally
//external fun EachInRange(array: Array<Any>, callback: Function<*>, context: Any, startIndex: Number, endIndex: Number, vararg args: Any): Array<Any> = definedExternally
//external fun FindClosestInSorted(value: Number, array: Array<Any>, key: String? = definedExternally /* null */): dynamic /* Number | Any? */ = definedExternally
//external fun GetAll(array: Array<Any>, property: String? = definedExternally /* null */, value: Any? = definedExternally /* null */, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Array<Any> = definedExternally
//external fun GetFirst(array: Array<Any>, property: String? = definedExternally /* null */, value: Any? = definedExternally /* null */, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Any = definedExternally
//external fun GetRandom(array: Array<Any>, startIndex: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */): Any = definedExternally
//external fun MoveDown(array: Array<Any>, item: Any): Array<Any> = definedExternally
//external fun MoveTo(array: Array<Any>, item: Any, index: Number): Any = definedExternally
//external fun MoveUp(array: Array<Any>, item: Any): Array<Any> = definedExternally
//external fun NumberArray(start: Number, end: Number, prefix: String? = definedExternally /* null */, suffix: String? = definedExternally /* null */): dynamic /* Array<String> | Array<Number> */ = definedExternally
//external fun NumberArrayStep(start: Number? = definedExternally /* null */, end: Number? = definedExternally /* null */, step: Number? = definedExternally /* null */): Array<Number> = definedExternally
//external fun QuickSelect(arr: Array<Any>, k: Number, left: Number, right: Number, compare: Function<*>): Unit = definedExternally
//external fun Range(a: Array<Any>, b: Array<Any>, options: Any): Array<Any> = definedExternally
//external fun Remove(array: Array<Any>, item: Any, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): dynamic /* Any | Array<Any> */ = definedExternally
//external fun Remove(array: Array<Any>, item: Array<Any>, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): dynamic /* Any | Array<Any> */ = definedExternally
//external fun RemoveAt(array: Array<Any>, index: Number, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Any = definedExternally
//external fun RemoveBetween(array: Array<Any>, startIndex: Number, endIndex: Number, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Array<Any> = definedExternally
//external fun RemoveRandomElement(array: Array<Any>, start: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */): Any = definedExternally
//external fun Replace(oldChild: Any, newChild: Any): Boolean = definedExternally
//external fun RotateLeft(array: Array<Any>, total: Number? = definedExternally /* null */): Any = definedExternally
//external fun RotateRight(array: Array<Any>, total: Number? = definedExternally /* null */): Any = definedExternally
//external fun SafeRange(array: Array<Any>, startIndex: Number, endIndex: Number, throwError: Boolean? = definedExternally /* null */): Boolean = definedExternally
//external fun SendToBack(array: Array<Any>, item: Any): Any = definedExternally
//external fun SetAll(array: Array<Any>, property: String, value: Any, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Array<Any> = definedExternally
//external fun Shuffle(array: Array<Any>): Array<Any> = definedExternally
//external fun SpliceOne(array: Array<Any>, index: Number): Any = definedExternally
//external fun Swap(array: Array<Any>, item1: Any, item2: Any): Array<Any> = definedExternally
