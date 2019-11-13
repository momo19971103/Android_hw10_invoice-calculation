package com.example.hw10;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView ansText = findViewById(R.id.AnsText);

        Intent intent = getIntent();
        final int month = intent.getIntExtra("Month", 0);
        final String[] Num = intent.getStringArrayExtra("Num");

        final String enter = intent.getStringExtra("enter");

        for (int i = 0; i < 6; i++) {
            assert enter != null;
            assert Num != null;
            if (enter.matches(Num[0])) {
                ansText.setText("恭喜獎金1000萬元");
            } else if (enter.matches(Num[1])) {
                ansText.setText("恭喜獎金200萬元");
            } else if (enter.substring(i, 8).matches(Num[2].substring(i, 8))
                    || enter.substring(i, 8).matches(Num[3].substring(i, 8))
                    || enter.substring(i, 8).matches(Num[4].substring(i, 8))) {
                StringConversion stringConversion = new StringConversion(i);
                ansText.setText(stringConversion.get_String());
                break;
            } else {
                ansText.setText("QAQ 沒有中獎 ");
            }
        }

        final Button button = findViewById(R.id.Back_Month_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final Button button1 = findViewById(R.id.Back_Number_button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                intent.putExtra("Month", month);
                startActivity(intent);
            }
        });

    }
}
