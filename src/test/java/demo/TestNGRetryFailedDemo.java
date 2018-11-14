package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {


    @Test
    public void test()
    {
        System.out.println("i'm inside test 1");
    }

    @Test
    public void test2()
    {
        System.out.println("i'm inside test 2");
        int i=1/0;
    }

    @Test
    public void test3()
    {
        System.out.println("i'm inside test 3");
        Assert.assertTrue(false);

    }
}
