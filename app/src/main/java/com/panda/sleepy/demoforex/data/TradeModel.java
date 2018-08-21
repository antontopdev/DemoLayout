package com.panda.sleepy.demoforex.data;

/*
 * Created by Anton Popov on 20.08.18.
 */
/**
 * Object for representation of user trades.
 */
public class TradeModel {

    private String up;
    private String down;
    private double profit;

    public TradeModel(String up, String down, double profit) {
        this.up = up;
        this.down = down;
        this.profit = profit;
    }

    public String getUp() {
        return up;
    }

    public String getDown() {
        return down;
    }

    public double getProfit() {
        return profit;
    }
}
