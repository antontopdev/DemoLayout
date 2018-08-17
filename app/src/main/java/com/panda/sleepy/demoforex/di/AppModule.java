package com.panda.sleepy.demoforex.di;

import android.arch.lifecycle.ViewModelProvider;

import com.panda.sleepy.demoforex.app.DemoApp;
import com.panda.sleepy.demoforex.di.main.MainActivityComponent;
import com.panda.sleepy.demoforex.di.viewmodel.ViewModelComponent;
import com.panda.sleepy.demoforex.di.viewmodel.ViewModelFactory;
import com.panda.sleepy.demoforex.util.InjectionHandler;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/*
 * Created by Anton Popov on 17.08.18.
 */
/**
 * Application module that control Activity and ViewModels injections.
 */
@Module(subcomponents = { MainActivityComponent.class,
        ViewModelComponent.class })
public class AppModule {

    @Provides
    @Singleton
    InjectionHandler provideInjectionHandler(DemoApp app) {
        return new InjectionHandler(app);
    }

    @Provides
    @Singleton
    ViewModelProvider.Factory provideViewModelFactory(ViewModelComponent.Builder component) {
        return new ViewModelFactory(component.build());
    }

}
