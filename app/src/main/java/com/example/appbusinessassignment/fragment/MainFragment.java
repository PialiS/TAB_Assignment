package com.example.appbusinessassignment.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.adapter.CustomMainListAdapter;
import com.example.appbusinessassignment.database.DaoSession;
import com.example.appbusinessassignment.database.comicData;
import com.example.appbusinessassignment.database.comicDataDao;
import com.example.appbusinessassignment.database.minmaxData;
import com.example.appbusinessassignment.database.minmaxDataDao;
import com.example.appbusinessassignment.model.Results;
import com.example.appbusinessassignment.presenter.MainPresenterImpl;
import com.example.appbusinessassignment.utils.DatabaseUtil;
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
    private Button filterButton, pageCountButton;
    private double minimumBudget,maximumBudget;
    private DatabaseUtil databaseUtil;
    private DaoSession daoSession;
    private comicDataDao comicDataDao;
    private minmaxDataDao minmaxDataDao;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);

        //initialise Views
        minimumBudgetText = (TextView) view.findViewById(R.id.minBudgetText);
        maximumBudgetText = (TextView) view.findViewById(R.id.maxBudgetText);
        enterBudgetEdit = (EditText) view.findViewById(R.id.enterBudgetEdit);
        enterBudgetEdit.setEnabled(false);
        filterButton = (Button) view.findViewById(R.id.filterButton);
        filterButton.setEnabled(false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        pageCountButton = (Button) view.findViewById(R.id.pageCountBtn);

        //
        MainPresenterImpl mainPresenter = new MainPresenterImpl(this);
        mainPresenter.loadComicsList();

        databaseUtil = new DatabaseUtil();


        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filteredText = enterBudgetEdit.getText().toString();


                if (filteredText.length() == 0) {
                    filteredResultsList.clear();
                    filteredResultsList.addAll(results);
                    customMainListAdapter.notifyDataSetChanged();
                } else {

                    try {
                        Double selectedPrice = Double.parseDouble(filteredText);
                        if(selectedPrice<minimumBudget){
                            Toast.makeText(getActivity(),"Budget Should not be less than minimum budget",Toast.LENGTH_SHORT).show();
                        }else if(selectedPrice>maximumBudget){
                            Toast.makeText(getActivity(),"Budget Should not be less than maximum budget",Toast.LENGTH_SHORT).show();
                        }else{
                            filteredResultsList.clear();
                            for (int i = 0; i < results.size(); i++) {
                                Results result = results.get(i);
                                if (result != null) {
                                    if (result.getPrices() != null && result.getPrices().size() > 0 && result.getPrices().get(0) != null) {
                                        double originalPrice = result.getPrices().get(0).getPrice();
                                        if (originalPrice<=selectedPrice && originalPrice>=minimumBudget ) {
                                            filteredResultsList.add(result);
                                        }
                                    }
                                }
                            }
                            customMainListAdapter.notifyDataSetChanged();
                        }
                    } catch (NumberFormatException e) {
                        Toast.makeText(getActivity(),"Please Enter Correct Budget",Toast.LENGTH_SHORT).show();
                    }

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
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        customMainListAdapter = new CustomMainListAdapter(getActivity(), filteredResultsList);
        recyclerView.setAdapter(customMainListAdapter);


        try {

            daoSession = databaseUtil.StartSession(getActivity());
            comicDataDao = daoSession.getComicDataDao();
            comicDataDao.deleteAll();

            for(Results results1:filteredResultsList) {
                comicData comicData = new comicData();

                //id
                comicData.setId(results1.getId());

                //title
                if(results1.getTitle()!=null)
                comicData.setTitle(results1.getTitle());

                //description
                if(results1.getDescription()!=null)
                    comicData.setDescription(results1.getDescription().toString());



                //image
                if(results1.getThumbnail()!=null && results1.getThumbnail().getPath()!=null){
                    comicData.setImage(results1.getThumbnail().getPath());
                }

                //image extension
                if(results1.getThumbnail()!=null && results1.getThumbnail().getExtension()!=null){
                    comicData.setImageExtension(results1.getThumbnail().getExtension());
                }

                if(results1.getPrices()!=null  && results1.getPrices().size()>0 && results1.getPrices().get(0)!=null)                           comicData.setPrice(results1.getPrices().get(0).getPrice());

                //page count
                    comicData.setPageCount(results1.getPageCount());

                //author
                if(results1.getCreators()!=null && results1.getCreators().getItems()!=null && results1.getCreators().getItems().size()>0 && results1.getCreators().getItems().get(0)!=null && results1.getCreators().getItems().get(0).getName()!=null)
                    comicData.setAuthor(results1.getCreators().getItems().get(0).getName());

                comicDataDao.insert(comicData);
                Log.d("Inserted ",results1.getTitle());

            }
            databaseUtil.closeSession();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public void showError(Throwable throwable) {
        Toast.makeText(getActivity(), throwable.getMessage(), Toast.LENGTH_LONG).show();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void displayBudgetRange(double minBudget, double maxBudget) {
        minimumBudget = minBudget;
        maximumBudget = maxBudget;
        minimumBudgetText.setText("$" + String.valueOf(minimumBudget) + " " + "To");
        maximumBudgetText.setText("$" + String.valueOf(maximumBudget));

        try {

            daoSession = databaseUtil.StartSession(getActivity());
            minmaxDataDao = daoSession.getMinmaxDataDao();
            minmaxDataDao.deleteAll();

            minmaxData minmaxData = new minmaxData(maximumBudget,maximumBudget);

            minmaxDataDao.insert(minmaxData);

            databaseUtil.closeSession();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    @Override
    public void displayTotalPageCount(int totalPageCount) {
        pageCountButton.setText("Page Count: " + totalPageCount);
    }


}
