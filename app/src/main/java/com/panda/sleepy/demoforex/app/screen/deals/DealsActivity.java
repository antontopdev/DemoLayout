package com.panda.sleepy.demoforex.app.screen.deals;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.panda.sleepy.demoforex.R;
import com.panda.sleepy.demoforex.databinding.ActivityDealsBinding;
import com.panda.sleepy.demoforex.di.viewmodel.Injectable;
import com.panda.sleepy.demoforex.util.BaseActivity;
import com.panda.sleepy.demoforex.util.TradeListDecorator;
import com.panda.sleepy.demoforex.viewmodel.DealsViewModel;

import javax.inject.Inject;

/*
 * Created by Anton Popov on 20.08.18.
 */
public class DealsActivity extends BaseActivity<ActivityDealsBinding> implements Injectable {

    @Inject
    protected DealsViewModel viewModel;

    @Inject
    protected TradeAdapter adapter;

    // BaseActivity methods.

    @Override
    protected int getLayout() {
        return R.layout.activity_deals;
    }

    // Lifecycle methods.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.setHandler(viewModel);
        setTradeList();
        setDataObservers();
        setEventObservers();
        viewModel.loadTradeModels();
    }

    // Initialization methods.

    private void setTradeList() {
        binding.tradeList.setLayoutManager(new LinearLayoutManager(this));
        binding.tradeList.setAdapter(adapter);
        binding.tradeList.addItemDecoration(new TradeListDecorator(this, LinearLayoutManager.HORIZONTAL));
    }

    private void setDataObservers() {
        viewModel.getTradeModels().observe(this, models -> adapter.setItems(models));
    }

    private void setEventObservers() {
        viewModel.getCloseEvent().observe(this, aVoid -> onBackPressed());
        viewModel.getMoreInfoEvent().observe(this, aVoid -> showToast("404 Not Found"));
    }

}
