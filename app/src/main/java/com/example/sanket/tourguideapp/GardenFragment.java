package com.example.sanket.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GardenFragment extends Fragment {


    public GardenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourview ,container ,false);

        final ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place( R.string.hang_details, R.string.hang_things, R.string.hang_timings,
                R.string.hang_entry, R.string.hang_best_time, R.drawable.hanginggarden, "HANGING GARDEN"));

        place.add(new Place( R.string.kamla_details, R.string.kamla_things, R.string.kamla_timings,
                R.string.kamla_entry, R.string.kamla_best_time, R.drawable.kamlanehrupark, "KAMLA NEHRU PARK"));

        place.add(new Place( R.string.jija_details, R.string.jija_things, R.string.jija_timings,
                R.string.jija_entry, R.string.jija_best_time, R.drawable.jijamataudyan, "JIJA MATA UDYAN"));

        place.add(new Place( R.string.sgnp_details, R.string.sgnp_things, R.string.sgnp_timings,
                R.string.sgnp_entry, R.string.sgnp_best_time, R.drawable.sanjaygandhinationalpark, "SANJAY GANDHI NATIONAL PARK"));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity() , place);

        final ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Place plc = place.get(position);

                Intent intent3 = new Intent(getActivity() ,GardenActivity.class);

                intent3.putExtra("imageId",plc.getImageResourceId());
                intent3.putExtra("gardenName" ,plc.getPlaceNames());
                intent3.putExtra("gardenDetails",plc.getGarDetails());
                intent3.putExtra("gardenThingsToDo" ,plc.getGarThingsToDo());
                intent3.putExtra("gardenTimings" ,plc.getGarTimings());
                intent3.putExtra("gardenEntryfee" ,plc.getGarEntryFee());
                intent3.putExtra("gardenBestTime" ,plc.getGarBestTime());

                startActivity(intent3);
            }
        });

        return rootView;
    }

}
