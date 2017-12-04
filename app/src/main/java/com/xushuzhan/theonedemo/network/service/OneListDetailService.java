package com.xushuzhan.theonedemo.network.service;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public interface OneListDetailService {
    @GET("essay/{item_id}?channel=wdj&source=channel_reading&source_id=9264&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<ReadingBean>> getReadingContent(@Path("item_id") String itemId);
}
