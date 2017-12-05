package com.xushuzhan.theonedemo.model.onelistdetail;

import io.reactivex.Observable;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public interface OneListDetailBaseData{
    <T> Observable<T> getContent(String itemId,String category);
}
