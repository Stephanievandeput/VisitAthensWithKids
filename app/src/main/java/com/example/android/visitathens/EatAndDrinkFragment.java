package com.example.android.visitathens;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * The fragment for the list with restaurants and bars.
 */
public class EatAndDrinkFragment extends Fragment {


    public EatAndDrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create a list of places to eat
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.kalamaki_bar_name), getString(R.string.kalamaki_bar_address), getString(R.string.kalamaki_bar_opening), R.drawable.kalamaki_bar));
        places.add(new Place(getString(R.string.skoubri_name), getString(R.string.skoubri_address), getString(R.string.skoubri_opening), R.drawable.skoubri));
        places.add(new Place(getString(R.string.gazi_college_name), getString(R.string.gazi_college_address), getString(R.string.gazi_college_opening), R.drawable.gazi_college));
        places.add(new Place(getString(R.string.to_mavro_provato_name), getString(R.string.to_mavro_provato_address), getString(R.string.to_mavro_provato_opening), R.drawable.to_mavro_provato));
        places.add(new Place(getString(R.string.numismatic_museum_cafe_name), getString(R.string.numismatic_museum_cafe_address), getString(R.string.numismatic_museum_cafe_opening), R.drawable.numismatic_museum_cafe));

        //Creates and adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.categoryEatAndDrink);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
