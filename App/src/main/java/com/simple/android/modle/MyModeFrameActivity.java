package com.simple.android.modle;

import android.content.Intent;
import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;
import com.simple.android.modle.mvc.control.MyMVCActivity;
import com.simple.android.modle.mvp.view.MyMVPActivity;
import com.simple.android.modle.mvvm.MyMVVMActivity;

/**
 * @fileName: 模式与框架
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 上午11:46
 * @description:
 **/
public class MyModeFrameActivity extends BaseActivity{
    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_mode_frame);
    }

    public void clickMyMVC(View view) {
        startActivity(new Intent(this,MyMVCActivity.class));
    }

    public void clickMyMVP(View view) {
        startActivity(new Intent(this,MyMVPActivity.class));
    }

    public void clickMyMVVM(View view) {
        startActivity(new Intent(this,MyMVVMActivity.class));
    }

    public void clickMyFrame(View view) {
        startActivity(new Intent(this,MyFrameActivity.class));
    }
}
