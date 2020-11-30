package com.rujirakongsomran.affirmations.Interface;

import com.rujirakongsomran.affirmations.Model.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("/")
    Call<Data> getData();
}
