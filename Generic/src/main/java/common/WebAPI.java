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
    //Setting the properties of the driver to run before everyMethod
    @BeforeMethod
    public static void setChromeDriver(@Optional("https://www.chase.com/") String url){
        System.setProperty("webdriver.chrome.driver","/Users/khaledmaouche/IdeaProjects/AutomationLab_Team_3/Generic/Browser/chrome/chromedriver");
        driver = new ChromeDriver();

        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public static void closeBrowser(){
        driver.quit();
    }
}
