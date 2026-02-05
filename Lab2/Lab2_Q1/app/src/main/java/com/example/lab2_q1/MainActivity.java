package com.example.lab2_q1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleDemo";
    TextView lifecycleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecycleText = findViewById(R.id.textView);
        lifecycleText.setText("onCreate() called");

        Log.d(TAG, "onCreate() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        lifecycleText.append("\n onStart() called");
        Log.d(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycleText.append("\n onResume() called");
        Log.d(TAG, "onResume() called");
    }

}