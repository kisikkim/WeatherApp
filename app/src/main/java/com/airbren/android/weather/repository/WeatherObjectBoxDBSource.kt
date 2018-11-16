package com.airbren.android.weather.repository

import com.airbren.android.weather.repository.api.WeatherResponse
import io.reactivex.Single

class WeatherObjectBoxDBSource: WeatherSource {

    override fun getCurrentWeather(): Single<WeatherResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}