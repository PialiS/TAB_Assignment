package com.example.appbusinessassignment.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.appbusinessassignment.R;
import com.example.appbusinessassignment.fragment.MainFragment;

public class MainActivity extends BaseActivity{


    //TextView minBudgetTextView, maxBudgetTextView;
    private static final String TAG = MainActivity.class.getSimpleName();

    Fragment mainFragment, detailsFragment;
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

//    private void navigateToFragmentDetails() {
//        detailsFragment = new DetailsFragment();
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentNameTag = "FragmentDetails";
//        if (fragmentManager.findFragmentById(R.id.frame_container) == null) {
//            fragmentTransaction.replace(R.id.frame_container, detailsFragment, fragmentNameTag);
//
//            fragmentTransaction.addToBackStack(null);
//            fragmentTransaction.commit();
//        }
//}

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }
//
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        int id = item.getItemId();
//        if (id == R.id.action_filter) {
//            filterLayout.setVisibility(View.VISIBLE);
//        } else {
//            filterLayout.setVisibility(View.GONE);
//        }
//        return super.onOptionsItemSelected(item);
//    }


}
