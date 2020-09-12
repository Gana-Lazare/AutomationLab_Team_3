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

import static foxnewsHome.FoxNewsHomeWebElement.*;

public class FoxNewsHome extends WebAPI {

    WebDriver driver;

    public void checkFoxNewsUS(){
        driver.findElement(By.xpath(foxNewsUS)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsWorld(){
        driver.findElement(By.xpath(foxNewsWorld)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsScience(){
        driver.findElement(By.xpath(foxNewsScience)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsPolitics(){
        driver.findElement(By.xpath(foxNewsPolitics)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsEntertainment(){
        driver.findElement(By.xpath(foxNewsEntertainment)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsBusiness(){
        driver.findElement(By.xpath(foxNewsBusiness)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsLifestyle(){
        driver.findElement(By.xpath(foxNewsLifestyle)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsTech(){
        driver.findElement(By.xpath(foxNewsTech)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsHealth(){
        driver.findElement(By.xpath(foxNewsHealth)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsTV(){
        driver.findElement(By.xpath(foxNewsTV)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsCareers(){
        driver.findElement(By.xpath(foxNewsCareers)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(foxNewsCareerSearchBox)).sendKeys(accounting);
        driver.findElement(By.xpath(go));


    }
    public void checkFoxNewsOther(){
        driver.findElement(By.xpath(foxNewsOther)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsFacebookIcon(){
        driver.findElement(By.xpath(foxNewsFacebookIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsTwitterIcon(){
        driver.findElement(By.xpath(foxNewsTwitterIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsFlipBoardIcon(){
        driver.findElement(By.xpath(foxNewsFlipBoardIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsGoogleIcon(){
        driver.findElement(By.xpath(foxNewsGoogleIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void checkFoxNewsInstagramIcon(){
        driver.findElement(By.xpath(foxNewsInstagramIcon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }




}
