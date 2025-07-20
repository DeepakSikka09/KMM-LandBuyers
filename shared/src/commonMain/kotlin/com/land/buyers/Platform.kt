package com.land.buyers

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform