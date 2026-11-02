package com.example.shared

class SessionCountdown(private val expiresAtMillis: Long) {
    fun secondsLeft(): Long = maxOf(0L, (expiresAtMillis - currentTimeMillis()) / 1000)
}
