package com.simple.android.system.permission;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;
import com.simple.android.utils.phone.PhoneUtils;

/**
 * @fileName: Android权限
 * @author: zhangzeyan
 * @date: 2017/7/9
 * @time: 下午5:14
 * @description:
 **/
public class MyPerMissionActivity extends BaseActivity {

    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_permission);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == MY_PERMISSIONS_REQUEST_CALL_PHONE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                PhoneUtils.callPhone(this,"10086");
            } else {
                Toast.makeText(this, "权限被禁止", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void clickMyTelnum(View view) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) { //没有权限

//            //没有权限,判断是否会弹权限申请对话框
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
                Toast.makeText(this, "上次已经拒绝", Toast.LENGTH_SHORT).show();

            }else{
                ActivityCompat.requestPermissions(this,  new String[]{Manifest.permission.CALL_PHONE},  MY_PERMISSIONS_REQUEST_CALL_PHONE);
            }

        } else {

            PhoneUtils.callPhone(this,"10086");

        }
    }

    public void clickMyTelnum2(View view) {
        startActivity(new Intent(this,MyPerMission2Activity.class));
    }

}
