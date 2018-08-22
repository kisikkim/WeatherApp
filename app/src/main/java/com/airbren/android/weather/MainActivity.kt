package com.airbren.android.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.airbren.android.weather.home.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.root, HomeFragment(), "HomeFragment")
                .commit()
    }
}
