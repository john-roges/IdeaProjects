package com.dtxy.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void depend1() {
        System.out.println("11111111  run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"depend1"})
    public void depend2() {
        System.out.println("22222222  run");
    }

}
