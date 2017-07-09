package com.simple.android.system.permission;

import android.Manifest;
import android.view.View;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

import kr.co.namee.permissiongen.PermissionFail;
import kr.co.namee.permissiongen.PermissionGen;
import kr.co.namee.permissiongen.PermissionSuccess;

/**
 * @fileName: Android权限（PerMissionGen库）
 * @author: zhangzeyan
 * @date: 2017/7/9
 * @time: 下午5:14
 * @description:
 **/
public class PerMissionGenActivity extends BaseActivity {

    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_permission_gen);
    }



    @PermissionSuccess(requestCode = 100)
    public void test(){

    }

    @PermissionFail(requestCode = 100)
    private void test2() {

    }

    @PermissionSuccess(requestCode = 200)
    public void test3(){
    }

    @PermissionFail(requestCode = 200)
    public void test4(){
    }

    @Override public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                     int[] grantResults) {
        PermissionGen.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
    }


    public void clickMyPermissions(View view) {


        PermissionGen.with(this)
                .addRequestCode(100)
                .permissions(
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.RECEIVE_SMS,
                        Manifest.permission.WRITE_CONTACTS)
                .request();


    }

    public void clickMyNeedPermission(View view) {

        PermissionGen.needPermission(this, 200, Manifest.permission.CAMERA);

    }
}
