package com.xushuzhan.theonedemo.data.module.onelist;

import com.xushuzhan.theonedemo.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.data.bean.OneListBean;

import java.util.List;

import io.reactivex.Observable;


/**
 * Created by xushuzhan on 2017/11/27.
 */

public interface OneListBaseData {
    Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id);
    Observable<JsonWrapper<List<String>>> getIdListBeanObservable();


}
