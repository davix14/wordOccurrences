package com.module6assignment.module6assignment

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import org.kordamp.bootstrapfx.BootstrapFX

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("main-scene.fxml"))
        val scene = Scene(fxmlLoader.load(), 520.0, 440.0)
        scene.root.style = "-fx-font-family: 'serif'"
        scene.stylesheets.add(BootstrapFX.bootstrapFXStylesheet())
        stage.title = "Word Occurrences"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}