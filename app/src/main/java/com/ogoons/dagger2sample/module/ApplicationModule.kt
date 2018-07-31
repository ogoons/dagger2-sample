package com.ogoons.dagger2sample.module

import android.content.Context
import com.ogoons.dagger2sample.mobility.Motor
import com.ogoons.dagger2sample.mobility.Vehicle
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule constructor(private val applicationContext: Context) {

    @Provides
    @Singleton
    internal fun provideApplicationContext(): Context = applicationContext

    @Provides
    @Singleton
    fun provideVehicle() = Vehicle(Motor())

}