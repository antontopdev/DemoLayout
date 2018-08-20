package com.panda.sleepy.demoforex.viewmodel;

import android.arch.lifecycle.ViewModel;

import com.panda.sleepy.demoforex.util.SingleLiveEvent;

import javax.inject.Inject;

/*
 * Created by Anton Popov on 20.08.18.
 */

/**
 * ViewModel for handling transitions between fragments in MainActivity.
 */
public class TransitionViewModel extends ViewModel {

    private SingleLiveEvent<Void> openDealsEvent = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> openBigLossEvent = new SingleLiveEvent<>();

    @Inject
    public TransitionViewModel() {
    }

    // Events handlers.

    public void openDeals() {
        openDealsEvent.call();
    }

    public void openBigLoss() {
        openBigLossEvent.call();
    }

    // Getters

    public SingleLiveEvent<Void> getOpenDealsEvent() {
        return openDealsEvent;
    }

    public SingleLiveEvent<Void> getOpenBigLossEvent() {
        return openBigLossEvent;
    }
}
