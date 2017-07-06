package com.simple.android.image;

import android.content.Intent;
import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;
import com.simple.android.image.glide.MyGlideActivity;
import com.simple.android.image.picasso.MyPicassoActivity;

/**
 * @fileName: 图片处理
 * @author: zhangzeyan
 * @date: 2017/5/26
 * @time: 上午11:33
 * @description:
 **/
public class MyImageActivity extends BaseActivity {
    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_image);
    }

    public void clickMyGlide(View view) {
        startActivity(new Intent(this, MyGlideActivity.class));
    }

    public void clickMyPicasso(View view) {
        startActivity(new Intent(this, MyPicassoActivity.class));
    }
}
