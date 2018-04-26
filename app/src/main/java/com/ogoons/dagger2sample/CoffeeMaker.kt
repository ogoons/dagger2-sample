package com.ogoons.dagger2sample

/**
 * Created by charles on 2018. 4. 26..
 */


class CoffeeMaker(
        private val heater: Heater,
        private val pump: Pump
) {


    /**
     * 커피 내리기
     */
    fun brew() {
        heater.on()
        pump.pump()
        println("[_]P coffee! [_]")
        heater.off()
    }
}