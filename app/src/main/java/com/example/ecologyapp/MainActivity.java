package com.example.ecologyapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Recycling;
    private Button FoodManagement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Recycling = findViewById(R.id.Recycling);
        FoodManagement = findViewById(R.id.FoodManagement);
    }

    public void RecyclingActivity(View view){
        Toast.makeText(this, "Opening Recycling activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Recycling.class);
        startActivity(intent);
    }

    public void FoodBankActivity(View view){
        Toast.makeText(this, "Opening Food Bank Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,FoodBankActivity.class);
        startActivity(intent);
    }
}