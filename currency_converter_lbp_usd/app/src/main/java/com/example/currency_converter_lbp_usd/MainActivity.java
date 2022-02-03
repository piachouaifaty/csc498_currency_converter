package com.example.currency_converter_lbp_usd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LBP to USD CONVERTER:

        //initializing variable and linking it to layout object
        Button to_usd_button = (Button) findViewById(R.id.LBPtoUSDButton);

        //1 usd = exchange_rate value
        int exchange_rate = 22000;

        //onclick event
        to_usd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText lbp_amount = (EditText) findViewById(R.id.LBPAmountEditText);
                TextView result_usd = (TextView) findViewById(R.id.resultUSDTextView);

                int lbp = Integer.parseInt(lbp_amount.getText().toString());
                int result = lbp/exchange_rate;
                result_usd.setText(result+" USD");

            }
        });


        //USD TO LBP CONVERTER:

        //initializing variable and linking it to layout object
        Button to_lbp_button = (Button) findViewById(R.id.USDtoLBPButton);

        to_lbp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText usd_amount = (EditText) findViewById(R.id.USDAmountEditText);
                TextView result_lbp = (TextView) findViewById(R.id.resultLBPTextView);

                int usd = Integer.parseInt(usd_amount.getText().toString());
                int result = usd*exchange_rate;
                result_lbp.setText(result+" LBP");


            }
        });


    }
}