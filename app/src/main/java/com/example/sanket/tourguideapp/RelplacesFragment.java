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
public class RelplacesFragment extends Fragment {


    public RelplacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourview ,container ,false);

        final ArrayList<Place> place = new ArrayList<Place>();

        place.add(new Place(R.string.haji_details, R.string.haji_timings, R.string.haji_entry, R.string.haji_things,
                R.string.haji_nearby, getString(R.string.haji_ali) ,R.drawable.hajiali));

        place.add(new Place(R.string.maha_details, R.string.maha_timings, R.string.maha_entry, R.string.maha_things,
                R.string.maha_nearby, getString(R.string.mahalaxmi_temple) ,R.drawable.mahalaxmitemple));

        place.add(new Place(R.string.mount_details, R.string.mount_timings, R.string.mount_entry, R.string.mount_things,
                R.string.mount_nearby, getString(R.string.mount_mary_church) ,R.drawable.mountmary));

        place.add(new Place(R.string.isk_details, R.string.isk_timings, R.string.isk_entry, R.string.isk_things,
                R.string.isk_nearby, getString(R.string.iskon_temple) ,R.drawable.iskontemple));

        place.add(new Place(R.string.sid_details, R.string.sid_timings, R.string.sid_entry, R.string.sid_things,
                R.string.sid_nearby, getString(R.string.siddhivinayak_temple) ,R.drawable.siddhivinayaktemple));

        place.add(new Place(R.string.pag_details, R.string.pag_timings, R.string.pag_entry, R.string.pag_things,
                R.string.pag_nearby, getString(R.string.global_pagoda) ,R.drawable.pagoda));

        place.add(new Place(R.string.ele_details, R.string.ele_timings, R.string.ele_entry, R.string.ele_things,
                R.string.ele_nearby, getString(R.string.elephanta_caves) ,R.drawable.elephantacaves));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity() , place);

        final ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Place plc = place.get(position);

                Intent intent2 = new Intent(getActivity() , RelplaceActivity.class);

                intent2.putExtra("relplaceName",plc.getPlaceNames());
                intent2.putExtra("imageId", plc.getImageResourceId());
                intent2.putExtra("relplaceDetails" ,plc.getRelDetails());
                intent2.putExtra("relplaceTimings" ,plc.getRelTimings());
                intent2.putExtra("relplaceEntry" ,plc.getRelEntry());
                intent2.putExtra("relplaceThings" ,plc.getRelThings());
                intent2.putExtra("relplaceNearby" ,plc.getRelNearby());

                startActivity(intent2);
            }
        });

        return rootView;
    }

}
