package com.example.appbusinessassignment.view;

import com.example.appbusinessassignment.model.Result;

import java.util.List;

/**
 * Created by piubips on 03/04/2017.
 */

public interface MainView {

    void showProgress();
    void hideProgress();
    void showComicsClicked();
    void displayComicsList(List<Result> results);
    void showError();

}
