package com.example.canteen;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PaperAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;


    public PaperAdapter( FragmentManager fm,Context context ,int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FoodFragment foodFragment = new FoodFragment();
                return foodFragment;

            case 1:
                DrinkFragment drinkFragment = new DrinkFragment();
                return drinkFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Food";
        }
        if (position == 1){
            return "Drink";
        }
        return null;
    }
}
