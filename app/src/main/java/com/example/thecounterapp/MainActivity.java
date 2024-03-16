package com.example.thecounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView appName;
    TextView counterText;
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appName = findViewById(R.id.appName_text);
        counterText = findViewById(R.id.counter_text);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                counterText.setText("" + increaseNumber());
            }
        });
    }

    public int increaseNumber() {
        return ++counter;
    }
}