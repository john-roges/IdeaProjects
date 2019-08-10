package com.dtxy.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "g1")
    public void test1(){
        System.out.println("分组中的第一个方法");
    }

    @Test(groups = "g1")
    public void test2(){
        System.out.println("分组中的第二个方法");
    }

    @Test
    public void test3(){
        System.out.println("不在分组中的方法");
    }

    @BeforeGroups("g1")
    public void test4(){
        System.out.println("分组之前的方法");
    }

    @AfterGroups("g1")
    public void test5(){
        System.out.println("分组之后的方法");
    }

}
