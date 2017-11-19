package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tours_list);
        setContentView(R.layout.tours_list);
        final ArrayList<Tourist> tours = new ArrayList<Tourist>();
        tours.add(new Tourist("DPS World-2017", "Sindh"));
        tours.add(new Tourist("ILM Business Conference & Exhibition", "University of Management & Technology"));
        tours.add(new Tourist("Masala Family Festival-2017", "Lahore"));
        tours.add(new Tourist("Pakistan Lifestyle and Wedding Expo","Lahore Expo"));
        tours.add(new Tourist("Student Education Expo (SEE) Lahore-2017","Islami Jamiat-e-Talba Lahore"));
        tours.add(new Tourist("Pak Lab Expo","Azad Kashmir"));
        tours.add(new Tourist("4th Pakistan Coating Show-2018","Skardu"));
        tours.add(new Tourist("Zameen Property Expo", "Khunjerab pass"));

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
