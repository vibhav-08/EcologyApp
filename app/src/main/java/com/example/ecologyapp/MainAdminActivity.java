package com.example.ecologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAdminActivity extends AppCompatActivity {

    private ListView hotelslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);

        hotelslist = findViewById(R.id.hotelslist);
        String [] Hotels_List = {"Hotel Bhimas", "Pai Viceroy", "Jalpaan", "Bhimas Residency","PS4 Restaurant", "KFC", "Novotel", "Minerva grand", "Hotel Taj", "Saravana Bhavan"};
        List<String> HotelsList = new ArrayList<String>(Arrays.asList(Hotels_List));

        ArrayAdapter<String> HotelAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, HotelsList);
        hotelslist.setAdapter(HotelAdapter);
        hotelslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(MainAdminActivity.this,HotelBhimas.class);
                    startActivity(intent);
                    Toast.makeText(MainAdminActivity.this, "Opening some activity", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}