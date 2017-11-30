package com.xushuzhan.theonedemo.data.module.onelist;

import android.util.Log;

import com.xushuzhan.theonedemo.data.bean.OneListBean;
import com.xushuzhan.theonedemo.data.local.onelist.OneListLocalData;
import com.xushuzhan.theonedemo.data.remote.onelist.OneListRemoteData;

import java.util.List;

/**
 * Created by xushuzhan on 2017/11/30.
 * OneListViewModel 通过DataCallBack回调与OneListModel进行数据交互
 * OneListViewModel 通过DataLoadCallBack回调与Fragment进行数据交互
 */

public class OneListViewModel implements DataCallBack{
    private static final String TAG = "OneListViewModel";
    private DataLoadCallBack mDataLoadCallBack ;
    private OneListModel mOneListModel;

    public OneListViewModel(int pagePisitionn,DataLoadCallBack dataLoadCallBack) {
        mDataLoadCallBack = dataLoadCallBack;
        mOneListModel = new OneListModel(OneListMultiData.getInstance());
        mOneListModel.getData(pagePisitionn,this);
    }

    @Override
    public void onLoadData(OneListBean oneListBean) {
        mDataLoadCallBack.onComplete(oneListBean);
    }

    @Override
    public void onGetIdList(List<String> idList) {

    }
}
