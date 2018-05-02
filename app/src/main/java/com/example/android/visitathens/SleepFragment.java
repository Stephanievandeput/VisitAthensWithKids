package com.example.android.visitathens;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * The fragment for the list of places to sleep.
 */
public class SleepFragment extends Fragment {


    public SleepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create a list of places to visit
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.ava_hotel_name), getString(R.string.ava_hotel_address), getString(R.string.ava_hotel_website), R.drawable.ava_hotel_and_suites));
        places.add(new Place(getString(R.string.dorianinn_hotel_name), getString(R.string.dorianinn_hotel_address), getString(R.string.dorianinn_hotel_website), R.drawable.dorian_inn_hotel));
        places.add(new Place(getString(R.string.astor_hotel_name), getString(R.string.astor_hotel_address), getString(R.string.astor_hotel_website), R.drawable.astor_hotel));
        places.add(new Place(getString(R.string.palmyra_hotel_name), getString(R.string.palmyra_hotel_address), getString(R.string.palmyra_hotel_website), R.drawable.palmyra_beach_hotel));
        places.add(new Place(getString(R.string.citycircus_hotel_name), getString(R.string.citycircus_hotel_address), getString(R.string.citycircus_hotel_website), R.drawable.city_circus));

        //Creates an adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.categorySleep);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
