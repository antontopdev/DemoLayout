package com.panda.sleepy.demoforex.app.screen.deals;

import android.support.v7.widget.RecyclerView;

import com.panda.sleepy.demoforex.data.TradeModel;
import com.panda.sleepy.demoforex.databinding.ItemTradeBinding;

/*
 * Created by Anton Popov on 20.08.18.
 */
/**
 * ViewHolder for list of unsuccessful deals on DealsActivity.
 */
public class DealsViewHolder extends RecyclerView.ViewHolder {

    private ItemTradeBinding binding;

    DealsViewHolder(ItemTradeBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(TradeModel item) {
        binding.setData(item);
    }
}
