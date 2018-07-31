package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.module.ActivityModule
import dagger.Component

@Component(
        modules = arrayOf(ActivityModule::class)
)
interface ActivityComponent { // component가 constructor를 가지고 있지 않다면 create() 사용 가능
}