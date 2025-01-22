package com.example.carbrowse

import android.app.Application
import com.example.carbrowse.di.initKoin
import org.koin.android.ext.koin.androidContext

class CarBrowseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@CarBrowseApplication)
        }
    }
}