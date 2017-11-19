package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PublicPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tours_list);
        final ArrayList<Tourist> tours = new ArrayList<Tourist>();
        tours.add(new Tourist("Chaukhandi Tombs", "Sindh"));
        tours.add(new Tourist("Alamgiri Gate ", " Lahore Fort in Punjab"));
        tours.add(new Tourist("Masala Family Festival-2017", "Lahore"));
        tours.add(new Tourist("Naltar Valley","Gilgit-Baltistan"));
        tours.add(new Tourist("Buddhist ruins","Takht Bhai in Khyber Pakhtunkhwa."));
        tours.add(new Tourist("Dhirkot Park Bagh","ajk"));
        tours.add(new Tourist("Taxila","Skardu"));
        tours.add(new Tourist("Fort and Shalamar Gardens", "Punjab "));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        TouristAdapter adapter =
                new TouristAdapter(this, tours);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // words_list.xmlt file.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
