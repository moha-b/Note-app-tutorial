package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
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
    public void replace(Fragment fragment, int layout){
        FragmentManager fg = getSupportFragmentManager();
        FragmentTransaction ft = fg.beginTransaction();
        ft.replace(layout,fragment);
        ft.commit();
    }
}