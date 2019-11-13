package com.example.hw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    int[] MonthID = {R.id.M1_2, R.id.M3_4, R.id.M5_6, R.id.M7_8, R.id.M9_10, R.id.M11_12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAllMonthClick();

    }

    void setAllMonthClick() {
        for (int i = 0; i < MonthID.length; i++)
            monthClick(i);
    }

    void monthClick(final int setID) {
        Button Month = findViewById(MonthID[setID]);
        Month.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month", setID);
                startActivity(intent);
            }
        });
    }
}
