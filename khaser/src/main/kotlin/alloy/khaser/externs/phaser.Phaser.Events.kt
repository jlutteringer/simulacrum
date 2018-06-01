@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Events")]
package Phaser.Events

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

external open class EventEmitter {
    open fun shutdown(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun eventNames(): Array<Any> = definedExternally
    open fun listeners(event: String): Array<Any> = definedExternally
    open fun listeners(event: Any?): Array<Any> = definedExternally
    open fun listenerCount(event: String): Number = definedExternally
    open fun listenerCount(event: Any?): Number = definedExternally
    open fun emit(event: String, vararg args: Any): Boolean = definedExternally
    open fun emit(event: Any?, vararg args: Any): Boolean = definedExternally
    open fun on(event: String, fn: Function<*>, context: Any? = definedExternally /* null */): EventEmitter = definedExternally
    open fun on(event: Any?, fn: Function<*>, context: Any? = definedExternally /* null */): EventEmitter = definedExternally
    open fun addListener(event: String, fn: Function<*>, context: Any? = definedExternally /* null */): EventEmitter = definedExternally
    open fun addListener(event: Any?, fn: Function<*>, context: Any? = definedExternally /* null */): EventEmitter = definedExternally
    open fun once(event: String, fn: Function<*>, context: Any? = definedExternally /* null */): EventEmitter = definedExternally
    open fun once(event: Any?, fn: Function<*>, context: Any? = definedExternally /* null */): EventEmitter = definedExternally
    open fun removeListener(event: String, fn: Function<*>, context: Any, once: Boolean): EventEmitter = definedExternally
    open fun removeListener(event: Any?, fn: Function<*>, context: Any, once: Boolean): EventEmitter = definedExternally
    open fun off(event: String, fn: Function<*>, context: Any, once: Boolean): EventEmitter = definedExternally
    open fun off(event: Any?, fn: Function<*>, context: Any, once: Boolean): EventEmitter = definedExternally
    open fun removeAllListeners(event: String? = definedExternally /* null */): EventEmitter = definedExternally
    open fun removeAllListeners(event: Any? = definedExternally /* null */): EventEmitter = definedExternally
    open fun removeAllListeners(): EventEmitter = definedExternally
}
