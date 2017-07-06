package com.simple.android.modle.mvvm;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


/**
 * Created by zhangzeyan on 16/10/18.
 */

public class UserBean extends BaseObservable {

    private String name;
    private String img;
    private int age;
    private int sex;
    private boolean isStudent;

    @BindingAdapter("bind:img")
    public static void loadInternetImage(ImageView iv, String img) {
        Glide.with(iv.getContext()).load(img).into(iv);
    }

    public void onItemClick(View view) {
        Toast.makeText(view.getContext(),"姓名："+name+", 年龄："+age, Toast.LENGTH_SHORT).show();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
