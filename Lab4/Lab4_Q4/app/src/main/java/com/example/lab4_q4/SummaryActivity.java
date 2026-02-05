package com.example.lab4_q4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView tvSummary = findViewById(R.id.tvSummary);
        TextView tvTotal = findViewById(R.id.tvTotal);

        String details = getIntent().getStringExtra("order_details");
        int total = getIntent().getIntExtra("total_cost", 0);

        tvSummary.setText(details);
        tvTotal.setText("Total Cost: $" + total);
    }
}
