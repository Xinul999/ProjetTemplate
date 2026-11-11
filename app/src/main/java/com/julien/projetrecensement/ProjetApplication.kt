package com.julien.projetrecensement

import android.app.Application
import com.julien.projetrecensement.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class ProjetApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
           androidContext(this@ProjetApplication)
           modules(appModule)
        }
    }
}