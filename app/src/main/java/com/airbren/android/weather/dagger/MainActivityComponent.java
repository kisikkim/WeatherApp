package com.airbren.android.weather.dagger;

import com.airbren.android.weather.MainActivity;
import com.airbren.android.weather.home.HomeFragment;

import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

//@Subcomponent(modules = MainActivityModule.class)
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    //extends AndroidInjector<MainActivity> {
//
//    @Subcomponent.Builder
//    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {}

    void inject(MainActivity mainActivity);
    void inject(HomeFragment homeFragment);
}