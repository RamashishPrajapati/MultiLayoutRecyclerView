package com.iic.multilayoutrecyclerview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.iic.multilayoutrecyclerview.R;
import com.iic.multilayoutrecyclerview.adapter.MultipleTypeAdapter;
import com.iic.multilayoutrecyclerview.interfaces.RowType;
import com.iic.multilayoutrecyclerview.viewholder.HeaderRowType;
import com.iic.multilayoutrecyclerview.viewholder.ListRowType;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<RowType> RowTypelist;
    List<RowType> AllRowTypelist;

    List<HeaderRowType> headerRowTypeslist;
    List<ListRowType> listRowTypeslist;

    HeaderRowType headerRowType;
    ListRowType listRowType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RowTypelist = new ArrayList<>();
        AllRowTypelist = new ArrayList<>();
        headerRowTypeslist = new ArrayList<>();
        listRowTypeslist = new ArrayList<>();


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        headerRowType = new HeaderRowType(this, "Test 1");
        headerRowTypeslist.add(headerRowType);

        listRowType = new ListRowType(this,"Sample 1");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 2");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 3");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 4");
        listRowTypeslist.add(listRowType);

        RowTypelist.addAll(headerRowTypeslist);
        RowTypelist.addAll(listRowTypeslist);


        headerRowType = new HeaderRowType(this, "Test 2");
        if (headerRowTypeslist!=null)
            headerRowTypeslist.clear();

        headerRowTypeslist.add(headerRowType);


        if (listRowTypeslist !=null)
            listRowTypeslist.clear();

        listRowType = new ListRowType(this,"Sample 5");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 6");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 7");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 8");

        listRowTypeslist.add(listRowType);

        RowTypelist.addAll(headerRowTypeslist);
        RowTypelist.addAll(listRowTypeslist);

        headerRowType = new HeaderRowType(this, "Test 3");
        if (headerRowTypeslist!=null)
            headerRowTypeslist.clear();

        headerRowTypeslist.add(headerRowType);


        if (listRowTypeslist !=null)
            listRowTypeslist.clear();

        listRowType = new ListRowType(this,"Sample 9");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 10");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 11");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 12");

        listRowTypeslist.add(listRowType);

        RowTypelist.addAll(headerRowTypeslist);
        RowTypelist.addAll(listRowTypeslist);


        headerRowType = new HeaderRowType(this, "Test 4");
        if (headerRowTypeslist!=null)
            headerRowTypeslist.clear();

        headerRowTypeslist.add(headerRowType);


        if (listRowTypeslist !=null)
            listRowTypeslist.clear();

        listRowType = new ListRowType(this,"Sample 13");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 14");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 15");
        listRowTypeslist.add(listRowType);
        listRowType = new ListRowType(this,"Sample 16");

        listRowTypeslist.add(listRowType);

        RowTypelist.addAll(headerRowTypeslist);
        RowTypelist.addAll(listRowTypeslist);



        AllRowTypelist.addAll(RowTypelist);


        MultipleTypeAdapter multipleTypeAdapter = new MultipleTypeAdapter(AllRowTypelist);
        recyclerView.setAdapter(multipleTypeAdapter);
    }

    }
