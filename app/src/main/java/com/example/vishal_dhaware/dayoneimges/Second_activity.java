package com.example.vishal_dhaware.dayoneimges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Second_activity extends AppCompatActivity {
    int index=0;
    int[] images=new int[]{R.drawable.image_one,R.drawable.image_two,R.drawable.image_three};
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void slide(View view) {
        imageView=findViewById(R.id.image_slider);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_animation);
         imageView.setAnimation(animation);
        imageView.setImageResource(images[index]);
        index++;
        if (index==images.length){
            index=0;
        }
    }
}
