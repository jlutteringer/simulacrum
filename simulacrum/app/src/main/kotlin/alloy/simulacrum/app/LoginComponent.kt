package alloy.simulacrum.app

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

import react.dom.*

interface LoginProps: RProps {

}

data class GoogleUser(val profileObj: BasicProfile?, val authResponse: AuthResponse?, val tokenId: String)

data class AuthResponse(val id_token: String)

data class BasicProfile(val id: String, val name: String, val givenName: String, val email: String, val imageUrl: String, val familyName: String)

class LoginComponent : RComponent<LoginProps, RState>() {

    override fun RBuilder.render() {
        div {
            GoogleLogin {
                attrs {
                    clientId = "1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
                    buttonText = "Login"
                    onSuccess = {
                        googleUser: GoogleUser ->
                        // Useful data for your client-side scripts:
                        val profile = googleUser.profileObj
                        console.log("ID: ${profile?.id}") // Don't send this directly to your server!
                        console.log("Full Name: ${profile?.name}")
                        console.log("Given Name: ${profile?.givenName}")
                        console.log("Family Name: ${profile?.familyName}")
                        console.log("Image URL: ${profile?.imageUrl}")
                        console.log("Email: ${profile?.email}")

                        // The ID token you need to pass to your backend:
                        console.log("ID Token: ${googleUser.tokenId}")
                    }
                    onFailure = {}
                }
            }
        }
    }
}

fun RBuilder.loginComponent() = child(LoginComponent::class) {}