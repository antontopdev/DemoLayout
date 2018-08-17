package com.panda.sleepy.demoforex.app;

import android.app.Activity;
import android.app.Application;

import com.panda.sleepy.demoforex.di.DaggerAppComponent;
import com.panda.sleepy.demoforex.util.InjectionHandler;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/*
 * Created by Anton Popov on 17.08.18.
 */
public class DemoApp extends Application implements HasActivityInjector {

    // Variables for Dagger injections.
    @Inject
    protected DispatchingAndroidInjector<Activity> activityInjector;
    @Inject
    protected InjectionHandler injectionHandler;

    // Initialization methods.

    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    private void inject() {
        DaggerAppComponent.builder().application(this).build().inject(this);
    }

    // HasActivityInjector methods.

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}
