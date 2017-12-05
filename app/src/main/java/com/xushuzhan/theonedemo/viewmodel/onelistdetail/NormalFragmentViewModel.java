package com.xushuzhan.theonedemo.viewmodel.onelistdetail;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.util.Log;
import android.webkit.WebView;

import com.xushuzhan.theonedemo.model.onelistdetail.ContentCallBack;
import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailModel;
import com.xushuzhan.theonedemo.model.onelistdetail.OneListDetailMutiData;

/**
 * Created by xushuzhan on 2017/12/4.
 */

public class NormalFragmentViewModel implements ContentCallBack {
    private static final String TAG = "NormalFragmentViewModel";
    public final ObservableField<String> content = new ObservableField<>();
    OneListDetailModel oneListDetailModel = new OneListDetailModel(new OneListDetailMutiData());

    public NormalFragmentViewModel(String itemId,String category) {
        if (category.equals("1")) {
            oneListDetailModel.getReadContent(itemId, this);
        }else {
            oneListDetailModel.getSerializedContent(itemId, this);
        }
    }

    @Override
    public void onLoadContent(String content) {
        this.content.set(content);

    }

    @BindingAdapter("web_content")
    public static void loadWebView(WebView webView, String content) {
        webView.loadData(content, "text/html;charset=UTF-8", null);

    }
}
