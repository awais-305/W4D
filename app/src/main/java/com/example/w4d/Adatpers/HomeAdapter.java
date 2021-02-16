package com.example.w4d.Adatpers;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.w4d.Model.HomeModel;
import com.example.w4d.OnClickListener;
import com.example.w4d.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.myViewHolder> {

    public static OnClickListener mOnClickListener;
    ArrayList<HomeModel> list;
    LayoutInflater layoutInflater;
    Context context;

    public HomeAdapter(ArrayList<HomeModel> list, Context context) {
        layoutInflater = LayoutInflater.from(context);
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflate the list item view for each recycler view item
        View homeView = layoutInflater.inflate( R.layout.home_item, parent , false);
        //Setting the type face of the item text
        return new HomeAdapter.myViewHolder(homeView);
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

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView image_icon;
        TextView textView;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            image_icon = itemView.findViewById(R.id.image_view_item);
            textView = itemView.findViewById(R.id.textview_item);
        }

        @Override
        public void onClick(View v) {
            Log.i("Home list adapter", "list item clicked.");
            mOnClickListener.OnItemClick(v, getAdapterPosition());
        }
    }

    public void setOnItemClickListener(OnClickListener clickListener) {
        HomeAdapter.mOnClickListener = clickListener;
    }

}



