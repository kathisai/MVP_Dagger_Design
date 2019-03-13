package com.sample.wireviewer.network;

import com.example.simpsonsviewer.BuildConfig;
import com.sample.wireviewer.model.simpsons.SimpsonModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {


    @GET(BuildConfig.PATH)
    Call<SimpsonModel> getItems();

}