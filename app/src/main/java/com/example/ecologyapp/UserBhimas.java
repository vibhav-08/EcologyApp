package com.example.ecologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserBhimas extends AppCompatActivity {
TextView check;
int bhimas_plates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_bhimas);

        check = findViewById(R.id.check);
        Intent intent = getIntent();
        bhimas_plates = intent.getIntExtra("bhimasplates",0);
        check.setText("Number of plates are : " + bhimas_plates);
    }
}