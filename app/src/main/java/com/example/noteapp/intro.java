package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class intro extends AppCompatActivity {

    SliderView slider;
    int[] images ={
            R.drawable.splash_background_1,
            R.drawable.splash_background_2,
            R.drawable.splash_background_3
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        slider = findViewById(R.id.Slider);

    }
}