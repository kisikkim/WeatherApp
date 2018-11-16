package com.airbren.android.weather.repository.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("/data/2.5/weather")
    fun getCurrentWeather(@Query("q") query: String,
                          @Query("appid") appid: String) : Single<WeatherResponse>
}