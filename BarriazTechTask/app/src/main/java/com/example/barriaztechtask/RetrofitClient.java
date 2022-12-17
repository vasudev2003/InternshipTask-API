package com.example.barriaztechtask;

import static com.example.barriaztechtask.MainActivity.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient  {
     public  static RetrofitClient instance ;
        Api apiinterface;
     RetrofitClient()
     {
         Retrofit retrofit=new Retrofit.Builder()
             .baseUrl(api)
             .addConverterFactory(GsonConverterFactory.create())
             .build();
       apiinterface = retrofit.create(Api.class);

     }
    public static RetrofitClient getInstance()
    {
        if (instance==null)
        {
            instance=new RetrofitClient();
        }
        return instance;
    }
}
