package com.airbren.android.weather.dagger;

import android.app.Activity;

import com.airbren.android.weather.MainActivity;
import com.airbren.android.weather.home.HomeModel;
import com.airbren.android.weather.home.HomePresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
        //(subcomponents = MainActivityComponent.class)
public class MainActivityModule {

//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity>
//    bindYourActivityInjectorFactory(MainActivityComponent.Builder builder);

    @Provides
    HomePresenter provideHomePresenter(HomeModel homeModel) {
        return new HomePresenter(homeModel);
    }
}

