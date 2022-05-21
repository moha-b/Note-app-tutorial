package com.example.noteapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signUp extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // variable section
        EditText signUpUserName = findViewById(R.id.signUpUserName);
        EditText signUpPassword = findViewById(R.id.signUpPassword);
        Button go = findViewById(R.id.signUp);
        TextView create = findViewById(R.id.go_login);

        firebaseAuth = firebaseAuth.getInstance();

        // go to home page
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = signUpUserName.getText().toString();
                String userPassword = signUpPassword.getText().toString();

                if (user.isEmpty() || userPassword.isEmpty()){
                    Toast.makeText(getApplicationContext(),"lol",Toast.LENGTH_SHORT).show();
                }else{
//                    connection with firebase
                      firebaseAuth.createUserWithEmailAndPassword(user,userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                          @Override
                          public void onComplete(@NonNull Task<AuthResult> task){
                              if (task.isSuccessful()){
                                  Toast.makeText(getApplicationContext(),"Gamed",Toast.LENGTH_SHORT).show();
                                  startActivity(new Intent(signUp.this,Home.class));
                              }else {
                                  Toast.makeText(getApplicationContext(),"fe 7ahgh 5lat",Toast.LENGTH_SHORT).show();
                              }
                          }
                      });
                }

            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signUp.this,logIn.class));
            }
        });

    }
}