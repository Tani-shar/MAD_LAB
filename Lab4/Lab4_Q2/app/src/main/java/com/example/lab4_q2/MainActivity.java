package com.example.lab4_q2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnOreo).setOnClickListener(v -> showCustomToast("Android Oreo", R.drawable.ic_oreo));
        findViewById(R.id.btnPie).setOnClickListener(v -> showCustomToast("Android Pie", R.drawable.ic_pie));
        findViewById(R.id.btnQ).setOnClickListener(v -> showCustomToast("Android 10", R.drawable.ic_android10));
    }

    private void showCustomToast(String name, int iconRes) {
        // Inflate the custom layout
        View layout = getLayoutInflater().inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_container));

        // Set the text and icon
        ImageView img = layout.findViewById(R.id.toastIcon);
        TextView txt = layout.findViewById(R.id.toastText);
        img.setImageResource(iconRes);
        txt.setText(name);

        // Create and show the Toast
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
