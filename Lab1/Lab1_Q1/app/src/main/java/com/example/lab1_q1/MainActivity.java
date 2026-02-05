package com.example.lab1_q1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView demoText = findViewById(R.id.bodyText);

        // 1. Changing Text Color dynamically
        demoText.setTextColor(Color.BLUE);

        // 2. Changing Font Size
        demoText.setTextSize(24);

        // 3. Changing Font Style/Typeface
        demoText.setTypeface(Typeface.SERIF, Typeface.BOLD);

        // 4. Setting Justification via Code (Requires API 26+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            demoText.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        }
    }
}