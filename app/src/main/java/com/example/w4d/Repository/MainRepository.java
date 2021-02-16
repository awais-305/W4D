package com.example.w4d.Repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.example.w4d.Model.ResponseModel.User;

public class MainRepository {

    public final String TAG = "Main Repository";
    private Context context;

    MutableLiveData<User> userLiveData;

    public MainRepository(){

    }

}
