package com.example.studentsapp;
import retrofit.RestAdapter;
public class Api {
    public static ApiInterface getClient() {


        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("https://hamon-interviewapi.herokuapp.com")
                .build();

        ApiInterface api = adapter.create(ApiInterface.class);
        return api; // return the APIInterface object
    }
}
