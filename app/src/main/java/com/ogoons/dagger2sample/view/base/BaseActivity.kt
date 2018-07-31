package com.ogoons.dagger2sample.view.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ogoons.dagger2sample.App
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.ActivityComponent
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity() {

    lateinit var component: ActivityComponent
        protected set

    protected abstract fun getInitializedComponent(): ActivityComponent

    protected abstract fun onInject(component: ActivityComponent)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component = getInitializedComponent()
        onInject(component)
    }

    protected fun getApplicationComponent() = App.component

}