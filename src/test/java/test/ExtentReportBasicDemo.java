package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtentReportBasicDemo {
    private static WebDriver driver = null;


    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");


        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        // creates a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("google search test","this is test extent report");

        System.setProperty("webdriver.chrome.driver","D:\\automationProjects\\SeleinumJavaFramework\\driver\\chromedriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en-GB");
        driver= new ChromeDriver(options);


        test1.log(Status.INFO,"Starting test case");
        driver.get("https://google.com");
        test1.pass("navgated to google");


        driver.findElement(By.name("q")).sendKeys("automation step by step");
        test1.pass("sent the key");

        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        test1.pass("clciked");



        driver.close();
        driver.quit();
        test1.pass("closed browser");


        // calling flush writes everything to the log file
        extent.flush();
    }






}
