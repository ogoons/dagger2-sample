package com.ogoons.dagger2sample.view.main.sub

import com.ogoons.dagger2sample.mobility.Motor
import com.ogoons.dagger2sample.mobility.Vehicle
import javax.inject.Inject

class SubPresenter @Inject internal constructor(override val view: SubContract.View) : SubContract.Presenter {

    val vehicle: Vehicle by lazy {
        Vehicle(Motor())
    }

    init {
        view.presenter = this
    }

    override fun increaseSpeed(speed: Int) {
        vehicle.increaseSpeed(speed)
        view.onSpeedChange(vehicle.speed)
    }

    override fun decreaseSpeed(speed: Int) {
        vehicle.decreaseSpeed(speed)
        view.onSpeedChange(vehicle.speed)
    }

    override fun start() {
    }

    override fun subscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unsubscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
