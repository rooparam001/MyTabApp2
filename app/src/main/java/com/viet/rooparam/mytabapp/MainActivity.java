package com.viet.rooparam.mytabapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.pageview);
        setViewPager(viewPager);

        tabLayout = (TabLayout)findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setViewPager(ViewPager viewPager)
    {
        viewPageAdapter Adapter = new viewPageAdapter(getSupportFragmentManager());
        Adapter.addFragment(new OneFragment(),"One");
        Adapter.addFragment(new TwoFragment(),"Two");
        Adapter.addFragment(new ThreeFragment(),"Three");
        Adapter.addFragment(new FourFragment(),"Four");
        Adapter.addFragment(new FiveFragment(),"five");
        Adapter.addFragment(new ItemFragment(),"Six");
        viewPager.setAdapter(Adapter);
    }
}
