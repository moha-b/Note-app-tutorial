package com.example.noteapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Notes[] Notes;
    Context context;

    public Adapter(Notes[] Notes, Home activity) {
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
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            noteTitle = itemView.findViewById(R.id.note_title);   // note_title
            noteContent = itemView.findViewById(R.id.note_content); // note_content

        }
    }
}
