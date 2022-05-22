package com.example.noteapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class Notes extends Fragment {
    View view;
    FloatingActionButton fab ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_notes, container, false);

        fab = fab.findViewById(R.id.add_note);

        
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //replace(new profile(),R.id.fragment);

            }
        });


        return view;
    }

    public void replace(Fragment fragment, int layout){
        FragmentManager fg = requireActivity().getSupportFragmentManager();
        FragmentTransaction ft = fg.beginTransaction();
        ft.replace(layout,fragment);
        ft.commit();
    }
}