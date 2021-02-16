package com.example.w4d.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.w4d.R;


public class UpdateEmailFragment extends Fragment {


    public UpdateEmailFragment() {
        // Required empty public constructor
    }

    public static UpdateEmailFragment newInstance(String param1, String param2) {
        UpdateEmailFragment fragment = new UpdateEmailFragment();

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
        View rootView = inflater.inflate(R.layout.fragment_update_email, container, false);

        return rootView;
    }
}