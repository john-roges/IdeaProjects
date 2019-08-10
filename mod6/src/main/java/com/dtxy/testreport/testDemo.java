package com.dtxy.testreport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testDemo {

    @Test
    public void test1(){
        Assert.assertEquals(2,3);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("ok","ok");
    }

    @Test
    public void tolog(){
        Reporter.log("测试写入log文件");
        throw new RuntimeException("测试抛出运行时异常");
    }

}
