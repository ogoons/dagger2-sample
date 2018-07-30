package com.ogoons.dagger2sample.view.base


import android.support.v4.app.Fragment

abstract class BaseFragment : Fragment() {

    protected fun <C> getComponent(componentType: Class<C>): C {
        return componentType.cast((activity as BaseActivity).component)
    }

}
