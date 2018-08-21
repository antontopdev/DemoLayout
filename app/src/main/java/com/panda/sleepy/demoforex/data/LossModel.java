package com.panda.sleepy.demoforex.data;

/*
 * Created by Anton Popov on 21.08.18.
 */
/**
 * Object for representation data on BigLossActivity.
 */
public class LossModel {

    private int loss;
    private int percent;
    private int gift;

    public LossModel(int loss, int percent, int gift) {
        this.loss = loss;
        this.percent = percent;
        this.gift = gift;
    }

    public int getLoss() {
        return loss;
    }

    public int getGift() {
        return gift;
    }

    public int getPercent() {
        return percent;
    }
}
