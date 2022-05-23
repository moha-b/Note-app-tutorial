package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class createNote extends AppCompatActivity {

    FloatingActionButton fab;
    EditText contentNote;
    EditText titleNote;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        fab = findViewById(R.id.save_note);

        contentNote = findViewById(R.id.note);
        titleNote = findViewById(R.id.noteTitle);
        toolbar = findViewById(R.id.toolBar);
        // back button to go back the main page
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}