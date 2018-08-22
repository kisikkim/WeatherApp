package com.airbren.android.weather.api

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WeatherApi {

    val weatherApiService = Retrofit.Builder()
            .baseUrl(WEATHER_API_END_POINT)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(WeatherApiService::class.java)

    fun getCurrentWeather(query: String): Single<WeatherResponse> {
        return weatherApiService.getCurrentWeather(query, API_KEY)
    }

    companion object {
        private const val WEATHER_API_END_POINT = "https://openweathermap.org"
        private const val API_KEY = "703313039540c1e1f106df916e35b6c7"
    }
}