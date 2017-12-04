package com.xushuzhan.theonedemo.model.data.local.onelist;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.OneListBean;
import com.xushuzhan.theonedemo.model.onelist.OneListBaseDatail;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneListLocalData implements OneListBaseDatail {

    @Override
    public Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id) {
        return null;
    }

    @Override
    public Observable<JsonWrapper<List<String>>> getIdListBeanObservable() {
        return null;
    }
}
