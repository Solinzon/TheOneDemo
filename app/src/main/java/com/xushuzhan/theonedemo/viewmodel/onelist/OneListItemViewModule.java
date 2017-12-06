package com.xushuzhan.theonedemo.viewmodel.onelist;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xushuzhan.theonedemo.common.Config;
import com.xushuzhan.theonedemo.model.data.bean.OneListBean;

/**
 * Created by xushuzhan on 2017/11/29.
 */

public class OneListItemViewModule {
    private static final String TAG = "OneListItemViewModule";
    public final ObservableField<String> title = new ObservableField<>();
    public final ObservableField<String> picInfo = new ObservableField<>();
    public final ObservableField<String> content = new ObservableField<>();
    public final ObservableField<String> wordsInfo = new ObservableField<>();
    public final ObservableField<String> imageUrl = new ObservableField<>();
    //normal item's property
    public final ObservableField<String> categry = new ObservableField<>();
    public final ObservableField<String> author = new ObservableField<>();

    public OneListBean.ContentListBean contentListBean;

    public OneListItemViewModule(OneListBean.ContentListBean contentListBean) {
        this.contentListBean = contentListBean;
        update(contentListBean);
    }

    public void update(OneListBean.ContentListBean contentListBean) {
        //毕竟不是自己的接口，对接口显示的数据的接口不一定不会改变，所以加上try-catch保险一点
        try {
            if (contentListBean.getCategory().equals(Config.ONE_DETAIL_CATEGORY_ADVERTISEMENT)) {
                imageUrl.set(contentListBean.getImg_url());
            } else {
                title.set(contentListBean.getTitle());
                picInfo.set(contentListBean.getPic_info());
                content.set(contentListBean.getForward());
                wordsInfo.set(contentListBean.getWords_info());
                imageUrl.set(contentListBean.getImg_url());
                author.set(contentListBean.getAuthor().getUser_name());
                categry.set(contentListBean.getShare_list().getWx().getTitle().split("\\|")[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @BindingAdapter({"image_url"})
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }
}
