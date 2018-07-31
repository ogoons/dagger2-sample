package com.ogoons.dagger2sample.module

import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.view.MainContract
import com.ogoons.dagger2sample.view.MainPresenter
import dagger.Module
import dagger.Provides

@Module/*(subcomponents = arrayOf(MobilityComponent::class))*/ // 상위 모듈(MainActivityModule)에 subcomponent인 MobilityComponent를 적용하면 부모, 자식 관계가 된다.
class MainActivityModule constructor(private val view: MainContract.View) {

    @Provides
    @ActivityScope
    fun provideView() = view

    @Provides
    @ActivityScope
    fun providePresenter(): MainContract.Presenter = MainPresenter(provideView())

}