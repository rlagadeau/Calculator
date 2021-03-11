package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    @SuppressLint("SetTextI18n")
    public void sum(View v){
        TextView results = (TextView) findViewById(R.id.results);
        EditText value1 = (EditText) findViewById(R.id.value1);
        EditText value2 = (EditText) findViewById(R.id.value2);
        int integer_value1 = Integer.parseInt(value1.getText().toString());
        int integer_value2 = Integer.parseInt(value2.getText().toString());
        int result_sum = integer_value1 + integer_value2;
        results.setText(Integer.toString(result_sum));
    }

    @SuppressLint("SetTextI18n")
    public void divide(View v){
        TextView results = (TextView) findViewById(R.id.results);
        EditText value1 = (EditText) findViewById(R.id.value1);
        EditText value2 = (EditText) findViewById(R.id.value2);
        int integer_value1 = Integer.parseInt(value1.getText().toString());
        int integer_value2 = Integer.parseInt(value2.getText().toString());
        int result_divide = integer_value1 / integer_value2;
        results.setText(Integer.toString(result_divide));
    }

    @SuppressLint("SetTextI18n")
    public void multiply(View v){
        TextView results = (TextView) findViewById(R.id.results);
        EditText value1 = (EditText) findViewById(R.id.value1);
        EditText value2 = (EditText) findViewById(R.id.value2);
        int integer_value1 = Integer.parseInt(value1.getText().toString());
        int integer_value2 = Integer.parseInt(value2.getText().toString());
        int result_multiply = integer_value1 * integer_value2;
        results.setText(Integer.toString(result_multiply));
    }


}