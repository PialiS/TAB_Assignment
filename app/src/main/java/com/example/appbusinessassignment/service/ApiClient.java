package com.example.appbusinessassignment.service;

import com.example.appbusinessassignment.model.ComicsMainResponse;
import com.example.appbusinessassignment.utils.Utils;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by piubips on 03/04/2017.
 */
//https://gateway.marvel.com/v1/public/comics?ts=1&limit=2&apikey=54306733de0f5cd1418aa05a85fa062a&hash=359e14db6b6a7bed5c31d81b2c00f36b
public class ApiClient {
    private static Retrofit retrofit = null;

    public interface ApiInterface {

        @GET("v1/public/comics")
        Call<ComicsMainResponse> getComicsListResponse
                (@Query("ts") String timeStamp, @Query("limit") String limit, @Query("apikey") String apiKey, @Query("hash") String hash);

    }

    public ApiInterface getClient() {

        if (retrofit == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

            retrofit = new Retrofit.Builder().baseUrl(Utils.BASE_URL).client(client).addConverterFactory(GsonConverterFactory.create()).build();
//            retrofit = new Retrofit.Builder().baseUrl(Utils.BASE_URL).client(client).addConverterFactory(ScalarsConverterFactory.create()).build();

        }

        return retrofit.create(ApiInterface.class);
    }


}
