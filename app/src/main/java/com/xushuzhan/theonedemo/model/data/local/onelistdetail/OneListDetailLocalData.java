package com.xushuzhan.theonedemo.model.data.local.onelistdetail;

import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailBaseData;

import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListDetailLocalData<T> implements OneListDetailBaseData {
    @Override
    public Observable<T> getContent(String itemId) {
        return null;
    }
}
