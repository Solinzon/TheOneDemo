package com.xushuzhan.theonedemo.one;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xushuzhan.theonedemo.BR;
import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.data.bean.OneListBean;
import com.xushuzhan.theonedemo.data.bean.OneListItemViewModule;
import com.xushuzhan.theonedemo.databinding.ItemOneNormalBinding;
import com.xushuzhan.theonedemo.databinding.ItemOneTopBinding;
import com.xushuzhan.theonedemo.common.CommonViewHolder;
import java.util.List;

/**
 * Created by xushuzhan on 2017/11/28.
 */

public class OneListAdapter extends RecyclerView.Adapter<CommonViewHolder> {

    List<OneListBean.ContentListBean> mContents;
    public OneListAdapter(List<OneListBean.ContentListBean> contentListBean) {
        mContents = contentListBean;
    }

    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == R.layout.item_one_top){
            ItemOneTopBinding itemOneTopBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),viewType,parent,false);
            return new CommonViewHolder<ItemOneTopBinding>(itemOneTopBinding);
        }else {
            ItemOneNormalBinding itemOneNormalBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),viewType,parent,false);
            return new CommonViewHolder<ItemOneNormalBinding>(itemOneNormalBinding);
        }

    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, int position) {
        OneListBean.ContentListBean contentListBean = mContents.get(position);
        OneListItemViewModule oneListItemViewModule = new OneListItemViewModule(contentListBean);
        holder.binding.setVariable(BR.itemViewModule,oneListItemViewModule);
//        oneListItemViewModule.update(contentListBean);
    }



    @Override
    public int getItemCount() {
        return 1;
    }

//    class OneListHolder extends RecyclerView.ViewHolder{
//        ViewDataBinding viewDataBinding;
//        public OneListHolder(ViewDataBinding itemBinding){
//            super(itemBinding.getRoot());
//            viewDataBinding = itemBinding;
//        }
//    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0){
            return R.layout.item_one_top;
        }else {
            return R.layout.item_one_normal;
        }
    }
}
