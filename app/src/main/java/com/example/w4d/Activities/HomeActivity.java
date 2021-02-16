package com.example.w4d.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.w4d.Adatpers.HomeAdapter;
import com.example.w4d.Model.HomeModel;
import com.example.w4d.R;

import java.util.ArrayList;

public class HomeActivity extends ParentActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        context = this;
    }
}