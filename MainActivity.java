package com.example.mycounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    Button buttonr;
    int count = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    textView = findViewById(R.id.textView);
    button = findViewById(R.id.button);
    buttonr = findViewById(R.id.buttonr);

    button.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            count++;
            textView.setText(""+count);
        }
    });
    buttonr.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v){
            count=0;
            textView.setText("0");
        }
    });

    }
}