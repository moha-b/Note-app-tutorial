package com.example.noteapp.Home.Profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.noteapp.R;

public class friends extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_friends, container, false);

        FrameLayout frame = view.findViewById(R.id.frame);

        ImageView back = view.findViewById(R.id.back_settings);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace(new profile(),R.id.fragment);
            }
        });

        Button remove = view.findViewById(R.id.remove);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frame.setVisibility(view.GONE);
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