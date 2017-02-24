package com.example.sanket.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RelplaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relplace);

        String relplaceName = getIntent().getStringExtra("relplaceName");
        int imageId = getIntent().getIntExtra("imageId" , 0);
        int relplaceDetails = getIntent().getIntExtra("relplaceDetails" , 0);
        int relplaceTimings = getIntent().getIntExtra("relplaceTimings" , 0);
        int relplaceEntry = getIntent().getIntExtra("relplaceEntry" , 0);
        int relplaceThings = getIntent().getIntExtra("relplaceThings" , 0);
        int relplaceNearby = getIntent().getIntExtra("relplaceNearby" , 0);

        ImageView imageView = (ImageView)findViewById(R.id.relplace_imageview);
        imageView.setImageResource(imageId);

        TextView text1 = (TextView)findViewById(R.id.relplace_title);
        text1.setText(relplaceName);

        TextView text2 = (TextView)findViewById(R.id.relplace_details_desc);
        text2.setText(relplaceDetails);

        TextView text3 = (TextView)findViewById(R.id.relplace_things_desc);
        text3.setText(relplaceThings);

        TextView text4 = (TextView)findViewById(R.id.relplace_entry_desc);
        text4.setText(relplaceEntry);

        TextView text5 = (TextView)findViewById(R.id.relplace_attract_desc);
        text5.setText(relplaceNearby);

        TextView text6 = (TextView)findViewById(R.id.relplace_timing_desc);
        text6.setText(relplaceTimings);
    }
}
