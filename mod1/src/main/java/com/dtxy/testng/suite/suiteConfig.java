package com.dtxy.testng.suite;

import org.testng.annotations.*;

public class suiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("在最前");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("在最后");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("在测试前");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("在测试后");
    }

}
