package com.iic.multilayoutrecyclerview.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iic.multilayoutrecyclerview.interfaces.RowType;
import com.iic.multilayoutrecyclerview.viewholder.ViewHolderFactory;

import java.util.List;

/**
 * Created by Ramashish Prajapati on 03-09-2019
 **/
/*This adapter class pass the viewtype to ViewHolderFactory so that multipal view get binded to recycler view*/
public class MultipleTypeAdapter extends RecyclerView.Adapter {

    private List<RowType> dataSet;


    public MultipleTypeAdapter(List<RowType> dataSet) {
        this.dataSet = dataSet;

    }


    @Override
    public int getItemViewType(int position) {
        return dataSet.get(position).getItemViewType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ViewHolderFactory.create(parent, viewType);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        dataSet.get(position).onBindViewHolder(holder);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
