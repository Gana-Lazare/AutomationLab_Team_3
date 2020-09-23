package testhome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends WebAPI {
    HomePage homePage;
   // RegistrationPage registrationPage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        //registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }
    @Test
    public void testCheckingLink()throws InterruptedException {
        homePage.checkingLink();
    }
   @Test
  public void testChasePremier()throws InterruptedException{
       homePage.chasePremier();
    }
    @Test
    public void testChaseCoupon() throws InterruptedException{
       homePage.chaseCoupon();
  }
   @Test
  public void testOpenSaving()throws InterruptedException{
       homePage.OpenSaving();
   }
   @Test
   public void testInterestRates()throws InterruptedException{
        homePage.interestRates();
    }
   @Test
   public void testStarbucksReward()throws InterruptedException{
       homePage.StarbucksReward();
  }
   @Test
   public void testCreditCarts()throws InterruptedException{
        homePage.CreditCarts();
   }
    @Test
    public void testOfferRewards()throws InterruptedException{
        homePage. OfferRewards();
   }
   @Test
   public void CashBack()throws InterruptedException{
        homePage.CashBack();
   }
   @Test
   public void testCreditCartLink()throws InterruptedException{
       homePage.creditCartLink();
   }
   @Test
   public void testFreeCreditScore()throws InterruptedException{
        homePage.FreeCreditScore();
    }
    @Test
    public void testpaymentMortgage()throws InterruptedException{
       homePage.paymentMortgage();
    }
   @Test
   public void testLearningCenter()throws InterruptedException{
      homePage. LearningCenter();
    }
    @Test
    public void testClickMortgageRate()throws InterruptedException{
        homePage.ClickMortgageRate();
   }
    @Test
    public void testMortgageCalculator()throws InterruptedException{
       homePage.MortgageCalculator();
   }
    @Test
    public void testApplyingMortgage()throws InterruptedException{
      homePage.ApplyingMortgage();
   }
    @Test
    public void testClickHomeEquity()throws InterruptedException{
        homePage.clickHomeEquity();
   }
    @Test
    public void testClickHelocCalculator() throws InterruptedException{
        homePage.ClickHelocCalculator();
   }
    @Test
    public void testClicForHeloc()throws InterruptedException{
       homePage.ClicForHeloc();
    }
   @Test
   public void testClickChaseAuto() throws InterruptedException{
        homePage.ClickChaseAuto();
    }
   @Test
   public void clickAutoLoan() throws InterruptedException{
      homePage.clickAutoLoan();
    }
    @Test
public void clickRefinance() throws InterruptedException{
        homePage.clickRefinance();
    }
@Test
public void testclickPaymentCalculator()throws InterruptedException{
        homePage.clickPaymentCalculator();
}
@Test
public void testClickFinancialAdvisor() throws InterruptedException{
   homePage.clickFinancialAdvisor();
}
@Test
public void testClickInvestOnline() throws InterruptedException{
        homePage.clickInvestOnline();
}
@Test
public void testAPrivateClients() throws InterruptedException{
        homePage.APrivateClients();
}
    }
