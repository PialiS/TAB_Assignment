package com.example.appbusinessassignment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.presenter.MainPresenterImpl;
import com.example.appbusinessassignment.view.DetailsView;
import com.squareup.picasso.Picasso;

import static com.example.appbusinessassignment.R.id.thumbnail_image;

/**
 * Created by piubips on 03/04/2017.
 */

public class DetailsFragment extends Fragment implements DetailsView {


    TextView title, price, author, description, pageCount;
    String titleReceived, descriptionReceived, authorNameReceived, imagePathReceived;
    int pageCountReceived;
    double priceReceived;


    ImageView comicsImage;
    MainPresenterImpl presenter;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.row_details, container, false);

        initlialiseViews();
        presenter = new MainPresenterImpl(this, getActivity());
        displayComicsDetails();
        return view;
    }


    @Override
    public void displayComicsDetails() {
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            titleReceived = bundle.getString("TITLE");
            descriptionReceived = bundle.getString("DESC");
            authorNameReceived = bundle.getString("AUTHOR");
            pageCountReceived = bundle.getInt("PAGE_COUNT");
            priceReceived = bundle.getDouble("PRICE");
            imagePathReceived = bundle.getString("IMAGE_PATH");

            if (titleReceived != null) {
                title.setText(titleReceived);
            }
            if (descriptionReceived != null) {
                description.setText(descriptionReceived);
            }
            if (authorNameReceived != null) {
                author.setText(authorNameReceived);
            }
            if (imagePathReceived != null) {

                Picasso.with(getActivity()).load(imagePathReceived).placeholder(R.mipmap.ic_launcher).into(comicsImage);
            } else {
                Picasso.with(getActivity()).load(R.mipmap.ic_launcher).into(comicsImage);
            }
            pageCount.setText(String.valueOf(pageCountReceived));
            price.setText(String.valueOf(priceReceived));
        }


    }


    private void initlialiseViews() {
        title = (TextView) view.findViewById(R.id.title);
        description = (TextView) view.findViewById(R.id.description);
        author = (TextView) view.findViewById(R.id.author);
        price = (TextView) view.findViewById(R.id.price);
        pageCount = (TextView) view.findViewById(R.id.pageCountText);
        comicsImage = (ImageView) view.findViewById(thumbnail_image);

    }
}