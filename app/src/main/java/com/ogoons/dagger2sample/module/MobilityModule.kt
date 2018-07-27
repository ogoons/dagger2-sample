package com.ogoons.dagger2sample.module

import com.ogoons.dagger2sample.mobility.Motor
import com.ogoons.dagger2sample.mobility.Vehicle
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MobilityModule {

    @Provides
    fun provideMotor() = Motor()

    /**
     * 싱글톤으로 제공하는 객체는 싱글톤 컴포넌트에 modules로 등록해야한다.
     */
    @Singleton
    @Provides
    fun provideVehicle() = Vehicle(provideMotor())

}