package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class WebAPI {
//from here we will set the propreties, path ,WebDriver  and befor and after Method//
    //Create the WebDriver element here
    public static WebDriver driver = null;

    @Parameters({"url"})
    //Seting the propreties of the driver to run before everyMethod
    @BeforeMethod
    public static void setChromeDriver(@Optional("https://www.google.com") String url){
        System.setProperty("webdriver.chrome.driver","/Users/ferhatbellache/Desktop/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterMethod
    public static void closeBrowser(){
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.quit();
    }
}
