package com.xushuzhan.theonedemo.viewmodel.onelistdetail;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.util.Log;
import android.webkit.WebView;

import com.xushuzhan.theonedemo.common.Config;
import com.xushuzhan.theonedemo.model.onelistdetail.ContentCallBack;
import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailModel;
import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailMutiData;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class PicBarFragmentViewModel implements ContentCallBack{
    private static final String TAG = "PicBarFragmentViewModel";
    public final ObservableField<String> content = new ObservableField<>();
    OneListDetailModel oneListDetailModel = new OneListDetailModel(new OneListDetailMutiData());

    public PicBarFragmentViewModel(String itemId,String category) {
        if (category.equals(Config.ONE_DETAIL_CATEGORY__MUSIC)) {
            oneListDetailModel.getMusicContent(itemId, this);
        }else if (category.equals(Config.ONE_DETAIL_CATEGORY_MOVIE)){
            oneListDetailModel.getMoviewContent(itemId,this);
        };
    }

    @Override
    public void onLoadContent(String content) {
        this.content.set(content);
        Log.d(TAG, "onLoadContent: "+content);

    }

    @BindingAdapter("web_content")
    public static void loadWebView(WebView webView, String content) {
        webView.loadData(content, "text/html;charset=UTF-8", null);
    }
}
