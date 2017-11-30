package com.xushuzhan.theonedemo.utils;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.IdRes;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;


/**
 * Created by xushuzhan on 2017/11/27.
 */

public  class StatusBarUtil {
   public static void transparentizeStatusBar(Activity activity, View titleBarView){
       Window window = activity.getWindow();
       if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP){
           //设置状态栏透明
           window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
       }

       if (titleBarView!=null){
           titleBarView.setFitsSystemWindows(true);
       }
   }
    public static void transparentizeStatusBar(Activity activity, @IdRes int titleBarId){
       transparentizeStatusBar(activity,activity.findViewById(titleBarId));
    }
    public static void transparentizeStatusBar(Activity activity){
        transparentizeStatusBar(activity,null);
        //content对应的Framelayout
        ViewGroup frame = (ViewGroup) activity.findViewById(Window.ID_ANDROID_CONTENT);
        //传入的布局
        ViewGroup viewGroup = (ViewGroup) frame.getChildAt(0);
        //获取第一个元素，即toolbar
        viewGroup.getChildAt(0).setFitsSystemWindows(true);
    }

}
