package com.ogoons.dagger2sample.view.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ogoons.dagger2sample.App
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.ActivityComponent
import com.ogoons.dagger2sample.component.ApplicationComponent
import javax.inject.Inject

abstract class BaseActivity<P : BasePresenter<V>, V : BaseView<P>, C : ActivityComponent> : AppCompatActivity() {

    @Inject
    lateinit var presenter: P
        internal set

    lateinit var component: C
        protected set

    protected abstract fun getInitializedComponent(): C

    protected abstract fun onInject(component: C)

    protected abstract fun onInject(applicationComponent: ApplicationComponent)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component = getInitializedComponent()
        onInject(component)
//        onInject(getApplicationComponent())
    }

    protected fun getApplicationComponent() = App.component

}