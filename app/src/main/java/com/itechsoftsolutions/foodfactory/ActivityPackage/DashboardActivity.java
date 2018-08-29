package com.itechsoftsolutions.foodfactory.ActivityPackage;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itechsoftsolutions.foodfactory.R;

public class DashboardActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        InitView();

    }


    


    private void InitView(){
        tabLayout = findViewById(R.id._dashboard_tabs);
        viewPager = findViewById(R.id.dashboard_viewpager);
    }


}
