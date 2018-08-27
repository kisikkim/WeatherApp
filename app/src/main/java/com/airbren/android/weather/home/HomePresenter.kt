package com.airbren.android.weather.home

import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class HomePresenter @Inject constructor(private val homeModel: HomeModel) {

    private val compositeDisposable = CompositeDisposable()

    fun bindView(homeview: HomeView) {
        compositeDisposable.add(homeModel.getCurrentWeather("London")
                .subscribe({ homeview.onUpdate(it.weather[0].main, it.main.temp.toString()) },
                        { homeview.onError() }))
    }

    fun unbindView() {
        compositeDisposable.clear()
    }
}