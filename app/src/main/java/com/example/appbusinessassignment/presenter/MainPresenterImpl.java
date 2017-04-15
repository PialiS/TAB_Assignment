package com.example.appbusinessassignment.presenter;

import android.app.Fragment;
import android.content.Context;
import android.widget.Toast;

import com.example.appbusinessassignment.model.ComicsMainResponse;
import com.example.appbusinessassignment.model.Results;
import com.example.appbusinessassignment.service.ApiClient;
import com.example.appbusinessassignment.utils.Utils;
import com.example.appbusinessassignment.view.MainView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by piubips on 03/04/2017.
 */

public class MainPresenterImpl extends BasePresenter implements MainPresenter{

    private MainView mainView;
    private MainPresenterImpl mainPresenterImpl;
    private ApiClient apiClient;
    List<Results> comedyResultList=new ArrayList<>();
    private Context context;

    public MainPresenterImpl(MainView mainView, Context context) {
        this.mainView = mainView;
        this.context = context;
    }

    @Override
    public void loadComicsList() {
        mainView.showProgress();

        new ApiClient().getClient().getComicsListResponse(Utils.TIMESTAMP,Utils.LIMIT,Utils.API_KEY,Utils.HASH).enqueue(new Callback<ComicsMainResponse>() {
            @Override
            public void onResponse(Call<ComicsMainResponse> call, Response<ComicsMainResponse> response) {
                mainView.hideProgress();
                Toast.makeText(context,response.body().toString(),Toast.LENGTH_LONG).show();
                ComicsMainResponse comicsMainResponseReceived=response.body();
                mainView.displayComicsList(comicsMainResponseReceived.getData().getResults());
            }

            @Override
            public void onFailure(Call<ComicsMainResponse> call, Throwable t) {

                mainView.hideProgress();;
                mainView.showError();

            }
        });
    }

    @Override
    public void navigateToFragment(String FragmentTag, Fragment fragmentName) {

    }
}
