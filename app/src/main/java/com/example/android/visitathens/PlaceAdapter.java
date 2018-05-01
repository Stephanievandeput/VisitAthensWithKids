package com.example.android.visitathens;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/* PlaceAdapter is an ArrayAdapter that can provide the layout for each list item
 * based on a data source, which is here a lit of Place objects
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /*
     * Create a new PlaceAdapter object
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    //Resource ID for the background color for this list of places
    private int mColourResourceId;

    public PlaceAdapter (Context context, ArrayList<Place> places, int colourResourceId){
        super(context, 0, places);
        mColourResourceId = colourResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the Place object located at this position in the list
        Place currentPlace = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);

        //Get the name of the currentPlace object and set this text in the nameTextView
        nameTextView.setText(currentPlace.getName());

        //Find the TextView in the list_item.xml layout with the ID address_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);

        //Get the name of the currentPlace object and set this text in the addressTextView
        addressTextView.setText(currentPlace.getAdress());

        //Find the TextView in the list_item.xml layout with the ID opening_hours_text_view
        TextView openingHoursTextView = (TextView) listItemView.findViewById(R.id.opening_hours_text_view);

        //Get the name of the currentPlace object and set this text in the openingHoursTextView
        openingHoursTextView.setText(currentPlace.getOpeningHours());

        //Find the ImageView in the list_itemk.xml layout with the ID image_view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        //Set the ImageView to have the image resource specified in the current Place object
        imageView.setImageResource(currentPlace.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColourResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
