package alloy.simulacrum.app

//import alloy.khaser.Khaser
//import alloy.khaser.externs.*
//import react.RProps
//import react.createElement
//import react.dom.h1
//import react.dom.render
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.browser.document

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        loginComponent()
    }

//    val preload = fun PreloadContext.() {
//        this.load.setBaseUrl("http://labs.phaser.io")
//
//        this.load.image("sky", "assets/skies/space3.png")
//        this.load.image("logo", "assets/sprites/phaser3-logo.png")
//        this.load.image("red", "assets/particles/red.png")
//    }
//
//    val addBlend = BlendModes.ADD
//
//    val create = fun dynamic.() {
//        this.add.image(400, 300, "sky")
//
//        val particles = this.add.particles("red")
//
//
//        val emitterConfig = EmitterConfig(
//                speed = 100,
//                scale = null,
//                blendMode = addBlend
//        )
//
//        val emitter = particles.createEmitter(emitterConfig)
//
//        val logo = this.physics.add.image(400, 100, "logo")
//
//        logo.setVelocity(100, 200)
//        logo.setBounce(1, 1)
//        logo.setCollideWorldBounds(true)
//
//        emitter.startFollow(logo)
//    }
//
//    val config = GameConfig(
//            width = 800,
//            height = 600,
//            physics = PhysicsConfig(
//                    default = "arcade",
//                    arcade = ArcadeConfig(
//                            gravity = GravityConfig(
//                                    y = 200
//                            )
//                    )
//            ),
//            scene = SceneConfig(
//                    preload = preload,
//                    create = create
//            )
//    )
//
//    val game = Game(config)
}

fun RBuilder.app() = child(App::class) {}