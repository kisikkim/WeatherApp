package com.airbren.android.weather.home

import android.view.ViewGroup
import android.widget.TextView
import com.airbren.android.weather.R

class HomeView constructor(viewGroup: ViewGroup) {

    val textView = viewGroup.findViewById<TextView>(R.id.textView)

    fun onUpdate(weatherInfo: String, degree: String) {
        textView.setText(weatherInfo + " : " + degree)
    }

    fun onError() {
        textView.setText("Failed to retrive inforamtion.")
    }

}