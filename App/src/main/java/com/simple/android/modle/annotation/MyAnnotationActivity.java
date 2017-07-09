package com.simple.android.modle.annotation;

import android.content.Intent;
import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/6/15
 * @time: 下午5:46
 * @description:
 **/
public class MyAnnotationActivity extends BaseActivity {
    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_annotation);
    }

    public void clickMyButterKnife(View view) {
        startActivity(new Intent(this,MyButterknifeActivity.class));

    }

    public void clickMyAnnotations(View view) {
        startActivity(new Intent(this,MyAndroidAnnotationsActivity_.class));
    }
}
