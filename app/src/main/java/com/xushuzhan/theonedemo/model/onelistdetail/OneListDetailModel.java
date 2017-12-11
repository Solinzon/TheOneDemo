package com.xushuzhan.theonedemo.model.onelistdetail;

import com.xushuzhan.theonedemo.common.Config;
import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.MovieBean;
import com.xushuzhan.theonedemo.model.data.bean.MusicBean;
import com.xushuzhan.theonedemo.model.data.bean.QuestionBean;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;
import com.xushuzhan.theonedemo.model.data.bean.SerializedContentBean;
import com.xushuzhan.theonedemo.utils.ContentConverter.MovieConverter;
import com.xushuzhan.theonedemo.utils.ContentConverter.MusicConverter;
import com.xushuzhan.theonedemo.utils.ContentConverter.OneStoryConverter;
import com.xushuzhan.theonedemo.utils.ContentConverter.QuestionConverter;
import com.xushuzhan.theonedemo.utils.ContentConverter.SerialzedContenConverter;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListDetailModel {
    OneListDetailBaseData oneListDetailBaseData;

    public OneListDetailModel(OneListDetailBaseData oneListDetailBaseData) {
        this.oneListDetailBaseData = oneListDetailBaseData;
    }

    //category = 1 的文章类的请求方法
    public void getReadContent(String itemId, ContentCallBack contentCallBack) {
        oneListDetailBaseData.<JsonWrapper<ReadingBean>>getContent(itemId, Config.ONE_DETAIL_CATEGORY_ESSAY)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        readingBeanJsonWrapper -> contentCallBack.onLoadContent(OneStoryConverter.convert(readingBeanJsonWrapper.getData())),
                        Throwable::printStackTrace
                );
    }

    //category = 2 的连载类的请求方法
    public void getSerializedContent(String itemId, ContentCallBack contentCallBack) {
        oneListDetailBaseData.<JsonWrapper<SerializedContentBean>>getContent(itemId, Config.ONE_DETAIL_CATEGORY_SERIALIZE)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        serializedContentBeanJsonWrapper -> contentCallBack.onLoadContent(SerialzedContenConverter.convert(serializedContentBeanJsonWrapper.getData())),
                        Throwable::printStackTrace
                );
    }

    //category = 3 的问答类的请求方法
    public void getQuestionContent(String itemId, ContentCallBack contentCallBack) {
        oneListDetailBaseData.<JsonWrapper<QuestionBean>>getContent(itemId, Config.ONE_DETAIL_CATEGORY_ASK_ANSWER)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        serializedContentBeanJsonWrapper -> contentCallBack.onLoadContent(QuestionConverter.convert(serializedContentBeanJsonWrapper.getData())),
                        Throwable::printStackTrace
                );
    }

    //category = 4 的音乐类的请求方法
    public void getMusicContent(String itemId, ContentCallBack contentCallBack) {
        oneListDetailBaseData.<JsonWrapper<MusicBean>>getContent(itemId, Config.ONE_DETAIL_CATEGORY__MUSIC)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        musicBeanJsonWrapper -> contentCallBack.onLoadContent(MusicConverter.convert(musicBeanJsonWrapper.getData())),
                        Throwable::printStackTrace
                );
    }

    //category = 5 的电影类的请求方法
    public void getMoviewContent(String itemId, ContentCallBack contentCallBack) {
        oneListDetailBaseData.<MovieBean>getContent(itemId, Config.ONE_DETAIL_CATEGORY_MOVIE)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(movieBean -> contentCallBack.onLoadContent(MovieConverter.convert(movieBean)),
                        Throwable::printStackTrace
                );
    }
}
