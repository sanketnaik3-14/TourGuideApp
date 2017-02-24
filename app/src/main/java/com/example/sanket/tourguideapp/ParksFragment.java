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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourview ,container,false);

        final ArrayList<Place> place = new ArrayList<Place>();

        place.add(new Place("ESSEL WORLD" ,R.drawable.esselworld ,R.string.essel_details
                ,R.string.essel_attract ,R.string.essel_timings ,R.string.essel_entry ,R.string.essel_best_time));

        place.add(new Place("WATER KINGDOM" ,R.drawable.waterkingdom ,R.string.king_details
                ,R.string.king_attract ,R.string.king_timings ,R.string.king_entry ,R.string.king_best_time));

        place.add(new Place("ADLABS IMAGICA" ,R.drawable.imagica ,R.string.imagica_details
                ,R.string.imagica_attract ,R.string.imagica_timings ,R.string.imagica_entry ,R.string.imagica_best_time));

        place.add(new Place("SURAJ WATER PARK" ,R.drawable.surajwaterpark ,R.string.suraj_details
                ,R.string.suraj_attract ,R.string.suraj_timings ,R.string.suraj_entry ,R.string.suraj_best_time));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),place);

        final ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Place plc = place.get(position);

                Intent intent1 = new Intent(getActivity() , ParkActivity.class);

                intent1.putExtra("imageId" ,plc.getImageResourceId());
                intent1.putExtra("parkName" ,plc.getPlaceNames());
                intent1.putExtra("parkDetails" ,plc.getParkDetails());
                intent1.putExtra("parkAttract" ,plc.getParkAttract());
                intent1.putExtra("parkTimings" ,plc.getParkTimings());
                intent1.putExtra("parkEntry" ,plc.getParkEntry());
                intent1.putExtra("parkBestTime" ,plc.getParkBestTime());

                startActivity(intent1);
            }
        });

        return rootView;
    }

}
