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
        places.add(new Place("Akropolis Museum", "Dionysiou Areopagitou Street",
                "08:00 - 20:00", R.drawable.akropolis_museum));
        places.add(new Place("Akropolis", "Dyonisiou Areopagitou Street", "08:00 - 20:00", R.drawable.akropolis));
        places.add(new Place("National Garden", "Syntagma Square", "sunrise - sundown", R.drawable.national_gardens));
        places.add(new Place("Flisvos Marina", "Paleo Faliro", "09:00 - 22:00", R.drawable.flisvos_marina));
        places.add(new Place("Stavros Niarchos Park", "Avenue Siggrou 364", "06:00 - 22:00", R.drawable.stavros_niarchos_park));
        places.add(new Place("Ancient Agora", "Adrianou Street", "08:00 - 15:00", R.drawable.ancient_agora));
        places.add(new Place("The Beach", "Avenue Posidonos", "sunrise - sundown", R.drawable.beach_athens));
        places.add(new Place("Museum of Cycladic Art", "Neofitou Douka 4", "10:00 - 17:00", R.drawable.museum_of_cycladic_art));

        //Creates an adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.categoryVisit);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
