package com.example.appbusinessassignment.view;

import com.example.appbusinessassignment.model.Results;

import java.util.List;

/**
 * Created by piubips on 03/04/2017.
 * MainView
 */

public interface MainView {

    void showProgress();
    void hideProgress();

    void displayComicsList(List<Results> results);
    void showError(Throwable throwable);
    void displayBudgetRange(double minBudget,double maxBudget);

}
