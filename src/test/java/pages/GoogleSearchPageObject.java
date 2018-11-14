package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPageObject {


    public GoogleSearchPageObject( WebDriver  driver){
        this.driver=driver;
    }




      static   WebDriver  driver =null;




    By textbox_search=By.id("lst-ib");
    By button_seacrh =By.xpath("//input[@value='Google Search']");


      public void setTextInSearchBox(String text)
      {
          driver.findElement(textbox_search).sendKeys(text);

      }


      public void clickSerachButtn()
      {
          driver.findElement(button_seacrh).sendKeys(Keys.RETURN);
      }


}
