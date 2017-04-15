package com.example.appbusinessassignment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.model.Results;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by piubips on 03/04/2017.
 */

public class CustomListAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    Context context;
    List<Results> resultList;

    public CustomListAdapter(Context context, List<Results> resultList) {
        this.context = context;
        this.resultList = resultList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout_details, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Results results = resultList.get(holder.getAdapterPosition());

        try {
            holder.textViewPageCount.setText(results.getPageCount()+" Pages");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (results.getThumbnail() != null && results.getThumbnail().getPath() != null)
                Picasso.with(context).load(results.getThumbnail().getPath()+"."+results.getThumbnail().getExtension()).placeholder(R.mipmap.ic_launcher).into(holder.imageView);
            else
                Picasso.with(context).load(R.mipmap.ic_launcher).into(holder.imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (results.getPrices() != null && results.getPrices().get(0) != null)
            holder.textViewPrice.setText(String.valueOf(results.getPrices().get(0).getPrice()));


        try {
            holder.textViewAuthor.setText(results.getCreators().getItems().get(0).getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (results.getDescription() != null)
            holder.textViewDescription.setText(results.getDescription().toString());
        if (results.getTitle() != null)
            holder.textViewTitle.setText(results.getTitle());

    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }
}
