package com.ogoons.dagger2sample.view

import com.ogoons.dagger2sample.mobility.Motor
import com.ogoons.dagger2sample.mobility.Vehicle
import javax.inject.Inject

class MainPresenter @Inject internal constructor(view: MainContract.View) : MainContract.Presenter {

    val vehicle: Vehicle by lazy {
        Vehicle(Motor())
    }

    init {
//        view.presenter = this
    }

    override fun increaseSpeed(speed: Int) {
        vehicle.increaseSpeed(speed)
    }

    override fun decreaseSpeed(speed: Int) {
        vehicle.decreaseSpeed(speed)
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
