package com.example.restapiproba;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface myapi {

    @GET ("test1.php")
    Call<List<model>> getmodels();
}
