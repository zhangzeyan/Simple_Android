package com.simple.android.modle.annotation;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.simple.android.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/7/6
 * @time: 下午11:45
 * @description:
 **/
@EActivity(R.layout.activity_android_annotation)
public class MyAndroidAnnotationsActivity extends AppCompatActivity {

    @ViewById
    Toolbar activityMainToolbar;
    @ViewById
    TextView myIntruduction;
    @ViewById
    TextView myFeatures;


    @AfterViews
    void init() {
        myIntruduction.setText(myIntruduction.getText());
        setSupportActionBar(activityMainToolbar);
        activityMainToolbar.setTitle(getPackageManager().getApplicationLabel(getApplicationInfo()));
        activityMainToolbar.setTitleTextColor(getResources().getColor(R.color.blue));
    }

    @Click(R.id.my_click)
    void button() {
        String strTemp = myFeatures.getText().toString();
        myFeatures.setText(myIntruduction.getText());
        myIntruduction.setText(strTemp);
    }
}
