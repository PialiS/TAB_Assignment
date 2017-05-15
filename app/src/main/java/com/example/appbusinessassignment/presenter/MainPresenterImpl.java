package com.example.appbusinessassignment.presenter;

import com.example.appbusinessassignment.model.ComicsMainResponse;
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
 * MainPresenterImpl
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView mainView;
    private ComicsMainResponse comicsMainResponseReceived;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }


    @Override
    public void loadComicsList() {
        mainView.showProgress();

        new ApiClient().getClient().getComicsListResponse(Utils.TIMESTAMP, Utils.LIMIT, Utils.API_KEY, Utils.HASH).enqueue(new Callback<ComicsMainResponse>() {
            @Override
            public void onResponse(Call<ComicsMainResponse> call, Response<ComicsMainResponse> response) {
                mainView.hideProgress();
                comicsMainResponseReceived = response.body();
                mainView.displayComicsList(comicsMainResponseReceived.getData().getResults());

                calculateMaxMinBudget();
            }

            @Override
            public void onFailure(Call<ComicsMainResponse> call, Throwable t) {

                mainView.hideProgress();
                mainView.showError(t);

            }
        });
    }

    @Override
    public void calculateMaxMinBudget() {

        List<Double> priceList = new ArrayList<>();
        Double maxmumPrice, priceObtained;
        Double minimumPrice;

        for (int i = 0; i < comicsMainResponseReceived.getData().getResults().size(); i++) {
            double prices = comicsMainResponseReceived.getData().getResults().get(i).getPrices().get(0).getPrice();
            priceList.add(prices);

            minimumPrice = priceList.get(0);
            maxmumPrice = priceList.get(0);


            for (int j = 0; j < priceList.size(); j++) {
                priceObtained = priceList.get(i);

                if (priceObtained < minimumPrice) {
                    minimumPrice = priceObtained;
                } else if (priceObtained > maxmumPrice) {
                    maxmumPrice = priceObtained;
                }

                mainView.displayBudgetRange(minimumPrice, maxmumPrice);

            }

        }


    }
}
