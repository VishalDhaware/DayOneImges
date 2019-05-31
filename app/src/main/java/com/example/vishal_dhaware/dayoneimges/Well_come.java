package com.example.vishal_dhaware.dayoneimges;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Well_come extends AppCompatActivity {
 Button show_imges,show_slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_well_come);
        initialize();
        oparetion_on_imgesg();
    }

    private void oparetion_on_imgesg() {
        show_imges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent images=new Intent(Well_come.this,MainActivity.class);
                startActivity(images);
            }
        });
        show_slider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slider=new Intent(Well_come.this,Second_activity.class);
                startActivity(slider);

            }
        });

    }


    private void initialize() {
        show_imges=findViewById(R.id.Show_images);
        show_slider=findViewById(R.id.Show_silider);

    }
}
