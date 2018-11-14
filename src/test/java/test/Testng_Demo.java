package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Demo {



   static  WebDriver driver=null;

   @BeforeTest
    public void setUpTest()
    {

        System.setProperty("webdriver.chrome.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\chromedriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en-GB");
         driver= new ChromeDriver(options);

    }


    @Test
       public static void googleSerach()
       {
           driver.get("https://google.com");
           ((ChromeDriver) driver).findElementByName("q").sendKeys("automation step by step");
           //((ChromeDriver) driver).findElementByName("btnk").click();
           // ((ChromeDriver) driver).findElementByName("btnk").sendKeys(Keys.RETURN);
           ((ChromeDriver) driver).findElementByXPath("//input[@value='Google Search']").click();
       }



    @AfterTest
    public void tearDownTest()
       {
           driver.close();
           driver.quit();
           System.out.println("tesssst");
       }




    }

