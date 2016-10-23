package com.example.bmi_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculate extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        Intent intent = getIntent();
        String nameAct = intent.getStringExtra("num");
        String valueAct = intent.getStringExtra("value");


        TextView nameText = (TextView) findViewById(R.id.textView2);
        nameText.setText(nameAct);

        TextView valueText = (TextView) findViewById(R.id.textView4);
        valueText.setText(valueAct);
    }
}