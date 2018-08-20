package com.panda.sleepy.demoforex.util;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Created by Anton Popov on 20.08.18.
 */

/**
 * Class for handling events via ViewModels.
 */
public class SingleLiveEvent<T> extends MutableLiveData<T> {

    private static final String TAG = SingleLiveEvent.class.getSimpleName();

    private AtomicBoolean pending = new AtomicBoolean(false);

    @MainThread
    @Override
    public void observe(@NonNull LifecycleOwner owner, @NonNull Observer<T> observer) {
        if (hasActiveObservers())
            Log.w(TAG, "Multiple observers registered but only one will be notified of changes.");
        super.observe(owner, t -> {
            if (pending.compareAndSet(true, false))
                observer.onChanged(t);
        });
    }

    @MainThread
    @Override
    public void setValue(T value) {
        pending.set(true);
        super.setValue(value);
    }

    @MainThread
    public void call() {
        postValue(null);
    }
}
