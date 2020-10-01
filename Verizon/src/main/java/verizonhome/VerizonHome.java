package verizonhome;

import common.WebAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static verizonhome.VerizonWebElement.*;

public class VerizonHome extends WebAPI {

    @BeforeMethod
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "OS X", "catalina", "chrome", "85", "https://www.verizon.com");
    }

    @FindBy(css = webElementSupport)
    WebElement support;
    public void supportMethod(){
        support.click();
    }

    @FindBy(xpath = webElementHomeSupport)
    WebElement homeSupport;
    public void homeSupportMethod(){
        homeSupport.click();
    }

    public void validateImage() {
        boolean imagePresent = driver.findElement(By.xpath(webElementImag)).isDisplayed();
        System.out.println(imagePresent);
        boolean expected = true;
        Assert.assertEquals(imagePresent,expected);
    }
    @FindBy(xpath = webElementSelectAnotherDevice)
         WebElement selectAnotherDevice;
       public void selectAnotherDeviceMethod(){
           selectAnotherDevice.click();
       }
       @FindBy(xpath = webElementSearchBox)
        WebElement searchBox;
       public void searchBoxMethod(){
           searchBox.sendKeys("plan");
       }



}
