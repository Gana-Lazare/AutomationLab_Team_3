package common;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.List;

public class WebAPI {
//from here we will set the propreties, path ,WebDriver  and befor and after Method//

    //Create the WebDriver element here
    public static WebDriver driver = null;
    WebElement webElement;
    String elementresearch;
    String locator;

    @Parameters({"url"})
    //Seting the propreties of the driver to run befor evryMethod
    @BeforeMethod
    public static void setChromeDriver(@Optional("https://www.ebay.com") String url) {
        System.setProperty("webdriver.chrome.driver", "..\\Generic\\Browser\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    //Creating a common method to click on a WebElement
    //giving as a parameter the WebElement
    public void clickWebElement(WebElement webElement) {
        this.webElement = webElement;
        webElement.click();
    }

    public String getTextFrom(WebElement webElement){
        this.webElement=webElement;
        return webElement.getText();
    }
    //Creating a method that use a locator to click what ever is the type of this locator
    public void clickByLocator(String locator) {

    }

    //Creating a method to scroll into view Element
    public void scrollIntoViewElement(WebElement element) {
        this.webElement = element;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }

    //Method to switch window giving the url of the new Window
    //giving as string the url of tje page
    //we can
    public void switchWindow(String url) throws InterruptedException {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
        Thread.sleep(3000);
        for (String windowHandel : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandel);

        }
    }
    //Method to Mouse Hover giving the element and the subelement fo menu

    public void mouseHover(WebElement element, WebElement subElement) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
        action.click(subElement).perform();
    }

    //method to check the status of a radiobutton or a checkbox
    public void radioButton(WebElement radioButton) {
        this.webElement = radioButton;
         boolean isChecked;
        isChecked = radioButton.isSelected();
        System.out.println(isChecked);
    }

    //creating a method to send a keyssearch
    public void sendKey(WebElement searchBar, String elementresearch) throws NoSuchElementException {
        this.webElement = searchBar;
        this.elementresearch = elementresearch;
        searchBar.sendKeys(elementresearch);
        searchBar.submit();
    }

    @AfterMethod(alwaysRun = true)
    public static void closeBrowser() {
        driver.quit();
    }
}
