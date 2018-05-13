package alloy.simulacrum.app

import kotlinext.js.requireAll
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
//    requireAll(kotlinext.js.require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        app()
    }
}