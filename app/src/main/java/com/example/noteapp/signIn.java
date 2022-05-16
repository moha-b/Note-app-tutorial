package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signIn extends AppCompatActivity {

    // variable section
    EditText userName = findViewById(R.id.signUPUserName);
    EditText password = findViewById(R.id.signUpPassword);
    Button go = findViewById(R.id.signUp);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}