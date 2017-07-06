package com.simple.android.modle.mvp.view;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;
import com.simple.android.modle.mvp.model.UserBean;
import com.simple.android.modle.mvp.presenter.MVPPresenter;
import com.simple.android.modle.mvp.presenter.MVPViewInter;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: MVP框架示例
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午2:39
 * @description:
 **/
public class MyMVPActivity extends BaseActivity implements MVPViewInter, AdapterView.OnItemClickListener {


    public ListView mvpListView;
    public MVPPresenter mvpPresenter;
    public ProgressBar pb;
    public UserDataAdapter adapter;
    private List<UserBean> userBeanList;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_mvp);

        //初始化控件
        mvpListView = (ListView)findViewById(R.id.mListView);
        mvpListView.setOnItemClickListener(this);
        pb = (ProgressBar) findViewById(R.id.mLoading);

        userBeanList = new ArrayList<>();
        adapter = new UserDataAdapter(this, userBeanList);
        mvpListView.setAdapter(adapter);

        //实例化Presenter
        mvpPresenter = new MVPPresenter(this);
        //调用Presenter层请求数据
        mvpPresenter.requestForData();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        mvpPresenter.onItemClick("姓名：" + userBeanList.get(position).getName() + ", 年龄：" + userBeanList.get(position).getAge());
    }

    @Override
    public void showLoading() {
        pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        pb.setVisibility(View.GONE);
    }

    @Override
    public void setListItem(List<UserBean> data) {
        userBeanList.clear();
        userBeanList.addAll(data);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
