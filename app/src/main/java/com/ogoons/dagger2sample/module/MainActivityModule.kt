package com.ogoons.dagger2sample.module

import android.app.Activity
import com.ogoons.dagger2sample.component.SubActivityComponent
import com.ogoons.dagger2sample.mobility.Motor
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.view.main.MainContract
import com.ogoons.dagger2sample.view.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module(subcomponents = arrayOf(SubActivityComponent::class))
class MainActivityModule constructor(activity: Activity, private val view: MainContract.View): ActivityModule(activity) {

    @Provides
    @ActivityScope
    fun provideView() = view

    @Provides
    @ActivityScope
    fun providePresenter(): MainContract.Presenter = MainPresenter(provideView())

    @Provides
    @ActivityScope
    fun provideVehicle(): Vehicle = Vehicle(Motor())

}