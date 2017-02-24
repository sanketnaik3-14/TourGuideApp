package com.example.sanket.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourview , container ,false);

        final ArrayList<Place> place = new ArrayList<Place>();

        place.add(new Place(getString(R.string.aksa_beach) ,R.drawable.aksa ,R.string.aksa_details ,R.string.aksa_nearby
                ,R.string.aksa_activities ,R.string.aksa_best_time));

        place.add(new Place(getString(R.string.juhu_beach) ,R.drawable.juhu ,R.string.juhu_details ,R.string.juhu_nearby
                ,R.string.juhu_activities ,R.string.juhu_best_time));

        place.add(new Place(getString(R.string.chowpatty_beach) ,R.drawable.girgaum ,R.string.chow_details ,R.string.chow_nearby
                ,R.string.chow_activities ,R.string.chow_best_time));

        place.add(new Place(getString(R.string.dadar_beach ),R.drawable.dadar ,R.string.dadar_details ,R.string.dadar_nearby
                ,R.string.dadar_activities ,R.string.dadar_best_time));

        place.add(new Place(getString(R.string.madh_beach) ,R.drawable.madh ,R.string.madh_details ,R.string.madh_nearby
                ,R.string.madh_activities ,R.string.madh_best_time));

        place.add(new Place(getString(R.string.marve_beach) ,R.drawable.marve ,R.string.marv_details ,R.string.marv_nearby
                ,R.string.marv_activities ,R.string.marv_best_time));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),place);

        final ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Place plc = place.get(position);

                Intent intent = new Intent(getActivity() ,BeachActivity.class);

                intent.putExtra("imageId" , plc.getImageResourceId());
                intent.putExtra("detailsId" ,plc.getBeachDetails());
                intent.putExtra("nearbyId" ,plc.getBeachNearby());
                intent.putExtra("activityId" ,plc.getBeachActivity());
                intent.putExtra("besttimeId" ,plc.getBeachBestTime());
                intent.putExtra("beachName" ,plc.getPlaceNames());

                startActivity(intent);
            }
        });

        return rootView;
    }

}
