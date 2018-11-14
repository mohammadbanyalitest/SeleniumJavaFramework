package listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.TestNGListener.class)

public class TestNGListenerDemo {


    @Test
    public  void test1()
    {
        System.out.println("i'm inside test1 ");
    }

    @Test
    public  void test2()
    {
        System.out.println("i'm inside test2 ");
        Assert.assertTrue(false);
    }


    @Test
    public  void test3()
    {
        System.out.println("i'm inside test3 ");
    }





}
