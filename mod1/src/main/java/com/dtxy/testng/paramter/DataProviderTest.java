package com.dtxy.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "tt")
    public void test1(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }

    @DataProvider(name = "tt")
    public Object[][] datas(){
        Object[][] o = new Object[][]{
                {"admin",25},
                {"zhangsan",18}
        };
        return o;
    }

    @Test(dataProvider = "yy")
    public void newtest1(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }

    @Test(dataProvider = "yy")
    public void newtest2(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }

    @DataProvider(name = "yy")
    public Object[][] newdatas(Method method){
        Object[][] pl = null;
        if(method.getName().equals("newtest1")){
            pl = new Object[][]{
                    {"admin",25},
                    {"zhangsan",18}
            };
        }else if(method.getName().equals("newtest2")){
            pl = new Object[][]{
                    {"ben",0},
                    {"mark",98}
            };

        };
        return pl;
    }

}
