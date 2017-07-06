package com.simple.android.view;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyViewActivity extends BaseActivity {

    @BindView(R.id.my_WebView)
    TextView myWebView;
    @BindView(R.id.my_TextView)
    TextView myTextView;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_view);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.activity_main_toolbar, R.id.my_WebView, R.id.my_TextView})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.my_WebView:
                startActivity(new Intent(this,MyWebViewActivity.class));
                break;
            case R.id.my_TextView:
                break;
        }
    }
}
