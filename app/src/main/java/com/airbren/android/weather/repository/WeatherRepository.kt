package com.airbren.android.weather.repository

import com.airbren.android.weather.api.WeatherApi
import com.airbren.android.weather.api.WeatherResponse
import io.reactivex.Single

import javax.inject.Inject

class WeatherRepository @Inject constructor(private val weatherApi: WeatherApi) {

    fun getCurrentWeather(query: String): Single<WeatherResponse> {
        return weatherApi.getCurrentWeather(query)
    }
}