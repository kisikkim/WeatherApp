package com.airbren.android.weather.home

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbren.android.weather.R
import com.airbren.android.weather.WeatherApplication
import javax.inject.Inject


class HomeFragment : Fragment() {

    @Inject
    lateinit var homePresenter: HomePresenter
    //val homePresenter: HomePresenter = HomePresenter(HomeModel(WeatherRepository(WeatherApi())))

    lateinit var homeView: HomeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val weatherApplication = activity?.application as WeatherApplication
        weatherApplication.mainActivityComponent
                .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_home, container, false)
        homeView = HomeView(view as ViewGroup)
        return view
    }

    override fun onResume() {
        super.onResume()
        homePresenter.bindView(homeView)
    }

    override fun onPause() {
        super.onPause()
        homePresenter.unbindView()
    }

}