package com.ogoons.dagger2sample.component

import android.content.Context
import com.ogoons.dagger2sample.App
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.ApplicationModule
import com.ogoons.dagger2sample.module.MobilityModule
import com.ogoons.dagger2sample.scope.ApplicationContext
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, MobilityModule::class))
interface ApplicationComponent {

    @ApplicationContext
    fun getContext(): Context

    // provision method (injection을 시킬 객체를 리턴)
    fun getVehicle(): Vehicle

    // member-injection method (멤버 파라미터로 의존성 주입을 시킬 객체를 넘김)
    fun inject(application: App)

}