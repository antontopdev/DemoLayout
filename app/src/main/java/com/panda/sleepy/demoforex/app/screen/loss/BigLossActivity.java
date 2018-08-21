package com.panda.sleepy.demoforex.app.screen.loss;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.panda.sleepy.demoforex.R;
import com.panda.sleepy.demoforex.databinding.ActivityBigLossBinding;
import com.panda.sleepy.demoforex.di.viewmodel.Injectable;
import com.panda.sleepy.demoforex.util.BaseActivity;
import com.panda.sleepy.demoforex.viewmodel.BigLossViewModel;

import javax.inject.Inject;

/*
 * Created by Anton Popov on 21.08.18.
 */
public class BigLossActivity extends BaseActivity<ActivityBigLossBinding> implements Injectable {

    @Inject
    protected BigLossViewModel viewModel;

    // BaseActivity methods.

    @Override
    protected int getLayout() {
        return R.layout.activity_big_loss;
    }

    // Lifecycle methods.

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel.loadData();
        binding.setLifecycleOwner(this);
        binding.setHandler(viewModel);
    }


}
