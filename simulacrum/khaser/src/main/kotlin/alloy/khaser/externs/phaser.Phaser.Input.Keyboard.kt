//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:[JsModule("phaser") JsQualifier("Input.Keyboard")]
//package Phaser.Input.Keyboard
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
//external open class KeyCombo {
//    constructor(keyboardManager: KeyboardManager, keys: String, config: KeyComboConfig? = definedExternally /* null */)
//    constructor(keyboardManager: KeyboardManager, keys: Array<Number>, config: KeyComboConfig? = definedExternally /* null */)
//    constructor(keyboardManager: KeyboardManager, keys: Array<Any?>, config: KeyComboConfig? = definedExternally /* null */)
//    open var manager: KeyboardManager = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var keyCodes: Array<Any> = definedExternally
//    open var current: Number = definedExternally
//    open var index: Number = definedExternally
//    open var size: Number = definedExternally
//    open var timeLastMatched: Number = definedExternally
//    open var matched: Boolean = definedExternally
//    open var timeMatched: Number = definedExternally
//    open var resetOnWrongKey: Boolean = definedExternally
//    open var maxKeyDelay: Number = definedExternally
//    open var resetOnMatch: Boolean = definedExternally
//    open var deleteOnMatch: Boolean = definedExternally
//    open var onKeyDown: (event: KeyboardEvent) -> Unit = definedExternally
//    open var progress: Number = definedExternally
//    open fun destroy(): Unit = definedExternally
//    companion object {
//        fun AdvanceKeyCombo(event: KeyboardEvent, combo: KeyCombo): Boolean = definedExternally
//        fun ProcessKeyCombo(event: KeyboardEvent, combo: KeyCombo): Boolean = definedExternally
//        fun ResetKeyCombo(combo: KeyCombo): KeyCombo = definedExternally
//    }
//}
//external open class KeyboardManager(inputManager: Phaser.Input.InputManager) : Phaser.Events.EventEmitter {
//    open var manager: Phaser.Input.InputManager = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var target: Any = definedExternally
//    open var keys: Array<Key> = definedExternally
//    open var combos: Array<KeyCombo> = definedExternally
//    open var captures: Array<Any> = definedExternally
//    open var queue: Array<KeyboardEvent> = definedExternally
//    open var handler: () -> Unit = definedExternally
//    open fun boot(): Unit = definedExternally
//    open fun startListeners(): Unit = definedExternally
//    open fun stopListeners(): Unit = definedExternally
//    open fun createCursorKeys(): CursorKeys = definedExternally
//    open fun addKeys(keys: Any): Any = definedExternally
//    open fun addKey(keyCode: String): Key = definedExternally
//    open fun addKey(keyCode: Number): Key = definedExternally
//    open fun removeKey(keyCode: String): Unit = definedExternally
//    open fun removeKey(keyCode: Number): Unit = definedExternally
//    open fun addKeyCapture(keyCodes: String): Unit = definedExternally
//    open fun addKeyCapture(keyCodes: Number): Unit = definedExternally
//    open fun addKeyCapture(keyCodes: Array<String>): Unit = definedExternally
//    open fun addKeyCapture(keyCodes: Array<Number>): Unit = definedExternally
//    open fun removeKeyCapture(keyCodes: String): Unit = definedExternally
//    open fun removeKeyCapture(keyCodes: Number): Unit = definedExternally
//    open fun removeKeyCapture(keyCodes: Array<String>): Unit = definedExternally
//    open fun removeKeyCapture(keyCodes: Array<Number>): Unit = definedExternally
//    open fun createCombo(keys: String, config: KeyComboConfig): KeyCombo = definedExternally
//    open fun createCombo(keys: Array<Number>, config: KeyComboConfig): KeyCombo = definedExternally
//    open fun createCombo(keys: Array<Any?>, config: KeyComboConfig): KeyCombo = definedExternally
//    open fun update(): Unit = definedExternally
//    override fun shutdown(): Unit = definedExternally
//    override fun destroy(): Unit = definedExternally
//}
//external fun DownDuration(key: Key, duration: Number? = definedExternally /* null */): Boolean = definedExternally
//external fun JustDown(key: Key): Boolean = definedExternally
//external fun JustUp(key: Key): Boolean = definedExternally
//external open class Key(keyCode: Number) {
//    open var keyCode: Number = definedExternally
//    open var originalEvent: KeyboardEvent = definedExternally
//    open var preventDefault: Boolean = definedExternally
//    open var enabled: Boolean = definedExternally
//    open var isDown: Boolean = definedExternally
//    open var isUp: Boolean = definedExternally
//    open var altKey: Boolean = definedExternally
//    open var ctrlKey: Boolean = definedExternally
//    open var shiftKey: Boolean = definedExternally
//    open var location: Number = definedExternally
//    open var timeDown: Number = definedExternally
//    open var duration: Number = definedExternally
//    open var timeUp: Number = definedExternally
//    open var repeats: Number = definedExternally
//    companion object {
//        fun reset(): Key = definedExternally
//    }
//}
//external enum class KeyCodes {
//    BACKSPACE,
//    TAB,
//    ENTER,
//    SHIFT,
//    CTRL,
//    ALT,
//    PAUSE,
//    CAPS_LOCK,
//    ESC,
//    SPACE,
//    PAGE_UP,
//    PAGE_DOWN,
//    END,
//    HOME,
//    LEFT,
//    UP,
//    RIGHT,
//    DOWN,
//    PRINT_SCREEN,
//    INSERT,
//    DELETE,
//    ZERO,
//    ONE,
//    TWO,
//    THREE,
//    FOUR,
//    FIVE,
//    SIX,
//    SEVEN,
//    EIGHT,
//    NINE,
//    A,
//    B,
//    C,
//    D,
//    E,
//    F,
//    G,
//    H,
//    I,
//    J,
//    K,
//    L,
//    M,
//    N,
//    O,
//    P,
//    Q,
//    R,
//    S,
//    T,
//    U,
//    V,
//    W,
//    X,
//    Y,
//    Z,
//    F1,
//    F2,
//    F3,
//    F4,
//    F5,
//    F6,
//    F7,
//    F8,
//    F9,
//    F10,
//    F11,
//    F12,
//    SEMICOLON,
//    PLUS,
//    COMMA,
//    MINUS,
//    PERIOD,
//    FORWARD_SLASH,
//    BACK_SLASH,
//    QUOTES,
//    BACKTICK,
//    OPEN_BRACKET,
//    CLOSED_BRACKET
//}
//external fun ProcessKeyDown(key: Key, event: KeyboardEvent): Key = definedExternally
//external fun ProcessKeyUp(key: Key, event: KeyboardEvent): Key = definedExternally
//external fun UpDuration(key: Key, duration: Number? = definedExternally /* null */): Boolean = definedExternally
