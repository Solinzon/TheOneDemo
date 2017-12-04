package com.xushuzhan.theonedemo.model.onelist;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.OneListBean;

import java.util.List;

import io.reactivex.Observable;


/**
 * Created by xushuzhan on 2017/11/27.
 */

public interface OneListBaseDatail {
    Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id);
    Observable<JsonWrapper<List<String>>> getIdListBeanObservable();


}
