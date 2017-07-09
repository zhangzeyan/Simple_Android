package com.simple.android.basic;

import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

/**
 * @fileName: Android基础
 * @author: zhangzeyan
 * @date: 2017/5/26
 * @time: 上午11:00
 * @description:
 **/
public class AndroidBasicActivity extends BaseActivity {

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_component);
    }

    public void clickMyActivity(View view) {
    }
}
