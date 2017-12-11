package com.xushuzhan.theonedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.xushuzhan.theonedemo.common.BaseActivity;
import com.xushuzhan.theonedemo.view.onelist.OneActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar_activity_main);
        setSupportActionBar(toolbar);
        startActivity(new Intent(this, OneActivity.class));
//        startActivity(new Intent(this, TestActivity.class));

    }

}
