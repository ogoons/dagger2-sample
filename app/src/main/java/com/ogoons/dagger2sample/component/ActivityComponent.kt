package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.module.MainActivityModule
import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.view.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

}