package com.simple.android.home;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.simple.android.R;
import com.simple.android.basic.AndroidBasicActivity;
import com.simple.android.database.MyDataBaseActivity;
import com.simple.android.image.MyImageActivity;
import com.simple.android.kotlin.MyKotlinActivity;
import com.simple.android.modle.MyModeFrameActivity;
import com.simple.android.modle.annotation.MyAnnotationActivity;
import com.simple.android.network.MyNetWorkActivity;
import com.simple.android.system.permission.MyPerMissionActivity;
import com.simple.android.view.MyViewActivity;


/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/5/26
 * @time: 上午11:00
 * @description:
 **/
public class MainActivity extends BaseActivity {


    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_main);
    }

    public void clickMyComponent(View view) {

        if(getString(R.string.showToast).equals("true")){
            Toast.makeText(this,"跳转到组件",Toast.LENGTH_SHORT).show();
        }

//        if (ContextCompat.checkSelfPermission(this,
//                Manifest.permission.READ_CONTACTS)
//                != PackageManager.PERMISSION_GRANTED) {
//        }else{
//            //
//        }

        startActivity(new Intent(this,AndroidBasicActivity.class));
    }

    public void clickMyView(View view) {
        startActivity(new Intent(this,MyViewActivity.class));
    }

    public void clickMyNetWork(View view) {
        startActivity(new Intent(this,MyNetWorkActivity.class));
    }

    public void clickMyDataBase(View view) {
        startActivity(new Intent(this,MyDataBaseActivity.class));

    }

    public void clickMyImage(View view) {
        startActivity(new Intent(this, MyImageActivity.class));
    }

    public void clickMyKotlin(View view) {
        startActivity(new Intent(this,MyKotlinActivity.class));

    }

    public void clickMyModeFrame(View view) {
        startActivity(new Intent(this,MyModeFrameActivity.class));
    }

    public void clickMyDesignPatterns(View view) {
        startActivity(new Intent(this,MyModeFrameActivity.class));

    }

    public void clickMyAnnotation(View view) {
        startActivity(new Intent(this, MyAnnotationActivity.class));

    }

    public void clickMyPermisstion(View view) {
        startActivity(new Intent(this, MyPerMissionActivity.class));
    }
}