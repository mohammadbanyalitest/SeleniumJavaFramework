package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {


     private  static WebDriver driver=null;

    public static void main(String[] args) {

        googleSearchTest();
    }

    public static void googleSearchTest()
    {

        System.setProperty("webdriver.chrome.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\chromedriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en-GB");
        WebDriver driver= new ChromeDriver(options);

        GoogleSearchPageObject searchPageObj=new GoogleSearchPageObject(driver);
         driver.get("https://google.com");

        searchPageObj.setTextInSearchBox("abcd");
        searchPageObj.clickSerachButtn();

         driver.close();
    }


}
