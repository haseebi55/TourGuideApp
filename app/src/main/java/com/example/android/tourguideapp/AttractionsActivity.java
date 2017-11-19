package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tours_list);
        final ArrayList<Tourist> tours = new ArrayList<Tourist>();
        tours.add(new Tourist("Lake Saif-ul-Malook", "Naran, Kaghan Valley"));
        tours.add(new Tourist(" Concordia", "Karakoram Range"));
        tours.add(new Tourist("Deosai National Park", " Skardu, district of Gilgit Baltistan"));
        tours.add(new Tourist("Kalash Valley","Chitral District"));
        tours.add(new Tourist("Shandur Top"," Khyber-Pakhtunkhwa’s Chitral area"));
        tours.add(new Tourist("Gorakh Hill Station","province of Sindh"));
        tours.add(new Tourist(" Badshahi Masjid (mosque)"," Lahore"));
        tours.add(new Tourist("Qila Rohtas (Fort Rohtas)", "Jehlum, Punjab"));
        tours.add(new Tourist("Naltar valley","Gilgit"));
        tours.add(new Tourist("Neelum Valley","Azad Kashmir"));
        tours.add(new Tourist("Gojal Valley"," borders China and Afghanistan"));


        TouristAdapter adapter =
                new TouristAdapter(this, tours);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
