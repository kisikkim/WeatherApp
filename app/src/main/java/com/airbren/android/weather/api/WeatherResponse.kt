package com.airbren.android.weather.api

data class WeatherResponse(val weather: Weather,
                           val main: Main) {

    data class Weather(val main: String,
                       val description: String)

    data class Main(val temp: Float,
                    val tempMin: Float,
                    val tempMax: Float
    )
}