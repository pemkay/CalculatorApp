package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunctionAdd(View view){
        EditText myTextField = (EditText) findViewById(R.id.int1);
        EditText myTextField2 = (EditText) findViewById(R.id.int2);
        int number1 = Integer.parseInt(myTextField.getText().toString());
        int number2 = Integer.parseInt(myTextField2.getText().toString());

        goToActivity2(Integer.toString(number1 + number2));
    }

    public void clickFunctionSubtract(View view){
        EditText myTextField = (EditText) findViewById(R.id.int1);
        EditText myTextField2 = (EditText) findViewById(R.id.int2);
        int number1 = Integer.parseInt(myTextField.getText().toString());
        int number2 = Integer.parseInt(myTextField2.getText().toString());

        goToActivity2(Integer.toString(number1 - number2));
    }

    public void clickFunctionMultiply(View view){
        EditText myTextField = (EditText) findViewById(R.id.int1);
        EditText myTextField2 = (EditText) findViewById(R.id.int2);
        int number1 = Integer.parseInt(myTextField.getText().toString());
        int number2 = Integer.parseInt(myTextField2.getText().toString());

        goToActivity2(Integer.toString(number1 * number2));
    }

    public void clickFunctionDivide(View view){
        EditText myTextField = (EditText) findViewById(R.id.int1);
        EditText myTextField2 = (EditText) findViewById(R.id.int2);
        int number1 = Integer.parseInt(myTextField.getText().toString());
        int number2 = Integer.parseInt(myTextField2.getText().toString());

        goToActivity2(Integer.toString(number1 / number2));
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}