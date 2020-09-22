package common;

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
    //Seting the propreties of the driver to run befor evryMethod
    @BeforeMethod
    public static void setChromeDriver(@Optional("https://www.google.com") String url){
        System.setProperty("webdriver.chrome.driver","..\\Generic\\Browser\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    @AfterMethod
    public static void closeBrowser(){
        driver.quit();
    }
}
