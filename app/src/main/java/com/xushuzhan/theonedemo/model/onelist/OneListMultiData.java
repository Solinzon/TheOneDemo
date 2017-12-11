package com.xushuzhan.theonedemo.model.onelist;

import android.app.Instrumentation;
import android.support.annotation.NonNull;
import android.util.Log;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.OneListBean;
import com.xushuzhan.theonedemo.model.data.local.onelist.OneListLocalData;
import com.xushuzhan.theonedemo.model.data.remote.onelist.OneListRemoteData;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/11/28.
 */

public class OneListMultiData implements OneListBaseData {
    private static final String TAG = "OneListMultiData";
    OneListRemoteData oneListRemoteData;
    OneListLocalData oneListLocalData;

    HashMap<String, Observable<JsonWrapper<OneListBean>>> mItemBeanCache = new HashMap<>();
    Observable<JsonWrapper<List<String>>> mIdListBeanCache;
    public static class Holder{
      static OneListMultiData INSTANCE = new OneListMultiData(new OneListRemoteData(),new OneListLocalData());
    }
    public static OneListMultiData getInstance(){
        return Holder.INSTANCE;
    }
    private OneListMultiData(@NonNull OneListRemoteData oneListRemoteData, @NonNull OneListLocalData oneListLocalData) {
        this.oneListRemoteData = oneListRemoteData;
        this.oneListLocalData = oneListLocalData;
    }

    @Override
    public Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id) {
        String s = "来自内存";
        Observable<JsonWrapper<OneListBean>> observable = mItemBeanCache.get(id);
        if (observable == null) {
            observable = oneListLocalData.getItemBeanObservable(id);
            mItemBeanCache.put(id, observable);
            s = "来自本地";

        }
        if (observable == null) {
            observable = oneListRemoteData.getItemBeanObservable(id);
            mItemBeanCache.put(id, observable);
            s = "来自网络";
        }
        Log.d(TAG, "getItemBeanObservable: "+s);
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
