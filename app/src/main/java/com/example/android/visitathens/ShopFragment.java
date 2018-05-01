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
        places.add(new Place("Damigos Toys", "Likourgou 3","09:00 - 20:00", R.drawable.damigos));
        places.add(new Place("Public", "Karagiorgi 1","09:00 - 21:00", R.drawable.public_shop));
        places.add(new Place("Moustakas", "Ermou 87-89","09:00 - 21:00", R.drawable.moustakas));
        places.add(new Place("Athens Metro Mall", "Avenue Vouliagmenis 276","09:00 - 21:00", R.drawable.athens_metro_mall));
        places.add(new Place("Athens Heart Mall", "Pireos 180", "10:00 - 21:00", R.drawable.athens_heart_mall));

        //Creates an adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.categoryShop);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
