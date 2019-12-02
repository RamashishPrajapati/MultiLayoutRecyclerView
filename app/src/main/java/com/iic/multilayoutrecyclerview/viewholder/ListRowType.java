package com.iic.multilayoutrecyclerview.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.iic.multilayoutrecyclerview.interfaces.RowType;

/**
 * Created by Ramashish Prajapati on 03-09-2019
 **/
/*This class is for list layout by extending RowType it can bind the data with adapter class*/

public class ListRowType implements RowType {

    private Context context;
    private String mpoiName;

    public ListRowType(Context context, String mpoiName) {
        this.context = context;
        this.mpoiName = mpoiName;
    }

    @Override
    public int getItemViewType() {
        return RowType.POI_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        final ViewHolderFactory.PoiViewHolder textViewHolder = (ViewHolderFactory.PoiViewHolder) viewHolder;

        textViewHolder.tv_poi_content.setTag(textViewHolder.getAdapterPosition());
        textViewHolder.cv_container.setTag(textViewHolder.getAdapterPosition());

        textViewHolder.tv_poi_content.setText(mpoiName);

        textViewHolder.cv_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Cardview click" + textViewHolder.getAdapterPosition(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
