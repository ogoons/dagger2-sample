package com.ogoons.dagger2sample.module

import com.ogoons.dagger2sample.view.MainContract
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule constructor(private val view: MainContract.View) {

    @Provides
    fun provideView() = view

//    @Provides
//    fun providePresenter() = view.presenter as MainPresenter

}