package com.example.admin.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText firstEditText, secondEditText;
    private Button addBox, minusbox, multiplybox, dividebox;
    private TextView textBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        firstEditText = (EditText) findViewById(R.id.firstNumberEt);
        secondEditText = (EditText) findViewById(R.id.second_number);
        addBox = (Button) findViewById(R.id.add_button);
        textBox = (TextView) findViewById(R.id.resultText);
        minusbox = (Button) findViewById(R.id.minus_button);
        multiplybox = (Button) findViewById(R.id.mul_btn);
        dividebox = (Button) findViewById(R.id.divide_btn);


        View.OnClickListener add_btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.add_button) {
                    int firstInt = Integer.parseInt(firstEditText.getText().toString());
                    int secondInt = Integer.parseInt(secondEditText.getText().toString());
                    int result = firstInt + secondInt;
                    textBox.setText(String.valueOf(result));
                }
                if (v.getId() == R.id.minus_button) {
                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());
                    double result = firstInt - secondInt;
                    textBox.setText(String.valueOf(result));
                }

                if (v.getId() == R.id.mul_btn) {
                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());
                    double result = firstInt * secondInt;
                    textBox.setText(String.valueOf(result));

                }
                if (v.getId() == R.id.divide_btn) {
                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());
                    double result = firstInt / secondInt;
                    textBox.setText(String.valueOf(result));
                }

            }

        };
        addBox.setOnClickListener(add_btn_click);
        minusbox.setOnClickListener(add_btn_click);
        multiplybox.setOnClickListener(add_btn_click);
        dividebox.setOnClickListener(add_btn_click);

    }
}























