package com.xushuzhan.theonedemo.viewmodel.onelistdetail;

import android.databinding.ObservableField;
import android.support.v4.app.FragmentManager;

import com.xushuzhan.theonedemo.view.onelistdetail.OneDetailNormaFragment;
import com.xushuzhan.theonedemo.view.onelistdetail.OneDetailTopBarFragment;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListDetaiViewModel {
    private final ObservableField<String> mShowType = new ObservableField<>();

    public FragmentManager mFragmentManager;

    public OneListDetaiViewModel(FragmentManager mFragmentManager) {
        this.mFragmentManager = mFragmentManager;
    }

    public void loadFragment(){

    }

}
