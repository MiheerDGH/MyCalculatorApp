package com.example.mycalculatorapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void addNums(View view){
        EditText editNum = findViewById(R.id.firstNumber);
        EditText editNum2 = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);
        // disappears the text when clicked on

        double num1 = Double.parseDouble(editNum.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);

    }
    public void diffNums(View view){
        EditText editNum = findViewById(R.id.firstNumber);
        EditText editNum2 = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);
        // disappears the text when clicked on
        double num1 = Double.parseDouble(editNum.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
        double diff = num1 - num2;

        numberSumTV.setText("" + diff);

    }
    public void multNums(View view){
        EditText editNum = findViewById(R.id.firstNumber);
        EditText editNum2 = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);
        // disappears the text when clicked on

        double num1 = Double.parseDouble(editNum.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
        double product = num1 * num2;

        numberSumTV.setText("" + product);

    }
    public void divNums(View view){
        EditText editNum = findViewById(R.id.firstNumber);
        EditText editNum2 = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);
        double num1 = Double.parseDouble(editNum.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
        // makes the quotient of num1 / num2 into a decimal
        double quotient = num1 / num2;

        numberSumTV.setText("" + quotient);

    }
}