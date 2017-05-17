package com.example.appbusinessassignment.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
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
 *
 * main list display
 */

public class CustomMainListAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private Context context;
    private List<Results> resultList;


    public CustomMainListAdapter(Context context, List<Results> resultList) {
        this.context = context;
        this.resultList = resultList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout_details, parent, false);
        return new CustomViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Results results = resultList.get(holder.getAdapterPosition());

        holder.layoutHolder.setOnClickListener(mClickListener);
        holder.layoutHolder.setTag(holder);

        try {
            String pagesLabel = " Pages";
            holder.textViewPageCount.setText(results.getPageCount() +pagesLabel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (results.getThumbnail() != null && results.getThumbnail().getPath() != null)
                Picasso.with(context).load(results.getThumbnail().getPath() + "." +
                        results.getThumbnail().getExtension()).placeholder(R.mipmap.ic_launcher).into(holder.imageView);
            else
                Picasso.with(context).load(R.mipmap.ic_launcher).into(holder.imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (results.getTitle() != null)
            holder.textViewTitle.setText(results.getTitle());

        if (results.getPrices() != null && results.getPrices().get(0) != null)
            holder.textViewPrice.setText(String.valueOf(results.getPrices().get(0).getPrice()));

        try {
            if (results.getCreators().getItems().get(0).getName()!=null) {
                holder.textViewAuthor.setText(results.getCreators().getItems().get(0).getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (results.getDescription() != null)
            holder.textViewDescription.setText(results.getDescription().toString());


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

            if(resultList.get(position)!=null) {
                //navigating to DetailsFragment to show details view
                DetailsFragment detailsFragment = new DetailsFragment();
                FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Bundle bundle = new Bundle();
                // sending imagePath via Bundle
                if (resultList.get(position).getThumbnail() != null && resultList.get(position).getThumbnail().getPath() != null) {
                    bundle.putString("IMAGE_PATH", resultList.get(position).getThumbnail().getPath() + "." + resultList.get(position).getThumbnail().getExtension());
                }

                bundle.putString("TITLE", resultList.get(position).getTitle());
                if (resultList.get(position).getDescription() != null) {
                    bundle.putString("DESC", resultList.get(position).getDescription().toString());
                }
                if (resultList.get(position).getCreators() != null) {
                    if (resultList.get(position).getCreators().getItems() != null && resultList.get(position).getCreators().getItems().size()>0 && resultList.get(position).getCreators().getItems().get(0) != null && resultList.get(position).getCreators().getItems().get(0).getName() != null)
                        bundle.putString("AUTHOR", resultList.get(position).getCreators().getItems().get(0).getName());
                    else
                        bundle.putString("AUTHOR", "");


                }
                if (resultList.get(position).getPrices() != null) {
                    if ( resultList.get(position).getPrices().size()>0 && resultList.get(position).getPrices().get(0) != null && resultList.get(position).getPrices().get(0).getPrice() != 0.0)
                        bundle.putDouble("PRICE", resultList.get(position).getPrices().get(0).getPrice());
                    else
                        bundle.putString("PRICE", "0.0");
                }

                bundle.putInt("PAGE_COUNT", (resultList.get(holder.getAdapterPosition()).getPageCount()));
                detailsFragment.setArguments(bundle);
                String fragmentNameTag = "FragmentDetails";
                if (fragmentManager.findFragmentById(R.id.frame_container) != null) {
                    fragmentTransaction.replace(R.id.frame_container, detailsFragment, fragmentNameTag);
                    fragmentTransaction.addToBackStack(fragmentNameTag);
                    fragmentTransaction.commit();

                }
            }
        }
    };
}

