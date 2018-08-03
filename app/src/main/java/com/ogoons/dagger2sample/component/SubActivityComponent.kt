package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.module.SubActivityModule
import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.view.main.sub.SubActivity
import dagger.Subcomponent

//@ActivityScope
@Subcomponent(modules = arrayOf(SubActivityModule::class))
//@Component(modules = arrayOf(SubActivityModule::class))
interface SubActivityComponent : ActivityComponent {

    fun inject(subActivity: SubActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): SubActivityComponent
    }

}