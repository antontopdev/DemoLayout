package com.panda.sleepy.demoforex.di.main;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import com.panda.sleepy.demoforex.app.MainActivity;
import com.panda.sleepy.demoforex.di.main.menu.MenuComponent;
import com.panda.sleepy.demoforex.viewmodel.TransitionViewModel;

import dagger.Module;
import dagger.Provides;

/*
 * Created by Anton Popov on 17.08.18.
 */

/**
 * MainActivity module that control fragments injecting.
 */
@Module(subcomponents = {MenuComponent.class})
public class MainActivityModule {

    @Provides
    TransitionViewModel provideTransitionViewModel(MainActivity activity, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(activity, factory).get(TransitionViewModel.class);
    }

}
