package com.panda.sleepy.demoforex.di.main.menu;

import com.panda.sleepy.demoforex.app.screen.MenuFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/*
 * Created by Anton Popov on 20.08.18.
 */
@Subcomponent
public interface MenuComponent extends AndroidInjector<MenuFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MenuFragment> { }

}
