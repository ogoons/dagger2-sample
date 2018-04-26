package com.ogoons.dagger2sample

/**
 * Created by charles on 2018. 4. 26..
 */
class APump(
        private val heater: Heater
) : Pump {
    override fun pump() {
        if (heater.isHot()) {
            println("A Pump > pumping => =>")
        }
    }
}