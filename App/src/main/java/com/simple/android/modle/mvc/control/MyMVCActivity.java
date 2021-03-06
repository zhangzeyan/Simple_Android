package com.simple.android.modle.mvc.control;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;
import com.simple.android.modle.mvc.model.UserBean;

import java.util.ArrayList;
import java.util.List;


/**
 * @fileName: MVC框架示例
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午3:04
 * @description:
 **/
public class MyMVCActivity extends BaseActivity{

    private List<UserBean> userBeanList;
    private ListView listView;
    private UserDataAdapter adapter;
    private ProgressBar mLoading;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_mvc);


        listView = ((ListView) findViewById(R.id.mListView));
        mLoading = (ProgressBar) findViewById(R.id.mLoading);

        userBeanList = new ArrayList<>();

        adapter = new UserDataAdapter(this, userBeanList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(), "姓名：" + userBeanList.get(position).getName() + ", 年龄：" + userBeanList.get(position).getAge(), Toast.LENGTH_SHORT).show();
            }
        });

        mLoading.setVisibility(View.VISIBLE);
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000); //模仿网络请求

                    List<UserBean> datas = new ArrayList<>();
                    for (int i = 1; i < 20; i++) {
                        UserBean user = new UserBean();
                        user.setName(i + "" + i + "" + i);
                        user.setImg("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
                        user.setAge(i + 20);
                        user.setSex(i % 2);
                        user.setStudent(i % 3 != 0);
                        datas.add(user);
                    }

                    userBeanList.clear();
                    userBeanList.addAll(datas);
                    mHandler.sendEmptyMessage(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            adapter.notifyDataSetChanged();
            mLoading.setVisibility(View.GONE);
        }
    };
}
