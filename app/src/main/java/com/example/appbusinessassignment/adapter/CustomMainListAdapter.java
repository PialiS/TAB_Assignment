package com.example.appbusinessassignment.adapter;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.fragment.DetailsFragment;
import com.example.appbusinessassignment.model.Results;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by piubips on 22/04/2017.
 * main list display
 */

public class CustomMainListAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private Context context;
    private List<Results> resultList;
    private DetailsFragment detailsFragment;
    private String fragmentNameTag;


    public CustomMainListAdapter(Context context, List<Results> resultList) {
        this.context = context;
        this.resultList = resultList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Results results = resultList.get(holder.getAdapterPosition());

        holder.layoutHolder.setOnClickListener(mClickListener);
        holder.layoutHolder.setTag(holder);

//        try {
//            holder.textViewPageCount.setText(results.getPageCount() + " Pages");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            if (results.getThumbnail() != null && results.getThumbnail().getPath() != null)
                Picasso.with(context).load(results.getThumbnail().getPath() + "." + results.getThumbnail().getExtension()).placeholder(R.mipmap.ic_launcher).into(holder.imageView);
            else
                Picasso.with(context).load(R.mipmap.ic_launcher).into(holder.imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (results.getTitle() != null)
            holder.textViewTitle.setText(results.getTitle());

    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }


    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            CustomViewHolder holder = (CustomViewHolder) view.getTag();
            int position = holder.getAdapterPosition();

            //navigating to DetailsFragment to show details view

            detailsFragment = new DetailsFragment();
            FragmentManager mFragmentManager = ((Activity) context).getFragmentManager();
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

            fragmentNameTag = "FragmentDetails";
            if (mFragmentManager.findFragmentById(R.id.frame_container) != null) {
                fragmentTransaction.replace(R.id.frame_container, detailsFragment, fragmentNameTag);

                fragmentTransaction.commit();

            }
        }
    };
}

