package com.xushuzhan.theonedemo.viewmodel.onelist;

import android.databinding.ObservableField;
import android.util.Log;
import android.widget.Toast;

import com.xushuzhan.theonedemo.model.data.bean.OneListBean;
import com.xushuzhan.theonedemo.model.onelist.DataCallBack;
import com.xushuzhan.theonedemo.model.onelist.DataLoadCallBack;
import com.xushuzhan.theonedemo.model.onelist.OneListModel;
import com.xushuzhan.theonedemo.model.onelist.OneListMultiData;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xushuzhan on 2017/11/30.
 * OneListViewModel 通过DataCallBack回调与OneListModel进行数据交互
 * OneListViewModel 通过DataLoadCallBack回调与Fragment进行数据交互
 */

public class OneListViewModel implements DataCallBack,Serializable {
    private static final String TAG = "OneListViewModel";

    private DataLoadCallBack mDataLoadCallBack ;
    private OneListModel mOneListModel;


    public OneListViewModel() {
        mOneListModel = new OneListModel(OneListMultiData.getInstance());
    }

    public void getData(int pagePosition,DataLoadCallBack dataLoadCallBack){
        mDataLoadCallBack = dataLoadCallBack;
        mOneListModel.getData(pagePosition,this);
    }

    @Override
    public void onLoadData(OneListBean oneListBean) {
        Log.d(TAG, "onLoadData: "+oneListBean.getWeather().getDate());
        mDataLoadCallBack.onComplete(oneListBean);
    }

    @Override
    public void onGetIdList(List<String> idList) {

    }
}
