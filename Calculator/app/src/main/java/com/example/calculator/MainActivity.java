package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn0, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_cal, btn_minus, btn_plus, btn_mul, btn_de, btn_cancel, btn_delete;
    TextView display, txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cal = findViewById(R.id.btn_cal);
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal();
            }
        });

        btn_cancel = findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
            }
        });

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("1");
            }
        });

        btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("0");
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("2");
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("3");
            }
        });

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("4");
            }
        });

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("5");
            }
        });

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("6");
            }
        });

        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("7");
            }
        });

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("8");
            }
        });

        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("9");
            }
        });

        btn_minus = findViewById(R.id.btn_minus);
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("-");
            }
        });

        btn_plus = findViewById(R.id.btn_plus);
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("+");
            }
        });

        btn_mul = findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("*");
            }
        });

        btn_de = findViewById(R.id.btn_de);
        btn_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("/");
            }
        });

        btn_delete = findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteChar();
            }

        });
    }

    public void display(String a) {
        display = findViewById(R.id.display);
        if (a.equals("+") || a.equals("-") || a.equals("/") || a.equals("*")) {
            display.setText(display.getText() + " " + a + " ");
        } else {
            display.setText(display.getText() + a);
        }
    }

    public void cal() {
        display = findViewById(R.id.display);
        String str = display.getText().toString();
        txtResult = findViewById(R.id.result);

        String arr[] = str.split(" ");
        Float result;
        result = Float.parseFloat(arr[0]);

        for (int i=1; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                result += Integer.parseInt(arr[i+1]);
            }
            if (arr[i].equals("-")) {
                result -= Integer.parseInt(arr[i+1]);
            }
            if (arr[i].equals("*")) {
                result *= Integer.parseInt(arr[i+1]);
            }
            if (arr[i].equals("/")) {
                result /= Integer.parseInt(arr[i+1]);
            }
            Log.i("Tag", "Not thing");
        }

        txtResult.setText(String.valueOf(result));
    }

    public void cancel(){
        display = findViewById(R.id.display);
        display.setText("");
        txtResult.setText("");
    }


    public void deleteChar() {
        display = findViewById(R.id.display);
        String str = display.getText().toString();
        display.setText(str.substring(0, str.length() - 1));
    }


}
