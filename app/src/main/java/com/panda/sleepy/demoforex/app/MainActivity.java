package com.panda.sleepy.demoforex.app;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.panda.sleepy.demoforex.R;
import com.panda.sleepy.demoforex.app.screen.deals.DealsActivity;
import com.panda.sleepy.demoforex.app.screen.menu.MenuFragment;
import com.panda.sleepy.demoforex.databinding.ActivityMainBinding;
import com.panda.sleepy.demoforex.util.BaseActivity;
import com.panda.sleepy.demoforex.viewmodel.TransitionViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/*
 * Created by Anton Popov on 17.08.18.
 */
public class MainActivity extends BaseActivity<ActivityMainBinding> implements HasSupportFragmentInjector {

    // Additional variable for dagger.android.
    @Inject
    protected DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Inject
    protected TransitionViewModel viewModel;

    // BaseActivity methods.

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    // Lifecycle methods

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment();
        setEventHandlers();
    }

    // Initialization methods.

    private void initFragment() {
        getSupportFragmentManager().beginTransaction()
                .add(binding.cardinal.getId(), new MenuFragment())
                .commit();
    }

    private void setEventHandlers() {
        viewModel.getOpenDealsEvent().observe(this, aVoid -> openDialog(DealsActivity.class));
        viewModel.getOpenBigLossEvent().observe(this, aVoid -> showToast("Big loss"));
    }

    // Additional methods

    private void openDialog(Class dialog) {
        Intent intent = new Intent(this, dialog);
        startActivity(intent);
    }

    // HasSupportFragmentInjector methods.

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }

}
