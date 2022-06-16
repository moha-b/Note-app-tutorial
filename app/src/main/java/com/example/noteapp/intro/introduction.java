package com.example.noteapp.intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.noteapp.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class introduction extends AppCompatActivity {

    SliderView slider;
    Images[] images = new Images[]{
            new Images(R.drawable.splash_background_1,"yoijgaiegjifgrefhtjyuthkjartjtyuijrtyjdgi;'jgi[gjigia[gjerge"),
            new Images(R.drawable.splash_background_2,"WOWOWO"),
            new Images(R.drawable.splash_background_3,"yo")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL, false));

        imageAdapter adapter = new imageAdapter(images,introduction.this);
        recyclerView.setAdapter(adapter);

    }
}
/*
* slider = findViewById(R.id.Slider);
        SliderAdapter adapter = new SliderAdapter(images);
        slider.setSliderAdapter(adapter);
        slider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        slider.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        slider.startAutoCycle();
*/