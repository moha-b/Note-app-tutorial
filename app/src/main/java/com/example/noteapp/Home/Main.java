package com.example.noteapp.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.noteapp.Home.settings.settings;
import com.example.noteapp.R;
import com.example.noteapp.createNote;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Main extends AppCompatActivity {

    FloatingActionButton fab ;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // TODO: Float Action Button Declaration & Action
        fab = findViewById(R.id.add_note);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, createNote.class));
                //replace(new createNote(),R.id.fragment);
            }
        });

        // TODO: Navigation bar Declaration & Action
        MeowBottomNavigation nav = findViewById(R.id.nav);
        nav.add(new MeowBottomNavigation.Model(1,R.drawable.ic_outline_person_24));
        nav.add(new MeowBottomNavigation.Model(2,R.drawable.ic_outline_home_24));
        nav.add(new MeowBottomNavigation.Model(3,R.drawable.ic_outline_settings_24));

        if (savedInstanceState == null){
            replace(new home(),R.id.fragment);
            //nav.setSelected();
        }

        nav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId()){
                    case 1:
                        replace(new profile(),R.id.fragment);
                        fab.hide();
                        break;
                    case 2:
                        replace(new home(),R.id.fragment);
                        fab.show();
                        break;
                    case 3:
                        replace(new settings(),R.id.fragment);
                        fab.hide();
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