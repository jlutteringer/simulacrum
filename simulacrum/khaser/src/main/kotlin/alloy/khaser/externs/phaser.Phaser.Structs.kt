//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Structs")]
//package Phaser.Structs
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
//external open class List<T>(parent: Any) {
//    open var parent: Any = definedExternally
//    open var list: Array<T> = definedExternally
//    open var position: Number = definedExternally
//    open var addCallback: Function<*> = definedExternally
//    open var removeCallback: Function<*> = definedExternally
//    open var _sortKey: String = definedExternally
//    open fun add(child: T, skipCallback: Boolean? = definedExternally /* null */): T = definedExternally
//    open fun addAt(child: T, index: Number? = definedExternally /* null */, skipCallback: Boolean? = definedExternally /* null */): T = definedExternally
//    open fun getAt(index: Number): T = definedExternally
//    open fun getIndex(child: T): Number = definedExternally
//    open fun sort(property: String): Array<T> = definedExternally
//    open fun getByName(name: String): T? = definedExternally
//    open fun getRandom(startIndex: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */): T? = definedExternally
//    open fun getFirst(property: String, value: T, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): T? = definedExternally
//    open fun getAll(property: String? = definedExternally /* null */, value: T? = definedExternally /* null */, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Array<T> = definedExternally
//    open fun count(property: String, value: T): Number = definedExternally
//    open fun swap(child1: T, child2: T): Unit = definedExternally
//    open fun moveTo(child: T, index: Number): T = definedExternally
//    open fun remove(child: T, skipCallback: Boolean? = definedExternally /* null */): T = definedExternally
//    open fun removeAt(index: Number, skipCallback: Boolean? = definedExternally /* null */): T = definedExternally
//    open fun removeBetween(startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */, skipCallback: Boolean? = definedExternally /* null */): Array<T> = definedExternally
//    open fun removeAll(skipCallback: Boolean? = definedExternally /* null */): List<T> = definedExternally
//    open fun bringToTop(child: T): T = definedExternally
//    open fun sendToBack(child: T): T = definedExternally
//    open fun moveUp(child: T): T = definedExternally
//    open fun moveDown(child: T): T = definedExternally
//    open fun reverse(): List<T> = definedExternally
//    open fun shuffle(): List<T> = definedExternally
//    open fun replace(oldChild: T, newChild: T): T = definedExternally
//    open fun exists(child: T): Boolean = definedExternally
//    open fun setAll(property: String, value: T, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun each(callback: (item: Any, args: Any) -> Unit, thisArg: Any? = definedExternally /* null */, vararg args: Any): Unit = definedExternally
//    open fun shutdown(): Unit = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open var length: Number = definedExternally
//    open var first: Number = definedExternally
//    open var last: Number = definedExternally
//    open var next: Number = definedExternally
//    open var previous: Number = definedExternally
//}
//external interface `T$6` {
//    @nativeGetter
//    operator fun get(key: String): V?
//    @nativeSetter
//    operator fun set(key: String, value: V)
//}
//external open class Map<K, V>(elements: Array<V>) {
//    open var entries: `T$6` = definedExternally
//    open var size: Number = definedExternally
//    open fun set(key: K, value: V): Map<K, V> = definedExternally
//    open fun get(key: K): V = definedExternally
//    open fun getArray(): Array<V> = definedExternally
//    open fun has(key: K): Boolean = definedExternally
//    open fun delete(key: K): Map<K, V> = definedExternally
//    open fun clear(): Map<K, V> = definedExternally
//    open fun keys(): Array<K> = definedExternally
//    open fun values(): Array<V> = definedExternally
//    open fun dump(): Unit = definedExternally
//    open fun each(callback: (key: String, entry: Any) -> Unit): Map<K, V> = definedExternally
//    open fun contains(value: V): Boolean = definedExternally
//    open fun merge(map: Map<K, V>, override: Boolean? = definedExternally /* null */): Map<K, V> = definedExternally
//}
//external open class ProcessQueue<T> {
//    open fun add(item: T): ProcessQueue<T> = definedExternally
//    open fun remove(item: T): ProcessQueue<T> = definedExternally
//    open fun update(): Array<T> = definedExternally
//    open fun getActive(): Array<T> = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external open class RTree
//external open class Set<T>(elements: Array<T>? = definedExternally /* null */) {
//    open var entries: Array<T> = definedExternally
//    open fun set(value: T): Set<T> = definedExternally
//    open fun get(property: String, value: T): T = definedExternally
//    open fun getArray(): Array<T> = definedExternally
//    open fun delete(value: T): Set<T> = definedExternally
//    open fun dump(): Unit = definedExternally
//    open fun each(callback: (entry: Any, index: Number) -> Unit, callbackScope: Any): Set<T> = definedExternally
//    open fun iterate(callback: (entry: Any, index: Number) -> Unit, callbackScope: Any): Set<T> = definedExternally
//    open fun iterateLocal(callbackKey: String, vararg args: Any): Set<T> = definedExternally
//    open fun clear(): Set<T> = definedExternally
//    open fun contains(value: T): Boolean = definedExternally
//    open fun union(set: Set<T>): Set<T> = definedExternally
//    open fun intersect(set: Set<T>): Set<T> = definedExternally
//    open fun difference(set: Set<T>): Set<T> = definedExternally
//    open var size: Number = definedExternally
//}
