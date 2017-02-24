package com.example.sanket.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sanket on 22/02/17.
 */

public class PlaceAdapter extends ArrayAdapter<Place>
{


    public PlaceAdapter(Activity context , ArrayList<Place> place)
    {
        super(context,0,place);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(convertView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

            Place place = getItem(position);

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.aksa_beach_imageview);
            imageView.setImageResource(place.getImageResourceId());

            TextView textView = (TextView) listItemView.findViewById(R.id.beach_name_textview);
            textView.setText(place.getPlaceNames());

            return listItemView;
        }

    }

