package com.example.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class GreetingTest {
    @Test
    fun mentionsThePlatform() {
        assertTrue(Greeting().greet().startsWith("Hello from "))
    }
}
