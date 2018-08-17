package com.panda.sleepy.demoforex.app;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.panda.sleepy.demoforex.R;

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

    // Lifecycle methods

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // HasSupportFragmentInjector methods.

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }
}
