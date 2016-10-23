package com.example.bmi_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Human N = new Human();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inputH = (EditText) findViewById(R.id.editText);
        EditText inputW = (EditText) findViewById(R.id.editText2);
        Button randomButton = (Button) findViewById(R.id.calculate);

        final String geta =inputH.getText().toString();
        final String getb =inputW.getText().toString();

        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Integer a =  N.Cal(geta,getb);
                final String b = N.level(a);
                Intent intent = new Intent(MainActivity.this, calculate.class);
                intent.putExtra("num", a);
                intent.putExtra("value",b);
                startActivity(intent);
            }
        });
    }


}

