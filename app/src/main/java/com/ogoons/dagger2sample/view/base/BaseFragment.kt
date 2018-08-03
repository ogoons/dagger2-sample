package com.ogoons.dagger2sample.view.base


import android.support.v4.app.Fragment
import javax.inject.Inject

abstract class BaseFragment<P : BasePresenter<V>, V : BaseView<P>> : Fragment() {

    @Inject
    lateinit var presenter: P
        internal set


//    protected fun <C> getComponent(componentType: Class<C>): C {
//        return componentType.cast((activity as BaseActivity).component)
//    }

}
