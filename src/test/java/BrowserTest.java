import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class BrowserTest {

    public static void main (String org [])
    {
        String projectpath=System.getProperty("user.dir");
        System.out.println("projectpath"+projectpath);


        //System.setProperty("webdriver.gecko.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\geckodriver\\geckodriver.exe");//firefox
       // WebDriver driver =new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\chromedriver\\chromedriver.exe");//chrome
        WebDriver driver=new ChromeDriver();

       // System.setProperty("webdriver.ie.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\iedriver\\IEDriverServer.exe");//ie
       //  WebDriver driver =new InternetExplorerDriver();
        driver.get("https://www.google.com");
//
//        WebElement textbox=((ChromeDriver) driver).findElementByXPath("//input[@id='lst-ib']");
//       textbox.sendKeys("selenium java framework");


     //  WebElement textbox=((ChromeDriver) driver).findElementByClassName("//input[@class='gsfi']");
      //  ((ChromeDriver) driver).findElementById("lst-ib").sendKeys("test");
       List<WebElement> listOfWebInput= ((ChromeDriver) driver).findElementsByXPath("//input");
       int count = listOfWebInput.size();
       System.out.println("count="+ count);
//
//        try {
//            Thread.sleep(300);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
       driver.close();
    }
}

