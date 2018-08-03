package com.ogoons.dagger2sample.module

import android.app.Activity
import com.ogoons.dagger2sample.mobility.Motor
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.view.main.MainContract
import com.ogoons.dagger2sample.view.main.MainPresenter
import com.ogoons.dagger2sample.view.main.sub.SubContract
import com.ogoons.dagger2sample.view.main.sub.SubPresenter
import dagger.Module
import dagger.Provides

@Module
class SubActivityModule constructor(activity: Activity, private val view: SubContract.View): ActivityModule(activity) {

    @Provides
    fun provideView() = view

    @Provides
    fun providePresenter(): SubContract.Presenter = SubPresenter(provideView())

    @Provides
    fun provideVehicle(): Vehicle = Vehicle(Motor())

}