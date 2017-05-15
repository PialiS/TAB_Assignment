package com.example.appbusinessassignment.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.fragment.MainFragment;

public class MainActivity extends AppCompatActivity{

    Fragment mainFragment;
    String fragmentNameTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateToFragmentMain();
    }

    private void navigateToFragmentMain() {
        mainFragment = new MainFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentNameTag = "FragmentMain";
        if (fragmentManager.findFragmentById(R.id.frame_container) == null) {
            fragmentTransaction.replace(R.id.frame_container, mainFragment, fragmentNameTag);

            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

}
