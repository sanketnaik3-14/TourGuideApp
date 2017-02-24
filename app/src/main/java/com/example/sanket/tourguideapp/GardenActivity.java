package com.example.sanket.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GardenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden);

        String garden = getIntent().getStringExtra("gardenName");
        int imageId = getIntent().getIntExtra("imageId", 0);
        int gardenDetails = getIntent().getIntExtra("gardenDetails", 0);
        int gardenThingsToDo = getIntent().getIntExtra("gardenThingsToDo", 0);
        int gardenTimings = getIntent().getIntExtra("gardenTimings" , 0);
        int gardenEntryfee = getIntent().getIntExtra("gardenEntryfee", 0);
        int gardenBestTime = getIntent().getIntExtra("gardenBestTime", 0);

        ImageView imageView = (ImageView)findViewById(R.id.garden_imageview);
        imageView.setImageResource(imageId);

        TextView text1 = (TextView)findViewById(R.id.garden_title);
        text1.setText(garden);

        TextView text2 = (TextView)findViewById(R.id.garden_details_desc);
        text2.setText(gardenDetails);

        TextView text3 = (TextView)findViewById(R.id.garden_things_desc);
        text3.setText(gardenThingsToDo);

        TextView text4 = (TextView)findViewById(R.id.garden_timings_desc);
        text4.setText(gardenTimings);

        TextView text5 = (TextView)findViewById(R.id.garden_entryfee_desc);
        text5.setText(gardenEntryfee);

        TextView text6 = (TextView)findViewById(R.id.garden_best_time_desc);
        text6.setText(gardenBestTime);


     }
}
