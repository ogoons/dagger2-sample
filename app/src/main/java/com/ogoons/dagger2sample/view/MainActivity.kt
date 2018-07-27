package com.ogoons.dagger2sample.view

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.ActivityComponent
import com.ogoons.dagger2sample.component.DaggerMainActivityComponent
import com.ogoons.dagger2sample.component.MainActivityComponent
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.view.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var fragment: MainFragment

    @Inject
    lateinit var vehicle: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_mob_injection)
        button.setOnClickListener {
            vehicle.increaseSpeed(1)
            Toast.makeText(this, component.getVehicle().speed.toString(), Toast.LENGTH_LONG).show()
        }

        supportFragmentManager.beginTransaction().apply {
            add(R.id.fl_container, fragment, MainFragment::class.java.simpleName)
            addToBackStack(MainFragment::class.java.simpleName)
            commit()
        }
    }

    override fun getInitializedComponent(): ActivityComponent {
        return DaggerMainActivityComponent.builder()
                .applicationComponent(getApplicationComponent())
                .build()
    }

    override fun onInject(component: ActivityComponent) {
        (component as MainActivityComponent).inject(this)
    }
}