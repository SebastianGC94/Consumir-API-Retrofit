package com.example.retrofitmovieslist.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;

    public static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http:///")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
