package com.xushuzhan.theonedemo.data.bean;

import android.databinding.ObservableField;

/**
 * Created by xushuzhan on 2017/11/29.
 */

public class OneListItemViewModule{
    public final ObservableField<String> title = new ObservableField<>();
    public final ObservableField<String> picInfo = new ObservableField<>();
    public final ObservableField<String> content = new ObservableField<>();
    public final ObservableField<String> wordsInfo = new ObservableField<>();
    public OneListBean.ContentListBean contentListBean;

    public OneListItemViewModule(OneListBean.ContentListBean contentListBean) {
        this.contentListBean = contentListBean;
        update(contentListBean);
    }

    public void update(OneListBean.ContentListBean contentListBean){
        title.set(contentListBean.getTitle());
        picInfo.set(contentListBean.getPic_info());
        content.set(contentListBean.getForward());
        wordsInfo.set(contentListBean.getWords_info());
    }


}
