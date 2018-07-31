package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.MobilityModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component( // Subcomponent는 Builder 인터페이스가 정의되어야만 @Component에서 생성이 된다.
        modules = arrayOf(MobilityModule::class))
interface MobilityComponent {

    fun getVehicle(): Vehicle

//    @Subcomponent.Builder
//    interface Builder {
//        fun build(): MobilityComponent
//    }

}