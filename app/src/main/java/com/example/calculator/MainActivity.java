package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaring editText , text view, buttons
    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add, subtract, multiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // code to hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        // Edit text
        etFirstValue= findViewById(R.id.etFirstValue);
        etSecondValue= findViewById(R.id.etSecondValue);
        //textView
        tvAns= findViewById(R.id.tvAns);
        //Buttons
        add= findViewById(R.id.btAdd);
        subtract= findViewById(R.id.btSubtract);
        multiply= findViewById(R.id.btMultiply);
        divide= findViewById(R.id.btDivide);
        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                ans= firstValue + secondValue;
                tvAns.setText(firstValue + "+" + secondValue + " = " + ans);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                ans= firstValue - secondValue;
                tvAns.setText(firstValue+"-"+secondValue+" = "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                ans= firstValue * secondValue;
                tvAns.setText(firstValue+"×"+secondValue+" = "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                ans= firstValue / secondValue;
                tvAns.setText(firstValue+"÷"+secondValue+" = "+ans);
            }
        });
    }
}