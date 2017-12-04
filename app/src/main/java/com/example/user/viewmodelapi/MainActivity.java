package com.example.user.viewmodelapi;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends LifecycleActivity {

    RecyclerView recyclerView;
    ViewModelClass viewModel;
    Recycler_AddmoreAdap adapter;
    List<Datum> productModels=new ArrayList<>();
    String search="the";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        adapter=new Recycler_AddmoreAdap(this,productModels,false);
        recyclerView.setAdapter(adapter);

         viewModel= ViewModelProviders.of(this).get(ViewModelClass.class);
        viewModel.getItemAndPersonList(search).observe(MainActivity.this, new Observer<List<Datum>>() {

            @Override
            public void onChanged(@Nullable List<Datum> itemAndPeople) {
                //recyclerViewAdapter.addItems(itemAndPeople);
                adapter.addItems(itemAndPeople);

            }
        });





    }


}
