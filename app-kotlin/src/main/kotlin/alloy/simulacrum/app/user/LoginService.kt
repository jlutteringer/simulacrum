package alloy.simulacrum.app.user

import org.w3c.dom.set
import org.w3c.xhr.XMLHttpRequest
import kotlin.browser.window


data class GoogleUser(val profileObj: BasicProfile?, val authResponse: AuthResponse?, val tokenId: String)

data class AuthResponse(val id_token: String)

data class BasicProfile(val id: String, val name: String, val givenName: String, val email: String, val imageUrl: String, val familyName: String)

class LoginService {
    fun sendLogin(googleUser: GoogleUser) {
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

        // TODO save the ID token
        window.localStorage["tokenId"] = googleUser.tokenId


        // TODO convert to ajax? and reactify
        val xhr = XMLHttpRequest()
        xhr.open("GET", "http://localhost:8080/user", true)
        xhr.setRequestHeader("Content-Type", "application/json")
        xhr.setRequestHeader("Bearer", googleUser.tokenId)
        xhr.onreadystatechange = {
            if (xhr.status == 200.toShort()) {
                console.log(xhr)
            }
            else if (xhr.status != 200.toShort()) {
                console.log("Request failed.  Returned status of ${xhr.status}")
            }
        }
        xhr.send()
    }

    fun register(googleUser: GoogleUser) {
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
}