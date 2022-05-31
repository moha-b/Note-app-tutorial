package com.example.noteapp.Home.Profile;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.noteapp.R;
import com.google.android.material.navigation.NavigationView;

public class profile extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false);

        TextView name = view.findViewById(R.id.name_user);
        TextView email = view.findViewById(R.id.email_user);
        Button friends = view.findViewById(R.id.friends);
        Button myNotes = view.findViewById(R.id.my_note);

        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace(new friends(),R.id.fragment);
            }
        });

        myNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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