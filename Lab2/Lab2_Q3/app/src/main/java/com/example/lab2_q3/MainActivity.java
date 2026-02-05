package com.example.lab2_q3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TO SHOW THE LINEAR LAYOUT (Image 1):
        //setContentView(R.layout.activity_linear);

        // OR TO SHOW THE RELATIVE LAYOUT (Image 2):
        setContentView(R.layout.activity_relative);
    }
}