package com.ogoons.dagger2sample

/**
 * Created by charles on 2018. 4. 26..
 */
class AHeater : Heater {
    private var heating = false

    override fun on() {
        println("AHeater ~ heating ~ ~ ~")
        this.heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean {
        return heating
    }
}