package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebAPI {
//from here we will set the propreties, path ,WebDriver  and befor and after Method//

    //Create the WebDriver element here
    public static WebDriver driver = null;

    @Parameters({"url"})
    //Seting the propreties of the driver to run befor evryMethod
    @BeforeSuite
    public static void setChromeDriver(@Optional("https://www.google.com") String url){
        System.setProperty("webdriver.chrome.driver","//Users/elhacenarib/Desktop/Selenium_download/chromedriver");
        //Users/elhacenarib/Desktop/Selenium_download/chromedriver

        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    @AfterSuite
    public static void closeBrowser(){
        //driver.close();
        driver.quit();
    }
}
