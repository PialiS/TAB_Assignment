package com.example.appbusinessassignment.fragment;

import android.annotation.SuppressLint;
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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piali on 03/04/2017.
 * main fragment
 */

public class MainFragment extends Fragment implements MainView {

    private ProgressDialog progressDialog;
    private RecyclerView recyclerView;
    private TextView minimumBudgetText, maximumBudgetText;
    private View view;
    private List<Results> results;
    private List<Results> filteredResultsList;
    private CustomMainListAdapter customMainListAdapter;
    private EditText enterBudgetEdit;
    private Button filterButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view=inflater.inflate(R.layout.fragment_main,container,false);

        //initialise Views
        minimumBudgetText = (TextView) view.findViewById(R.id.minBudgetText);
        maximumBudgetText = (TextView) view.findViewById(R.id.maxBudgetText);
         enterBudgetEdit = (EditText) view.findViewById(R.id.enterBudgetEdit);
        enterBudgetEdit.setEnabled(false);
         filterButton = (Button) view.findViewById(R.id.filterButton);
        filterButton.setEnabled(false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        //
        MainPresenterImpl mainPresenter = new MainPresenterImpl(this);
        mainPresenter.loadComicsList();

        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filteredText = enterBudgetEdit.getText().toString();
                if(filteredText.length()==0){
                    filteredResultsList.clear();
                    filteredResultsList.addAll(results);
                    customMainListAdapter.notifyDataSetChanged();
                }else{
                    filteredResultsList.clear();
                    for(int i=0;i<results.size();i++){
                        Results result = results.get(i);
                        if(result!=null){
                            if(result.getPrices()!=null && result.getPrices().size()>0 && result.getPrices().get(0)!=null){
                                String price = String.valueOf(result.getPrices().get(0).getPrice());
                                if(price.equalsIgnoreCase(filteredText)){
                                    filteredResultsList.add(result);
                                }
                            }
                        }
                    }
                    customMainListAdapter.notifyDataSetChanged();
                }
            }
        });


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
    public void displayComicsList(final List<Results> results) {
        this.results = new ArrayList<>(results);
        this.filteredResultsList = new ArrayList<>(results);
        filterButton.setEnabled(true);
        enterBudgetEdit.setEnabled(true);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
         customMainListAdapter=new CustomMainListAdapter(getActivity(),filteredResultsList);
        recyclerView.setAdapter(customMainListAdapter);


    }

    @Override
    public void showError(Throwable throwable) {
        Toast.makeText(getActivity(), throwable.getMessage(),Toast.LENGTH_LONG).show();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void displayBudgetRange(double minBudget, double maxBudget) {
        minimumBudgetText.setText("$" + String.valueOf(minBudget) + " " + "To");
        maximumBudgetText.setText("$" + String.valueOf(maxBudget));

    }
}
