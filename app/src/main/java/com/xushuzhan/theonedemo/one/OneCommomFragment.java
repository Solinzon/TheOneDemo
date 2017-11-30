package com.xushuzhan.theonedemo.one;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.data.bean.OneListBean;
import com.xushuzhan.theonedemo.data.bean.OneListItemViewModule;
import com.xushuzhan.theonedemo.data.module.onelist.DataLoadCallBack;
import com.xushuzhan.theonedemo.data.module.onelist.OneListViewModel;
import com.xushuzhan.theonedemo.databinding.FragmentOneBinding;
import com.xushuzhan.theonedemo.databinding.FragmentOneCommonBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneCommomFragment extends Fragment implements DataLoadCallBack{
    private static final String TAG = "OneCommomFragment";
    public static final String LIST_ID = "list_id";
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
        OneListViewModel oneListViewModel = new OneListViewModel(listId,this);

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
        mFragmentCommonOneBinding.rvOneCommonFragment.setAdapter(new OneListAdapter(oneListBean.getContent_list()));
        Log.d(TAG, "onComplete: "+oneListBean.getContent_list().get(0).toString());
    }
}
