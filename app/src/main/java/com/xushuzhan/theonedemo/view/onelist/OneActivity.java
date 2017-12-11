package com.xushuzhan.theonedemo.view.onelist;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.xushuzhan.theonedemo.common.BaseActivity;
import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.databinding.ActivityOneBinding;
import com.xushuzhan.theonedemo.model.onelistdetail.ContentCallBack;
import com.xushuzhan.theonedemo.utils.ActivityUtils;
import com.xushuzhan.theonedemo.viewmodel.onelist.OneListViewModel;


public class OneActivity extends BaseActivity {
    private static final String TAG = "OneActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityOneBinding activityOneBinding = DataBindingUtil.setContentView(this, R.layout.activity_one);
        setSupportActionBar(activityOneBinding.toolbarActivityOne);

        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), new OneFragment(), R.id.fm_fragment_activity_one);

    }

}
