package com.xushuzhan.theonedemo.view.onelist;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.xushuzhan.theonedemo.common.BaseActivity;
import com.xushuzhan.theonedemo.R;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;
import com.xushuzhan.theonedemo.model.data.remote.onelistdetail.OneListDetailRemoteData;
import com.xushuzhan.theonedemo.model.onelistdetail.ContentCallBack;
import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailModel;
import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailMutiData;
import com.xushuzhan.theonedemo.network.RetrofitManager;
import com.xushuzhan.theonedemo.network.service.OneListDetailService;
import com.xushuzhan.theonedemo.utils.ActivityUtils;


public class OneActivity extends BaseActivity implements ContentCallBack{
    private static final String TAG = "OneActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_one);

        Toolbar toolbar = findViewById(R.id.toolbar_activity_one);
        setSupportActionBar(toolbar);

        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), new OneFragment(), R.id.fm_fragment_activity_one);

    }

    @Override
    public void onLoadContent(String content) {
        Log.d(TAG, "onLoadContent: "+content);
    }
}
