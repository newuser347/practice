package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   EditText salary;
  TextView Salary,Tax,Biweekly;
  Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salary = findViewById(R.id.edsal);
        Salary = findViewById(R.id.sal);
        Tax = findViewById(R.id.tax);
        Biweekly = findViewById(R.id.bs);
        calc = findViewById(R.id.cal);
        calc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (!salary.getText().toString().equals("")) {
            double salaries = Double.parseDouble(salary.getText().toString());

        }
    }}