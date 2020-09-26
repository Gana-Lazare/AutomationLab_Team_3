package verizonhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static verizonhome.VerizonWebElements.*;

public class VerizonHome extends WebAPI {
    @BeforeMethod
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "OS X", "catalina", "chrome", "85", "https://www.verizon.com");
    }

    //    @FindBy(how = How.XPATH, using = webElementSearchText)
    //    public WebElement searchText;

    @FindBy(css = webElementStore)
    WebElement Store;

    public void storeMethod() {
        Store.click();
    }

    @FindBy(xpath = WebElementStoreNearMe)
    WebElement StoreNearMe;

    public void StoreNearMeMethod() {
        Store.click();
    }

    @FindBy(how = How.XPATH, using = WebElementSearchButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = WebElementSearchBox)
    WebElement searchBox;

    public void searchBox(String searchItem) {
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }

    public void verifyPageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Store";
        assertEquals(expectedTitle, actualTitle);
        //assertTrue(driver.getTitle().contains("Title of Page"));
    }

    public void verifyMapPageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "43202";
        assertEquals(expectedTitle, actualTitle);
    }

    @FindBy(xpath = WebElementTypeZipCode)
    WebElement TypeZipCode;

    public void enterZipCode(String String) {
        TypeZipCode.sendKeys();
    }

    @FindBy(css = WebElementVerizonButton)
    WebElement verizonButton;

    public void verizonButtonMethod() {
        verizonButton.click();

    }

    @FindBy(xpath = WebElementEndOfThePage)
    WebElement endOfThePage;

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        endOfThePage.click();
    }

    @FindBy(how = How.CSS, using = WebElementScreen)
    WebElement screen;

    public void screenMethod() {
        driver.findElement(By.cssSelector(WebElementScreen)).isDisplayed();
        boolean result = screen.isDisplayed();
        System.out.println("is the element displayed? " + result);

    }
    @FindBy(xpath = WebElementWhyVerizon)
    WebElement WhyVerizon;

    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }
        public void verifyPageTitleWhyVerizon() {
            String expectedTitle="Verizon Cloud - Mobile Phone Backup | Verizon Wireless";
            String actualTitle= driver.getTitle();
            Assert.assertEquals("Title does not match",actualTitle,expectedTitle);
        }
//    String expectedresult="https://locator.chase.com/?locale=en_US";
//    String actualresult=driver.getCurrentUrl();
//        Assert.assertEquals("not the right page",expectedresult,actualresult);

    }





