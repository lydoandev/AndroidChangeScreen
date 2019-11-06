package com.example.demoimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    int check = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.image_dog);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check == 0){
                    img.setImageResource(R.drawable.ly);
                    check = 1;
                }else {
                    img.setImageResource(R.drawable.cho);
                    check = 0;
                }
            }
        });
    }

}
