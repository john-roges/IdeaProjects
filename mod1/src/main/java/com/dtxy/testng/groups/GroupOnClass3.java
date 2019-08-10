package com.dtxy.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "c2")
public class GroupOnClass3 {

    public void test1(){
        System.out.println("类3中的方法1");
    }

    public void test2(){
        System.out.println("类3中的方法2");
    }

}
