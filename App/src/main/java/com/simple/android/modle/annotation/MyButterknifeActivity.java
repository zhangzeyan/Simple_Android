package com.simple.android.modle.annotation;

import android.widget.Button;
import android.widget.TextView;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @fileName: AndroidAnnotations使用实例
 * @author: zhangzeyan
 * @date: 2017/7/6
 * @time: 下午11:44
 * @description:
 **/
public class MyButterknifeActivity extends BaseActivity {

    @BindView(R.id.my_intruduction)
    TextView myIntruduction;
    @BindView(R.id.my_features)
    TextView myFeatures;
    @BindView(R.id.my_click)
    Button myClick;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_butterknife);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.my_click)
    public void onViewClicked() {
        String strTemp = myFeatures.getText().toString();
        myFeatures.setText(myIntruduction.getText());
        myIntruduction.setText(strTemp);
    }
}
