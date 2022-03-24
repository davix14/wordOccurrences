package com.module6assignment.module6assignment

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.ListView

class HelloController {
    lateinit var button: Button

    @FXML
    lateinit var listView: ListView<String>

    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onButtonClick() {
        welcomeText.text = "Word Occurrences (Sorted by occurrence # from High to Low):"
        val wordCounter = WordCounter("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm")
        val displayList = wordCounter.getDocAndWords()
        for(item in displayList){
            listView.items.add(item)
        }
        listView.isVisible = true
        button.text = "Done!"
        button.isDisable = true
    }
}