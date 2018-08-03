package com.ogoons.dagger2sample.view.base

interface BasePresenter<V> {

    val view: V

    fun start()

    fun subscribe()

    fun unsubscribe()

}