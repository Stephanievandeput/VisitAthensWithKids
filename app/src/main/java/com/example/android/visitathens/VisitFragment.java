package com.example.android.visitathens;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * The fragment for the list of places to visit
 */
public class VisitFragment extends Fragment {


    public VisitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create a list of places to visit
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.akropolis_museum_name), getString(R.string.akropolis_museum_address),
                getString(R.string.akropolis_museum_opening), R.drawable.akropolis_museum));
        places.add(new Place(getString(R.string.akropolis_name), getString(R.string.akropolis_address), getString(R.string.akropolis_opening), R.drawable.akropolis));
        places.add(new Place(getString(R.string.national_garden_name), getString(R.string.national_garden_address), getString(R.string.national_garden_opening), R.drawable.national_gardens));
        places.add(new Place(getString(R.string.flisvos_marina_name), getString(R.string.flisvos_marina_address), getString(R.string.flisvos_marina_opening), R.drawable.flisvos_marina));
        places.add(new Place(getString(R.string.stavros_niarchos_name), getString(R.string.stavros_niarchos_address), getString(R.string.stavros_niarchos_opening), R.drawable.stavros_niarchos_park));
        places.add(new Place(getString(R.string.ancient_agora_name), getString(R.string.ancient_agora_address), getString(R.string.ancient_agora_opening), R.drawable.ancient_agora));
        places.add(new Place(getString(R.string.the_beach_name), getString(R.string.the_beach_address), getString(R.string.the_beach_opening), R.drawable.beach_athens));
        places.add(new Place(getString(R.string.cycladic_museum_name), getString(R.string.cycladic_museum_address), getString(R.string.cycladic_museum_opening), R.drawable.museum_of_cycladic_art));

        //Creates an adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.categoryVisit);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
