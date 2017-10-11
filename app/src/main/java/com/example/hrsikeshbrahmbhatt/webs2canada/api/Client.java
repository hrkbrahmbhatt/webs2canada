package com.example.hrsikeshbrahmbhatt.webs2canada.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hrsikeshbrahmbhatt on 2017-10-08.
 */

public class Client {


    public static final String BASE_URL = "https://webs2canada.ca";
    public static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
