package com.xushuzhan.theonedemo.model.data.local.onelistdetail;

import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailBaseData;

import io.reactivex.Observable;

/**
 * 暂时未实现具体逻辑，之后会结合Room来做
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListDetailLocalData<T> implements OneListDetailBaseData {
    @Override
    public <T> Observable<T> getContent(String itemId, String category) {
        return null;
    }
}
