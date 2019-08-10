package com.dtxy.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test(enabled = true)
    public void ignore1(){
        System.out.println("11111111  run");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("22222222  run");
    }

    @Test
    public void ignore3(){
        System.out.println("33333333  run");
    }
}
