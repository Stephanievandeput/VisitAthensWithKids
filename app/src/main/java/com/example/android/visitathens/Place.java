package com.example.android.visitathens;

public class Place {

    // The image of the place
    private int mImageResourceId;

    // The name of the place
    private String mName;

    //The address of the place
    private String mAddress;

    //The opening hours of the place
    private String mOpeningHours;

    //Creates a new Place object
    public Place(String name, String address, String openingHours) {
        mName = name;
        mAddress = address;
        mOpeningHours = openingHours;
    }

    //Creates a new Place object with an image
    public Place(String name, String address, String openingHours, int imageResourceId) {
        mName = name;
        mAddress = address;
        mOpeningHours = openingHours;
        mImageResourceId = imageResourceId;
    }

    //Get the name of the Place object
    public String getName() {
        return mName;
    }

    //Get the address of the Place object
    public String getAdress() {
        return mAddress;
    }

    //Get the Opening Hours of the Place object
    public String getOpeningHours() {
        return mOpeningHours;
    }

    //Get the image of the Place object
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
