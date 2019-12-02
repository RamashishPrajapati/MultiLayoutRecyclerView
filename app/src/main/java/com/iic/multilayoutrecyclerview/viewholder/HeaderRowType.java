package com.iic.multilayoutrecyclerview.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.iic.multilayoutrecyclerview.interfaces.RowType;

/**
 * Created by Ramashish Prajapati on 03-09-2019
 **/
/*This class is for header layout by extending RowType it can bind the data with adapter class*/
public class HeaderRowType implements RowType {

    private Context context;
    String tv_poi_title;

    public HeaderRowType(Context context, String text) {
        this.context = context;
        tv_poi_title = text;
    }

    @Override
    public int getItemViewType() {
        return RowType.HEADER_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {

        final ViewHolderFactory.HeaderViewHolder textViewHolder = (ViewHolderFactory.HeaderViewHolder) viewHolder;
        textViewHolder.tv_poi_title.setText(tv_poi_title);
        textViewHolder.tv_poi_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Title " + textViewHolder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
