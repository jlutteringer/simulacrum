@file:JsModule("react-redux")
package alloy.simulacrum.app.wrappers

import alloy.simulacrum.app.user.LoginComponent
import react.RBuilder
import react.RClass
import react.RProps

external interface ProviderProps: RProps {
    var store: Any
}

external val Provider: RClass<ProviderProps>
