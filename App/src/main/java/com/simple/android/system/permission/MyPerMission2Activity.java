package com.simple.android.system.permission;

import android.content.Intent;
import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

/**
 * @fileName: Android权限（封装）
 * @author: zhangzeyan
 * @date: 2017/7/9
 * @time: 下午5:14
 * @description:
 **/
public class MyPerMission2Activity extends BaseActivity {


    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_permission2);
    }


    public void clickMyPermisstionGen(View view) {
        startActivity(new Intent(this,PerMissionGenActivity.class));

    }

    public void clickMyPermisstionDispatcher(View view) {
        startActivity(new Intent(this,PerMissionDispatcherActivity.class));

    }
}
