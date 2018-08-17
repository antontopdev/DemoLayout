package com.panda.sleepy.demoforex.di;

import android.app.Activity;

import com.panda.sleepy.demoforex.app.MainActivity;
import com.panda.sleepy.demoforex.di.main.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/*
 * Created by Anton Popov on 17.08.18.
 */
@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

}
