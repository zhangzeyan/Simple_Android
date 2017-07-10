package com.simple.android;


/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/7/11
 * @time: 上午12:00
 * @description:
 **/
public class LoginPresenter {

    private UserManager mUserManager = new UserManager();
    private  PasswordValidator mPasswordValidator = new PasswordValidator();

    public void login(String username, String password) {

        if (username == null || username.length() == 0) return;

        if (!mPasswordValidator.verifyPassword(password)) return;

        mUserManager.performLogin(username, password);
    }

    public void setUserManager(UserManager userManager) {
        this.mUserManager = userManager;
    }

}
