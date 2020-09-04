package foxnewsHome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class FoxNewsHome extends WebAPI {
    public String chromeDriver="webdriver.chrome.driver";
    public String chromeDriverPath="C:\\Users\\yeti\\IdeaProjects\\FirstProject\\LearnJava_WeekendAfternoon_Selenium_NY_Summer2020\\BrowserDriver\\windows\\chromedriver.exe";
    public String url="https://www.foxnews.com/";
    public static final String foxNewsUS = "//*[@id=\"wrapper\"]/footer/div[1]/div/nav[1]/h6/a";


    WebDriver driver;
    public void chrome () {
        System.setProperty(chromeDriver,chromeDriverPath);
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    public void checkFoxNewsUS(){
        driver.findElement(By.xpath(foxNewsUS)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }




}
