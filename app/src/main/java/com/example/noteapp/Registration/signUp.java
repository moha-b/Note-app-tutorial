package com.example.noteapp.Registration;

import androidx.annotation.NonNull;
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
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signUp extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // variable section
        EditText signUpUserName = findViewById(R.id.signUpEmail);
        EditText signUpPassword = findViewById(R.id.signUpPassword);
        Button go = findViewById(R.id.signUp);
        TextView create = findViewById(R.id.goLogin);

        firebaseAuth = firebaseAuth.getInstance();

        // go to home page
         // trim -> remove spaces

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = signUpUserName.getText().toString().trim();
                String userPassword = signUpPassword.getText().toString().trim();

                if (user.isEmpty() || userPassword.isEmpty()){
                    Toast.makeText(getApplicationContext(),"username & password required",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"created succesfully",Toast.LENGTH_SHORT).show();
//                    connection with firebase
            }

        };
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signUp.this, logIn.class));
            }
        });

    }
    }
