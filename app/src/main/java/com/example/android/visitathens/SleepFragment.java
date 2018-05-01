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
        places.add(new Place("Ava Hotel and Suites" , "Lisikratous 9","www.avahotel.gr", R.drawable.ava_hotel_and_suites));
        places.add(new Place("Dorian Inn Hotel", "Pireos 15", "www.dorianinnhotel.com", R.drawable.dorian_inn_hotel));
        places.add(new Place("Astor Hotel", "Karagiorgi Servias 16", "www.gtp.gr/AstorHotel", R.drawable.astor_hotel));
        places.add(new Place("Palmyra Beach Hotel", "Avenue Posidonos 70", "www.palmyra.gr/en", R.drawable.palmyra_beach_hotel));
        places.add(new Place ("City Circus", "Sarri 16", "www.citycircus.gr", R.drawable.city_circus));

        //Creates an adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.categorySleep);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
