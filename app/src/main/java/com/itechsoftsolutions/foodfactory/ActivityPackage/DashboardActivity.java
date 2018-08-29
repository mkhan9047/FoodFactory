package com.itechsoftsolutions.foodfactory.ActivityPackage;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itechsoftsolutions.foodfactory.AdapterPackage.DashboardViewpagerAdapter;
import com.itechsoftsolutions.foodfactory.FragmentPackage.HomeFragment;
import com.itechsoftsolutions.foodfactory.FragmentPackage.MenuFragment;
import com.itechsoftsolutions.foodfactory.FragmentPackage.MoreFragment;
import com.itechsoftsolutions.foodfactory.FragmentPackage.ReservationFragment;
import com.itechsoftsolutions.foodfactory.FragmentPackage.ServicesFragment;
import com.itechsoftsolutions.foodfactory.R;

public class DashboardActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        InitView();
        setUpFragment();
    }


    


    private void InitView(){
        tabLayout = findViewById(R.id._dashboard_tabs);
        viewPager = findViewById(R.id.dashboard_viewpager);
    }



    private void setUpFragment(){

        DashboardViewpagerAdapter viewpagerAdapter = new DashboardViewpagerAdapter(getSupportFragmentManager());
        viewpagerAdapter.addItem(new HomeFragment(), "Home");
        viewpagerAdapter.addItem(new MenuFragment(),"Menu");
        viewpagerAdapter.addItem(new ReservationFragment(), "Reservation");
        viewpagerAdapter.addItem(new ServicesFragment(),"Services");
        viewpagerAdapter.addItem(new MoreFragment(),"More");

        viewPager.setAdapter(viewpagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }

}
