package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.MobilityModule
import com.ogoons.dagger2sample.view.MainActivity
import com.ogoons.dagger2sample.view.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
        modules = arrayOf(MobilityModule::class))
interface MobilityComponent {

    fun getVehicle(): Vehicle

}