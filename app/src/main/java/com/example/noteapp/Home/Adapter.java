package com.example.noteapp.Home;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteapp.Notes;
import com.example.noteapp.R;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    com.example.noteapp.Notes[] Notes;
    home context;

    public Adapter(Notes[] Notes, home activity) {
        this.Notes = Notes;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.note_layout, parent, false); // put notes in note_layout
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    // we put in an external layout what we want
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int color = getRandomColor();

        holder.noteTitle.setBackgroundColor(holder.itemView.getResources().getColor(color,null));
        holder.noteContent.setBackgroundColor(holder.itemView.getResources().getColor(color,null));
        holder.edit.setBackgroundColor(holder.itemView.getResources().getColor(color,null));
        final Notes notesList = Notes[position];
        holder.noteTitle.setText(notesList.getTitleNote());
        holder.noteContent.setText(notesList.getNoteContent());

    }

    @Override
    public int getItemCount() {
        return Notes.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView noteTitle;
        TextView noteContent;
        ImageView edit;
        View card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            noteTitle = itemView.findViewById(R.id.note_title);   // note_title
            noteContent = itemView.findViewById(R.id.note_content); // note_content
            edit = itemView.findViewById(R.id.edit_note);
        }
    }
    public int getRandomColor(){

        List<Integer> color = new LinkedList<>();
        color.add(R.color.color1);
        color.add(R.color.color2);
        color.add(R.color.color3);
        color.add(R.color.color4);
        color.add(R.color.color5);
        color.add(R.color.color6);
        color.add(R.color.color7);
        color.add(R.color.color8);
        color.add(R.color.color9);
        color.add(R.color.color10);
        color.add(R.color.color11);
        color.add(R.color.color12);
        color.add(R.color.color13);
        color.add(R.color.color14);
        color.add(R.color.color15);
        Random random = new Random();

        return color.get(random.nextInt(color.size()));
    }
}