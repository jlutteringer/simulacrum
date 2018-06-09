@file:JsModule("react-google-login")
package alloy.simulacrum.app.wrappers

import alloy.simulacrum.app.user.GoogleUser
import org.w3c.dom.events.Event
import react.*

external interface GoogleLoginProps: RProps {
    var clientId: String
    var buttonText: String?
    var onSuccess: (GoogleUser) -> Unit
    var onFailure: (Event) -> Unit
}

external val GoogleLogin: RClass<GoogleLoginProps>
