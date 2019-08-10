package com.dtxy.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "c1")
public class GroupOnClass1 {

    public void test1(){
        System.out.println("类1中的方法1");
    }

    public void test2(){
        System.out.println("类1中的方法2");
    }

}
