import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.security.Key;

public class DesiredCapabilities_Demo {
    public static void main(String[] args) {


        DesiredCapabilities caps =new DesiredCapabilities ();
        caps.setCapability("ignoreProtectedModeSettings",true);
        System.setProperty("webdriver.ie.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\iedriver\\IEDriverServer.exe");//ie
        WebDriver driver =new InternetExplorerDriver(caps);


        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("automation step by step");
        driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys(Keys.RETURN);

    }




}
