package com.simple.android.modle.mvp.presenter;

import android.os.Handler;
import android.os.Looper;

import com.simple.android.modle.mvp.model.RequestData;
import com.simple.android.modle.mvp.model.RequestDataImp;
import com.simple.android.modle.mvp.model.UserBean;

import java.util.List;

/**
 * @fileName: Prensenter层
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午3:04
 * @description:
 **/
public class MVPPresenter {

    private MVPViewInter mvpView;
    private RequestData requestData;
    private Handler mHandler;

    public MVPPresenter(MVPViewInter mvpView) {
        this.mvpView = mvpView;
        requestData = new RequestDataImp();
        mHandler = new Handler(Looper.getMainLooper());
    }

    public void requestForData(){
        mvpView.showLoading();
        requestData.requestForData(new RequestData.OnRequestListener() {
            @Override
            public void onSuccess(final List<UserBean> data) {
                mHandler.post(new Runnable() { //需要使用handler去更新界面
                    @Override
                    public void run() {
                        mvpView.hideLoading();
                        mvpView.setListItem(data);
                    }
                });

            }

            @Override
            public void onFailed() {
                mvpView.showMessage("请求失败");
            }
        });
    }

    public void onItemClick(String message){
        mvpView.showMessage(message);
    }

    public void onDestroy(){
        mvpView = null;
    }
}
