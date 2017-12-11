package com.xushuzhan.theonedemo.common;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xushuzhan.theonedemo.utils.StatusBarUtil;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public abstract class BaseActivity extends AppCompatActivity {
    private boolean isSetTransparent = true;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (isSetTransparent) {
            StatusBarUtil.transparentizeStatusBar(this);
        }
    }
    public void requestCancelTransparentsizeStatusBar(boolean isSetTransparent) {
        this.isSetTransparent = isSetTransparent;
    }

}
