package com.viet.rooparam.mytabapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewPageAdapter extends FragmentPagerAdapter {

    List<Fragment> mfragmentlist = new ArrayList<>();
    List<String> mfragmentTitlelist = new ArrayList<>();

    public viewPageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return mfragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentlist.size();
    }

    public void addFragment(Fragment fragment, String title) {
        mfragmentlist.add(fragment);
        mfragmentTitlelist.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mfragmentTitlelist.get(position);
    }
}
