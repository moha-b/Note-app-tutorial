package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // variable section
        EditText signUpUserName = findViewById(R.id.signUpUserName);
        EditText signUpPassword = findViewById(R.id.signUpPassword);
        Button go = findViewById(R.id.signUp);

        // go to home page
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = signUpUserName.getText().toString();
                String userPassword = signUpPassword.getText().toString();

//                if (user.isEmpty() || userPassword.isEmpty()){
//                    Toast.makeText(getApplicationContext(),"lol",Toast.LENGTH_SHORT).show();
//                }else{
//                    connection with firebase
//                }

                //Intent intent = new Intent(signIn.this,home.class);
                //startActivity(intent);
            }
        });

    }
}