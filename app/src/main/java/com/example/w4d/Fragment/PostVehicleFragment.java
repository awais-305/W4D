package com.example.w4d.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.w4d.R;

class PostVehicleFragment extends Fragment {



    public PostVehicleFragment() {
        // Required empty public constructor
    }

    public static PostVehicleFragment newInstance() {
        PostVehicleFragment fragment = new PostVehicleFragment();

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
        View rootView = inflater.inflate(R.layout.fragment_post_vehicle, container, false);

        return rootView;
    }
}