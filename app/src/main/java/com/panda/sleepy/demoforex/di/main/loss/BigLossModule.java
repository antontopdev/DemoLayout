package com.panda.sleepy.demoforex.di.main.loss;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import com.panda.sleepy.demoforex.app.screen.loss.BigLossActivity;
import com.panda.sleepy.demoforex.data.Repository;
import com.panda.sleepy.demoforex.viewmodel.BigLossViewModel;

import dagger.Module;
import dagger.Provides;

/*
 * Created by Anton Popov on 21.08.18.
 */
@Module
public class BigLossModule {

    @Provides
    BigLossViewModel provideTransitionViewModel(BigLossActivity activity, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(activity, factory).get(BigLossViewModel.class);
    }

    @Provides
    Repository provideRepository(){
        return new Repository();
    }

}
