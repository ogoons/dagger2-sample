package com.ogoons.dagger2sample.view.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.DaggerMainFragmentComponent
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.MainFragmentModule
import com.ogoons.dagger2sample.view.base.BaseFragment
import javax.inject.Inject

class MainFragment @Inject constructor() : BaseFragment<MainContract.Presenter, MainContract.View>(), MainContract.View {

    @Inject
    lateinit var vehicle: Vehicle

//    @Inject
//    override lateinit var presenter: MainContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        getComponent(MainFragmentComponent::class.java).inject(this)


        view.findViewById<Button>(R.id.btn_decrease).setOnClickListener {
            presenter.increaseSpeed(10)
        }

        view.findViewById<Button>(R.id.btn_decrease_of_app_instance).setOnClickListener {
            vehicle.increaseSpeed(10)
            Toast.makeText(requireContext(), vehicle.speed.toString(), Toast.LENGTH_LONG).show()
        }




        DaggerMainFragmentComponent
                .builder()
                .mainFragmentModule(MainFragmentModule(this))
                .build()
                .inject(this)


    }

    override fun onSpeedChange(speed: Int) {
        Toast.makeText(requireContext(), speed.toString(), Toast.LENGTH_LONG).show()
    }

}
