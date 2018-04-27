//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Scenes.Settings")]
//package Phaser.Scenes.Settings
//
//import alloy.khaser.externs.Scene
//import kotlin.js.*
//
//external interface `T$4` {
//    @nativeGetter
//    operator fun get(key: String): String?
//    @nativeSetter
//    operator fun set(key: String, value: String)
//}
//external interface Config {
//    var key: String? get() = definedExternally; set(value) = definedExternally
//    var active: Boolean? get() = definedExternally; set(value) = definedExternally
//    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
//    var files: dynamic /* Boolean | Array<LoaderFileObject> */ get() = definedExternally; set(value) = definedExternally
//    var cameras: dynamic /* InputJSONCameraObject | Array<InputJSONCameraObject> */ get() = definedExternally; set(value) = definedExternally
//    var map: `T$4`? get() = definedExternally; set(value) = definedExternally
//    var mapAdd: `T$4`? get() = definedExternally; set(value) = definedExternally
//    var physics: Any? get() = definedExternally; set(value) = definedExternally
//    var loader: Any? get() = definedExternally; set(value) = definedExternally
//    var plugins: dynamic /* Boolean | Any */ get() = definedExternally; set(value) = definedExternally
//}
//external interface Object {
//    var status: Number
//    var key: String
//    var active: Boolean
//    var visible: Boolean
//    var isBooted: Boolean
//    var isTransition: Boolean
//    var transitionFrom: Scene
//    var transitionDuration: Number
//    var transitionAllowInput: Boolean
//    var data: Any
//    var files: dynamic /* Boolean | Array<LoaderFileObject> */
//    var cameras: dynamic /* InputJSONCameraObject | Array<InputJSONCameraObject> */
//    var map: `T$4`
//    var physics: Any
//    var loader: Any
//    var plugins: dynamic /* Boolean | Any */
//}
//external fun create(config: String): Phaser.Scenes.Settings.Object = definedExternally
//external fun create(config: Phaser.Scenes.Settings.Config): Phaser.Scenes.Settings.Object = definedExternally
