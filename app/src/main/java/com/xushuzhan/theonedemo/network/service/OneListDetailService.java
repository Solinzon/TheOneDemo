package com.xushuzhan.theonedemo.network.service;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.MovieDetailBean;
import com.xushuzhan.theonedemo.model.data.bean.MovieInfoBean;
import com.xushuzhan.theonedemo.model.data.bean.MusicBean;
import com.xushuzhan.theonedemo.model.data.bean.QuestionBean;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;
import com.xushuzhan.theonedemo.model.data.bean.SerializedContentBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public interface OneListDetailService {
    //文章 category = 1
    @GET("essay/{item_id}?channel=wdj&source=channel_reading&source_id=9264&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<ReadingBean>> getReadingContent(@Path("item_id") String itemId);
    //连载 category = 2
    @GET("serialcontent/{item_id}?channel=wdj&source=summary&source_id=9261&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<SerializedContentBean>> getSerializedContent(@Path("item_id") String itemId);
    //问答 category = 3
    @GET("question/{item_id}?channel=wdj&source=summary&source_id=9261&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<QuestionBean>> getQuestionContent(@Path("item_id") String itemId);
    //音乐 category = 4
    @GET ("music/detail/{item_id}?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<MusicBean>> getMusicContent(@Path("item_id") String itemId);

    //影视信息 category = 5
    @GET ("movie/detail/{item_id}?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<MovieInfoBean>> getMovieInfo(@Path("item_id") String itemId);

    @GET ("movie/{item_id}/story/1/0?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<JsonWrapper<MovieDetailBean>> getMovieContent(@Path("item_id") String itemId);
}
