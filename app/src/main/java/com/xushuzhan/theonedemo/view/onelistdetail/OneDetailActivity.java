package com.xushuzhan.theonedemo.view.onelistdetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import com.xushuzhan.theonedemo.R;
import com.xushuzhan.theonedemo.utils.ActivityUtils;
import com.xushuzhan.theonedemo.view.onelist.OneCommomFragment;

public class OneDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_detail);
        Intent intent = getIntent();
        int category = intent.getIntExtra(OneCommomFragment.ITEM_CATEGORY, 1);
        int itemId = intent.getIntExtra(OneCommomFragment.ITEM_ID,-1);

        if (category == 1) {
            Toast.makeText(this, ">>>", Toast.LENGTH_SHORT).show();
            OneListNormaFragment oneListNormaFragment = new OneListNormaFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(OneCommomFragment.ITEM_ID,2938);
            oneListNormaFragment.setArguments(bundle);
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), oneListNormaFragment, R.id.frame_one_detail_activity);
        }else {
            Toast.makeText(this, "暂时不支持该数据类型", Toast.LENGTH_SHORT).show();
        }
    }
}
