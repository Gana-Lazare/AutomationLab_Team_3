package hiltonhotelHome;

import common.WebAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

import static hiltonhotelHome.HiltonHotelWebElements.*;


public class HiltonHotelHome extends WebAPI {
    @FindBy(xpath = metingAndEvent_xpath)
    WebElement metingAndEvent;

    public void metingAndEventMethod() throws InterruptedException {
        metingAndEvent.click();
        Thread.sleep(3000);
    }

    @FindBy(css = ourBrand_css)
    WebElement ourBrand1;

    public void ourBrand() throws InterruptedException {
        ourBrand1.click();
        Thread.sleep(3000);
    }

    public void takeScreenShot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file, new File("screenShots.png"));
    }

    public void mouseHoverByXpath() {
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

    public void mouseHoverByXpath1() {
        try {
            WebElement element = driver.findElement(By.cssSelector(ourBrand_css));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(ourBrand_css));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }

//    }// Action Method
//    public void searchBoxCheck(String searchItem) {
//        searchBox.sendKeys(searchItem);
//       // searchButton.click();
//    }
//    // Validate Method
//    public void validateSearchText(String expectedResult) {
//        String actualResult = searchText.getText();
//        // String expectedResult="\"Hand Sanitizer\"";
//        Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
//
//    }
    }

    @FindBy(xpath = scrollDown)
    WebElement scrollDown1;

    public void scrollDownMethod() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        scrollDown1.click();
    }

    public void mouseHoverFindAHotelMethod() {
        try {
            WebElement element = driver.findElement(By.xpath(mouseHoverFindAHotel));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.xpath(mouseHoverFindAHotel));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }

    public void OurBrandTab() throws InterruptedException {
        Actions myAction = new Actions(driver);
        Thread.sleep(2000);
        myAction.moveToElement(driver.findElement(By.linkText("Our Brands"))).build().perform();
        driver.findElement(By.linkText("Waldorf Astoria")).click();

    }


//    public void OurBrandTab() throws InterruptedException {
//        Actions myAction = new Actions(driver);
//        Thread.sleep(2000);
//
//
//        try {
//            myAction.moveToElement(driver.findElement(By.linkText("Our Brands"))).build().perform();
//            Thread.sleep(4000);
//            driver.findElement(By.linkText("Waldorf Astoria")).click();
//
//
//        }catch (Exception e){
//            System.out.println("No such element found due to the wrong locator");
//        }
//
//        finally {
//            System.out.println("the test has been executed with no errors with the locators ");
//        }

   // }




}