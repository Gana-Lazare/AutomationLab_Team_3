package libertyMutualHome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static libertyMutualHome.LibertyMutualWebElements.*;
import static libertyMutualHome.LibertyMutualWebElements.WebElementIndustries;

public class LibertyMutualHome  extends WebAPI {
    @BeforeMethod
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "OS X", "catalina", "chrome", "85", "https://www.libertymutual.com");
    }

    @FindBy(xpath = libertyMutualInsuranceWebElement)
    WebElement libertyMutualInsurance;

    public void libertyMutualInsuranceMethod() {
        libertyMutualInsurance.click();
    }

    @FindBy(css = businessInsuranceWebElement)
    WebElement businessInsurance;

    public void businessInsuranceMethod() throws InterruptedException {
        businessInsurance.click();
        sleepFor(2);
    }

    @FindBy(xpath = webElementSearchBox)
    WebElement searchBox;

    public void searchBoxMethod() {
        searchBox.submit();
    }

    // Action Method
    public void enterSearchKeyword(String searchItem) {
        searchBox.sendKeys(searchItem);
    }

    public void clickOnSearchButton() {
        //searchButton.click();
        searchBox.submit();

    }

    public void verifyPageTitle() {
        String expectedUrl = "https://business.libertymutualgroup.com/business-insurance";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public void verifyPolicyPageTitle() {

        String expectedUrl = "https://www.libertymutualgroup.com/search-results/?q=policy";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public void verifyBusinessInsurancePageTitle() {
        String expectedUrl = "https://business.libertymutualgroup.com/business-insurance";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("Text do not match",actualUrl, expectedUrl);
    }

    public void verifyCoveragePageTitle() {
        String expectedUrl = "https://business.libertymutualgroup.com/business-insurance/coverages/captives";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("text do not match",actualUrl, expectedUrl);
    }

    public void verifyIndustriesPageTitle() {
        String expectedUrl = "https://business.libertymutualgroup.com/business-insurance/industries/farm-insurance-coverage";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }


    public void verifyClaimPageTitle() throws InterruptedException {
        businessInsuranceMethod();
        String expectedUrl = "https://business.libertymutualgroup.com/business-insurance/claims-overview";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    public void verifyServicesPageTitle() {
        String expectedUrl = "https://business.libertymutualgroup.com/business-insurance/risk-control/disaster-preparedness";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public void verifyBusinessSizePageTitle() {
        String expectedUrl = "https://business.libertymutualgroup.com/business-insurance/business-size/midsize-to-large-business-insurance";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @FindBy(xpath = WebElementCoverage)
    WebElement coverage;

    public void coverageMethod() {
        coverage.click();
    }

    @FindBy(xpath = webElementSearchText)
    WebElement searchText;

    public void searchTextMethod() {
        searchText.sendKeys("policy");
    }

    @FindBy(xpath = WebElementAboutLibertyMutual)
    WebElement aboutLibertyMutual;

    public void aboutLibertyMutualMethod() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("About Liberty Mutual"))).build().perform();
        driver.findElement(By.linkText("International")).click();


    }

    @FindBy(xpath = WebElementIndustries)
    WebElement industries;

    public void industriesMethod() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Industries"))).build().perform();
        driver.findElement(By.linkText("Food & Beverage Manufacturing")).click();
    }

    @FindBy(xpath = WebElementClaims)
    WebElement claim;

    public void claimsMethod() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Claims"))).build().perform();
        driver.findElement(By.linkText("Policyholder Toolkit")).click();
    }

    @FindBy(xpath = WebElementServices)
    WebElement services;

    public void servicesMethod() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Services"))).build().perform();
        driver.findElement(By.linkText("Severe Weather Resources")).click();

    }

    @FindBy(xpath = WebElementBusinessSize)
    WebElement businessSize;

    public void businessSizeMethod() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.linkText("Business Size"))).build().perform();
        driver.findElement(By.linkText("Surety")).click();
    }

//        public void OurBrandTab() throws InterruptedException {
//        Actions myAction = new Actions(driver);
//        Thread.sleep(2000);
//        myAction.moveToElement(driver.findElement(By.linkText(""))).build().perform();
//        driver.findElement(By.linkText("Waldorf Astoria")).click();
//
//    }



    public void validateImage() {
        boolean imagePresent = driver.findElement(By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_75df0e51_6e52_44f6_b0de_f41fd1dc27a0_imgCallout\"]")).isDisplayed();
        System.out.println(imagePresent);
        boolean expected = true;
        Assert.assertEquals(imagePresent,expected);
    }



    public void validateImageVisible() {
        boolean imagePresent = driver.findElement(By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_9d2ce5a0_0feb_4c8b_9cec_b999503cbafe_imgCallout\"]")).isDisplayed();
        System.out.println(imagePresent);
        boolean expected = true;
        Assert.assertEquals(imagePresent,expected);
    }

}


