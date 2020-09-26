package chaseCreditCardTest;

import chaseCreditCard.ChaseCreditCard;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class ChaseCreditCardTest extends WebAPI {

    ChaseCreditCard chaseCreditCard;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        chaseCreditCard = PageFactory.initElements(driver, ChaseCreditCard.class);
    }
//    @BeforeMethod
//    public void openBrowserForChase() throws IOException {
//        chaseCreditCard.openBrowser("https://www.chase.com/");
//    }

    @Test(timeOut = 6000)
    public void testChaseCreditCreditButtonCheck() throws InterruptedException {
        chaseCreditCard.creditCardButtonCheck();
        chaseCreditCard.validateSearchText();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testDollsTeddyBearsButtonCheck(){
        chaseCreditCard.featuredCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText1();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testAllCreditCardsButtonCheck(){
        chaseCreditCard.allCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText2();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCashBackCreditCardsButtonCheck(){
        chaseCreditCard.cashBackCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText3();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testTravelCreditCardsButtonCheck(){
        chaseCreditCard.travelCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText4();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testBusinessCreditCardsButtonCheck(){
        chaseCreditCard.businessCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText5();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testRewardsCreditCardsButtonCheck(){
        chaseCreditCard.rewardsCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText6();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testAirLineCreditCardsButtonCheck(){
        chaseCreditCard.airLineCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText7();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testHotelCreditCardsButtonCheck(){
        chaseCreditCard.hotelCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText8();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testNoAnnualFeeCreditCardsButtonCheck(){
        chaseCreditCard.noAnnualFeeCreditCardsButtonCheck();
        chaseCreditCard.validateSearchText9();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCreditJourneyButtonCheck(){
        chaseCreditCard.creditJourneyButtonCheck();
        chaseCreditCard.validateSearchText10();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testOnlineBankingButtonCheck(){
        chaseCreditCard.onlineBankingButtonCheck();
        chaseCreditCard.validateSearchText11();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCheckingAccountsButtonCheck(){
        chaseCreditCard.checkingAccountsButtonCheck();
        chaseCreditCard.validateSearchText12();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testSavingAccountsButtonCheck(){
        chaseCreditCard.savingAccountsButtonCheck();
        chaseCreditCard.validateSearchText13();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCertificatesOfDepositsButtonCheck(){
        chaseCreditCard.certificatesOfDepositsButtonCheck();
        chaseCreditCard.validateSearchText14();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testMortgagesButtonCheck(){
        chaseCreditCard.mortgagesButtonCheck();
        chaseCreditCard.validateSearchText15();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testAutoLoansButtonCheck(){
        chaseCreditCard.autoLoansButtonCheck();
        chaseCreditCard.validateSearchText16();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testPlanningAndInvestmentsButtonCheck(){
        chaseCreditCard.planningAndInvestmentsButtonCheck();
        chaseCreditCard.validateSearchText17();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testMobileBankingButtonCheck(){
        chaseCreditCard.mobileBankingButtonCheck();
        chaseCreditCard.validateSearchText18();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCardMemberAgreementsButtonCheck(){
        chaseCreditCard.cardMemberAgreementsButtonCheck();
        chaseCreditCard.validateSearchText19();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCreditCardNewsButtonCheck(){
        chaseCreditCard.creditCardNewsButtonCheck();
        chaseCreditCard.validateSearchText20();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCreditCardGlossaryButtonCheck(){
        chaseCreditCard.creditCardGlossaryButtonCheck();
        chaseCreditCard.validateSearchText21();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testUltimateRewardsButtonCheck(){
        chaseCreditCard.ultimateRewardsButtonCheck();
        chaseCreditCard.validateSearchText22();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testCreditCardEducationButtonCheck(){
        chaseCreditCard.creditCardEducationButtonCheck();
        chaseCreditCard.validateSearchText23();
    }
    @Test //(dependsOnMethods = {"testChaseCreditCreditButtonCheck"}) //(enabled = false)
    public void testScheduleAmeetingButtonCheck(){
        chaseCreditCard.scheduleAmeetingButtonCheck();
        chaseCreditCard.validateSearchText24();
    }
}
