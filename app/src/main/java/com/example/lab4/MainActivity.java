package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.monthList);
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,month);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String select=listView.getItemAtPosition(i).toString();
                //Toast.makeText(MainActivity.this, ""+select, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,MonthM1.class);

                intent.putExtra("select",select);
                startActivity(intent);



            }
        });


    }
}