package com.example.carbrowse.di

import com.example.carbrowse.car_browse.di.carModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(listOf(module,carModule))
    }
}