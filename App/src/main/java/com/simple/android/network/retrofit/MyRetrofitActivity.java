package com.simple.android.network.retrofit;

import android.content.Intent;
import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

/**
 * @fileName: Retrofit的使用
 * @author: zhangzeyan
 * @date: 2017/6/15
 * @time: 下午5:23
 * @description:
 **/
public class MyRetrofitActivity extends BaseActivity {

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_retrofit);
    }

    public void clickMyOnlyRetrofit(View view) {
        startActivity(new Intent(this,MyOnlyRetrofitActivity.class));

    }

    public void clickMyRetrofitRxjava(View view) {
        startActivity(new Intent(this,MyRetrofitRxjavaActivity.class));

    }
}
