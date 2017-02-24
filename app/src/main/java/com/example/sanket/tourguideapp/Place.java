package com.example.sanket.tourguideapp;

/**
 * Created by sanket on 22/02/17.
 */

public class Place {

    private String mPlaceNames;
    private int mImageResourceId;

    private int mDetails;
    private int mNearby;
    private int mActivity;
    private int mBestTime;
    private int mAttract;
    private int mTimings;
    private int mEntryFee;
    private int mThingsToDo;

    public Place(String placeNames, int imageResourceId, int beachDetails, int beachNearby, int beachActivity, int beachBestTime) {
        mPlaceNames = placeNames;
        mImageResourceId = imageResourceId;

        mDetails = beachDetails;
        mNearby = beachNearby;
        mActivity = beachActivity;
        mBestTime = beachBestTime;
    }

    public Place(String placeNames, int imageResourceId, int parkDetails, int parkAttract, int parkTimings, int parkEntryFee, int parkBestTime) {
        mPlaceNames = placeNames;
        mImageResourceId = imageResourceId;

        mDetails = parkDetails;
        mAttract = parkAttract;
        mTimings = parkTimings;
        mEntryFee = parkEntryFee;
        mBestTime = parkBestTime;
    }

    public Place(int relDetails, int relTimings, int relEntryFee, int relThingstodo, int relNearby, String placeNames ,int imageResourceId)
    {
        mPlaceNames = placeNames;
        mImageResourceId = imageResourceId;

        mDetails = relDetails;
        mTimings = relTimings;
        mEntryFee = relEntryFee;
        mThingsToDo = relThingstodo;
        mNearby = relNearby;
    }

    public Place(int garDetails, int garThingsToDo, int garTimings, int garEntryFee, int garBestTime, int imageResourceId, String placeNames)
    {
        mPlaceNames = placeNames;
        mImageResourceId = imageResourceId;

        mDetails = garDetails;
        mThingsToDo = garThingsToDo;
        mTimings = garTimings;
        mEntryFee = garEntryFee;
        mBestTime = garBestTime;

    }

    public String getPlaceNames() { return mPlaceNames; }

    public int getImageResourceId() { return mImageResourceId; }


    public int getBeachDetails() {
        return mDetails;
    }

    public int getBeachNearby() {
        return mNearby;
    }

    public int getBeachActivity() {
        return mActivity;
    }

    public int getBeachBestTime() {
        return mBestTime;
    }



    public int getParkDetails() { return mDetails; }

    public int getParkAttract() { return mAttract; }

    public int getParkTimings() { return mTimings; }

    public int getParkEntry() { return mEntryFee; }

    public int getParkBestTime() { return mBestTime; }



    public int getRelDetails() { return mDetails; }

    public int getRelTimings() { return mTimings; }

    public int getRelEntry() { return mEntryFee; }

    public int getRelThings() { return mThingsToDo; }

    public int getRelNearby() { return mNearby; }



    public int getGarDetails() { return mDetails; }

    public int getGarThingsToDo() { return mThingsToDo; }

    public int getGarTimings() { return mTimings; }

    public int getGarEntryFee() { return mEntryFee; }

    public int getGarBestTime() { return mBestTime; }



}


