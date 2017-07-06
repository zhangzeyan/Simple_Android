package com.simple.android.modle.mvp.presenter;

import com.simple.android.modle.mvp.model.UserBean;

import java.util.List;

/**
 * @fileName: View层需要实现的接口
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午3:04
 * @description:
 **/
public interface MVPViewInter {


    /**
     *  显示loading progress
     */
    void showLoading();

    /**
     * 隐藏loading progress
     */
    void hideLoading();

    /**
     * ListView的初始化
     * @param data
     */
    void setListItem(List<UserBean> data);


    /**
     * Toast 消息
     * @param message
     */
    void showMessage(String message);
}
