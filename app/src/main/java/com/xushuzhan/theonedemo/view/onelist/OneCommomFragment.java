package com.xushuzhan.theonedemo.view.onelist;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.model.data.bean.OneListBean;
import com.xushuzhan.theonedemo.model.onelist.DataLoadCallBack;
import com.xushuzhan.theonedemo.view.onelistdetail.OneDetailActivity;
import com.xushuzhan.theonedemo.viewmodel.onelist.OneListViewModel;
import com.xushuzhan.theonedemo.databinding.FragmentOneCommonBinding;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneCommomFragment extends Fragment implements DataLoadCallBack{
    private static final String TAG = "OneCommomFragment";
    public static final String LIST_ID = "list_id";
    public static final String ITEM_CATEGORY = "item_category";
    public static final String ITEM_ID = "item_id";

    FragmentOneCommonBinding mFragmentCommonOneBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mFragmentCommonOneBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_one_common,container,false);
        return mFragmentCommonOneBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int listId = getArguments().getInt(LIST_ID);
        OneListViewModel oneListViewModel = new OneListViewModel();
        oneListViewModel.getData(listId,this);

    }

    public static Fragment newInstance(int listId){
        Fragment fragment = new OneCommomFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(LIST_ID,listId);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onComplete(OneListBean oneListBean) {
        mFragmentCommonOneBinding.rvOneCommonFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        OneListAdapter oneListAdapter = new OneListAdapter(oneListBean.getContent_list());
        oneListAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(OneListBean.ContentListBean contentListBean) {
                Intent intent = new Intent(OneCommomFragment.this.getContext(), OneDetailActivity.class);
                intent.putExtra(ITEM_CATEGORY,contentListBean.getCategory());
                intent.putExtra(ITEM_ID,contentListBean.getItem_id());
                startActivity(intent);
            }
        });
        mFragmentCommonOneBinding.rvOneCommonFragment.setAdapter(oneListAdapter);
    }
}
