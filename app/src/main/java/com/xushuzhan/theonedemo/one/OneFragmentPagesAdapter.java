package com.xushuzhan.theonedemo.one;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by xushuzhan on 2017/11/30.
 */

public class OneFragmentPagesAdapter extends FragmentStatePagerAdapter {
    List<Fragment> mFragments;
    public OneFragmentPagesAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        mFragments = fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
