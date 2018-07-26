package com.ogoons

import android.app.Application
import com.ogoons.dagger2sample.component.DaggerMobilityComponent
import com.ogoons.dagger2sample.component.MobilityComponent
import com.ogoons.dagger2sample.module.MobilityModule

class App : Application() {

    lateinit var component: MobilityComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerMobilityComponent.builder().mobilityModule(MobilityModule()).build()
    }
}