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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.adapter.CustomMainListAdapter;
import com.example.appbusinessassignment.model.Results;
import com.example.appbusinessassignment.presenter.MainPresenterImpl;
import com.example.appbusinessassignment.view.MainView;

import java.util.List;

/**
 * Created by piubips on 03/04/2017.
 */

public class MainFragment extends Fragment implements MainView {

    ProgressDialog progressDialog;
    MainPresenterImpl presenter;;
    CustomMainListAdapter customMainListAdapter;
    RecyclerView recyclerView;
    TextView minimumBudgetText, maximumBudgetText;
    EditText enterBudgetEdit;
    Button filterButton;



    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view=inflater.inflate(R.layout.fragment_main,container,false);

        //initialise Views
        minimumBudgetText = (TextView) view.findViewById(R.id.minBudgetText);
        maximumBudgetText = (TextView) view.findViewById(R.id.maxBudgetText);
        enterBudgetEdit = (EditText) view.findViewById(R.id.enterBudgetEdit);
        filterButton = (Button) view.findViewById(R.id.filterButton);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        //
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
    public void displayComicsList(List<Results> results) {
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        customMainListAdapter=new CustomMainListAdapter(getActivity(),results);
        recyclerView.setAdapter(customMainListAdapter);
    }

    @Override
    public void showError(Throwable throwable) {
        Toast.makeText(getActivity(), throwable.getMessage().toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void displayBudgetRange(double minBudget, double maxBudget) {
        minimumBudgetText.setText("$" + String.valueOf(minBudget) + " " + "To");
        maximumBudgetText.setText("$" + String.valueOf(maxBudget));

    }
}
