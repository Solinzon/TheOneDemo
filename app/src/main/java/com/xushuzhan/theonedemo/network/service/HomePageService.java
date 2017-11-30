package com.xushuzhan.theonedemo.network.service;

import com.xushuzhan.theonedemo.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.data.bean.OneListBean;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public interface HomePageService {

    @GET("onelist/idlist/?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<List<String>>> getIdList();

    @GET("onelist/{data}/0?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<OneListBean>> getOneList(@Path("data") String data);

}
