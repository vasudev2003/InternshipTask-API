package com.example.barriaztechtask;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    //String BASE_URL ="http://universities.hipolabs.com/search?country=United+States/";
    @GET("/search?country=United+States")
    Call<List<Result>>getCountries();
}
