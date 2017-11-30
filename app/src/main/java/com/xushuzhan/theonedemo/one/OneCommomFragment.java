package com.xushuzhan.theonedemo.one;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
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
    public static final String LIST_ID = "list_id";

    FragmentOneCommonBinding mFragmentCommonOneBinding;
    String content = " {\n" +
            "                \"id\": \"9070\",\n" +
            "                \"category\": \"0\",\n" +
            "                \"display_category\": 6,\n" +
            "                \"item_id\": \"1581\",\n" +
            "                \"title\": \"绘画\",\n" +
            "                \"forward\": \"许多人相信，没有注定的人生，所有的事基本上是一连串的巧合。然而，即使抱持如是信念的人也会有这样的结论：在生命中的某一段时期，当他们回头审视，发现多年来被视为巧合的事，其实是不可避免的。\",\n" +
            "                \"img_url\": \"http://image.wufazhuce.com/FgV1sJRhHYefN8FNRkJJIXpKbI97\",\n" +
            "                \"like_count\": 3166,\n" +
            "                \"post_date\": \"2017-01-08 06:00:00\",\n" +
            "                \"last_update_date\": \"2017-01-04 18:22:59\",\n" +
            "                \"author\": { },\n" +
            "                \"video_url\": \"\",\n" +
            "                \"audio_url\": \"\",\n" +
            "                \"audio_platform\": 2,\n" +
            "                \"start_video\": \"\",\n" +
            "                \"volume\": \"VOL.1555\",\n" +
            "                \"pic_info\": \"大木耳Hammer Chen\",\n" +
            "                \"words_info\": \"奥尔罕·帕慕克\",\n" +
            "                \"subtitle\": \"\",\n" +
            "                \"number\": 0,\n" +
            "                \"serial_id\": 0,\n" +
            "                \"serial_list\": [ ],\n" +
            "                \"movie_story_id\": 0,\n" +
            "                \"ad_id\": 0,\n" +
            "                \"ad_type\": 0,\n" +
            "                \"ad_pvurl\": \"\",\n" +
            "                \"ad_linkurl\": \"\",\n" +
            "                \"ad_makettime\": \"\",\n" +
            "                \"ad_closetime\": \"\",\n" +
            "                \"ad_share_cnt\": \"\",\n" +
            "                \"ad_pvurl_vendor\": \"\",\n" +
            "                \"content_id\": \"1581\",\n" +
            "                \"content_type\": \"0\",\n" +
            "                \"content_bgcolor\": \"#FFFFFF\",\n" +
            "                \"share_url\": \"http://m.wufazhuce.com/one/1581\",\n" +
            "                \"share_info\": {\n" +
            "                    \"url\": \"http://m.wufazhuce.com/one/1581\",\n" +
            "                    \"image\": \"http://image.wufazhuce.com/FgV1sJRhHYefN8FNRkJJIXpKbI97\",\n" +
            "                    \"title\": \"VOL.1555\",\n" +
            "                    \"content\": \"许多人相信，没有注定的人生，所有的事基本上是一连串的巧合。然而，即使抱持如是信念的人也会有这样的结论：在生命中的某一段时期，当他们回头审视，发现多年来被视为巧合的事，其实是不可避免的。\"\n" +
            "                },\n" +
            "                \"orientation\": \"0\"\n" +
            "            }";
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
    }
}
