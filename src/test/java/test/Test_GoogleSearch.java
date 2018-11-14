package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_GoogleSearch {

    public static void main(String[] args) {

        googleSerach();


    }
       public static void googleSerach()
       {

           System.setProperty("webdriver.chrome.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\chromedriver\\chromedriver.exe");

           ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=en-GB");
           WebDriver driver= new ChromeDriver(options);

           driver.get("https://google.com");

           ((ChromeDriver) driver).findElementByName("q").sendKeys("automation step by step");
           //((ChromeDriver) driver).findElementByName("btnk").click();
          //  ((ChromeDriver) driver).findElementByName("btnk").sendKeys(Keys.RETURN);

            ((ChromeDriver) driver).findElementByXPath("//input[@value='Google Search']").click();

            driver.close();
           System.out.println("tesssst");

       }




    }

