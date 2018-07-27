package com.ogoons.dagger2sample.view.base


import android.os.Bundle
import android.support.v4.app.Fragment

abstract class BaseFragment : Fragment() {

    protected fun onInject(cls: Class<C>) {

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    protected fun <C> getComponent(componentType: Class<C>): C {
        return componentType.cast((activity as BaseActivity).component)
    }



}
