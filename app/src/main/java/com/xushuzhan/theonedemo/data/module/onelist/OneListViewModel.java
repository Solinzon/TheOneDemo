package com.xushuzhan.theonedemo.data.module.onelist;

import com.xushuzhan.theonedemo.data.bean.OneListBean;
import com.xushuzhan.theonedemo.data.local.onelist.OneListLocalData;
import com.xushuzhan.theonedemo.data.remote.onelist.OneListRemoteData;

import java.util.List;

/**
 * Created by xushuzhan on 2017/11/30.
 */

public class OneListViewModel implements DataCallBack{
    DataLoadCallBack mDataLoadCallBack ;

    OneListBaseData oneListBaseData = new OneListMultiData(new OneListRemoteData(),new OneListLocalData());

    public OneListViewModel(int pagePisitionn,DataLoadCallBack dataLoadCallBack) {
        mDataLoadCallBack = dataLoadCallBack;
        OneListModel oneListModel = new OneListModel(oneListBaseData);
        oneListModel.getData(pagePisitionn,this);
    }

    @Override
    public void onLoadData(OneListBean oneListBean) {
        mDataLoadCallBack.onComplete(oneListBean);
    }

    @Override
    public void onGetIdList(List<String> idList) {

    }
}
