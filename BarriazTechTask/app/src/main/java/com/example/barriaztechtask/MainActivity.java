package com.example.barriaztechtask;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvMain;
   public static String api="http://universities.hipolabs.com/";
   List<Result>resultList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvMain=findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new LinearLayoutManager(this));
       RetrofitClient.getInstance().apiinterface.getCountries().enqueue(new Callback<List<Result>>() {
           @Override
           public void onResponse(Call<List<Result>> call, Response<List<Result>> response) {
               resultList = response.body();
               rcvMain.setAdapter(new userAdapter(MainActivity.this,resultList));

           }

           @Override
           public void onFailure(Call<List<Result>> call, Throwable t) {
               Log.e("API Response","Vasudev "+t.getLocalizedMessage());
           }
       });
    }


}