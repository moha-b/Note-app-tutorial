package com.example.noteapp.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.noteapp.Home.Main;
import com.example.noteapp.R;

public class logIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // variable section
        EditText userName = findViewById(R.id.logInEmail);
        EditText password = findViewById(R.id.logInPassword);
        Button go = findViewById(R.id.singIn);
        TextView create = findViewById(R.id.goSingUp);

        // go to home page
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = userName.getText().toString().trim();
                String userPassword = password.getText().toString().trim();

                if (user.isEmpty() || userPassword.isEmpty()){
                    Toast.makeText(getApplicationContext(),"userName & password required",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext()," welcome ",Toast.LENGTH_SHORT).show();
                }

                startActivity(new Intent(logIn.this, Main.class));
            }
        });


        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logIn.this, signUp.class);
                startActivity(intent);
            }
        });
    }
}