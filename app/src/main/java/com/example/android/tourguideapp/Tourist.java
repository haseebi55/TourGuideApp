package com.example.android.tourguideapp;

/**
 * Created by JS IID on 10/29/2017.
 */

public class Tourist {
    private String mCityName;
    private String mItemName;



    public Tourist (String CityName ,String ItemName) {
        mCityName = CityName;
        mItemName = ItemName;

    }
    public String getItemName(){
        return mItemName;
    }
    public String  getCityName(){
        return mCityName;
    }




    @Override
    public String toString() {
        return "Tourist{" +
                "mItemName='" + mItemName + '\'' +

                ", mCityName='" + mCityName + '\'' +
                '}';
    }
}
