package com.airbren.android.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.airbren.android.weather.home.HomeFragment
import com.airbren.android.weather.home.HomePresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var homePresenter: HomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val weatherApplication = application as WeatherApplication
        weatherApplication.mainActivityComponent
                .inject(this@MainActivity)

        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.root, HomeFragment(), "HomeFragment")
                .commit()
    }
}
