package com.example.appbusinessassignment.presenter;

import android.app.Fragment;

/**
 * Created by piubips on 03/04/2017.
 */

public interface MainPresenter {

   void loadComicsList();

   void navigateToFragment(String FragmentTag, Fragment fragmentName);

}
