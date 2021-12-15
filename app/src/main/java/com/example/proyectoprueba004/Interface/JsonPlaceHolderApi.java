package com.example.proyectoprueba004.Interface;

import com.example.proyectoprueba004.Model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    //el encargado de tener la información
    @GET("posts")
    Call<List<Post>> getPosts();
}
