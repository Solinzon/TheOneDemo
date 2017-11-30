package com.xushuzhan.theonedemo.data.module.onelist;

import android.support.annotation.NonNull;
import android.util.ArrayMap;
import android.util.Log;

import com.xushuzhan.theonedemo.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.data.bean.OneListBean;
import com.xushuzhan.theonedemo.data.bean.OneListItemViewModule;
import com.xushuzhan.theonedemo.data.local.onelist.OneListLocalData;
import com.xushuzhan.theonedemo.data.remote.onelist.OneListRemoteData;

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
//    ArrayMap<String, Observable<JsonWrapper<OneListBean>>> mItemBeanCache = new ArrayMap<>();
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
        Log.d(TAG, "OneListMultiData: 初始化了");
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
        Log.d(TAG, "getItemBeanObservable: "+s+">mItemBeanCache.size="+mItemBeanCache.size()+">>id="+id);
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
