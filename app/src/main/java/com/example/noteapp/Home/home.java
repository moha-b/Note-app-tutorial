package com.example.noteapp.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.noteapp.Notes;
import com.example.noteapp.R;

public class home extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        Notes[] notes = new Notes[]{
                new Notes("Greetings","Hello World"),
                new Notes("Valorant","main kj, chamber maybe sage or kay/o"),
                new Notes("this just a shit","Completely uesless note with no goal"),
                new Notes("hmmmm","qew"),
                new Notes("hmmmm","sdadad"),
                new Notes("hmmmm","hmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm"),
                new Notes("hmmmm","hmmmmmmmmmmmeeemmmmssasdasdmmmmmmmmmmmmmmmmmmmmm"),
                new Notes("hmmmm","hmmmmmmmmmaaaaaaaaaaaaaaaaaaaaammmmmmmmmmmmmmmmmmmmmmmmmm"),
                new Notes("hmmmm","hmmmmmmmmmmmmmmssssssmmmmmmmmmmmmmmmmmmmmmmmm"),
                new Notes("hmmmm","hmmmmmmmmmmmmmmmmmmmmmmmmmmmm"),

        };

        Adapter adapter = new Adapter(notes,home.this);
        recyclerView.setAdapter(adapter);


        return view;
    }
}