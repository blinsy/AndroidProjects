package com.example.maureen.fragments;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;



public class PagerAdapter extends FragmentStatePagerAdapter{

    int numofTabs;



public Fragment getItem (int position){

    switch (position) {
        case 0:
            return new Tab1();
        case 1:
            return new Tab2();
        case 2:
            return new Tab3();
        default:
            return null;
    }
}

    @Override
    public int getCount() {
        return numofTabs;
    }
}
