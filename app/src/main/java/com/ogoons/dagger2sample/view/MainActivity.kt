package com.ogoons.dagger2sample.view

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.ogoons.dagger2sample.R
import com.ogoons.dagger2sample.component.ActivityComponent
import com.ogoons.dagger2sample.component.DaggerMainActivityComponent
import com.ogoons.dagger2sample.component.MainActivityComponent
import com.ogoons.dagger2sample.mobility.Vehicle
import com.ogoons.dagger2sample.module.MainActivityModule
import com.ogoons.dagger2sample.view.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var fragment: MainFragment

    @Inject
    override lateinit var presenter: MainContract.Presenter

    @Inject
    lateinit var vehicle: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_increase_speed)
        button.setOnClickListener {
            // Call
            presenter.increaseSpeed(10)
        }

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_container, fragment, MainFragment::class.java.simpleName)
            commit()
        }
    }

    override fun onSpeedChange(speed: Int) {
        // Callback
        Toast.makeText(this, speed.toString(), Toast.LENGTH_LONG).show()
    }

    /**
     * Build component
     */
    override fun getInitializedComponent(): ActivityComponent {
        return DaggerMainActivityComponent.builder()
                .mainActivityModule(MainActivityModule(this))
                .applicationComponent(getApplicationComponent())
                .build()
    }

    /**
     * Injection
     */
    override fun onInject(component: ActivityComponent) {
        (component as MainActivityComponent).inject(this)
    }

}