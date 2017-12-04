package com.xushuzhan.theonedemo.model.onelistdetail;

import com.xushuzhan.theonedemo.model.data.bean.JsonWrapper;
import com.xushuzhan.theonedemo.model.data.bean.ReadingBean;
import com.xushuzhan.theonedemo.utils.ContentConverter.OneStoryConverter;

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

    public void getReadContent(String itemId,ContentCallBack contentCallBack){
        oneListDetailBaseData.<JsonWrapper<ReadingBean>>getContent(itemId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        readingBeanJsonWrapper -> contentCallBack.onLoadContent(OneStoryConverter.convert(readingBeanJsonWrapper.getData())),
                        Throwable::printStackTrace
                );
    }
}
