package home;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {

    // Action Class: All the action methods and Validate methods

    // PageObject Design Pattern
    // Two way we can use @FindBY
    @FindBy(how = How.XPATH, using =WebElementcheckingLink) public WebElement checking;

   @FindBy(how = How.XPATH, using = webElementChasePremier) public WebElement premier;
//
    @FindBy(how = How.XPATH, using = WebElementCoupon) public WebElement coupon;
//
    @FindBy(how=How.XPATH,using=WebElementOpenSaving) public WebElement saving;
//
   @FindBy(how=How.XPATH,using=webElementInterestRates) public WebElement rates;
//
    @FindBy(how=How.XPATH,using=WebElementStarbucks) public WebElement Starbucks;
//
    @FindBy(how=How.XPATH,using=WebElementCreditCarts) public WebElement carts;
//
    @FindBy(how=How.XPATH,using=webElementOfferRewards) public WebElement offer;
//
    @FindBy(how=How.XPATH,using = WebElementCashBack) public WebElement cash;
//
    @FindBy(how=How.XPATH,using = WebElementCreditCart) public WebElement Credit;
//
    @FindBy(how=How.XPATH,using = WebElementFreeCreditScore) public WebElement Score;
//
    @FindBy(how=How.XPATH,using=WebElementPaymentMortgage) public WebElement mortgage;
//
    @FindBy(how=How.XPATH,using = webElementLearningCenter) public WebElement Center;
//
    @FindBy(how=How.XPATH,using =WebElementMortgageRate) public WebElement MortgageRate;
//
   @FindBy(how=How.XPATH,using = WebElementMortgageCalculator) public WebElement calculator;
//
    @FindBy(how = How.XPATH,using = webElementApplyingMortgage) public WebElement applying;
//
    @FindBy(how = How.XPATH,using =  WebElementHomeEquity) public WebElement homeEquity;
//
    @FindBy(how = How.XPATH,using = WebElementHelocCalculator) public WebElement heloc;
//
    @FindBy(how = How.XPATH,using = WebElementForHeloc) public  WebElement forHeloc;
//
   @FindBy(how = How.XPATH,using = WebElementChaseAuto) public WebElement chaseAuto;
//
    @FindBy(how = How.XPATH,using = WebElementAutoLoan) public WebElement autoLoan;
//
//
    @FindBy(how = How.XPATH,using = WebElementRefinance) public WebElement refinance;
   @FindBy(how = How.XPATH,using = WebElementPaymentCalculator) public WebElement PaymentCalculator;
    @FindBy(how = How.XPATH,using = WebElementFinancialAdvisor) public WebElement financial;
   @FindBy(how = How.XPATH,using = WebElementInvestOnline) public WebElement online;
    @FindBy(how = How.XPATH,using = WebElementPrivateClients) public WebElement Clients;



    // Action Method
    public void checkingLink()throws InterruptedException{
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
        checking.click();
    }

    // Validate Method
//    public void validateSearchText(){
//        String actualResult=searchText.getText();
//        String expectedResult="\"Hand Sanitizer\"";
//        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
//    }
   public void chasePremier()throws InterruptedException{
       ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
       Thread.sleep(2000);
       premier.click();
}

    public void chaseCoupon() throws InterruptedException{
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
       coupon.click();
   }
   public void OpenSaving()throws InterruptedException{
       ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
       Thread.sleep(2000);
       saving.click();
   }
    public void interestRates()throws InterruptedException{
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
       rates.click();
    }
   public void StarbucksReward()throws InterruptedException{
       ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
       Thread.sleep(2000);
       Starbucks.click();
   }
    public void CreditCarts()throws InterruptedException{
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
       carts.click();
   }
   public void OfferRewards()throws InterruptedException{
       ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
       Thread.sleep(2000);
       offer.click();
   }
    public void CashBack()throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
        cash.click();
    }
   public void creditCartLink()throws InterruptedException{
       ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
       Thread.sleep(2000);
       Credit.click();
    }
    public void FreeCreditScore()throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
       Score.click();
   }
   public void paymentMortgage()throws InterruptedException{
       ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
       Thread.sleep(2000);
       mortgage.click();
    }
    public void LearningCenter()throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
        Center.click();
    }
   public void ClickMortgageRate()throws InterruptedException{
       ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
       Thread.sleep(2000);
      MortgageRate.click();
    }
    public void MortgageCalculator()throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
        calculator.click();
   }
   public void ApplyingMortgage()throws InterruptedException{
           ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
           Thread.sleep(2000);
       applying.click();
    }
    public void clickHomeEquity()throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
        homeEquity.click();
   }
    public void ClickHelocCalculator() throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        Thread.sleep(2000);
        heloc.click();
    }
   public void ClicForHeloc()throws InterruptedException{
       ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
       Thread.sleep(2000);
        forHeloc.click();
    }
   public void ClickChaseAuto() throws InterruptedException{
       ((JavascriptExecutor) driver).executeScript("scroll(0,1300)");
       Thread.sleep(2000);
        chaseAuto.click();
    }
   public void clickAutoLoan() throws InterruptedException{
       ((JavascriptExecutor) driver).executeScript("scroll(0,1300)");
       Thread.sleep(2000);
       autoLoan.click();
    }

//
    public void clickRefinance() throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1300)");
        Thread.sleep(2000);
        refinance.click();
   }
    public void clickPaymentCalculator()throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1300)");
        Thread.sleep(2000);
        PaymentCalculator.click();
  }
    public void clickFinancialAdvisor() throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1300)");
        Thread.sleep(2000);
       financial.click();
    }
   public void clickInvestOnline() throws InterruptedException{
       ((JavascriptExecutor) driver).executeScript("scroll(0,1300)");
       Thread.sleep(2000);
        online.click();
    }
    public void APrivateClients() throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("scroll(0,1300)");
        Thread.sleep(2000);
        Clients.click();
    }
    }








