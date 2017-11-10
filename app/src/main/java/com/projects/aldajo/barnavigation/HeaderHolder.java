package com.projects.aldajo.barnavigation;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HeaderHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public HeaderHolder(TextView itemView) {
        super(itemView);
        textView = itemView;

        Resources resources = textView.getResources();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(
                resources.getDimensionPixelSize(R.dimen.spacing_large),
                0,
                resources.getDimensionPixelSize(R.dimen.spacing_large),
                0
        );
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
        textView.setTextColor(Color.BLACK);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
    }
}
