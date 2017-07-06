package com.simple.android.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.simple.android.R;


/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/5/26
 * @time: 上午11:00
 * @description:
 **/
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        Toolbar toolbar = (Toolbar)findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getPackageManager().getApplicationLabel(getApplicationInfo()));
        toolbar.setTitleTextColor(getResources().getColor(R.color.blue));
    }

    protected abstract void setContentView();
}
