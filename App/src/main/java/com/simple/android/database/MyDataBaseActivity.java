package com.simple.android.database;

import android.content.Intent;
import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;


/**
 * @fileName: 数据库
 * @author: zhangzeyan
 * @date: 2017/5/26
 * @time: 上午11:00
 * @description:
 **/
public class MyDataBaseActivity extends BaseActivity {

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_database);
    }

    public void clickMySqlite(View view) {
        startActivity(new Intent(this,MySqliteActivity.class));
    }

    public void clickMyLitePal(View view) {
    }

    public void clickMyGreenDao(View view) {
    }

    public void clickMyOrmLite(View view) {
    }
}
