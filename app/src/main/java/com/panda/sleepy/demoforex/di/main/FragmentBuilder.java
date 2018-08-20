package com.panda.sleepy.demoforex.di.main;

import android.support.v4.app.Fragment;

import com.panda.sleepy.demoforex.app.screen.MenuFragment;
import com.panda.sleepy.demoforex.di.main.menu.MenuComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/*
 * Created by Anton Popov on 17.08.18.
 */
@Module
abstract class FragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(MenuFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindStatisticsProjectFragment(MenuComponent.Builder builder);

}
