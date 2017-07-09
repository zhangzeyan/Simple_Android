package com.simple.android.utils.phone;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * @fileName: 电话管理工具
 * @author: zhangzeyan
 * @date: 2017/7/9
 * @time: 下午11:02
 * @description:
 **/
public class PhoneUtils {

    public static void callPhone(Context context, String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        context.startActivity(intent);
    }
}
