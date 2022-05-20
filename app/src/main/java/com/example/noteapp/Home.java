package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);








        // Navigation bar
        MeowBottomNavigation nav = findViewById(R.id.nav);
        nav.add(new MeowBottomNavigation.Model(1,R.drawable.ic_outline_person_24));
        nav.add(new MeowBottomNavigation.Model(2,R.drawable.ic_outline_home_24));
        nav.add(new MeowBottomNavigation.Model(3,R.drawable.ic_outline_settings_24));

        nav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId()){
                    case 1:

                        break;
                    case 2:
                        Intent intent = new Intent(Home.this,Home.class);
                        startActivity(intent);
                        break;
                    case 3:
                        //Intent intent = new Intent(Home.this,signIn.class);
                        //startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });

        nav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
            }
        });



    }
}

// login class
/*
* // variable section


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
*/

// signUp class
/*
*
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
*/