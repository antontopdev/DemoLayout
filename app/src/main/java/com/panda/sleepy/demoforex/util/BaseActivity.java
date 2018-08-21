package com.panda.sleepy.demoforex.util;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/*
 * Created by Anton Popov on 21.08.18.
 */
public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {

    protected T binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getLayout());
    }

    protected abstract int getLayout();

    protected void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
