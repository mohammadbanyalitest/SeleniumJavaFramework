package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestNGMultiBrowserDemo {


    WebDriver driver=null;

    @Parameters("browserName")
    @BeforeTest
    public void setUp(String browserName)
    {

        System.out.println("broesername:"+browserName);


        if (browserName.equalsIgnoreCase("chrome"))

        {
            System.setProperty("webdriver.chrome.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\chromedriver\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=en-GB");
            driver= new ChromeDriver(options);
        }

        else if (browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\geckodriver\\geckodriver.exe");//firefox

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--lang=en-GB");

            driver =new FirefoxDriver();

        }

        else if (browserName.equalsIgnoreCase("internet explorer"))
        {
            System.setProperty("webdriver.ie.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\iedriver\\IEDriverServer.exe");//ie
            InternetExplorerOptions options=new InternetExplorerOptions();
            //options.addArguments("--lang=en-GB");
            // options.add


            driver =new InternetExplorerDriver();



        }


    }

    @Test
    public void test()
    {

        driver.get("https://google.com");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
    }
}

