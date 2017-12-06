package com.xushuzhan.theonedemo.view.onelist;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.databinding.FragmentOneBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public class OneFragment extends Fragment{
    private static final String TAG = "OneFragment";
    FragmentOneBinding mFragmentOneBinding;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentOneBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_one,container,false);
        Log.d(TAG, "onCreateView: ");
        return mFragmentOneBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<Fragment> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(OneCommonFragment.newInstance(i));
        }
        mFragmentOneBinding.vpFragmentOneFragment.setAdapter(new OneFragmentPagesAdapter(getActivity().getSupportFragmentManager(),list));
    }

}
