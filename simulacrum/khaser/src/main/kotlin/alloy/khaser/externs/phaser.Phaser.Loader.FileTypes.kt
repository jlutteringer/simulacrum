//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Loader.FileTypes")]
//package Phaser.Loader.FileTypes
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
//external fun AnimationJSONFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): JSONFile = definedExternally
//external fun AtlasJSONFile(key: String, textureURL: String, atlasURL: String, path: String, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): Any = definedExternally
//external open class AudioFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */, audioContext: AudioContext? = definedExternally /* null */) : Phaser.Loader.File {
//    open var context: AudioContext = definedExternally
//    override fun onProcess(callback: (file: Phaser.Loader.File) -> Unit): Unit = definedExternally
//}
//external open class BinaryFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external fun BitmapFontFile(key: String, textureURL: String, xmlURL: String, path: String, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, xmlXhrSettings: XHRSettingsObject? = definedExternally /* null */): Any = definedExternally
//external open class GLSLFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external open class HTML5AudioFile(key: String, url: String, path: String, config: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external open class HTMLFile(key: String, url: String, width: Number, height: Number, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external open class ImageFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */, config: Any? = definedExternally /* null */) : Phaser.Loader.File
//external open class JSONFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external open class PluginFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external open class ScriptFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external fun SpriteSheetFile(key: String, url: String, config: Any, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): Any = definedExternally
//external open class SVGFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external open class TextFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external open class TilemapCSVFile(key: String, url: String, path: String, format: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
//external fun TilemapJSONFile(key: String, url: String, path: String, format: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */): Any = definedExternally
//external fun UnityAtlasFile(key: String, textureURL: String, atlasURL: String, path: String, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): Any = definedExternally
//external open class XMLFile(key: String, url: String, path: String, xhrSettings: XHRSettingsObject? = definedExternally /* null */) : Phaser.Loader.File
