package com.example.noteapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class logIn extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_log_in, container, false);

        EditText userName = view.findViewById(R.id.logInUserName);
        EditText password = view.findViewById(R.id.logInPassword);
        Button go = view.findViewById(R.id.Login);


        return view;
    }


}