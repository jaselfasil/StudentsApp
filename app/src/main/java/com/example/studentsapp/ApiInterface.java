package com.example.studentsapp;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public class ApiInterface {
    @GET("/students/?api_key=a2e4B")
    public void getUsersList(
            Callback<List<Post>> callback) {

    }
}
