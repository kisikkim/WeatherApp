package com.airbren.android.weather.home

import com.airbren.android.weather.api.WeatherResponse
import com.airbren.android.weather.repository.WeatherRepository
import io.reactivex.Single
import javax.inject.Inject

class HomeModel @Inject constructor(private val weatherRepository: WeatherRepository) {

    fun getCurrentWeather(city: String): Single<WeatherResponse> {
        return weatherRepository.getCurrentWeather(city)
    }
}

