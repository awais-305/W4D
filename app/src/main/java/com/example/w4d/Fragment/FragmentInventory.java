package com.example.w4d.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.w4d.R;


public class FragmentInventory extends Fragment {


    public FragmentInventory() {
        // Required empty public constructor
    }


    public static FragmentInventory newInstance() {
        FragmentInventory fragment = new FragmentInventory();

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
        View rootView = inflater.inflate(R.layout.fragment_inventory, container, false);

        return rootView;
    }
}