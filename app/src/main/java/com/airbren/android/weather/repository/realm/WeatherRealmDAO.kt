package com.airbren.android.weather.repository.realm

import io.realm.RealmObject

class WeatherRealmDAO: RealmObject() {

    var city: String = ""
    var description: String? = null

}