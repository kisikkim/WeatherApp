package com.airbren.android.weather.repository.realm

import com.airbren.android.weather.repository.WeatherSource
import com.airbren.android.weather.repository.api.WeatherResponse
import io.reactivex.Single

class WeatherRealmDBSource: WeatherSource {

    override fun getCurrentWeather(): Single<WeatherResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}