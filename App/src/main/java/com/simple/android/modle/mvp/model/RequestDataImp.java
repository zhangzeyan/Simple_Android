package com.simple.android.modle.mvp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: 请求数据业务实现类
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午3:04
 * @description:
 **/
public class RequestDataImp implements RequestData {

    @Override
    public void requestForData(final OnRequestListener listener) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000); //设置延迟，模仿网络请求

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

                    if(null != listener){
                        listener.onSuccess(datas);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    listener.onFailed();
                }
            }
        }).start();

    }
}
