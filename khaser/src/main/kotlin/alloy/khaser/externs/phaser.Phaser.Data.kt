//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Data")]
//package Phaser.Data
//
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//import kotlin.js.Json
//
//external open class DataManager(parent: Any, eventEmitter: Phaser.Events.EventEmitter) {
//    open var parent: Any = definedExternally
//    open var events: Phaser.Events.EventEmitter = definedExternally
//    open var list: Json = definedExternally
//    open var blockSet: Boolean = definedExternally
//    open fun get(key: String): Any = definedExternally
//    open fun getAll(): Json = definedExternally
//    open fun query(search: String): Json = definedExternally
//    open fun set(key: String, data: Any): DataManager = definedExternally
//    open fun each(callback: (parent: Any, key: String, value: Any, args: Any) -> Unit, scope: Any? = definedExternally /* null */, vararg args: Any): DataManager = definedExternally
//    open fun merge(data: Json, overwrite: Boolean): DataManager = definedExternally
//    open fun remove(key: String): DataManager = definedExternally
//    open fun pop(key: String): Any = definedExternally
//    open fun has(key: String): Boolean = definedExternally
//    open fun setFreeze(value: Boolean): DataManager = definedExternally
//    open fun reset(): DataManager = definedExternally
//    open fun destroy(): Unit = definedExternally
//    open var freeze: Boolean = definedExternally
//    open var count: Number = definedExternally
//}
//external open class DataManagerPlugin(scene: Scene) : DataManager {
//    open var scene: Scene = definedExternally
//    open var systems: Phaser.Scenes.Systems = definedExternally
//    override fun destroy(): Unit = definedExternally
//}
