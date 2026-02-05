package com.example.lab4_q4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox cbPizza, cbBurger, cbPasta;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbPizza = findViewById(R.id.cbPizza);
        cbBurger = findViewById(R.id.cbBurger);
        cbPasta = findViewById(R.id.cbPasta);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            StringBuilder receipt = new StringBuilder();
            int total = 0;

            if (cbPizza.isChecked()) { receipt.append("Pizza: $10\n"); total += 10; }
            if (cbBurger.isChecked()) { receipt.append("Burger: $5\n"); total += 5; }
            if (cbPasta.isChecked()) { receipt.append("Pasta: $8\n"); total += 8; }

            // Disable checkboxes so they can't be changed
            cbPizza.setEnabled(false);
            cbBurger.setEnabled(false);
            cbPasta.setEnabled(false);
            btnSubmit.setEnabled(false);

            // Pass data to New Activity
            Intent intent = new Intent(MainActivity.this, SummaryActivity.class);
            intent.putExtra("order_details", receipt.toString());
            intent.putExtra("total_cost", total);
            startActivity(intent);
        });
    }
}
