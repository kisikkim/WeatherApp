package com.airbren.android.weather.home

import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class HomePresenter @Inject constructor(private val homeModel: HomeModel) {

    val compositeDisposable = CompositeDisposable()

    fun bindView(homeview: HomeView) {
        compositeDisposable.add(homeModel.getCurrentWeather("London")
                .subscribe({ homeview.onUpdate() }, { homeview.onError() }))
    }

    fun unbindView() {
        compositeDisposable.clear()
    }
}