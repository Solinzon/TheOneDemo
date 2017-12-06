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

public class OneListDetailRemoteData implements OneListDetailBaseData {
    private static final String TAG = "OneListDetailRemoteData";
    OneListDetailService mOneListDetailService;

    public OneListDetailRemoteData() {
        mOneListDetailService = RetrofitManager.INSTANCE.getRetrofit().create(OneListDetailService.class);
    }

    @Override
    public <T> Observable<T> getContent(String itemId, String category) {

        switch (category) {
            case Config.ONE_DETAIL_CATEGORY_SERIALIZE:
                return (Observable<T>) mOneListDetailService.getSerializedContent(itemId);
            case Config.ONE_DETAIL_CATEGORY_ESSAY:
                return (Observable<T>) mOneListDetailService.getReadingContent(itemId);
            case Config.ONE_DETAIL_CATEGORY_ASK_ANSWER:
                return (Observable<T>) mOneListDetailService.getQuestionContent(itemId);
            default:
                return (Observable<T>) mOneListDetailService.getReadingContent(itemId);
        }
    }
}
