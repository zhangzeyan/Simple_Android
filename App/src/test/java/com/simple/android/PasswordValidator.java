package com.simple.android;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/7/11
 * @time: 上午12:58
 * @description:
 **/
public class PasswordValidator {
    public boolean verifyPassword(String password) {
        if (password == null || password.length() < 6)
            return false;
        else
            return true;
    }
}
