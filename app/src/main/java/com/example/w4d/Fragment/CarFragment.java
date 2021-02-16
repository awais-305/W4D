package com.example.w4d.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.w4d.Activities.LoginActivity;
import com.example.w4d.Adatpers.HomeAdapter;
import com.example.w4d.Model.HomeModel;
import com.example.w4d.OnClickListener;
import com.example.w4d.R;

import java.util.ArrayList;

public class CarFragment extends Fragment implements OnClickListener {

    ArrayList<HomeModel> list;
    HomeAdapter homeAdapter;
    Context context;
    HomeModel homeModel ;

    RecyclerView recyclerView;

    public CarFragment() {
        // Required empty public constructor
    }

    public static CarFragment newInstance() {
        CarFragment fragment = new CarFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_car, container, false);
        addData();
        recyclerView = rootView.findViewById(R.id.car_recycler_view);
        homeAdapter = new HomeAdapter(list,context);
        recyclerView.setAdapter(homeAdapter);
        homeAdapter.setOnItemClickListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        return rootView;
    }

    private void addData(){
        list = new ArrayList<>();
        list.add(new HomeModel(R.drawable.car,context.getString(R.string.post_vehicle)));
        list.add(new HomeModel(R.drawable.trolley,context.getString(R.string.inventory)));
        list.add(new HomeModel(R.drawable.search,context.getString(R.string.search)));
        list.add(new HomeModel(R.drawable.user,context.getString(R.string.my_profile)));
        list.add(new HomeModel(R.drawable.logout,context.getString(R.string.logout)));
    }

    @Override
    public void OnItemClick(View view, int position) {

        Log.i("Car Fragment: ", position+"");
        if (position == 0) {
            Navigation.findNavController(view).navigate(R.id.action_carFragment_to_fragmentPostVehicle1);
        } else if (position == 1) {
            Navigation.findNavController(view).navigate(R.id.action_carFragment_to_fragmentInventory);
        } else if (position == 2) {
            Navigation.findNavController(view).navigate(R.id.action_carFragment_to_fragmentSearch);
        } else if (position == 3) {
            Navigation.findNavController(view).navigate(R.id.action_carFragment_to_fragmentProfile);
        } else if (position == 4) {
            context.startActivity(new Intent(context, LoginActivity.class));
        }
    }
}