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
    String N1, N2, N3, N4, N5;
    //String[] Num = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t1 = findViewById(R.id.N_1);
        TextView t2 = findViewById(R.id.N_2);
        TextView t3 = findViewById(R.id.N_3);
        TextView t4 = findViewById(R.id.N_4);
        TextView t5 = findViewById(R.id.N_5);
        editText = findViewById(R.id.editText);

        Intent intent = getIntent();
        final int month = intent.getIntExtra("Month", 0);

        switch (month) {
            case 0:
                N1 = getString(R.string.N_1_1_2);
                N2 = getString(R.string.N_2_1_2);
                N3 = getString(R.string.N_3_1_2);
                N4 = getString(R.string.N_4_1_2);
                N5 = getString(R.string.N_5_1_2);
                break;
            case 1:
                N1 = getString(R.string.N_1_3_4);
                N2 = getString(R.string.N_2_3_4);
                N3 = getString(R.string.N_3_3_4);
                N4 = getString(R.string.N_4_3_4);
                N5 = getString(R.string.N_5_3_4);
                break;
            case 2:
                N1 = getString(R.string.N_1_5_6);
                N2 = getString(R.string.N_2_5_6);
                N3 = getString(R.string.N_3_5_6);
                N4 = getString(R.string.N_4_5_6);
                N5 = getString(R.string.N_5_5_6);
                break;
            case 3:
                N1 = getString(R.string.N_1_7_8);
                N2 = getString(R.string.N_2_7_8);
                N3 = getString(R.string.N_3_7_8);
                N4 = getString(R.string.N_4_7_8);
                N5 = getString(R.string.N_5_7_8);
                break;
            case 4:
                N1 = getString(R.string.N_1_9_10);
                N2 = getString(R.string.N_2_9_10);
                N3 = getString(R.string.N_3_9_10);
                N4 = getString(R.string.N_4_9_10);
                N5 = getString(R.string.N_5_9_10);
                break;
            case 5:
                N1 = getString(R.string.N_1_11_12);
                N2 = getString(R.string.N_2_11_12);
                N3 = getString(R.string.N_3_11_12);
                N4 = getString(R.string.N_4_11_12);
                N5 = getString(R.string.N_5_11_12);
                break;
        }

        t1.setText(N1);
        t2.setText(N2);
        t3.setText(N3);
        t4.setText(N4);
        t5.setText(N5);

        final Button button = findViewById(R.id.Back_button_B);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final Button button1 =  findViewById(R.id.Ans_button_B);
        button1.setOnClickListener(new View.OnClickListener() {
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
                    intent.putExtra("N1", N1);
                    intent.putExtra("N2", N2);
                    intent.putExtra("N3", N3);
                    intent.putExtra("N4", N4);
                    intent.putExtra("N5", N5);
                    intent.putExtra("enter", enter);
                    startActivity(intent);
                }

            }
        });

    }
}
