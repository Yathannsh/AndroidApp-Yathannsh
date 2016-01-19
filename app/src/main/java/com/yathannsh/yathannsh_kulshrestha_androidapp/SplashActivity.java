package com.yathannsh.yathannsh_kulshrestha_androidapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);
        getSupportActionBar().hide();
        //getActionBar().hide();
        //handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashActivity.this, ScrollingActivity.class);

                startActivity(i);

                // close activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
