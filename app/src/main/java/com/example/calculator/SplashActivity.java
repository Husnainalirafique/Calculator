package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
        }
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().hide();
        }
        Thread thread=new Thread(){
          public  void run() {
              Intent intent;
              try {
                  sleep(1500);
              } catch (Exception e) {
                  e.printStackTrace();
              } finally {
                  intent = new Intent(SplashActivity.this, MainActivity.class);
              }
              startActivity(intent);
          }
        };thread.start();
    }
}