package chasePageTest;

import chasehome.ChaseHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import org.junit.Test;

public class ChaseTest extends WebAPI {
 ChaseHome chasehome;
//    @BeforeMethod
//    public void getInit(){ chasehome = PageFactory.initElements(driver,ChaseHome.class);
//    }

    @Test
    public void homeLendingTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
       // Thread.sleep(5000);
        home.homeLending();
    }
    @Test
    public void bayButtonTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.homeLending();
        home.bayButton();
        Thread.sleep(5000);
    }
    @Test
    public void refinanceTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.refinance();

    }
    @Test
    public void homeEquityTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.homeEquity();

    }
    @Test
    public void manageAccountTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.manageAccount();

    }
    @Test
    public void learnTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.learn();

    }
    @Test
    public void contactUsTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.contactUs();

    }
    @Test
    public void yourHomeJourneStartHereTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.yourHomeJourneStartHere();

    }
    @Test
    public void getStartedTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.getStarted();

    }
    @Test
    public void atmBrandTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.atmBrand();

    }
    @Test//(dependsOnMethods = { "homeLendingTest"})
    public void estimateYourRateAndTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.estimateYourRateAnd();

    }
    @Test
    public void imageTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.image();

    }
    @Test
    public void getPrequalifiedTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.getPrequalified();

    }
    @Test
    public void chaseHomeLendingTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.chaseHomeLending();

    }
//    @Test//(dependsOnMethods = { "homeLendingTest"})
//    public void bayingHomeTest() throws InterruptedException {
//        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
//        home.bayingHome();
//
//    }

    @Test
    public void overviewTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.overview();

    }
    @Test
    public void calculatorTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.calculator();

    }
    @Test
    public void rateTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.rate();

    }
    @Test//(dependsOnMethods = { "homeLendingTest"})
    public void espanolTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.espanol();

    }
    @Test
    public void image1Test() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.image1();

    }
    @Test
    public void refinance1Test() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.refinance1();

    }
    @Test
    public void startRefinancingYourTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.startRefinancingYour();

    }
    @Test//(dependsOnMethods = { "homeLendingTest"})
    public void learnAboutRefinancingTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.learnAboutRefinancing();

    }
    @Test
    public void compareYourOptionTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.compareYourOption();

    }
    @Test
    public void checkOutOurRenovationButtonTest() throws InterruptedException {
        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
        home.checkOutOurRenovationButton();

    }
//    @Test
//    public void endOfPageTest() throws InterruptedException {
//        ChaseHome home = PageFactory.initElements(driver,ChaseHome.class);
//        home.endOfPage();
//
//    }
}
