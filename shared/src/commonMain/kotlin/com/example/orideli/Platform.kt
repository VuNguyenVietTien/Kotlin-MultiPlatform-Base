package com.example.orideli

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform