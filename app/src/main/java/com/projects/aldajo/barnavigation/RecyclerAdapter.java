package com.projects.aldajo.barnavigation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public final int HEADER = 1;
    public final int ITEM = 2;

    List<Item> listItems = new ArrayList<>();

    public void addItem(Item item) {
        listItems.add(item);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType == HEADER){
            TextView view = new TextView(parent.getContext());
            return new HeaderHolder(view);
        }
        else {
            return new ItemHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_previous_orders, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder.getItemViewType() == HEADER){
            TextView textView = ((HeaderHolder) holder).textView;
            textView.setText(listItems.get(position).title);
        }else{
            ((ItemHolder) holder).textViewTitle.setText(listItems.get(position).date);
            ((ItemHolder) holder).textViewSubTitle.setText(listItems.get(position).address);
        }
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? HEADER : ITEM;
    }
}
