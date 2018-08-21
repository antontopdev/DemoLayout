package com.panda.sleepy.demoforex.di;

import android.app.Activity;

import com.panda.sleepy.demoforex.app.MainActivity;
import com.panda.sleepy.demoforex.app.screen.deals.DealsActivity;
import com.panda.sleepy.demoforex.app.screen.loss.BigLossActivity;
import com.panda.sleepy.demoforex.di.main.MainActivityComponent;
import com.panda.sleepy.demoforex.di.main.deals.DealsComponent;
import com.panda.sleepy.demoforex.di.main.loss.BigLossComponent;

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

    @Binds
    @IntoMap
    @ActivityKey(DealsActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDealsActivity(DealsComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(BigLossActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindBigLossActivity(BigLossComponent.Builder builder);

}
