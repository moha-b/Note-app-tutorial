package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class logIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // variable section
        EditText userName = findViewById(R.id.logInUserName);
        EditText password = findViewById(R.id.logInPassword);
        Button go = findViewById(R.id.Login);

        // go to home page
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = userName.getText().toString();
                String userPassword = password.getText().toString();

//                if (user.isEmpty() || userPassword.isEmpty()){
//                    Toast.makeText(getApplicationContext(),"lol",Toast.LENGTH_SHORT).show();
//                }else{
//                    connection with SQLite
//                }

                Intent intent = new Intent(logIn.this,Home.class);
                startActivity(intent);
            }
        });
    }
}