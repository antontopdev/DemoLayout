package com.panda.sleepy.demoforex.di.main.deals;

import com.panda.sleepy.demoforex.app.screen.deals.DealsActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/*
 * Created by Anton Popov on 20.08.18.
 */
@Subcomponent(modules = DealsModule.class)
public interface DealsComponent extends AndroidInjector<DealsActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DealsActivity> { }

}
