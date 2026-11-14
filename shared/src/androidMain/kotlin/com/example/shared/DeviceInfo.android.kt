package com.example.shared

import android.os.Build

actual fun deviceModel(): String = Build.MODEL
