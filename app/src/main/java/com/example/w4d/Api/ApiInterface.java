package com.example.w4d.Api;

import com.example.w4d.Model.ResponseModel.SignupModel;
import com.example.w4d.Model.ResponseModel.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("token")
    Call<User> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @POST("customer_register")
    @FormUrlEncoded
    Call<SignupModel> customer_register(
            @Field("email") String email,
            @Field("name") String name,
            @Field("password") String mobile
    );
}
