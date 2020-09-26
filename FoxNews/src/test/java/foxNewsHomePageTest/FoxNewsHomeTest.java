package foxNewsHomePageTest;

import common.WebAPI;
import foxnewsHome.FoxNewsHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

//import jdk.jfr.Enabled;
public class FoxNewsHomeTest extends WebAPI {
    FoxNewsHome foxnewsHome;

    @BeforeMethod
    public void getInit() {
        foxnewsHome = PageFactory.initElements(driver, FoxNewsHome.class);
    }


    @Test
    public void entertainmentTest() throws InterruptedException {
        foxnewsHome.entertainment();
        //Thread.sleep(2000);
    }

    @Test
    public void searchBoxTest() throws InterruptedException {
        foxnewsHome.searchButton1Method();
        //Thread.sleep(2000);
    }

    @Test
    public void E2020ElectionButtonTest() throws InterruptedException {
        entertainmentTest();
        foxnewsHome.E2020ElectionButton();
        Thread.sleep(5000);
    }

    @Test
    public void coronavirusButtonTest() throws InterruptedException {
        entertainmentTest();
        foxnewsHome.coronaVirusButton();
        Thread.sleep(2000);

    }

    //        @Test
//    public void searchBoxMethodTest() throws InterruptedException {
//        entertainmentTest();
//        Thread.sleep(5000);
//        FoxNewsHome homeObj1 = PageFactory.initElements(driver, FoxNewsHome.class);
//        homeObj1.searchBoxMethod();
//
//    }
//    @Test
//    public void testSearchBoxCheckGetItemsListFromExcel() throws Exception {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        homePage.searchBoxCheckGetItemsListFromExcel();
//    }
    @Test
    public void endOfPageTest() throws InterruptedException {
        foxnewsHome.entertainment();
        foxnewsHome.endOfPage();


    }

    @Test
    public void endOfPageHelpTest() throws InterruptedException {
        foxnewsHome.tvButton();

    }

    @Test
    public void showMoreTest() throws InterruptedException {
        entertainmentTest();
//        FoxNewsHome home = PageFactory.initElements(driver, FoxNewsHome.class);
//        home.showMore();
        foxnewsHome.showMore();
    }

    @Test
    public void whatYouNeedToKnowTest() throws InterruptedException {
        entertainmentTest();
        coronavirusButtonTest();
//        FoxNewsHome homeObj = PageFactory.initElements(driver, FoxNewsHome.class);
//        homeObj.whatYouNeedToKnowMethod();
        foxnewsHome.whatYouNeedToKnowMethod();
        Thread.sleep(5000);

    }

    @Test
    public void readExcelTest() throws IOException, InterruptedException {
//        FoxNewsHome homeObj1 = PageFactory.initElements(driver, FoxNewsHome.class);
//        homeObj1.readExcelFile();
        foxnewsHome.readExcelFile();
        Thread.sleep(2000);
    }

    @Test
    public static void takeScreenShotMethod() throws IOException, InterruptedException {
        FoxNewsHome homeObj2 = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj2.screenShotOfPage();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void stopCaptioningPolicyTest() throws InterruptedException {
        entertainmentTest();

        FoxNewsHome home = PageFactory.initElements(driver, FoxNewsHome.class);
        home.stopCaptioningPolicy();
    }

    @Test(priority = 2)
    public static void tvButtonTest() throws InterruptedException {
        FoxNewsHome home = PageFactory.initElements(driver, FoxNewsHome.class);
        home.tvButton();
        Thread.sleep(3000);
    }

    @Test
    public void watchLiveTest() throws InterruptedException {
        tvButtonTest();
        FoxNewsHome home = PageFactory.initElements(driver, FoxNewsHome.class);
        home.watchLive();
        Thread.sleep(3000);
    }

    @Test(enabled = false)
    public void podcastMethodTest() throws InterruptedException {
        tvButtonTest();
        FoxNewsHome homeObj = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj.podcastMethod();
        Thread.sleep(3000);
    }

    @Test
    public void captureScreenshotTest() throws Exception {
        tvButtonTest();
        FoxNewsHome homeObj1 = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj1.captureScreenshot();
    }

    @Test
    public void getItemsListFromExcelTest() throws Exception {
        foxnewsHome.searchButton1Method();
        //Thread.sleep(3000);
        foxnewsHome.searchBoxCheckGetItemsListFromExcel();

//        FoxNewsHome homeObj1 =PageFactory.initElements(driver,FoxNewsHome.class);
//        homeObj1.captureScreenshot();


    }

    @Test
    public void picture1methodTest() throws InterruptedException {
        foxnewsHome.entertainment();
        foxnewsHome.picture1method();
    }

    @Test
    public void foxNationMethodTest() throws InterruptedException {
        foxnewsHome.foxNationMethod();
    }

    @Test
    public void crimeMethodTest() throws InterruptedException {
        foxnewsHome.entertainment();
        foxnewsHome.crimeMethod();
    }

    @Test
    public void getItemValueTest() {

    }

    @Test
    public void mouseHoverByXpathTest() {


    }
}