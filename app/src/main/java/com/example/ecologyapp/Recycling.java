package com.example.ecologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recycling extends AppCompatActivity {
    private ListView RecyclingList;
    private Button CityButton;
    private TextView CityTextView;
    private EditText CityText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycling);
        RecyclingList = findViewById(R.id.Recycling_List);
        CityButton = findViewById(R.id.CityButton);
        CityTextView = findViewById(R.id.CityTextView);
        CityText = findViewById(R.id.CityText);

        String [] Recycling_types = {"Plastic Recycling", "Metal Recycling", "Electronic Recycling", "Wood Recycling","Glass Recycling", "Textile Recycling", "Bricks and inert waste"};
        List<String> RecyclingTypes = new ArrayList<String>(Arrays.asList(Recycling_types));

        ArrayAdapter<String> RecyclingAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, RecyclingTypes);
        RecyclingList.setAdapter(RecyclingAdapter);

        RecyclingList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(Recycling.this,PlasticRecycling.class);
                    startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(Recycling.this,MetalRecycling.class);
                    startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(Recycling.this,ElectronicRecycling.class);
                    startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(Recycling.this,WoodRecycling.class);
                    startActivity(intent);
                }
                else if(position == 4){
                    Intent intent = new Intent(Recycling.this,GlassRecycling.class);
                    startActivity(intent);
                }
                else if(position == 5){
                    Intent intent = new Intent(Recycling.this,TextileRecycling.class);
                    startActivity(intent);
                }
                else if(position == 6){
                    Intent intent = new Intent(Recycling.this,BricksInertWaste.class);
                    startActivity(intent);
                }
            }
        });

        CityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String city = CityText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                String url = "https://www.google.com/maps/search/recycling+in+"+city+"/";
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}