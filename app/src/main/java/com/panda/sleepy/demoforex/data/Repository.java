package com.panda.sleepy.demoforex.data;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/*
 * Created by Anton Popov on 20.08.18.
 */
/**
 * Class for imitation of data source.
 */
public class Repository {

    @Inject
    public Repository() {

    }

    /**
     * Generates list of unsuccessful deals.
     *
     * @return - list of dummy TradeModel objects.
     */
    public List<TradeModel> downloadLossDeals() {
        List<TradeModel> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            TradeModel tradeModel = new TradeModel("JPY", "AUD", 1235);
            result.add(tradeModel);
        }
        return result;
    }

}
