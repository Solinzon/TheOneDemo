package com.xushuzhan.theonedemo.network;

import com.xushuzhan.theonedemo.common.Config;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public enum RetrofitManager {
    INSTANCE;
    public Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
