package com.panda.sleepy.demoforex.app.screen.deals;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.panda.sleepy.demoforex.R;
import com.panda.sleepy.demoforex.data.TradeModel;
import com.panda.sleepy.demoforex.databinding.ItemTradeBinding;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/*
 * Created by Anton Popov on 20.08.18.
 */
/**
 * Adapter for list of unsuccessful deals on DealsActivity.
 */
public class TradeAdapter extends RecyclerView.Adapter<DealsViewHolder> {

    private List<TradeModel> items = new ArrayList<>();

    @Inject
    public TradeAdapter() {
    }

    // Default adapter methods.

    @NonNull
    @Override
    public DealsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemTradeBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_trade, parent, false);
        return new DealsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DealsViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    // Additional methods.

    public void setItems(List<TradeModel> items) {
        this.items.addAll(items);
        notifyDataSetChanged();
    }
}
