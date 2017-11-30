package com.xushuzhan.theonedemo.data.module.onelist;

import com.xushuzhan.theonedemo.data.bean.OneListBean;

import java.util.List;

/**
 * Created by xushuzhan on 2017/11/29.
 */

public interface DataCallBack {
    //获取到数据时候
//    void onLoadData(OneListBean.ContentListBean contentListBean);
    void onLoadData(OneListBean oneListBean);

    //获取到列表id了
    void onGetIdList(List<String> idList);

}
