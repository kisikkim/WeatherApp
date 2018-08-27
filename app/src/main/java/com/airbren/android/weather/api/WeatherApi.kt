package com.airbren.android.weather.api

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
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
        return weatherApiService.getCurrentWeather(query, SAMPLE_API_KEY)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

    companion object {
        private const val WEATHER_API_END_POINT = "https://openweathermap.org"
        private const val API_KEY = "703313039540c1e1f106df916e35b6c7"
        private const val SAMPLE_API_KEY = "b6907d289e10d714a6e88b30761fae22"
    }
}