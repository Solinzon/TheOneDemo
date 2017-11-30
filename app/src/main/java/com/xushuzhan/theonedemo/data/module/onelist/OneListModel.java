package com.xushuzhan.theonedemo.data.module.onelist;

import android.util.Log;

import com.xushuzhan.theonedemo.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.data.bean.OneListBean;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneListModel {
    private static final String TAG = "OneListModel";
    OneListBaseData mOneListBaseData;

    public OneListModel(OneListBaseData oneListBaseData){
        mOneListBaseData = oneListBaseData;
    }

    public void getData(int idPosition,DataCallBack dataCallBack){
        mOneListBaseData.getIdListBeanObservable()
                .flatMap(listJsonWrapper -> mOneListBaseData.getItemBeanObservable(listJsonWrapper.getData().get(idPosition)))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(oneListBeanJsonWrapper -> {
                    dataCallBack.onLoadData(oneListBeanJsonWrapper.getData());
                },throwable -> Log.e(TAG, "getData: "+throwable.getMessage()));
    }

}
