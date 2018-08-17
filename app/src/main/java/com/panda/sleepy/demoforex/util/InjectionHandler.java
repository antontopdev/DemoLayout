package com.panda.sleepy.demoforex.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.panda.sleepy.demoforex.di.viewmodel.Injectable;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.HasSupportFragmentInjector;

/*
 * Created by Anton Popov on 17.08.18.
 */
/**
 * This class causes injections for activity and fragments.
 */
public class InjectionHandler {

    @Inject
    public InjectionHandler(Application app) {
        app.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                handleActivity(activity);
            }

            @Override
            public void onActivityStarted(Activity activity) {
            }

            @Override
            public void onActivityResumed(Activity activity) {
            }

            @Override
            public void onActivityPaused(Activity activity) {
            }

            @Override
            public void onActivityStopped(Activity activity) {
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
            }
        });
    }

    private static void handleActivity(Activity activity) {
        if (activity instanceof HasSupportFragmentInjector) {
            AndroidInjection.inject(activity);
            if(activity instanceof AppCompatActivity) {
                ((AppCompatActivity) activity).getSupportFragmentManager()
                        .registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {
                            @Override
                            public void onFragmentCreated(@NonNull FragmentManager fm,
                                                          @NonNull Fragment fragment,
                                                          Bundle savedInstanceState) {
                                if (fragment instanceof Injectable) {
                                    AndroidSupportInjection.inject(fragment);
                                }
                            }
                        }, true);
            }
        }
    }

}
