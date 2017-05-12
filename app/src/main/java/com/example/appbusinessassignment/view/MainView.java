package com.example.appbusinessassignment.view;

import com.example.appbusinessassignment.model.Results;

import java.util.List;

/**
 * Created by piubips on 03/04/2017.
 */

public interface MainView {

    void showProgress();
    void hideProgress();

    void displayComicsList(List<Results> results);
    void displayBudgetRange(double minBudget, double maxBudget);
    void showError(Throwable throwable);

}
