package com.example.hw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button M1;
    private Button M3;
    private Button M5;
    private Button M7;
    private Button M9;
    private Button M11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M1 = (Button)findViewById(R.id.M1_2);
        M3 = (Button)findViewById(R.id.M3_4);
        M5 = (Button)findViewById(R.id.M5_6);
        M7 = (Button)findViewById(R.id.M7_8);
        M9 = (Button)findViewById(R.id.M9_10);
        M11 = (Button)findViewById(R.id.M11_12);


        M1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",1);
                startActivity(intent);
            }
        });
        M3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",3);
                startActivity(intent);
            }
        });
        M5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",5);
                startActivity(intent);
            }
        });
        M7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",7);
                startActivity(intent);
            }
        });
        M9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",9);
                startActivity(intent);
            }
        });
        M11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",11);
                startActivity(intent);
            }
        });





    }



}
