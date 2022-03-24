package com.module6assignment.module6assignment

import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "HELLO MOTHER FALCON!"
        val wordCounter = WordCounter("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm")
        wordCounter.getDocAndWords()
    }
}