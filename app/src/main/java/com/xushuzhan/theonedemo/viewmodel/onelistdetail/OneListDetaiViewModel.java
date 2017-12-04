package com.xushuzhan.theonedemo.viewmodel.onelistdetail;

import android.app.Fragment;
import android.databinding.ObservableField;
import android.support.v4.app.FragmentManager;

import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailModel;
import com.xushuzhan.theonedemo.utils.ActivityUtils;
import com.xushuzhan.theonedemo.view.onelistdetail.OneListNormaFragment;
import com.xushuzhan.theonedemo.view.onelistdetail.OnelistTopBarFragment;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListDetaiViewModel {
    private final ObservableField<String> mShowType = new ObservableField<>();
    private OneListNormaFragment mOneListNormaFragment = new OneListNormaFragment();
    private OnelistTopBarFragment mOnelistTopBarFragment = new OnelistTopBarFragment();
    public FragmentManager mFragmentManager;

    public OneListDetaiViewModel(FragmentManager mFragmentManager) {
        this.mFragmentManager = mFragmentManager;
    }

    public void loadFragment(){

    }
//    public static void loadFragment(Fragment fragment, String showType) {
//        int frameId = fragment.getId();
//        ActivityUtils.addFragmentToActivity(OneListDetaiViewModel.);
//
//    }
}
