package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PublicKey;

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
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
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
                String first_value1=etFirstValue.getText().toString().trim();
                String second_value1=etFirstValue.getText().toString().trim();
                if(first_value1.isEmpty() && second_value1.isEmpty())
                {
                    return;
                }
                else {
                    int firstValue, secondValue, ans;
                    firstValue = Integer.parseInt(etFirstValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue + secondValue;
                    tvAns.setText(firstValue + "+" + secondValue + " = " + ans);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String first_value1=etFirstValue.getText().toString().trim();
                String second_value1=etFirstValue.getText().toString().trim();
                if(first_value1.isEmpty() && second_value1.isEmpty())
                {
                   return;
                }
                else {
                    int firstValue, secondValue, ans;
                    firstValue = Integer.parseInt(etFirstValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue - secondValue;
                    tvAns.setText(firstValue + "-" + secondValue + " = " + ans);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String first_value1=etFirstValue.getText().toString().trim();
                String second_value1=etFirstValue.getText().toString().trim();
                if(first_value1.isEmpty() && second_value1.isEmpty())
                {
                    return;
                }
                else {
                    int firstValue, secondValue, ans;
                    firstValue = Integer.parseInt(etFirstValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue * secondValue;
                    tvAns.setText(firstValue + "×" + secondValue + " = " + ans);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String first_value1=etFirstValue.getText().toString().trim();
                String second_value1=etFirstValue.getText().toString().trim();
                if(first_value1.isEmpty() && second_value1.isEmpty())
                {
                   return;
                }
                else {
                    int firstValue, secondValue, ans;
                    firstValue = Integer.parseInt(etFirstValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue / secondValue;
                    tvAns.setText(firstValue + "÷" + secondValue + " = " + ans);
                }
            }
        });
    }
}