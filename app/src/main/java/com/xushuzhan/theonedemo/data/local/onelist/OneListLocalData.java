package com.xushuzhan.theonedemo.data.local.onelist;

import com.xushuzhan.theonedemo.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.data.bean.OneListBean;
import com.xushuzhan.theonedemo.data.module.onelist.OneListBaseData;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneListLocalData implements OneListBaseData{

    @Override
    public Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id) {
        return null;
    }

    @Override
    public Observable<JsonWrapper<List<String>>> getIdListBeanObservable() {
        return null;
    }
}
