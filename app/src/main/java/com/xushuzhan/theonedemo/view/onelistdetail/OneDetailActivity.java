package com.xushuzhan.theonedemo.view.onelistdetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        String category = intent.getStringExtra(OneCommomFragment.ITEM_CATEGORY);
        String itemId = intent.getStringExtra(OneCommomFragment.ITEM_ID);

        if (category.equals("1")) {
            OneDetailNormaFragment oneDetailNormaFragment = new OneDetailNormaFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OneCommomFragment.ITEM_ID,itemId);
            oneDetailNormaFragment.setArguments(bundle);
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), oneDetailNormaFragment, R.id.frame_one_detail_activity);
        }else {
            Toast.makeText(this, "暂时不支持该数据类型", Toast.LENGTH_SHORT).show();
        }
    }
}
