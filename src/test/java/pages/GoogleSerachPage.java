package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSerachPage {


    private static WebElement element=null;

    public  static WebElement  testbox_serach(WebDriver driver)
    {

         element = driver.findElement(By.name("q"));

        return element;
    }


    public  static  WebElement button_search(WebDriver driver)
    {

        element=driver.findElement(By.name("btnk"));

        return element;
    }



}
