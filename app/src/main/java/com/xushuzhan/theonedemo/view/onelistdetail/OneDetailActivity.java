package com.xushuzhan.theonedemo.view.onelistdetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.common.BaseActivity;
import com.xushuzhan.theonedemo.utils.ActivityUtils;
import com.xushuzhan.theonedemo.view.onelist.OneCommonFragment;

public class OneDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_detail);
        Intent intent = getIntent();

        String category = intent.getStringExtra(OneCommonFragment.ITEM_CATEGORY);
        String itemId = intent.getStringExtra(OneCommonFragment.ITEM_ID);

        if (!(category.equals("4")||category.equals("5")) ) {
            OneDetailNormaFragment oneDetailNormaFragment = new OneDetailNormaFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OneCommonFragment.ITEM_ID,itemId);
            bundle.putString(OneCommonFragment.ITEM_CATEGORY,category);
            oneDetailNormaFragment.setArguments(bundle);
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), oneDetailNormaFragment, R.id.frame_one_detail_activity);
        } else {
            Toast.makeText(this, "暂时不支持该数据类型", Toast.LENGTH_SHORT).show();
        }
    }
}
