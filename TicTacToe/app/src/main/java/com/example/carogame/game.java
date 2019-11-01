package com.example.carogame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class game extends AppCompatActivity {
    String caro = "X";
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_playAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText(caro);
                changeState();
                checkWin();
            }
        });

        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText(caro);
                changeState();
                checkWin();
            }
        });

        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setText(caro);
                changeState();
                checkWin();
            }
        });

        btn4 = findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setText(caro);
                changeState();
                checkWin();
            }
        });
        btn5 = findViewById(R.id.btn5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setText(caro);
                changeState();
                checkWin();
            }
        });
        btn6 = findViewById(R.id.btn6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setText(caro);
                changeState();
                checkWin();
            }
        });

        btn7 = findViewById(R.id.btn7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn7.setText(caro);
                changeState();
                checkWin();
            }
        });

        btn8 = findViewById(R.id.btn8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn8.setText(caro);
                changeState();
                checkWin();
            }
        });

        btn9 = findViewById(R.id.btn9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setText(caro);
                changeState();
                checkWin();
            }
        });

        btn_playAgain = findViewById(R.id.btn_playAgain);

        btn_playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAgain();
            }
        });
    }

    public void changeState(){
        if (caro.equals("X")){
            caro = "O";
        }else caro = "X";
    }

    public void playAgain(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        caro = "X";
    }

    public void checkWin(){
        String btn1Text = btn1.getText().toString();
        String btn2Text = btn2.getText().toString();
        String btn3Text = btn3.getText().toString();
        String btn4Text = btn4.getText().toString();
        String btn5Text = btn5.getText().toString();
        String btn6Text = btn6.getText().toString();
        String btn7Text = btn7.getText().toString();
        String btn8Text = btn8.getText().toString();
        String btn9Text = btn9.getText().toString();

        if (btn1Text.equals(btn2Text) && btn2Text.equals(btn3Text) && (!btn1Text.equals("") || !btn2Text.equals("") || !btn3Text.equals(""))){
            showNotification(btn1Text + " Win");
        }

        if (btn3Text.equals(btn4Text) && btn4Text.equals(btn5Text) && (!btn4Text.equals("") || !btn5Text.equals("") || !btn6Text.equals(""))){
            showNotification(btn1Text + " Win");
        }

        if (btn7Text.equals(btn8Text) && btn8Text.equals(btn9Text) && (!btn7Text.equals("") || !btn8Text.equals("") || !btn9Text.equals(""))){
            showNotification(btn1Text + " Win");
        }

        if (btn1Text.equals(btn4Text) && btn4Text.equals(btn7Text) && (!btn1Text.equals("") || !btn4Text.equals("") || !btn7Text.equals(""))){
            showNotification(btn1Text + " Win");
        }

        if (btn2Text.equals(btn5Text) && btn5Text.equals(btn8Text) && (!btn2Text.equals("") || !btn5Text.equals("") || !btn8Text.equals(""))){
            showNotification(btn1Text + " Win");
        }

        if (btn3Text.equals(btn6Text) && btn6Text.equals(btn9Text) && (!btn3Text.equals("") || !btn6Text.equals("") || !btn9Text.equals(""))){
            showNotification(btn1Text + " Win");
        }

        if (btn1Text.equals(btn5Text) && btn5Text.equals(btn9Text) && (!btn1Text.equals("") || !btn5Text.equals("") || !btn9Text.equals(""))){
            showNotification(btn1Text + " Win");
        }

        if (btn3Text.equals(btn5Text) && btn5Text.equals(btn7Text) && (!btn3Text.equals("") || !btn5Text.equals("") || !btn7Text.equals(""))){
            showNotification(btn1Text + " Win");
        }
    }

    public void showNotification(String message){
        new AlertDialog.Builder(this)
                .setTitle("Notification")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).show();
    }
}
