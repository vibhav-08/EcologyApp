package com.example.ecologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.app.Application;

public class HotelPlatesList extends Application {

    private static int HotelBhimasPlates;

    public int getHotelBhimasPlates() {
        return HotelBhimasPlates;
    }

    public void setHotelBhimasPlates(int hotelBhimasPlates) {
        HotelBhimasPlates = hotelBhimasPlates;
    }
}