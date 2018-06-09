package alloy.simulacrum.app.user

import alloy.simulacrum.app.wrappers.GoogleLogin
import alloy.simulacrum.app.wrappers.GoogleLoginComponent
import org.w3c.dom.set
import org.w3c.xhr.XMLHttpRequest
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

import react.dom.*
import kotlin.browser.window

interface LoginProps: RProps {

}

class LoginComponent : RComponent<LoginProps, RState>() {

    override fun RBuilder.render() {
        div {
            GoogleLogin {
                attrs {
                    clientId = "1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
                    buttonText = "Login"
                    onSuccess = {
                        googleUser: GoogleUser ->
                            LoginService().sendLogin(googleUser)
                    }
                    onFailure = {}
                }
            }
        }
    }
}

class RegisterComponent : RComponent<LoginProps, RState>() {

    override fun RBuilder.render() {
        div {
            GoogleLogin {
                attrs {
                    clientId = "1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
                    buttonText = "Register"
                    onSuccess = {
                        googleUser: GoogleUser ->
                        // Useful data for your client-side scripts:
                        val profile = googleUser.profileObj!!
                        console.log(googleUser)

                        // The ID token you need to pass to your backend:
                        console.log("ID Token: ${googleUser.tokenId}")

                        val user = UserDTO(profile.email, profile.givenName, profile.familyName, profile.email)

                        // TODO convert to ajax? and reactify
                        val xhr = XMLHttpRequest()
                        xhr.open("POST", "http://localhost:8080/user/register", true)
                        xhr.setRequestHeader("Content-Type", "application/json")
                        xhr.onreadystatechange = {
                            if (xhr.status == 200.toShort()) {
                                console.log("Registered!")
                            }
                            else if (xhr.status != 200.toShort()) {
                                console.log("Request failed.  Returned status of ${xhr.status}")
                            }
                        }
                        xhr.send(JSON.stringify(user))
                    }
                    // TODO what to do on failure?
                    onFailure = {}
                }
            }
        }
    }
}

// TODO use a shared object!
data class UserDTO(val username: String, val firstName: String, val lastName: String, val email: String)

fun RBuilder.loginComponent() = child(LoginComponent::class) {}
fun RBuilder.registerComponent() = child(RegisterComponent::class) {}