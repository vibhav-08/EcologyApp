package com.example.ecologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FoodBankActivity extends AppCompatActivity {

    //"Hotel Bhimas", "Pai Viceroy", "Jalpaan", "Bhimas Residency","PS4 Restaurant", "KFC", "Novotel", "Minerva grand", "Hotel Taj", "Saravana Bhavan"
    private int HotelBhimasPlates;
    int PaiViceroyPlates;
    int JalpaanPlates;
    private int BhimasResidencyPlates;
    int PS4RestaurantPlates;
    int KFCPlates;
    int NovotelPlates;
    int MinervaGrandPlates;
    int HotelTajPlates;
    int SaravanaBhavanPlates;

    public int getHotelBhimasPlates() {
        return HotelBhimasPlates;
    }

    public void setHotelBhimasPlates(int hotelBhimasPlates) {
        HotelBhimasPlates = hotelBhimasPlates;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_bank);
    }

    public void AdminActivity(View view){
        Toast.makeText(this, "Opening Admin activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,AdminLoginActivity.class);
        startActivity(intent);
    }

    public void UserActivity(View view){
        Toast.makeText(this, "Opening User activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,UserBhimas.class);
        startActivity(intent);
    }
}