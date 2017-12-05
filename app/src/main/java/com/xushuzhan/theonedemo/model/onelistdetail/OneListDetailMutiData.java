package com.xushuzhan.theonedemo.model.onelistdetail;

import android.util.Log;
import com.xushuzhan.theonedemo.model.data.local.onelistdetail.OneListDetailLocalData;
import com.xushuzhan.theonedemo.model.data.remote.onelistdetail.OneListDetailRemoteData;
import java.util.HashMap;
import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListDetailMutiData implements OneListDetailBaseData {
    private static final String TAG = "OneListDetailMutiData";
    OneListDetailRemoteData oneListDetailRemoteData = new OneListDetailRemoteData();
    OneListDetailLocalData oneListDetailLocalData = new OneListDetailLocalData();
    HashMap<String,Object> contentCache = new HashMap<>();




    @Override
    public <T> Observable<T> getContent(String itemId,String category) {
        String s = "来自内存";
        Observable<T> observable = (Observable<T>) contentCache.get(itemId);
        if (observable == null) {
            observable = oneListDetailLocalData.getContent(itemId,category);
            contentCache.put(itemId, observable);
            s = "来自本地";

        }
        if (observable == null) {
            observable = oneListDetailRemoteData.getContent(itemId,category);
            contentCache.put(itemId, observable);
            s = "来自网络";
        }
        Log.d(TAG, "getItemBeanObservable: "+s+">mItemBeanCache.size="+contentCache.size()+">>id="+itemId);
        return observable;
    }
}
