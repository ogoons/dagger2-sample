package com.ogoons.dagger2sample.component

import com.ogoons.dagger2sample.module.MainFragmentModule
import com.ogoons.dagger2sample.scope.ActivityScope
import com.ogoons.dagger2sample.scope.FragmentScope
import com.ogoons.dagger2sample.view.main.MainFragment
import dagger.Component

@ActivityScope
@Component(/*dependencies = arrayOf(ApplicationComponent::class),*/ // ApplicationComponent에 있는 것들을 주입받을 수 있다.
           modules = arrayOf(MainFragmentModule::class)
)
interface MainFragmentComponent {

    fun inject(mainFragment: MainFragment)

//    @Subcomponent.Builder
//    interface Builder {
//        fun build(): MainFragmentComponent
//    }
    
}