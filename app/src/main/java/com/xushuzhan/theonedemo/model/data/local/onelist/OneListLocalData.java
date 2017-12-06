package com.xushuzhan.theonedemo.model.data.local.onelist;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.OneListBean;
import com.xushuzhan.theonedemo.model.onelist.OneListBaseData;

import java.util.List;

import io.reactivex.Observable;

/**
 * 暂时未实现具体逻辑，之后会结合Room来做
 * Created by xushuzhan on 2017/11/27.
 */

public class OneListLocalData implements OneListBaseData {

    @Override
    public Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id) {
        return null;
    }

    @Override
    public Observable<JsonWrapper<List<String>>> getIdListBeanObservable() {
        return null;
    }
}
