package com.projects.aldajo.barnavigation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ItemHolder> {

    List<Item> listItems = new ArrayList<>();

    public void addItem(Item item) {
        listItems.add(item);
        notifyDataSetChanged();
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_previous_orders, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        holder.textViewTitle.setText(listItems.get(position).date);
        holder.textViewSubTitle.setText(listItems.get(position).address);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


}
