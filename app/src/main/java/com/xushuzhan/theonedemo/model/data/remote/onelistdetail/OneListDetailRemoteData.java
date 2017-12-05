package com.xushuzhan.theonedemo.model.data.remote.onelistdetail;

import android.util.Log;

import com.xushuzhan.theonedemo.common.Config;
import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;
import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailBaseData;
import com.xushuzhan.theonedemo.network.RetrofitManager;
import com.xushuzhan.theonedemo.network.service.OneListDetailService;

import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListDetailRemoteData implements OneListDetailBaseData{
    private static final String TAG = "OneListDetailRemoteData";
    OneListDetailService mOneListDetailService;
    public OneListDetailRemoteData() {
        mOneListDetailService = RetrofitManager.INSTANCE.getRetrofit().create(OneListDetailService.class);
    }

    @Override
    public <T>Observable<T> getContent(String itemId,String category) {
        if (category.equals(Config.ONE_DETAIL_CATEGORY_SERIALIZE)){
            Log.d(TAG, "getContent: 连载");
            return (Observable<T>) mOneListDetailService.getSerializedContent(itemId);
        }
        return (Observable<T>) mOneListDetailService.getReadingContent(itemId);
    }
}
