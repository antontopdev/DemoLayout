package com.panda.sleepy.demoforex.util;

import android.databinding.BindingAdapter;
import android.widget.Button;
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

    @BindingAdapter("loss")
    public static void setLoss(TextView view, int loss) {
        String result = "–$" + loss;
        view.setText(result);
    }

    @BindingAdapter({"loss_percent", "loss_message"})
    public static void setLossPercent(TextView view, int loss, String message) {
        String result = String.valueOf(loss) + message;
        view.setText(result);
    }

    @BindingAdapter({"gift", "gift_message"})
    public static void setGift(TextView view, int gift, String message) {
        String result = message + " $" + gift + "!";
        view.setText(result);
    }

}
