package com.example.noteapp.intro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteapp.R;

public class imageAdapter extends RecyclerView.Adapter<imageAdapter.ViewHolder>{
    Images[] Images;
    Context context;

    public imageAdapter(Images[] Images, Context activity) {
        this.Images = Images;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.sliging_image,parent,false); // put notes in note_layout
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    // we put in an external layout what we want
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Images imagesList = Images[position];
        holder.imageView.setImageResource(imagesList.getImg());
        holder.Content.setText(imagesList.getContent());

    }

    @Override
    public int getItemCount() {
        return Images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView Content;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);   // note_title
            Content = itemView.findViewById(R.id.content); // note_content

        }
    }

}
