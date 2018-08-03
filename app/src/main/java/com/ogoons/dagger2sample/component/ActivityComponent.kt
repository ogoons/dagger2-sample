package com.ogoons.dagger2sample.component

import android.app.Activity
import com.ogoons.dagger2sample.module.ActivityModule
import com.ogoons.dagger2sample.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activity: Activity)

}