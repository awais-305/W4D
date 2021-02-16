package com.example.w4d.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.w4d.R;

public class SignupActivity extends AppCompatActivity {

    TextView loginTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        loginTv = findViewById(R.id.login_text);


        loginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }




}