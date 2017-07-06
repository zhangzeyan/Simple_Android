package com.simple.android.network;

import android.content.Intent;
import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;
import com.simple.android.network.asynchttp.MyAsyncTaskActivity;
import com.simple.android.network.retrofit.MyRetrofitActivity;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/5/26
 * @time: 上午11:00
 * @description:
 **/
public class MyNetWorkActivity extends BaseActivity {

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_network);
    }

    public void clickMyAsyncTask(View view) {
        startActivity(new Intent(this,MyAsyncTaskActivity.class));
    }

    public void clickMyRetrofit(View view) {
        startActivity(new Intent(this,MyRetrofitActivity.class));
    }

    public void clickMyOkhttp(View view) {
        startActivity(new Intent(this,MyRetrofitActivity.class));
    }

    public void clickMyVolley(View view) {
        startActivity(new Intent(this,MyRetrofitActivity.class));
    }
}
