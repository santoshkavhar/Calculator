package com.example.calculator_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button btn[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = new Button[16];
        display = findViewById(R.id.display);
        btnClickListeners();
    }

    public void btnClickListeners(){

        int[] buttonID = new int[]{R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4,
                R.id.btn_5, R.id.btn_6, R.id.btn_7, R.id.btn_8, R.id.btn_9 , R.id.btn_AC,
                R.id.btn_div, R.id.btn_mul, R.id.btn_plus, R.id.btn_minus, R.id.btn_equal };


        // attaching views
        for (int i = 0; i <16; i++){
            btn[i] = findViewById(buttonID[i]);
            Log.d("This is log...", String.format("%d",i));

            int j = i;

            btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (j == 10) {
                        display.setText("");
                    }
                    else if (j == 15) {
                        calculate();
                    }
                    else {
                        display.setText(""+display.getText()+btn[j].getText());
                    }
                }
            });
        }
    }

    public void calculate(){

    }
}