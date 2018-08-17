package com.panda.sleepy.demoforex.di.main;

import com.panda.sleepy.demoforex.app.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/*
 * Created by Anton Popov on 17.08.18.
 */
@Subcomponent (modules = { FragmentBuilder.class,
        MainActivityModule.class })
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> { }

}
