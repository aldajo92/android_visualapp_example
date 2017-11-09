package com.projects.aldajo.barnavigation;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {

    TextView textViewTitle;
    TextView textViewSubTitle;
    RecyclerView recyclerView;

    RecyclerViewProductsAdapter adapter;

    public ItemHolder(View itemView) {
        super(itemView);
        textViewTitle = itemView.findViewById(R.id.textView_title);
        textViewSubTitle = itemView.findViewById(R.id.textView_subtitle);
        recyclerView = itemView.findViewById(R.id.recyclerView_products);

        adapter = new RecyclerViewProductsAdapter();
        GridLayoutManager layoutManager = new GridLayoutManager(
                itemView.getContext(),
                2,
                LinearLayoutManager.HORIZONTAL,
                false
        );

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        adapter.addProduct(new Product(1));
        adapter.addProduct(new Product(0));
        adapter.addProduct(new Product(11));
        adapter.addProduct(new Product(0));
        adapter.addProduct(new Product(0));
        adapter.addProduct(new Product(5));
        adapter.addProduct(new Product(0));
        adapter.addProduct(new Product(0));
        adapter.addProduct(new Product(10));
    }
}
