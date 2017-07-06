package com.simple.android.modle.mvp.model;

import java.util.List;

/**
 * @fileName: 请求数据业务接口
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午3:04
 * @description:
 **/

public interface RequestData {

    void requestForData(OnRequestListener listener);

    interface OnRequestListener {

        void onSuccess(List<UserBean> data);
        void onFailed();
    }
}
