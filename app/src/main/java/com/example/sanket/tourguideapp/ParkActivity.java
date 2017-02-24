package com.example.sanket.tourguideapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

        String parkName = getIntent().getStringExtra("parkName");
        int imageId = getIntent().getIntExtra("imageId" , 0);
        int parkDetails = getIntent().getIntExtra("parkDetails" , 0);
        int parkAttract = getIntent().getIntExtra("parkAttract" , 0);
        int parkTimings = getIntent().getIntExtra("parkTimings" , 0);
        int parkEntry = getIntent().getIntExtra("parkEntry" , 0);
        int parkBestTime = getIntent().getIntExtra("parkBestTime" , 0);

        ImageView park = (ImageView)findViewById(R.id.park_imageview);
        park.setImageResource(imageId);

        TextView text1 = (TextView)findViewById(R.id.park_title);
        text1.setText(parkName);

        TextView text2 = (TextView)findViewById(R.id.park_details_desc);
        text2.setText(parkDetails);

        TextView text3 = (TextView)findViewById(R.id.park_attractions_desc);
        text3.setText(parkAttract);

        TextView text4 = (TextView)findViewById(R.id.park_timings_desc);
        text4.setText(parkTimings);

        TextView text5 = (TextView)findViewById(R.id.park_entryfee_desc);
        text5.setText(parkEntry);

        TextView text6 = (TextView)findViewById(R.id.park_best_time_desc);
        text6.setText(parkBestTime);



    }
}
