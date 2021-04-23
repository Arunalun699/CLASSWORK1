package com.example.classwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Second_page extends AppCompatActivity {

    Button btn;
    EditText et;
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        btn=findViewById(R.id.button);
        et=findViewById(R.id.edittext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Second_page.this,MainActivity.class);
                st=et.getText().toString();
                i.putExtra("Value",st);
                startActivity(i);
                finish();

            }
        });
    }
}