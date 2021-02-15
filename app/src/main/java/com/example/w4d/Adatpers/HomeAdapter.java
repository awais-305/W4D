package com.example.w4d.Adatpers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.w4d.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.myViewHolder> {



    ArrayList<HomeModel> list;
    Context context;

    public HomeAdapter(ArrayList<HomeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View v=layoutInflater.inflate(R.layout.home_item,parent,false);
        return new myViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
//
            holder.image_icon.setImageResource(list.get(position).getImage());
            holder.textView.setText(list.get(position).getTextrv());





    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView image_icon;
        TextView textView;




        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            image_icon = itemView.findViewById(R.id.image_view_item);
            textView = itemView.findViewById(R.id.textview_item);








        }
    }
}



