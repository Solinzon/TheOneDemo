package com.xushuzhan.theonedemo.data.module.onelist;

import android.support.annotation.NonNull;
import android.util.ArrayMap;

import com.xushuzhan.theonedemo.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.data.bean.OneListBean;
import com.xushuzhan.theonedemo.data.local.onelist.OneListLocalData;
import com.xushuzhan.theonedemo.data.remote.onelist.OneListRemoteData;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/11/28.
 */

public class OneListMultiData implements OneListBaseData {
    OneListRemoteData oneListRemoteData;
    OneListLocalData oneListLocalData;
    ArrayMap<String, Observable<JsonWrapper<OneListBean>>> mItemBeanCache = new ArrayMap<>();
    Observable<JsonWrapper<List<String>>> mIdListBeanCache;

    public OneListMultiData(@NonNull OneListRemoteData oneListRemoteData, @NonNull OneListLocalData oneListLocalData) {
        this.oneListRemoteData = oneListRemoteData;
        this.oneListLocalData = oneListLocalData;
    }

    @Override
    public Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id) {
        Observable<JsonWrapper<OneListBean>> observable = mItemBeanCache.get(id);
        if (observable == null) {
            observable = oneListLocalData.getItemBeanObservable(id);
        }
        if (observable == null) {
            observable = oneListRemoteData.getItemBeanObservable(id);
        }
        mItemBeanCache.put(id, observable);
        return observable;
    }

    @Override
    public Observable<JsonWrapper<List<String>>> getIdListBeanObservable() {
        if (mIdListBeanCache == null){
            mIdListBeanCache = oneListLocalData.getIdListBeanObservable();
        }
        if (mIdListBeanCache == null){
            mIdListBeanCache = oneListRemoteData.getIdListBeanObservable();
        }
        return mIdListBeanCache;
    }
}
