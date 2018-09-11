package com.dash.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    EditText eText1;
    EditText eText2;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        eText1=(EditText) findViewById(R.id.eText1);
        eText2=(EditText) findViewById(R.id.eText2);
        tvResult=(TextView) findViewById(R.id.tvResult);
    }

    public void btnSumClick(View view) {
        int n1=Integer.parseInt(eText1.getText().toString());
        int n2=Integer.parseInt(eText2.getText().toString());
        int sum=n1+n2;
        tvResult.setText(String.valueOf(sum));
    }
}
