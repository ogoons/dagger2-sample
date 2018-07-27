package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.ActivityModule
import dagger.Component

@Component(
        modules = arrayOf(ActivityModule::class)
)
interface ActivityComponent {

    fun getVehicle(): Vehicle

}