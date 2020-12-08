package com.example.kmmapp.shared


import platform.UIKit.UIDevice
import kotlinx.datetime.*

val instant = Clock.System.now()

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}