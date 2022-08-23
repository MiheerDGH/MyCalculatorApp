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

        int num1 = Integer.parseInt(editNum.getText().toString());
        int num2 = Integer.parseInt(editNum2.getText().toString());
        int sum = num1 + num2;
        numberSumTV.setText("" + sum);

    }
}