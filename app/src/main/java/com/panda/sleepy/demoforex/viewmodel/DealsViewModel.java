package com.panda.sleepy.demoforex.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.panda.sleepy.demoforex.data.Repository;
import com.panda.sleepy.demoforex.data.TradeModel;
import com.panda.sleepy.demoforex.util.SingleLiveEvent;

import java.util.List;

import javax.inject.Inject;

/*
 * Created by Anton Popov on 20.08.18.
 */
public class DealsViewModel extends ViewModel {

    @Inject
    protected Repository repository;

    private MutableLiveData<List<TradeModel>> tradeModels = new MutableLiveData<>();
    private SingleLiveEvent<Void> closeEvent = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> moreInfoEvent = new SingleLiveEvent<>();

    @Inject
    public DealsViewModel() {

    }

    public void loadTradeModels() {
        new Thread(() -> tradeModels.postValue(repository.downloadLossDeals())).start();
    }

    public void close() {
        closeEvent.call();
    }

    public void getMoreInfo() {
        moreInfoEvent.call();
    }

    public MutableLiveData<List<TradeModel>> getTradeModels() {
        return tradeModels;
    }

    public SingleLiveEvent<Void> getCloseEvent() {
        return closeEvent;
    }

    public SingleLiveEvent<Void> getMoreInfoEvent() {
        return moreInfoEvent;
    }
}
