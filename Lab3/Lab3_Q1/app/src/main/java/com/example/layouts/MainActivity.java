package com.example.layouts;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openList(View view) {
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }

    public void openGrid(View view) {
        Intent intent = new Intent(this, GridViewActivity.class);
        startActivity(intent);
    }

    public void openTab(View view) {
        Intent intent = new Intent(this, TabActivity.class);
        startActivity(intent);
    }

    public void openTable(View view) {
        Intent intent = new Intent(this, TableActivity.class);
        startActivity(intent);
    }
}

