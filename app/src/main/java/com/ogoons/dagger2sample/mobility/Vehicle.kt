package com.ogoons.dagger2sample.mobility

import javax.inject.Inject
import javax.inject.Singleton

class Vehicle @Inject internal constructor(private val motor: Motor) {
    internal val speed: Int
        get() = motor.rpm

    internal fun increaseSpeed(value: Int) {
        motor.accelerate(value)
    }

    internal fun decreaseSpeed(value: Int) {
        motor.decelerate(value)
    }

    internal fun stop() {
        motor.brake()
    }

}
