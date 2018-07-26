package com.ogoons.dagger2sample.module

import com.ogoons.dagger2sample.mobility.Motor
import com.ogoons.dagger2sample.mobility.Vehicle
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MobilityModule {

    @Singleton
    @Provides
    fun provideMotor() = Motor()

    @Singleton
    @Provides
    fun provideVehicle() = Vehicle(provideMotor())

}