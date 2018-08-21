package com.panda.sleepy.demoforex.util;

import android.databinding.BindingAdapter;
import android.widget.TextView;

import java.util.Locale;

/*
 * Created by Anton Popov on 20.08.18.
 */
public class BindingAdapters {

    @BindingAdapter("profit")
    public static void setProfit(TextView view, double profit){
        String result = "– $" + String.format(Locale.ENGLISH, "%.2f", profit);
        view.setText(result);
    }

}
