package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class logIn extends AppCompatActivity {

    // variable section
    EditText userName = findViewById(R.id.logInUserName);
    EditText password = findViewById(R.id.logInPassword);
    Button go = findViewById(R.id.Login);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
}