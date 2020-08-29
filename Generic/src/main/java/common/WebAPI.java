package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class WebAPI {
//from here we will set the propreties, path ,WebDriver  and befor and after Method//

    //Create the WebDriver element here
    public static WebDriver driver = null;

    @Parameters({"url"})
    //Seting the propreties of the driver to run before everyMethod
    @BeforeMethod
    public static void setChromeDriver(@Optional("https://www.google.com") String url)throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/abestaieb/AutomationLab_Team_3/Generic/Browser/chrome/chromedriver1");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.ebay.com");

        Thread.sleep(2000);
    }

// @AfterMethod
//   public static void closeBrowser()throws InterruptedException{
//        Thread.sleep(2000);
//      driver.quit();
//   }
}
