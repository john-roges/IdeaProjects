package com.dtxy.testng;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void ecpTest1(){
        System.out.println("heme");
        throw new RuntimeException();
    }
}
