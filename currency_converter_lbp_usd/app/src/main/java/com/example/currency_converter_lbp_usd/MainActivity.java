package com.example.currency_converter_lbp_usd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing variable and linking it to layout object
        Button to_usd_button = (Button) findViewById(R.id.LBPtoUSDButton);
        int exchange_rate = 22000;

        //onclick event
        to_usd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText lbp_amount = (EditText) findViewById(R.id.LBPAmountEditText);

            }
        });

        //initializing variable and linking it to layout object
        Button to_lbp_button = (Button) findViewById(R.id.USDtoLBPButton);

        to_lbp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText usd_amount = (EditText) findViewById(R.id.USDAmountEditText);

            }
        });


    }
}