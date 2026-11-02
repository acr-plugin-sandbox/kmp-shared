package com.example.shared

import android.os.Build

actual fun platformName(): String = "Android ${Build.VERSION.SDK_INT}"

actual fun currentTimeMillis(): Long = System.currentTimeMillis()
