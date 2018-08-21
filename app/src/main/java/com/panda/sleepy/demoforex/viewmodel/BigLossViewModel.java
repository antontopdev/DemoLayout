package com.panda.sleepy.demoforex.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.panda.sleepy.demoforex.data.LossModel;
import com.panda.sleepy.demoforex.data.Repository;

import javax.inject.Inject;

/*
 * Created by Anton Popov on 21.08.18.
 */
public class BigLossViewModel extends ViewModel {

    @Inject
    protected Repository repository;

    private MutableLiveData<LossModel> loss = new MutableLiveData<>();

    @Inject
    public BigLossViewModel() {
    }

    public void loadData() {
        loadLoss();
    }

    private void loadLoss() {
        new Thread(() -> loss.postValue(repository.getLoss())).start();
    }

    public MutableLiveData<LossModel> getLoss() {
        return loss;
    }
}
