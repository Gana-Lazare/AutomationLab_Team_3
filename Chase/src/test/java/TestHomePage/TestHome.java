package TestHomePage;

import chasehome.ChaseHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends WebAPI {

    @Test(priority = 1)
    public void chaseButtonTest () throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver, ChaseHome.class);
        home.clickButtonMethod();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void clickPrivateTest() throws InterruptedException {
        chaseButtonTest();
        ChaseHome homeObj = PageFactory.initElements(driver, ChaseHome.class);
        homeObj.privateClientMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void letConnectTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObj3 = PageFactory.initElements(driver, ChaseHome.class);
        homeObj3.letConnectMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void bankingTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObj2 = PageFactory.initElements(driver, ChaseHome.class);
        homeObj2.bankingMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void loginTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObj4 = PageFactory.initElements(driver, ChaseHome.class);
        homeObj4.loginMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void homeTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObj5 = PageFactory.initElements(driver, ChaseHome.class);
        homeObj5.homeMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void creditCardLendingTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObj6 = PageFactory.initElements(driver, ChaseHome.class);
        homeObj6.creditCardLendingMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 4)
    public void investingWithJPTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObj7 = PageFactory.initElements(driver, ChaseHome.class);
        homeObj7.investingWithJPtMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void preparingForRetirementTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObj8 = PageFactory.initElements(driver, ChaseHome.class);
        homeObj8.preparingForRetirementMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void planningForEducationTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObj9 = PageFactory.initElements(driver, ChaseHome.class);
        homeObj9.planningForEducationMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void getInspiredTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObja = PageFactory.initElements(driver, ChaseHome.class);
        homeObja.getInspiredMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void planningBenefitsTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObjb = PageFactory.initElements(driver, ChaseHome.class);
        homeObjb.planningBenefitstMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void ourThinkingTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObjc = PageFactory.initElements(driver, ChaseHome.class);
        homeObjc.ourThinkingMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void contactUsTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObjd = PageFactory.initElements(driver, ChaseHome.class);
        homeObjd.contactUsMethod();
        Thread.sleep(5000);

    }


    @Test(priority = 3)
    public void glimpsGoalsTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObjf = PageFactory.initElements(driver, ChaseHome.class);
        homeObjf.glimpsGoalsMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void retirementCalculatorTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObjh = PageFactory.initElements(driver, ChaseHome.class);
        homeObjh.retirementCalculatorMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void contactsUsTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObjm = PageFactory.initElements(driver, ChaseHome.class);
        homeObjm.contactsUsMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void findBranchTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObjn = PageFactory.initElements(driver, ChaseHome.class);
        homeObjn.findBranchMethod();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void clickHereTest() throws InterruptedException {
        chaseButtonTest();
        clickPrivateTest();
        ChaseHome homeObjk= PageFactory.initElements(driver, ChaseHome.class);
        homeObjk.clickHereMethod();
        Thread.sleep(5000);

    }












































}
