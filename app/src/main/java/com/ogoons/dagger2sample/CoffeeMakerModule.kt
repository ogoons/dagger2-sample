package com.ogoons.dagger2sample

import dagger.Module
import dagger.Provides

/**
 * Created by charles on 2018. 4. 26..
 */

@Module
class CoffeeMakerModule {

    @Provides
    fun proivideHeater(): Heater {
        return AHeater()
    }

    @Provides
    fun providePump(heater: Heater): Pump {
        return APump(heater)
    }

}