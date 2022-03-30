package com.module6assignment.module6assignment

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class WordCounterTest {
    lateinit var instance: WordCounter

    @BeforeEach
    fun setUp() {
        instance = WordCounter("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm")
    }

    @Test
    fun getDocAndWords() {
        val result = instance.getDocAndWords()

        assert(result.isNotEmpty())

        assert(result[0] == "Word: the\t\t\t\t Occurrences: 56")
    }
}