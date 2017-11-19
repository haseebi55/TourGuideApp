package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**,
 * Created by JS IID on 10/29/2017.
 */

public class TouristAdapter extends ArrayAdapter<Tourist> {
    public TouristAdapter(Context context, List<Tourist> earthquakes) {
        super(context, 0, earthquakes);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tourist_list_item, parent, false);
        }
        Tourist currentTour = getItem(position);
        TextView CityView = (TextView) listItemView.findViewById(R.id.city);
        CityView.setText(currentTour.getCityName());
        TextView ItemView = (TextView) listItemView.findViewById(R.id.item);
        ItemView.setText(currentTour.getItemName());
        return listItemView;
}}
