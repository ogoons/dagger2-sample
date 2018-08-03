package com.ogoons.dagger2sample.view.main

import com.ogoons.dagger2sample.view.base.BasePresenter
import com.ogoons.dagger2sample.view.base.BaseView

interface MainContract {

    interface Presenter : BasePresenter<View> {

        fun increaseSpeed(speed: Int)

        fun decreaseSpeed(speed: Int)

    }

    interface View : BaseView<Presenter> {

        fun onSpeedChange(speed: Int)
    }


}