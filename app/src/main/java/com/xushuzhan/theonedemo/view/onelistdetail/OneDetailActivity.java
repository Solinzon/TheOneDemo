package com.xushuzhan.theonedemo.view.onelistdetail;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DebugUtils;
import android.util.Log;
import android.widget.Toast;

import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.common.BaseActivity;
import com.xushuzhan.theonedemo.common.Config;
import com.xushuzhan.theonedemo.databinding.ActivityOneDetailBinding;
import com.xushuzhan.theonedemo.utils.ActivityUtils;
import com.xushuzhan.theonedemo.view.onelist.OneCommonFragment;
import com.xushuzhan.theonedemo.viewmodel.onelistdetail.OneDetailViewModel;

public class OneDetailActivity extends BaseActivity {
    private static final String TAG = "OneDetailActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityOneDetailBinding activityOneDetailBinding = DataBindingUtil.setContentView(this,R.layout.activity_one_detail);
        setSupportActionBar(activityOneDetailBinding.toolbarActivityOne);
        activityOneDetailBinding.ivBackOneDetailActivity.setOnClickListener(v -> finish());

        //获取CommonFragment传递过来的信息
        Intent intent = getIntent();
        String category = intent.getStringExtra(OneCommonFragment.ITEM_CATEGORY);
        String itemId = intent.getStringExtra(OneCommonFragment.ITEM_ID);
        String title = intent.getStringExtra(OneCommonFragment.ITEM_Title);

        //绑定并更新标题
        OneDetailViewModel oneDetailViewModel = new OneDetailViewModel();
        activityOneDetailBinding.setViewModel(oneDetailViewModel);
        oneDetailViewModel.update(title);

        //将信息传递给Fragment
        Bundle bundle = new Bundle();
        bundle.putString(OneCommonFragment.ITEM_ID, itemId);
        bundle.putString(OneCommonFragment.ITEM_CATEGORY, category);

        if (category.equals(Config.ONE_DETAIL_CATEGORY_MOVIE) || category.equals(Config.ONE_DETAIL_CATEGORY__MUSIC)) {
            OneDetailTopBarFragment oneDetailTopBarFragment = new OneDetailTopBarFragment();
            oneDetailTopBarFragment.setArguments(bundle);
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), oneDetailTopBarFragment, R.id.frame_one_detail_activity);
        } else if (category.equals(Config.ONE_DETAIL_CATEGORY_ESSAY) ||
                category.equals(Config.ONE_DETAIL_CATEGORY_SERIALIZE) ||
                category.equals(Config.ONE_DETAIL_CATEGORY_ASK_ANSWER) ||
                category.equals(Config.ONE_DETAIL_CATEGORY_ADVERTISEMENT) ){
            OneDetailNormaFragment oneDetailNormaFragment = new OneDetailNormaFragment();
            oneDetailNormaFragment.setArguments(bundle);
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), oneDetailNormaFragment, R.id.frame_one_detail_activity);
        }else{
            Toast.makeText(this, "暂不支持该类型", Toast.LENGTH_SHORT).show();
        }
    }
}
