package com.example.lab03;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("Posts")
    Call<List<TextNote>> getTextNote();
}