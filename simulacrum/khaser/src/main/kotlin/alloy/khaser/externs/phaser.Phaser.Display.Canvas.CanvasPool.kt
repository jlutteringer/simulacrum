@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Display.Canvas.CanvasPool")]
package Phaser.Display.Canvas.CanvasPool

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external fun create(parent: Any, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, canvasType: Number? = definedExternally /* null */): HTMLCanvasElement = definedExternally
external fun create2D(parent: Any, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): HTMLCanvasElement = definedExternally
external fun createWebGL(parent: Any, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): HTMLCanvasElement = definedExternally
external fun first(canvasType: Number? = definedExternally /* null */): HTMLCanvasElement = definedExternally
external fun remove(parent: Any): Unit = definedExternally
external fun total(): Number = definedExternally
external fun free(): Number = definedExternally
external fun disableSmoothing(): Unit = definedExternally
external fun enableSmoothing(): Unit = definedExternally
