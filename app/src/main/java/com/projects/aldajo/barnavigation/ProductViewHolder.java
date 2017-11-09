package com.projects.aldajo.barnavigation;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alejo on 9/11/17.
 */

public class ProductViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public ProductViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView_counter);
    }
}
