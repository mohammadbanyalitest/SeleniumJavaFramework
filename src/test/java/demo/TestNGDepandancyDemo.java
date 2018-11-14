package demo;

import org.testng.annotations.Test;

public class TestNGDepandancyDemo {


    @Test (dependsOnMethods ="test2" )
    public void test1()
    {
        System.out.println("i'm inside test 1");
    }


    @Test//(dependsOnMethods = )
    public void test2()
    {
        System.out.println("i'm inside test 2");
    }



}
