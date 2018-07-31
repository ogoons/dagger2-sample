package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.module.MainActivityModule
import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.view.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(ApplicationComponent::class), // ApplicationComponent에 있는 것들을 주입받을 수 있다.
           modules = arrayOf(MainActivityModule::class)
)
interface MainActivityComponent : ActivityComponent {

    fun inject(mainActivity: MainActivity)

}