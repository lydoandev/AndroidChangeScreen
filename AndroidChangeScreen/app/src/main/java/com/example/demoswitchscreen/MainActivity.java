package com.example.demoswitchscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_switch = findViewById(R.id.btn_switch);

        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchScreen();
            }
        });
    }

    public void switchScreen(){

        Intent intent = new Intent(MainActivity.this, second_screen.class);

        startActivity(intent);
    }

}
