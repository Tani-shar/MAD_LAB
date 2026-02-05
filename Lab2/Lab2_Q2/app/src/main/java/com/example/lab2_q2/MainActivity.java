package com.example.lab2_q2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    double firstNumber = 0;
    double secondNumber = 0;
    String operator = "";
    boolean isNewInput = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        int[] numberButtons = {
                R.id.button0, R.id.button1, R.id.button2, R.id.button3,
                R.id.button4, R.id.button5, R.id.button6,
                R.id.button7, R.id.button8, R.id.button9
        };

        for (int id : numberButtons) {
            findViewById(id).setOnClickListener(this::onNumberClick);
        }

        findViewById(R.id.buttonAdd).setOnClickListener(this::onOperatorClick);
        findViewById(R.id.buttonSub).setOnClickListener(this::onOperatorClick);
        findViewById(R.id.buttonMul).setOnClickListener(this::onOperatorClick);
        findViewById(R.id.buttonDiv).setOnClickListener(this::onOperatorClick);
        findViewById(R.id.buttonEqual).setOnClickListener(this::onEqualClick);

        // CLEAR BUTTON
        findViewById(R.id.buttonClear).setOnClickListener(v -> clear());
    }

    public void onNumberClick(View view) {
        Button button = (Button) view;

        if (isNewInput) {
            textView.setText(button.getText().toString());
            isNewInput = false;
        } else {
            textView.append(button.getText().toString());
        }
    }

    public void onOperatorClick(View view) {
        Button button = (Button) view;
        firstNumber = Double.parseDouble(textView.getText().toString());
        operator = button.getText().toString();
        isNewInput = true;
    }

    public void onEqualClick(View view) {
        secondNumber = Double.parseDouble(textView.getText().toString());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    textView.setText("Error");
                    return;
                }
                break;
        }

        textView.setText(String.valueOf(result));
        isNewInput = true;
    }

    private void clear() {
        textView.setText("0");
        firstNumber = 0;
        secondNumber = 0;
        operator = "";
        isNewInput = true;
    }
}
