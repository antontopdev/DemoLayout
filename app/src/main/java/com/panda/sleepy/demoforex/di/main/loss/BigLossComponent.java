package com.panda.sleepy.demoforex.di.main.loss;

import com.panda.sleepy.demoforex.app.screen.loss.BigLossActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/*
 * Created by Anton Popov on 21.08.18.
 */
@Subcomponent
public interface BigLossComponent extends AndroidInjector<BigLossActivity> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<BigLossActivity> {
    }

}
