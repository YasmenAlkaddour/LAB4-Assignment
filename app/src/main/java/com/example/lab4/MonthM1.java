package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MonthM1 extends AppCompatActivity {
TextView txtMonthName,txtDays,txtHour;
int days;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_m1);
        txtMonthName=(TextView) findViewById(R.id.monthName);
        txtDays=(TextView) findViewById(R.id.txtDays);
        txtHour=(TextView) findViewById(R.id.txtHour);

        Intent intent=getIntent();
        txtMonthName.setText(intent.getStringExtra("select"));
        String monthName=txtMonthName.getText().toString();
        if (monthName.equals("April")
            || monthName.equals("June")
            || monthName.equals("September")
            || monthName.equals("November")){
            days=30;
            txtDays.setText(txtDays.getText()+" "+days);
        }else if (monthName.equals("February")){
            days=28;
            txtDays.setText(txtDays.getText()+" "+days);
        }else{
            days=31;
            txtDays.setText(txtDays.getText()+" "+days);
        }
        txtHour.setText(txtHour.getText()+" "+days*24);

    }

}