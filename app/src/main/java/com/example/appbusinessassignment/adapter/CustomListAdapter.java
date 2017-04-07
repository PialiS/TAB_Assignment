package com.example.appbusinessassignment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.model.Result;
import com.example.appbusinessassignment.view.MainView;

import java.util.List;

/**
 * Created by piubips on 03/04/2017.
 */

public class CustomListAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    Context context;
    MainView mainView;
    List<Result> resultList;

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_layout_details,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }
}
