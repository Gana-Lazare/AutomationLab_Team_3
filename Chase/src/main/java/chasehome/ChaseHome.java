package chasehome;

import common.WebAPI;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChaseHome extends ChaseHomeWebElements {



    @FindBy(xpath = homeLending_Xpath)
    WebElement homeLending;


    public void homeLending() throws InterruptedException {
       Thread.sleep(4000);
        homeLending.click();

    }
    @FindBy(xpath = bay_Xpath)
    WebElement bay;
    public void bayButton() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        bay.click();
    }
    @FindBy(xpath = refinance_Xpath)
    WebElement refinance;
    public void refinance() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        refinance.click();
    }
    @FindBy(xpath = homeEquity_Xpath)
    WebElement homeEquity;
    public void homeEquity() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        homeEquity.click();
    }
    @FindBy(xpath = manageAccount_Xpath)
    WebElement manageAccount;
    public void manageAccount() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        manageAccount.click();
    }
    @FindBy(xpath = learn_Xpath)
    WebElement learn;
    public void learn() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        learn.click();
    }
    @FindBy(xpath = contactUs_Xpath)
    WebElement contactUs;
    public void contactUs() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        contactUs.click();
    }

    @FindBy(xpath = yourHomeJourneStartHere_Xpath)
    WebElement yourHomeJourneStartHere;
    public void yourHomeJourneStartHere() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        yourHomeJourneStartHere.click();
    }
    @FindBy(xpath = getStarted_Xpath)
    WebElement getStarted;
    public void getStarted() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        getStarted.click();
    }
    @FindBy(xpath = atmBrand_Xpath)
    WebElement atmBrand;
    public void atmBrand() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        atmBrand.click();
    }
    @FindBy(xpath = estimateYourRateAnd_Xpath)
    WebElement estimateYourRateAnd;
    public void estimateYourRateAnd() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        estimateYourRateAnd.click();
    }


    @FindBy(xpath = image_Xpath)
    WebElement image;
    public void image() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        image.click();
    }
    @FindBy(xpath = getPrequalified_Xpath)
    WebElement getPrequalified;
    public void getPrequalified() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        getPrequalified.click();
    }
    @FindBy(xpath = chaseHomeLending_Xpath)
    WebElement chaseHomeLending;
    public void chaseHomeLending() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        chaseHomeLending.click();
    }
//    @FindBy(xpath = bayingHome_Xpath)
//    WebElement bayingHome;
//    public void bayingHome() throws InterruptedException {
//        Thread.sleep(3000);
//        homeLending.click();
//        bayingHome.click();
//    }
    @FindBy(xpath = overview_Xpath)
    WebElement overview;
    public void overview() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        overview.click();
    }
    @FindBy(xpath = calculator_Xpath)
    WebElement calculator;
    public void calculator() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        calculator.click();
    }
    @FindBy(xpath = rate_Xpath)
    WebElement rate;
    public void rate() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        rate.click();
    }
    @FindBy(xpath = espanol_Xpath)
    WebElement espanol;
    public void espanol() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        espanol.click();
    }

    @FindBy(xpath = image1_Xpath)
    WebElement image1;
    public void image1() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        image1.click();
    }
    @FindBy(xpath = refinance1_Xpath)
    WebElement refinance1;
    public void refinance1() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        refinance1.click();
    }
    @FindBy(xpath = startRefinancingYour_Xpath)
    WebElement startRefinancingYour;
    public void startRefinancingYour() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        startRefinancingYour.click();
    }
    @FindBy(xpath = learnAboutRefinancing_Xpath)
    WebElement learnAboutRefinancing;
    public void learnAboutRefinancing() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        learnAboutRefinancing.click();
    }
    @FindBy(xpath = compareYourOption_Xpath)
    WebElement compareYourOption;
    public void compareYourOption() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        compareYourOption.click();
    }

    @FindBy(xpath = checkOutOurRenovationButton_Xpath)
    WebElement checkOutOurRenovationButton;
    public void checkOutOurRenovationButton() throws InterruptedException {
        Thread.sleep(3000);
        homeLending.click();
        checkOutOurRenovationButton.click();
    }
//    @FindBy(xpath = security_Xpath)
//    WebElement security;
//    public void endOfPage() throws InterruptedException {
//
//        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
//        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        Thread.sleep(3000);
//        homeLending.click();
//        security.click();
//
//    }
}
