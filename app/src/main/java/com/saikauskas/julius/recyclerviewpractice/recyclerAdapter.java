package com.saikauskas.julius.recyclerviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolder> {

    private ArrayList<Item> itemList;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView1, textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);

        }
    }

    public recyclerAdapter(ArrayList<Item> itemList){
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Item currentItem = itemList.get(position);

        holder.imageView.setImageResource(currentItem.getmImgResource());
        holder.textView1.setText(currentItem.getmText1());
        holder.textView2.setText(currentItem.getmText2());


    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


}
