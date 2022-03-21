package com.example.ecologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HotelBhimas extends AppCompatActivity {

    private EditText hotelbhimasplates;
    private Button bhimasplatesbutton;
    private TextView availability;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_bhimas);


        bhimasplatesbutton = findViewById(R.id.bhimasplatesbutton);
        hotelbhimasplates = findViewById(R.id.hotelbhimasplates);
        availability = findViewById(R.id.availability);

        bhimasplatesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bhimas_plates = Integer.parseInt(hotelbhimasplates.getText().toString());
                Intent intent = new Intent(HotelBhimas.this,UserBhimas.class);
                intent.putExtra("bhimasplates",bhimas_plates);
                startActivity(intent);
            }
        });
    }
}