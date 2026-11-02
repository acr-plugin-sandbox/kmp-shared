package com.example.shared

class Greeting {
    fun greet(name: String? = null): String =
        if (name == null) "Hello from ${platformName()}" else "Hello $name, from ${platformName()}"
}
