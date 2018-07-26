package com.ogoons.dagger2sample.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.DaggerMobilityComponent
import com.ogoons.dagger2sample.component.MobilityComponent
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.MobilityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var fragment: MainFragment

    @Inject
    lateinit var vehicle: Vehicle

    lateinit var component: MobilityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component = DaggerMobilityComponent.builder().build()
        component.inject(this)

        val button = findViewById<Button>(R.id.btn_mob_injection)
        button.setOnClickListener {
            vehicle.increaseSpeed(20)
            Toast.makeText(this, vehicle.speed.toString(), Toast.LENGTH_LONG).show()
        }

//        CoffeeMaker(CoffeeMakerModule.provideHeater(), CoffeeMakerModule.providePump()).brew()
        supportFragmentManager.beginTransaction().apply {
            add(R.id.fl_container, fragment, MainFragment::class.java.simpleName)
            addToBackStack(MainFragment::class.java.simpleName)
            commit()
        }
    }

}