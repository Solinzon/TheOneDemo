package com.xushuzhan.theonedemo.model.data.remote.onelistdetail;

import android.util.Log;

import com.xushuzhan.theonedemo.common.Config;
import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.MovieBean;
import com.xushuzhan.theonedemo.model.data.bean.MovieDetailBean;
import com.xushuzhan.theonedemo.model.data.bean.MovieInfoBean;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;
import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailBaseData;
import com.xushuzhan.theonedemo.network.RetrofitManager;
import com.xushuzhan.theonedemo.network.service.OneListDetailService;
import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListDetailRemoteData implements OneListDetailBaseData {
    private static final String TAG = "OneListDetailRemoteData";
    OneListDetailService mOneListDetailService;

    public OneListDetailRemoteData() {
        mOneListDetailService = RetrofitManager.INSTANCE.getRetrofit().create(OneListDetailService.class);
    }

    @Override
    public <T> Observable<T> getContent(String itemId, String category) {

        switch (category) {
            case Config.ONE_DETAIL_CATEGORY_SERIALIZE:
                return (Observable<T>) mOneListDetailService.getSerializedContent(itemId);
            case Config.ONE_DETAIL_CATEGORY_ESSAY:
                return (Observable<T>) mOneListDetailService.getReadingContent(itemId);
            case Config.ONE_DETAIL_CATEGORY_ASK_ANSWER:
                return (Observable<T>) mOneListDetailService.getQuestionContent(itemId);
            case Config.ONE_DETAIL_CATEGORY__MUSIC:
                return (Observable<T>) mOneListDetailService.getMusicContent(itemId);
            case Config.ONE_DETAIL_CATEGORY_MOVIE:
                Observable<JsonWrapper<MovieDetailBean>> detail = mOneListDetailService.getMovieContent(itemId);
                Observable<JsonWrapper<MovieInfoBean>> info = mOneListDetailService.getMovieInfo(itemId);

                    return  (Observable<T>) Observable.zip(detail, info, (movieDetailBeanJsonWrapper, movieInfoBeanJsonWrapper) -> {
                            MovieBean movieBean = new MovieBean(movieInfoBeanJsonWrapper.getData().getDetailcover(),
                            movieDetailBeanJsonWrapper.getData().getData().get(0).getTitle(),
                            movieDetailBeanJsonWrapper.getData().getData().get(0).getContent(),
                            movieDetailBeanJsonWrapper.getData().getData().get(0).getUser().getUser_name());
                        return movieBean;
                    });


            default:
                return (Observable<T>) mOneListDetailService.getReadingContent(itemId);
        }
    }
}
