package com.xushuzhan.theonedemo.model.onelist;

import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneListModel {
    private static final String TAG = "OneListModel";
    OneListBaseDatail mOneListBaseData;

    public OneListModel(OneListBaseDatail oneListBaseData) {
            mOneListBaseData = oneListBaseData;
    }

    public void getData(int idPosition, DataCallBack dataCallBack) {
        mOneListBaseData.getIdListBeanObservable()
                .flatMap(listJsonWrapper -> mOneListBaseData.getItemBeanObservable(listJsonWrapper.getData().get(idPosition)))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(oneListBeanJsonWrapper -> {
                    dataCallBack.onLoadData(oneListBeanJsonWrapper.getData());
                }, throwable ->
                {
                    Log.e(TAG, "getData: " + throwable.getMessage());
                    throwable.printStackTrace();
                });
    }

}
