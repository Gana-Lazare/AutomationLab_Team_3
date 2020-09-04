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
    public static final String foxNewsWorld= "//*[@id=\"wrapper\"]/footer/div[1]/div/nav[2]/h6/a";
    public static final String foxNewsScience="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[8]/h6/a";
    public static final String foxNewsPolitics="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[4]/h6/a";
    public static final String foxNewsEntertainment="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[5]/h6/a";
    public static final String foxNewsBusiness="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[6]/h6/a";
    public static final String foxNewsLifestyle="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[7]/h6/a";
    public static final String foxNewsTech="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[9]/h6/a";
    public static final String foxNewsHealth="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[10]/h6/a";
    public static final String foxNewsTV="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[11]/h6/a";
    public static final String foxNewsCareers="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[12]/ul/li[2]/a";
    public static final String foxNewsCareerSearchBox="//*[@id=\"keywordSearch\"]";
    public static final String accounting="Accounting";
    public static final String go="//*[@id=\"filterButton\"]";
    public static final String foxNewsOther="//*[@id=\"wrapper\"]/footer/div[1]/div/nav[13]/h6";
    public static final String foxNewsFacebookIcon="//*[@id=\"wrapper\"]/footer/div[2]/div[1]/ul/li[1]/a";
    public static final String foxNewsTwitterIcon="//*[@id=\"wrapper\"]/footer/div[2]/div[1]/ul/li[2]/a";
    public static final String foxNewsFlipBoardIcon="//*[@id=\"wrapper\"]/footer/div[2]/div[1]/ul/li[3]/a";
    public static final String foxNewsGoogleIcon="//*[@id=\"wrapper\"]/footer/div[2]/div[1]/ul/li[4]/a";
    public static final String foxNewsInstagramIcon="//*[@id=\"wrapper\"]/footer/div[2]/div[1]/ul/li[5]/a";


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
    public void checkFoxNewsWorld(){
        driver.findElement(By.xpath(foxNewsWorld)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsScience(){
        driver.findElement(By.xpath(foxNewsScience)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsPolitics(){
        driver.findElement(By.xpath(foxNewsPolitics)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsEntertainment(){
        driver.findElement(By.xpath(foxNewsEntertainment)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsBusiness(){
        driver.findElement(By.xpath(foxNewsBusiness)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsLifestyle(){
        driver.findElement(By.xpath(foxNewsLifestyle)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsTech(){
        driver.findElement(By.xpath(foxNewsTech)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsHealth(){
        driver.findElement(By.xpath(foxNewsHealth)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsTV(){
        driver.findElement(By.xpath(foxNewsTV)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsCareers(){
        driver.findElement(By.xpath(foxNewsCareers)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(foxNewsCareerSearchBox)).sendKeys(accounting);
        driver.findElement(By.xpath(go));
        driver.close();

    }
    public void checkFoxNewsOther(){
        driver.findElement(By.xpath(foxNewsOther)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsFacebookIcon(){
        driver.findElement(By.xpath(foxNewsFacebookIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsTwitterIcon(){
        driver.findElement(By.xpath(foxNewsTwitterIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsFlipBoardIcon(){
        driver.findElement(By.xpath(foxNewsFlipBoardIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsGoogleIcon(){
        driver.findElement(By.xpath(foxNewsGoogleIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
    public void checkFoxNewsInstagramIcon(){
        driver.findElement(By.xpath(foxNewsInstagramIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }




}
