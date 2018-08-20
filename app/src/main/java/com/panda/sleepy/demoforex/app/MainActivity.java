package com.panda.sleepy.demoforex.app;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.panda.sleepy.demoforex.R;
import com.panda.sleepy.demoforex.app.screen.MenuFragment;
import com.panda.sleepy.demoforex.databinding.ActivityMainBinding;
import com.panda.sleepy.demoforex.viewmodel.TransitionViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/*
 * Created by Anton Popov on 17.08.18.
 */
public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    // Additional variable for dagger.android.
    @Inject
    protected DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Inject
    protected TransitionViewModel viewModel;

    private ActivityMainBinding binding;

    // Lifecycle methods

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initFragment();
        setEventHandlers();
    }

    // Initialization methods

    private void initFragment() {
        getSupportFragmentManager().beginTransaction()
                .add(binding.cardinal.getId(), new MenuFragment())
                .commit();
    }

    private void setEventHandlers() {
        viewModel.getOpenDealsEvent().observe(this, aVoid -> showToast("Deals"));
        viewModel.getOpenBigLossEvent().observe(this, aVoid -> showToast("Big loss"));
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    // HasSupportFragmentInjector methods.

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }

}
