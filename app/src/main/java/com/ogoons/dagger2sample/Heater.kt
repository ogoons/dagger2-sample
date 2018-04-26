package com.ogoons.dagger2sample

/**
 * Created by charles on 2018. 4. 26..
 */
interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}