package com.example.noteapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderView;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.Holder> {

    int[] images;
    public SliderAdapter(int[] images){
        this.images = images;
    }
    @Override
    public SliderAdapter.Holder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_intro,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(SliderAdapter.Holder viewHolder, int position) {
        viewHolder.image.setImageResource(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    public static class Holder extends SliderViewAdapter.ViewHolder{

        ImageView image;
        public Holder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
        }
    }
}
