package com.example.android.visitathens;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * The fragment for the list of shops.
 */
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create a list of places to visit
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.damigos_name), getString(R.string.damigos_address), getString(R.string.damigos_opening), R.drawable.damigos));
        places.add(new Place(getString(R.string.public_name), getString(R.string.public_address), getString(R.string.public_opening), R.drawable.public_shop));
        places.add(new Place(getString(R.string.moustakas_name), getString(R.string.moustakas_address), getString(R.string.moustakas_opening), R.drawable.moustakas));
        places.add(new Place(getString(R.string.metro_mall_name), getString(R.string.metro_mall_address), getString(R.string.metro_mall_opening), R.drawable.athens_metro_mall));
        places.add(new Place(getString(R.string.heart_mall_name), getString(R.string.heart_mall_address), getString(R.string.heart_mall_opening), R.drawable.athens_heart_mall));

        //Creates an adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.categoryShop);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
