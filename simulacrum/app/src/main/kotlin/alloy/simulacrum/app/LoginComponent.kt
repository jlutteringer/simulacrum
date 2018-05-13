package alloy.simulacrum.app

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

import react.*
import react.dom.*

external interface GoogleLoginProps: RProps {
    var clientId: String
    var buttonText: String?
    var onSuccess: Any
    var onFailure: Any
}

@JsModule("react-google-login")
external val GoogleLogin: RClass<GoogleLoginProps>

interface LoginProps: RProps {

}

data class GoogleUser(val basicProfile: BasicProfile?, val authResponse: AuthResponse?)

data class AuthResponse(val id_token: String)

data class BasicProfile(val id: String, val name: String, val givenName: String, val email: String, val imageUrl: String, val familyName: String)

class LoginComponent : RComponent<LoginProps, RState>() {

//    private val onSignOn = {
//        googleUser: GoogleUser ->
//            // Useful data for your client-side scripts:
//            val profile = googleUser.basicProfile
//            console.log("ID: ${profile?.id}") // Don't send this directly to your server!
//            console.log("Full Name: ${profile?.name}")
//            console.log("Given Name: ${profile?.givenName}")
//            console.log("Family Name: ${profile?.familyName}")
//            console.log("Image URL: ${profile?.imageUrl}")
//            console.log("Email: ${profile?.email}")
//
//            // The ID token you need to pass to your backend:
//            val id_token = googleUser.authResponse?.id_token
//            console.log("ID Token: $id_token")
//    }

    override fun RBuilder.render() {
        div {
            GoogleLogin {
                attrs {
                    clientId = "1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
                    buttonText="Login"
                    onSuccess={

                    }
                    onFailure={

                    }
                }
            }
        }

//
//        div {
//            div (classes="g-signin2") {
//                attrs["data-onsuccess"] = "onSignIn"
//                attrs["data-theme"] = "dark"
//            }
//        }
    }
}

fun RBuilder.loginComponent() = child(LoginComponent::class) {}