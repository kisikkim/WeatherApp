package com.airbren.android.weather.repository

import com.airbren.android.weather.repository.api.WeatherResponse
import io.reactivex.Single

interface WeatherSource {

    fun getCurrentWeather(): Single<WeatherResponse>
}