package com.example.lab4_q3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ToggleButton modeToggle;
    private ImageView modeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modeToggle = findViewById(R.id.modeToggle);
        modeImage = findViewById(R.id.modeImage);
        Button btnChangeMode = findViewById(R.id.btnChangeMode);

        // 1. Listener for the ToggleButton itself
        modeToggle.setOnCheckedChangeListener((buttonView, isChecked) -> updateUI(isChecked));

        // 2. Listener for the "Change Mode" button
        btnChangeMode.setOnClickListener(v -> {
            // Toggle the current state programmatically
            modeToggle.toggle();
        });
    }

    private void updateUI(boolean isMobileData) {
        if (isMobileData) {
            modeImage.setImageResource(R.drawable.ic_mobile_data);
            Toast.makeText(this, "Mode: Mobile Data", Toast.LENGTH_SHORT).show();
        } else {
            modeImage.setImageResource(R.drawable.ic_wifi);
            Toast.makeText(this, "Mode: Wi-Fi", Toast.LENGTH_SHORT).show();
        }
    }
}
