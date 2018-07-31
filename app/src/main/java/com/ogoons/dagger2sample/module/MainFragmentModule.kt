package com.ogoons.dagger2sample.module

import com.ogoons.dagger2sample.scope.FragmentScope
import com.ogoons.dagger2sample.view.MainContract
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule constructor(private val view: MainContract.View) {

    @Provides
    @FragmentScope
    fun provideView() = view

//    @Provides
//    @FragmentScope
//    fun provideVehicle(): Vehicle = Vehicle(Motor())

}