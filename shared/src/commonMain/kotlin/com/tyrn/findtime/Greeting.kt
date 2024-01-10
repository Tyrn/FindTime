package com.tyrn.findtime

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello Kitty, ${platform.name}!"
    }
}