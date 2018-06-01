//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Cache")]
//package Phaser.Cache
//
//import alloy.khaser.externs.Game
//import kotlin.js.*
//
//external open class BaseCache {
//    open var entries: Phaser.Structs.Map<String, Any> = definedExternally
//    open var events: Phaser.Events.EventEmitter = definedExternally
//    open fun add(key: String, data: Any): BaseCache = definedExternally
//    open fun has(key: String): Boolean = definedExternally
//    open fun get(key: String): Any = definedExternally
//    open fun remove(key: String): BaseCache = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
//external interface `T$0` {
//    @nativeGetter
//    operator fun get(key: String): BaseCache?
//    @nativeSetter
//    operator fun set(key: String, value: BaseCache)
//}
//external open class CacheManager(game: Game) {
//    open var game: Game = definedExternally
//    open var binary: BaseCache = definedExternally
//    open var bitmapFont: BaseCache = definedExternally
//    open var json: BaseCache = definedExternally
//    open var physics: BaseCache = definedExternally
//    open var shader: BaseCache = definedExternally
//    open var audio: BaseCache = definedExternally
//    open var text: BaseCache = definedExternally
//    open var obj: BaseCache = definedExternally
//    open var tilemap: BaseCache = definedExternally
//    open var xml: BaseCache = definedExternally
//    open var custom: `T$0` = definedExternally
//    open fun addCustom(key: String): BaseCache = definedExternally
//    open fun destroy(): Unit = definedExternally
//}
