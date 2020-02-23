package com.deepshikha.chatapp.api;

import com.deepshikha.chatapp.model.LoginUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface FirebaseAPI {
    String BASE_URL = "https://chatapp-446e6.firebaseio.com/";

    @POST("users")
    Call<LoginUser> registerUser();

    @GET("users")
    Call<List<LoginUser>> getUsers();
}
