package com.example.fineplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //redirect to home page "MainActivity"
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //load page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        //handler post deplayed
        new Handler().postDelayed(runnable,2500);
    }
}