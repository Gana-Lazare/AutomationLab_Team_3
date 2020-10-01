package foxNewsTest;

import common.WebAPI;
import foxnewsHome.FoxNewsHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class FoxNewsTest extends WebAPI {
//    FoxNewsHome foxnewsHome;
//    @BeforeMethod
//    public void getInit(){
//        foxnewsHome=PageFactory.initElements(driver,FoxNewsHome.class);
//    }

FoxNewsHome foxNewsHome;

    @Test(priority = 1)
    public void businessTest() throws InterruptedException {

        FoxNewsHome homeObj = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj.business();
        Thread.sleep(5000);
    }


    @Test(priority = 2)
    public void personalFinanceTest() throws InterruptedException {

        FoxNewsHome homeObj = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj.personalFinance();
        Thread.sleep(5000);
    }

    @Test
    public void takeScreenShotMethod() throws IOException, InterruptedException {
        FoxNewsHome homeObj2 = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj2.screenShotOfPage();
        Thread.sleep(2000);
    }


    @Test(enabled = false)
    public void morningWithMaria() throws InterruptedException {

        FoxNewsHome home = PageFactory.initElements(driver, FoxNewsHome.class);
        home.morningWithMaria();
    }

//    @Test
//    public void viewMore() throws InterruptedException {
//
//        FoxNewsHome home = PageFactory.initElements(driver, FoxNewsHome.class);
//        home.viewMore();
//    }

    @Test(enabled = false)
    public void soccer() throws InterruptedException {

        FoxNewsHome home = PageFactory.initElements(driver, FoxNewsHome.class);
        home.soccer();
    }

    @Test(priority = 3)
    public void loginTest() throws InterruptedException {
        businessTest();
        personalFinanceTest();
        FoxNewsHome homeObj4 = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj4.loginMethod();
        Thread.sleep(5000);

    }
//    @Test(priority = 4)
//    public void accountCreateTest() throws InterruptedException {
//        businessTest();
//        personalFinanceTest();
//        loginTest();
//        FoxNewsHome homeObj5 = PageFactory.initElements(driver, FoxNewsHome.class);
//        homeObj5.accountCreate();
//        Thread.sleep(5000);
//
//    }

    @Test
    public void forgotPasswordTest() throws InterruptedException {
        businessTest();
        personalFinanceTest();
        loginTest();
        FoxNewsHome homeObj5 = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj5.forgotPasswordMethode();
        Thread.sleep(5000);

    }

//driver.findElement(By.partialLinkText(“Goo”)).click();
//driver.findElement(By.partialLinkText(“abode”)).click();
//
//
//
//    WebElement mySelectedElement = driver.findElement(By.id("select"));
//    Select dropdown= new Select(mySelectedElement);
//dropdown.selectByVisibleText("Apple");
//
//
//
//    File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(shot, new File("D:\\ shot1.jpg"));

    @Test(priority = 3)
    public void covidSafetyTest() throws InterruptedException {
        businessTest();
        personalFinanceTest();
        FoxNewsHome homeObj4 = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj4.loginMethod();
        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void watchTvTest() throws InterruptedException {
        businessTest();
        FoxNewsHome homeObj3 = PageFactory.initElements(driver, FoxNewsHome.class);
        homeObj3.watchTvMethod();
        Thread.sleep(2000);
    }
    @Test
    public void electionButtonTest() throws InterruptedException {
        foxNewsHome.electionButtonMethod();
    }
    @Test
    public void economyTest(){
        foxNewsHome.economyMethod();
    }
//    @Test
//    public void captureScreenshotTest() throws InterruptedException {
//        tvButtonTest();
//        FoxNewsHome homeObj1 =PageFactory.initElements(driver,FoxNewsHome.class);
//        homeObj1.captureScreenshot();
//    }

//
//    @Test(enabled = false)
//    public void readExcelTest() throws IOException, InterruptedException {
//        FoxNewsHome homeObj1 = PageFactory.initElements(driver, FoxNewsHome.class);
//        homeObj1.readExcelFile();
//        Thread.sleep(2000);
//    }




//    @Test(enabled = false)
//    public void coronavirusButtonTest() throws InterruptedException {
//        entertainmentTest();
//        FoxNewsHome homeObj1 = PageFactory.initElements(driver, FoxNewsHome.class);
//        homeObj1.coronavirusButton();
//        Thread.sleep(2000);

    }
//    @Test
//    public  void getItemsListFromExcelTest() throws Exception {
//        foxnewsHome.searchButton1Method();
//        //Thread.sleep(3000);
//        foxnewsHome.searchBoxCheckGetItemsListFromExcel();
//
////        FoxNewsHome homeObj1 =PageFactory.initElements(driver,FoxNewsHome.class);
////        homeObj1.captureScreenshot();




















