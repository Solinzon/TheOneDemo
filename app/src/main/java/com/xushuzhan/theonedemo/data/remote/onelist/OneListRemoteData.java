package com.xushuzhan.theonedemo.data.remote.onelist;

import com.xushuzhan.theonedemo.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.data.bean.OneListBean;
import com.xushuzhan.theonedemo.data.module.onelist.OneListBaseData;
import com.xushuzhan.theonedemo.network.RetrofitManager;
import com.xushuzhan.theonedemo.network.service.HomePageService;

import java.util.List;

import io.reactivex.Observable;


/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneListRemoteData implements OneListBaseData {
    HomePageService homePageService;

    public OneListRemoteData(){
         createApiService();
    }

    void createApiService(){
        homePageService = RetrofitManager.INSTANCE
                .getRetrofit()
                .create(HomePageService.class);
    }
    @Override
    public Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id) {
        return homePageService.getOneList(id);
    }

    @Override
    public Observable<JsonWrapper<List<String>>> getIdListBeanObservable() {
        return homePageService.getIdList();
    }


}
