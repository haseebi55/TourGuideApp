package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView attractions = (TextView) findViewById(R.id.attractions);
        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        TextView publicplaces = (TextView) findViewById(R.id.public_places);
        TextView events = (TextView) findViewById(R.id.events);

        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent AttractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(AttractionsIntent);
            }
        });
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        publicplaces.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent publicplacesIntent = new Intent(MainActivity.this,PublicPlaces.class);
                startActivity(publicplacesIntent);
            }
        });
        events.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent eventsIntent = new Intent(MainActivity.this,EventsActivity.class);
                startActivity(eventsIntent);
            }
        });
    }
}

