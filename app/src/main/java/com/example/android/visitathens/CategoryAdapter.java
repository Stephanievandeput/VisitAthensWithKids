package com.example.android.visitathens;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    //Context of the app
    private Context mContext;

    /* Constructor to create a new CategoryAdapter object
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep the state of fragments in the adapeter across swipes
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /* Return the Fragment that should be displayed for the given page number
     *
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VisitFragment();
        } else if (position == 1) {
            return new EatAndDrinkFragment();
        } else if (position == 2) {
            return new ShopFragment();
        } else {
            return new SleepFragment();
        }
    }

    /* Return the total number of pages
     *
     */
    @Override
    public int getCount() {
        return 4;
    }

    //Sets the titles of the tabs
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_visit);
        } else if (position == 1) {
            return mContext.getString(R.string.category_eat_and_drink);
        } else if (position == 2) {
            return mContext.getString(R.string.category_shop);
        } else {
            return mContext.getString(R.string.category_sleep);
        }
    }
}
