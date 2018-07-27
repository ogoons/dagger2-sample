package com.ogoons.dagger2sample.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.MainActivityComponent
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.view.base.BaseFragment
import javax.inject.Inject

class MainFragment @Inject constructor() : BaseFragment() {

    @Inject
    lateinit var vehicle: Vehicle

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getComponent(MainActivityComponent::class.java).inject(this)

        val button = view.findViewById<Button>(R.id.btn_pop)
        button.setOnClickListener {
//            requireActivity().supportFragmentManager.popBackStack()
            vehicle.increaseSpeed(2)
            Toast.makeText(requireContext(), vehicle.speed.toString(), Toast.LENGTH_LONG).show()
        }

    }




}
