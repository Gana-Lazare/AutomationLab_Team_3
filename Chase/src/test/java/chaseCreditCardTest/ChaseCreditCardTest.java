package chaseCreditCardTest;

import chaseCreditCard.ChaseCreditCard;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChaseCreditCardTest extends WebAPI {

    ChaseCreditCard chaseCreditCard;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        chaseCreditCard = PageFactory.initElements(driver, ChaseCreditCard.class);
    }
    @Test(timeOut = 6000)
    public void testChaseCreditCreditButtonCheck() throws InterruptedException {
        chaseCreditCard.creditCardButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testDollsTeddyBearsButtonCheck(){
        chaseCreditCard.featuredCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testAllCreditCardsButtonCheck(){
        chaseCreditCard.allCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCashBackCreditCardsButtonCheck(){
        chaseCreditCard.cashBackCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testTravelCreditCardsButtonCheck(){
        chaseCreditCard.travelCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testBusinessCreditCardsButtonCheck(){
        chaseCreditCard.businessCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testRewardsCreditCardsButtonCheck(){
        chaseCreditCard.rewardsCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testAirLineCreditCardsButtonCheck(){
        chaseCreditCard.airLineCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testHotelCreditCardsButtonCheck(){
        chaseCreditCard.hotelCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testNoAnnualFeeCreditCardsButtonCheck(){
        chaseCreditCard.noAnnualFeeCreditCardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCreditJourneyButtonCheck(){
        chaseCreditCard.creditJourneyButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testOnlineBankingButtonCheck(){
        chaseCreditCard.onlineBankingButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCheckingAccountsButtonCheck(){
        chaseCreditCard.checkingAccountsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testSavingAccountsButtonCheck(){
        chaseCreditCard.savingAccountsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCertificatesOfDepositsButtonCheck(){
        chaseCreditCard.certificatesOfDepositsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testMortgagesButtonCheck(){
        chaseCreditCard.mortgagesButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testAutoLoansButtonCheck(){
        chaseCreditCard.autoLoansButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testPlanningAndInvestmentsButtonCheck(){
        chaseCreditCard.planningAndInvestmentsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testMobileBankingButtonCheck(){
        chaseCreditCard.mobileBankingButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCardMemberAgreementsButtonCheck(){
        chaseCreditCard.cardMemberAgreementsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCreditCardNewsButtonCheck(){
        chaseCreditCard.creditCardNewsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCreditCardGlossaryButtonCheck(){
        chaseCreditCard.creditCardGlossaryButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testUltimateRewardsButtonCheck(){
        chaseCreditCard.ultimateRewardsButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCreditCardEducationButtonCheck(){
        chaseCreditCard.creditCardEducationButtonCheck();
    }
    @Test (dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testScheduleAmeetingButtonCheck(){
        chaseCreditCard.scheduleAmeetingButtonCheck();
    }
}
