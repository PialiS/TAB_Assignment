package com.example.appbusinessassignment.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appbusinessassignment.R;

/**
 * Created by piubips on 03/04/2017.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView textViewTitle;
    TextView textViewDescription;
    TextView textViewAuthor;
    TextView textViewPrice;
    TextView textViewPageCount;
    ImageView imageView;
    public CustomViewHolder(View itemView) {
        super(itemView);

        textViewTitle = (TextView)itemView.findViewById(R.id.title);
        textViewDescription = (TextView)itemView.findViewById(R.id.description);
        textViewAuthor = (TextView)itemView.findViewById(R.id.author);
        textViewPrice = (TextView)itemView.findViewById(R.id.price);
        textViewPageCount = (TextView)itemView.findViewById(R.id.pageCountText);
        imageView  = (ImageView)itemView.findViewById(R.id.thumbnail_image);

    }


}

