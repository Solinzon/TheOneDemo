package com.xushuzhan.theonedemo.common;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by xushuzhan on 2017/11/30.
 */

public class CommonViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    public T binding;
    public CommonViewHolder(T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

}
