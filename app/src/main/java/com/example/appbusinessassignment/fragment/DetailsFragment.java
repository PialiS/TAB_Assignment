package com.example.appbusinessassignment.fragment;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.adapter.CustomListAdapter;
import com.example.appbusinessassignment.model.Results;
import com.example.appbusinessassignment.presenter.MainPresenterImpl;
import com.example.appbusinessassignment.view.MainView;

import java.util.List;

/**
 * Created by piubips on 03/04/2017.
 */

public class DetailsFragment extends Fragment implements MainView {


    ProgressDialog progressDialog;
    MainPresenterImpl presenter;
    CustomListAdapter customListAdapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        presenter = new MainPresenterImpl(this, getActivity());
        presenter.loadComicsList();
        return view;
    }

    @Override
    public void showProgress() {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Please Wait!");
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void displayComicsList(List<Results> results) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        customListAdapter = new CustomListAdapter(getActivity(), results);
        recyclerView.setAdapter(customListAdapter);

    }

    @Override
    public void showError() {

    }
}
