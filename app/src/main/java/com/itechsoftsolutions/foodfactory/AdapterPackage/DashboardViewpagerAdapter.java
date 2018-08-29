package com.itechsoftsolutions.foodfactory.AdapterPackage;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class DashboardViewpagerAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> fragmentTitleList = new ArrayList<>();

    public DashboardViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }



    public void addItem(Fragment fragment, String title){
        fragmentTitleList.add(title);
        fragmentList.add(fragment);
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }
}
