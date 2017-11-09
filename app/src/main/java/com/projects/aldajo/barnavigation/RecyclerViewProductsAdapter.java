package com.projects.aldajo.barnavigation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class RecyclerViewProductsAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        int count = productList.get(position).count;
        if(count > 0){
            holder.textView.setText(String.format(Locale.getDefault(), "%d", productList.get(position).count));
        }else {
            holder.textView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
