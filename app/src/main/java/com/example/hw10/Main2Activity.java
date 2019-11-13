package com.example.hw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private EditText editText;

    String[] Num = new String[5];
    int[][] R_string = {{R.string.N_1_1_2, R.string.N_2_1_2, R.string.N_3_1_2, R.string.N_4_1_2, R.string.N_5_1_2},
            {R.string.N_1_3_4, R.string.N_2_3_4, R.string.N_3_3_4, R.string.N_4_3_4, R.string.N_5_3_4},
            {R.string.N_1_5_6, R.string.N_2_5_6, R.string.N_3_5_6, R.string.N_4_5_6, R.string.N_5_5_6},
            {R.string.N_1_7_8, R.string.N_2_7_8, R.string.N_3_7_8, R.string.N_4_7_8, R.string.N_5_7_8},
            {R.string.N_1_9_10, R.string.N_2_9_10, R.string.N_3_9_10, R.string.N_4_9_10, R.string.N_5_9_10},
            {R.string.N_1_11_12, R.string.N_2_11_12, R.string.N_3_11_12, R.string.N_4_11_12, R.string.N_5_11_12}};
    int[] Rid = {R.id.N_1, R.id.N_2, R.id.N_3, R.id.N_4, R.id.N_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.editText);

        Intent intent = getIntent();
        final int month = intent.getIntExtra("Month", 0);

        for (int i = 0; i < 5; i++) {
            Num[i] = getString(R_string[month][i]);
            TextView textView = findViewById(Rid[i]);
            textView.setText(Num[i]);
        }


        final Button Back_button = findViewById(R.id.Back_button_B);
        Back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final Button Ans_button = findViewById(R.id.Ans_button_B);
        Ans_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (editText.getText().toString().matches("")) {
                    Toast toast = Toast.makeText(Main2Activity.this, "欄位不能是空白!!", Toast.LENGTH_LONG);
                    toast.show();
                } else if (editText.getText().toString().length() < 8 || editText.getText().toString().length() > 8) {
                    Toast toast = Toast.makeText(Main2Activity.this, "發票號碼一共8碼", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    String enter = editText.getText().toString();
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    intent.putExtra("Month", month);
                    intent.putExtra("Num",Num);
                    intent.putExtra("enter", enter);
                    startActivity(intent);
                }

            }
        });

    }
}
