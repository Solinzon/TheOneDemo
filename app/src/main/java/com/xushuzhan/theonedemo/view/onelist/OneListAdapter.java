package com.xushuzhan.theonedemo.view.onelist;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xushuzhan.theonedemo.BR;
import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.model.data.bean.OneListBean;
import com.xushuzhan.theonedemo.viewmodel.onelist.OneListItemViewModule;
import com.xushuzhan.theonedemo.databinding.ItemOneNormalBinding;
import com.xushuzhan.theonedemo.databinding.ItemOneTopBinding;
import com.xushuzhan.theonedemo.common.CommonViewHolder;

import java.util.List;

/**
 * Created by xushuzhan on 2017/11/28.
 */

public class OneListAdapter extends RecyclerView.Adapter<CommonViewHolder>{

    List<OneListBean.ContentListBean> mContents;
    OnItemClickListener mListener;
    public OneListAdapter(List<OneListBean.ContentListBean> contentListBean) {
        mContents = contentListBean;
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }
    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == R.layout.item_one_top) {
            ItemOneTopBinding itemOneTopBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), viewType, parent, false);
            return new CommonViewHolder<>(itemOneTopBinding);
        } else {
            ItemOneNormalBinding itemOneNormalBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), viewType, parent, false);
            return new CommonViewHolder<>(itemOneNormalBinding);
        }

    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, int position) {
        OneListBean.ContentListBean contentListBean = mContents.get(position);


        OneListItemViewModule oneListItemViewModule = new OneListItemViewModule(contentListBean);
        holder.binding.setVariable(BR.itemViewModel, oneListItemViewModule);
//        oneListItemViewModule.update(contentListBean);
        holder.itemView.setOnClickListener(view -> {
            if (mListener!=null) mListener.onItemClick(contentListBean);
        });
    }


    @Override
    public int getItemCount() {
        return mContents.size();
    }


    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return R.layout.item_one_top;
        } else {
            return R.layout.item_one_normal;
        }
    }


}
