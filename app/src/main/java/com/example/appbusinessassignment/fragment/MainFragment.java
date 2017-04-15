package com.example.appbusinessassignment.fragment;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.adapter.CustomListAdapter;
import com.example.appbusinessassignment.model.Results;
import com.example.appbusinessassignment.presenter.MainPresenterImpl;
import com.example.appbusinessassignment.view.MainView;

import java.util.List;

/**
 * Created by piubips on 03/04/2017.
 */

public class MainFragment extends Fragment implements MainView {

    ProgressDialog progressDialog;
    MainPresenterImpl presenter;
    CustomListAdapter customListAdapter;


    EditText budgetEditText;
    Context context;
    RecyclerView recyclerView;

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view=inflater.inflate(R.layout.fragment_main,container,false);


        presenter = new MainPresenterImpl(this,getActivity());
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
    public void showComicsClicked() {

    }

    @Override
    public void displayComicsList(List<Results> results) {
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        customListAdapter = new CustomListAdapter(getActivity(),results);
        recyclerView.setAdapter(customListAdapter);
    }

    @Override
    public void showError() {

    }
}
