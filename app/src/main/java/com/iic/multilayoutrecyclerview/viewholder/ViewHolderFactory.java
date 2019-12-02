package com.iic.multilayoutrecyclerview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.iic.multilayoutrecyclerview.R;
import com.iic.multilayoutrecyclerview.interfaces.RowType;

/**
 * Created by Ramashish Prajapati on 03-09-2019
 **/
/*user will pass the layout type from adapter class to this, layout type should be same as defined in RowType interface,
 then accoring to the type of layout type ui will build and data get bind in recyclerview.
 */
public class ViewHolderFactory {

    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_poi_title;

        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_poi_title = itemView.findViewById(R.id.tv_poi_title);
        }
    }


    public static class PoiViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_poi_content;
        public CardView cv_container;

        public PoiViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_poi_content = itemView.findViewById(R.id.tv_poi_content);
            cv_container = itemView.findViewById(R.id.cv_container);
        }
    }


    public static RecyclerView.ViewHolder create(ViewGroup parent, int viewType) {
        switch (viewType) {
            case RowType.HEADER_ROW_TYPE:
                View headerTypeView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_header, parent, false);
                return new ViewHolderFactory.HeaderViewHolder(headerTypeView);

            case RowType.POI_ROW_TYPE:
                View poiTypeView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_poi_list, parent, false);
                return new ViewHolderFactory.PoiViewHolder(poiTypeView);
            default:
                return null;
        }
    }
}

