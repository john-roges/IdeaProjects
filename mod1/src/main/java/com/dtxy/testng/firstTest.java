package com.dtxy.testng;

import org.testng.annotations.*;

public class firstTest {

    @Test
    public void testcase1(){
        System.out.println("方法1");
    }

    @Test
    public void testcase2(){
        System.out.println("方法2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("在方法之前");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("在方法之后");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("在类之前");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("在类之后");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("在最前");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("在最后");
    }
}
