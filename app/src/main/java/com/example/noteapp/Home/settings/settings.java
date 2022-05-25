package com.example.noteapp.Home.settings;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.noteapp.Home.Main;
import com.example.noteapp.R;
import com.example.noteapp.Registration.logIn;

public class settings extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_settings, container, false);

        Button help = view.findViewById(R.id.Help);
        Button about = view.findViewById(R.id.About);
        Button changePassword = view.findViewById(R.id.change_passsword);
        Button log_out = view.findViewById(R.id.log_out);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace(new help(),R.id.fragment);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace(new about(),R.id.fragment);
            }
        });

//        changePassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                replace(new changePassword(),R.id.fragment);
//            }
//        });
//
//        log_out.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Main.class, logIn.class));
//            }
//        });


        return view;
    }

    public void replace(Fragment fragment, int layout){
        FragmentManager fg = requireActivity().getSupportFragmentManager();
        FragmentTransaction ft = fg.beginTransaction();
        ft.replace(layout,fragment);
        ft.commit();
    }
}