package com.dtxy.testng.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginOK(){
        System.out.println("登录成功");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("在类前");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("在类后");
    }

}
