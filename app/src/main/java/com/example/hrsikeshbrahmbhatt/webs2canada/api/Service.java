package com.example.hrsikeshbrahmbhatt.webs2canada.api;

import com.example.hrsikeshbrahmbhatt.webs2canada.model.TeamResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hrsikeshbrahmbhatt on 2017-10-08.
 */

public interface Service {

    @GET("/webs2canada.json")
    Call<TeamResponse> getAlbums();




}
