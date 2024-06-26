package com.ab

import com.ab.di.mainModule
import com.ab.plugins.*
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)

    // EngieMain.main will trigger the application module
}

fun Application.module() {
    // Feature needed in server we added here

    install(Koin) {
        modules(mainModule)
    }

    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
    configureRouting()
}
