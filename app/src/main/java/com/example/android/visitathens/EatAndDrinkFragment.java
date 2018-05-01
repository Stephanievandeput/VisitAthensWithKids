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
        places.add(new Place("Kalamaki Bar", "Drakou 15", "12:00 - 01:30", R.drawable.kalamaki_bar));
        places.add(new Place("Skoubri", "Drakou 14", "12:00 - 02:00", R.drawable.skoubri));
        places.add(new Place("Gazi College", "Persefonis 53", "08:00 - 03:00", R.drawable.gazi_college));
        places.add(new Place("To Mavro Provato", " Arrianou 31", "12:30 - 01:00", R.drawable.to_mavro_provato));
        places.add(new Place("Numismatic Museum Cafe", "Panepistimiou 12", "09:00 - 00:00", R.drawable.numismatic_museum_cafe));

        //Creates and adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.categoryEatAndDrink);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
