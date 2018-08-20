package com.panda.sleepy.demoforex.di.main.menu;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import com.panda.sleepy.demoforex.app.screen.menu.MenuFragment;
import com.panda.sleepy.demoforex.viewmodel.TransitionViewModel;

import dagger.Module;
import dagger.Provides;

/*
 * Created by Anton Popov on 20.08.18.
 */
@Module
public class MenuModule {

    @Provides
    TransitionViewModel provideTransitionViewModel(MenuFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment.getActivity(), factory).get(TransitionViewModel.class);
    }

}
