package com.example.appbusinessassignment.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by piali on 03/04/2017.
 * Utils
 */

public class
Utils {

    public static final String BASE_URL = "https://gateway.marvel.com/";

    public static final String API_KEY = "54306733de0f5cd1418aa05a85fa062a";

    public static final String HASH = "359e14db6b6a7bed5c31d81b2c00f36b";

    public static String LIMIT = "100";

    public static String TIMESTAMP = "1";

    public static final String DB_NAME = "assignment.db";

    /*
    * Method To Check INTERNET CONNECTIVITY
     */
    public static boolean isConnectedToNetwork(Context context) {
        if (context != null) {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            return activeNetwork != null && activeNetwork.isConnected();
        } else
            return false;
    }

}
    //https://gateway.marvel.com/v1/public/comics?ts=1&limit=2&apikey=54306733de0f5cd1418aa05a85fa062a&hash=359e14db6b6a7bed5c31d81b2c00f36b

