package listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)

public class TestNGListenerDemo2 {


    @Test
    public  void test4()
    {
        System.out.println("i'm inside test4 ");
    }

    @Test
    public  void test5()
    {
        System.out.println("i'm inside test5 ");
        Assert.assertTrue(false);
    }


    @Test
    public  void test6()
    {
        System.out.println("i'm inside test6 ");
    }





}
