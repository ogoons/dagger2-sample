package com.ogoons.dagger2sample

import android.app.Application
import android.widget.Toast
import com.ogoons.dagger2sample.component.ApplicationComponent
import com.ogoons.dagger2sample.component.DaggerApplicationComponent
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.ApplicationModule
import javax.inject.Inject

class App : Application() {

    companion object {

        lateinit var component: ApplicationComponent

    }

    @Inject
    lateinit var vehicle: Vehicle

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build().apply {
                    inject(this@App)
                }

        vehicle.increaseSpeed(100)
        Toast.makeText(this, "Initialize vehicle speed : ${vehicle.speed} in app object", Toast.LENGTH_LONG).show()
    }

}