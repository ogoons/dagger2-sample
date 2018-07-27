package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.module.MainActivityModule
import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.view.MainActivity
import com.ogoons.dagger2sample.view.MainFragment
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(ApplicationComponent::class),
           modules = arrayOf(MainActivityModule::class)
)
interface MainActivityComponent : ActivityComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(mainFragment: MainFragment)

}