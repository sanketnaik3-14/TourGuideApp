package com.example.sanket.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sanket on 22/02/17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    Context mContext;
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {

        if(position == 0)
        {
            return new BeachesFragment();
        }
        else if(position == 1)
        {
            return new ParksFragment();
        }
        else if(position == 2)
        {
            return new RelplacesFragment();
        }
        else
        {
            return new GardenFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return mContext.getString(R.string.category_beaches);
        } else if (position == 1) {
            return mContext.getString(R.string.category_amusmentparks);
        } else if (position == 2) {
            return mContext.getString(R.string.category_religiousplaces);
        } else {
            return mContext.getString(R.string.category_gardens);
        }
    }
}

