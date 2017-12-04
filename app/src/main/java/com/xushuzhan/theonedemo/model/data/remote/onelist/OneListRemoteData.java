package com.xushuzhan.theonedemo.model.data.remote.onelist;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.OneListBean;
import com.xushuzhan.theonedemo.model.onelist.OneListBaseDatail;
import com.xushuzhan.theonedemo.network.RetrofitManager;
import com.xushuzhan.theonedemo.network.service.OneListService;

import java.util.List;

import io.reactivex.Observable;


/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneListRemoteData implements OneListBaseDatail {
    OneListService oneListService;

    public OneListRemoteData(){
         createApiService();
    }

    void createApiService(){
        oneListService = RetrofitManager.INSTANCE
                .getRetrofit()
                .create(OneListService.class);
    }
    @Override
    public Observable<JsonWrapper<OneListBean>> getItemBeanObservable(String id) {
        return oneListService.getOneList(id);
    }

    @Override
    public Observable<JsonWrapper<List<String>>> getIdListBeanObservable() {
        return oneListService.getIdList();
    }


}
