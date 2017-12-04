package com.xushuzhan.theonedemo.viewmodel.onelist;

import com.xushuzhan.theonedemo.model.data.bean.OneListBean;
import com.xushuzhan.theonedemo.model.onelist.DataCallBack;
import com.xushuzhan.theonedemo.model.onelist.DataLoadCallBack;
import com.xushuzhan.theonedemo.model.onelist.OneListModel;
import com.xushuzhan.theonedemo.model.onelist.OneListMultiData;

import java.util.List;

/**
 * Created by xushuzhan on 2017/11/30.
 * OneListViewModel 通过DataCallBack回调与OneListModel进行数据交互
 * OneListViewModel 通过DataLoadCallBack回调与Fragment进行数据交互
 */

public class OneListViewModel implements DataCallBack {
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
