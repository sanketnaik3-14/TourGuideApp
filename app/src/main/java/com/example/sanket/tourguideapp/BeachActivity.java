package com.example.sanket.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.id.text1;

public class BeachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach);

        String beachName = getIntent().getStringExtra("beachName");
        int imageId = getIntent().getIntExtra("imageId" ,0);
        int detailsId = getIntent().getIntExtra("detailsId" ,0);
        int nearbyId = getIntent().getIntExtra("nearbyId" ,0);
        int activityId = getIntent().getIntExtra("activityId" ,0);
        int besttimeId = getIntent().getIntExtra("besttimeId" ,0);

        ImageView beach = (ImageView)findViewById(R.id.beach_imageview);
        beach.setImageResource(imageId);

        TextView text1 = (TextView)findViewById(R.id.beach_title);
        text1.setText(beachName);

        TextView text2 = (TextView)findViewById(R.id.beach_details_desc);
        text2.setText(detailsId);

        TextView text3 = (TextView)findViewById(R.id.beach_nearby_desc);
        text3.setText(nearbyId);

        TextView text4 = (TextView)findViewById(R.id.beach_activities_desc);
        text4.setText(activityId);

        TextView text5 = (TextView)findViewById(R.id.beach_best_time_desc);
        text5.setText(besttimeId);

    }
}
