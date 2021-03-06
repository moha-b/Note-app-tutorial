package com.example.noteapp.Home.settings;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.noteapp.R;

public class help extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_help, container, false);

        ImageView back = view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace(new settings(),R.id.fragment);
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