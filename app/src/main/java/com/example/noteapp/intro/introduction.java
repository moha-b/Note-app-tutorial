package com.example.noteapp.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.noteapp.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class introduction extends AppCompatActivity {

    SliderView slider;
    Images[] images = new Images[]{
            new Images(R.drawable.splash_background_1),
            new Images(R.drawable.splash_background_2),
            new Images(R.drawable.splash_background_3)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        slider = findViewById(R.id.Slider);
        imageAdapter imageadapter = new imageAdapter(images,introduction.this);
        slider.setSliderAdapter(imageadapter);
        slider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        slider.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        slider.startAutoCycle();

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