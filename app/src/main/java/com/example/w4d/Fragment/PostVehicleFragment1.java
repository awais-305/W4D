package com.example.w4d.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.w4d.R;

public class PostVehicleFragment1 extends Fragment {


    public PostVehicleFragment1() {
        // Required empty public constructor
    }

    public static PostVehicleFragment1 newInstance(String param1, String param2) {
        PostVehicleFragment1 fragment = new PostVehicleFragment1();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_post_vehicle1, container, false);

        return rootView;
    }
}