package com.ogoons.dagger2sample.view.main.sub

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.*
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.SubActivityModule
import com.ogoons.dagger2sample.view.base.BaseActivity
import javax.inject.Inject

class SubActivity : BaseActivity<SubContract.Presenter, SubContract.View, SubActivityComponent>(), SubContract.View {

    @Inject
    lateinit var vehicle: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val button = findViewById<Button>(R.id.btn_increase_speed)
        button.setOnClickListener {
            // Call
//            presenter.increaseSpeed(10)

            vehicle.increaseSpeed(10)
            Toast.makeText(this, vehicle.speed.toString(), Toast.LENGTH_LONG).show()
        }

    }

    override fun onSpeedChange(speed: Int) {
        // Callback
        Toast.makeText(this, speed.toString(), Toast.LENGTH_LONG).show()
    }

    /**
     * Build component
     */
    override fun getInitializedComponent(): SubActivityComponent {
                return DaggerSubActivityComponent.builder()
                .subActivityModule(SubActivityModule(this, this))
//                .applicationComponent(getApplicationComponent())
                .build()
    }

    /**
     * Injection
     */
    override fun onInject(component: SubActivityComponent) {
        component.inject(this)
    }

    override fun onInject(applicationComponent: ApplicationComponent) {
//        applicationComponent.plus(MainActivityModule(this, this)).inject(this)
    }

}