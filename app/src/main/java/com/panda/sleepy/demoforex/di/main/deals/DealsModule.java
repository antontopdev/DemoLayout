package com.panda.sleepy.demoforex.di.main.deals;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import com.panda.sleepy.demoforex.app.screen.deals.TradeAdapter;
import com.panda.sleepy.demoforex.app.screen.deals.DealsActivity;
import com.panda.sleepy.demoforex.data.Repository;
import com.panda.sleepy.demoforex.viewmodel.DealsViewModel;

import dagger.Module;
import dagger.Provides;

/*
 * Created by Anton Popov on 20.08.18.
 */
@Module
public class DealsModule {

    @Provides
    DealsViewModel provideDealsViewModel(DealsActivity activity, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(activity, factory).get(DealsViewModel.class);
    }

    @Provides
    TradeAdapter provideTradeAdapter() {
        return new TradeAdapter();
    }

    @Provides
    Repository provideRepository() {
        return new Repository();
    }

}
