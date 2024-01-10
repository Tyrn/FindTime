package com.tyrn.findtime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform