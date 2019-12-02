package com.iic.multilayoutrecyclerview.interfaces;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Ramashish Prajapati on 03-09-2019
 **/
/*interface to differentiate multipal layout and accessing them in recyclerview*/
public interface RowType {
    int HEADER_ROW_TYPE = 0;
    int POI_ROW_TYPE = 1;


    int getItemViewType();

    void onBindViewHolder(RecyclerView.ViewHolder viewHolder);
}
