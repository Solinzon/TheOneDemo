package com.xushuzhan.theonedemo.view.onelistdetail;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.databinding.FragmentOneNormalDetailBinding;
import com.xushuzhan.theonedemo.databinding.FragmentOnePicbarDetailBinding;
import com.xushuzhan.theonedemo.view.onelist.OneCommonFragment;
import com.xushuzhan.theonedemo.viewmodel.onelistdetail.NormalFragmentViewModel;
import com.xushuzhan.theonedemo.viewmodel.onelistdetail.PicBarFragmentViewModel;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class OneDetailTopBarFragment extends Fragment {
    FragmentOnePicbarDetailBinding mFragmentOnePicbarDetailBinding;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentOnePicbarDetailBinding= DataBindingUtil.inflate(inflater, R.layout.fragment_one_picbar_detail,container,false);
        return mFragmentOnePicbarDetailBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //itemId用于请求具体的内容
        String itemId = getArguments().getString(OneCommonFragment.ITEM_ID);
        //category用于判断具体的显示类型
        String category = getArguments().getString(OneCommonFragment.ITEM_CATEGORY);
        PicBarFragmentViewModel picBarFragmentViewModel = new PicBarFragmentViewModel(itemId,category);
        mFragmentOnePicbarDetailBinding.setViewModel(picBarFragmentViewModel);
    }
}
