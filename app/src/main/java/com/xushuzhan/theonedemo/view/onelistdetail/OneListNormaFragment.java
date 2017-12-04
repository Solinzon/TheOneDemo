package com.xushuzhan.theonedemo.view.onelistdetail;

import android.annotation.SuppressLint;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.databinding.FragmentOneNormalDetailBinding;
import com.xushuzhan.theonedemo.view.onelist.OneCommomFragment;
import com.xushuzhan.theonedemo.viewmodel.onelistdetail.NormalFragmentViewModel;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneListNormaFragment extends Fragment {
    FragmentOneNormalDetailBinding mOneNormalDetailBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mOneNormalDetailBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_one_normal_detail,container,false);
        return mOneNormalDetailBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int itemId = getArguments().getInt(OneCommomFragment.ITEM_ID);
        NormalFragmentViewModel normalFragmentViewModel = new NormalFragmentViewModel(String.valueOf(itemId));
    }
}
