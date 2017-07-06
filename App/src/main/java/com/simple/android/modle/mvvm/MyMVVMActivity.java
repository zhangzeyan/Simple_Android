package com.simple.android.modle.mvvm;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午4:22
 * @description:
 **/
public class MyMVVMActivity extends BaseActivity{

    private List<UserBean> userBeanList;
    private ListView listView;
    private MVVMAdapter<UserBean> adapter;
    private ProgressBar mLoading;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_mvvm);

        listView = ((ListView) findViewById(R.id.mListView));
        mLoading = (ProgressBar) findViewById(R.id.mLoading);

        userBeanList = new ArrayList<>();

//        adapter = new MVVMAdapter<>(this, R.layout.activity_mvvm_list_item, userBeanList, com.simple.android.BR.userBean);
        adapter = null;
        listView.setAdapter(adapter);

        mLoading.setVisibility(View.VISIBLE);
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000); //模仿网络请求

                    List<UserBean> datas = new ArrayList<>();
                    for(int i = 1 ; i< 20 ; i++){
                        UserBean user = new UserBean();
                        user.setName(i+""+i+""+i);
                        user.setImg("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
                        user.setAge(i+20);
                        user.setSex(i%2);
                        user.setStudent(i%3!=0);
                        datas.add(user);
                    }

                    userBeanList.clear();
                    userBeanList.addAll(datas);
                    mHandler.sendEmptyMessage(0);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            adapter.notifyDataSetChanged();
            mLoading.setVisibility(View.GONE);
        }
    };
}
