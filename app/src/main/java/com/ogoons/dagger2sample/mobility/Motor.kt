package com.ogoons.dagger2sample.mobility

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Motor @Inject internal constructor() {
    internal var rpm: Int = 0
        private set

    init {
        this.rpm = 0
    }

    internal fun accelerate(value: Int) {
        rpm += value
    }

    internal fun decelerate(value: Int) {
        rpm -= value
    }

    internal fun brake() {
        rpm = 0
    }
}
