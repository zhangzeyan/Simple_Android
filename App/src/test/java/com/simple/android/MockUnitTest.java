package com.simple.android;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/7/10
 * @time: 下午11:53
 * @description:
 **/
public class MockUnitTest {

    @Test
    public void testLogin() throws Exception {

        UserManager userManager = Mockito.mock(UserManager.class);

        PasswordValidator mockValidator = Mockito.mock(PasswordValidator.class);
//        Mockito.when(mockValidator.verifyPassword("123456")).thenReturn(true);
        Mockito.when(mockValidator.verifyPassword("654321")).thenReturn(false);

        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setUserManager(userManager);
        loginPresenter.login("simple","654321");



        Mockito.verify(userManager, Mockito.times(1)).performLogin("simple","654321");


    }
}
