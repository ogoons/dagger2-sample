package com.ogoons.dagger2sample.view


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.DaggerMobilityComponent
import com.ogoons.dagger2sample.component.MobilityComponent
import com.ogoons.dagger2sample.mobility.Vehicle
import javax.inject.Inject

class MainFragment @Inject constructor() : Fragment() {

    @Inject
    lateinit var vehicle: Vehicle

    lateinit var component: MobilityComponent

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        component = DaggerMobilityComponent.builder().build()
        component.inject(this)

        val button = view.findViewById<Button>(R.id.btn_pop)
        button.setOnClickListener {
//            requireActivity().supportFragmentManager.popBackStack()
            vehicle.increaseSpeed(80)
            Toast.makeText(requireContext(), vehicle.speed.toString(), Toast.LENGTH_LONG).show()
        }

    }

}
