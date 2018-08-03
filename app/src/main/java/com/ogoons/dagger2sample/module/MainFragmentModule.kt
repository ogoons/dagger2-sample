package com.ogoons.dagger2sample.module

import com.ogoons.dagger2sample.mobility.Motor
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.scope.FragmentScope
import com.ogoons.dagger2sample.view.main.MainContract
import com.ogoons.dagger2sample.view.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule constructor(private val view: MainContract.View) {

    @Provides
    @ActivityScope
    fun provideView() = view

    @Provides
    @ActivityScope
    fun provideVehicle(): Vehicle = Vehicle(Motor())

    @Provides
    @ActivityScope
    fun providePresenter(): MainContract.Presenter = MainPresenter(provideView())

}