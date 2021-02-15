package com.example.w4d.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.w4d.Adatpers.HomeAdapter;
import com.example.w4d.Adatpers.HomeModel;
import com.example.w4d.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<HomeModel> list=new ArrayList<>();
    HomeAdapter homeAdapter;
    Context context;
    HomeModel homeModel ;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        context = this;
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        addData();
        homeAdapter = new HomeAdapter(list,context);
        recyclerView.setAdapter(homeAdapter);

    }

    private void addData(){

        homeModel = new HomeModel(R.drawable.car,"Post Vehicle");
       list.add(homeModel);
       homeModel = new HomeModel(R.drawable.notification,"Notification");
       list.add(homeModel);
       homeModel = new HomeModel(R.drawable.trolley,"Inventory");
       list.add(homeModel);
       homeModel = new HomeModel(R.drawable.search,"Search");
       list.add(homeModel);
        homeModel = new HomeModel(R.drawable.user,"My Profile");
        list.add(homeModel);
        homeModel = new HomeModel(R.drawable.logout,"Logout");
        list.add(homeModel);




    }
}