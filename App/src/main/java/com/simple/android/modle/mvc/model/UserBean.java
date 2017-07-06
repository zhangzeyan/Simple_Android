package com.simple.android.modle.mvc.model;


/**
 * @fileName: UserBean
 * @author: zhangzeyan
 * @date: 2017/6/12
 * @time: 下午3:04
 * @description:
 **/
public class UserBean {

    private String name;
    private String img;
    private int age;
    private int sex;
    private boolean isStudent;


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
