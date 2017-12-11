package com.xushuzhan.theonedemo.viewmodel.onelistdetail;

import android.databinding.ObservableField;

/**
 * Created by xushuzhan on 2017/12/10.
 */

public class OneDetailViewModel {
    public final ObservableField<String> title = new ObservableField<>();

    public void update(String title){
        this.title.set(title);
    }
}
