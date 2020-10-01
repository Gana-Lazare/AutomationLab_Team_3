package aetnaHomeTest;

import aetnahome.AetnaHome;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AetnaHomeTest extends WebAPI {

    @Test(priority = 1)
    public void exploreAetnaSitesTest () throws InterruptedException {
        AetnaHome home = PageFactory.initElements(driver, AetnaHome.class);
        home.exploreAetnaSites();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void aboutUsTest() throws InterruptedException {
        exploreAetnaSitesTest ();
        AetnaHome homeObj = PageFactory.initElements(driver, AetnaHome.class);
        homeObj.aboutUs();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void loginTest() throws InterruptedException {
        exploreAetnaSitesTest ();
        aboutUsTest();
        AetnaHome homeObj1= PageFactory.initElements(driver, AetnaHome.class);
        homeObj1.login();
        Thread.sleep(5000);

    }

//    @Test(priority = 4)
//    public void registerTest() throws InterruptedException {
//        exploreAetnaSitesTest ();
//        aboutUsTest();
//        loginTest();
//        AetnaHome homeObj1= PageFactory.initElements(driver, AetnaHome.class);
//        homeObj1.register();
//        Thread.sleep(5000);

//    }

//    @Test(priority = 4)
//    public void registerTest() throws InterruptedException {
//        exploreAetnaSitesTest ();
//        aboutUsTest();
//        loginTest();
//        AetnaHome homeObj1= PageFactory.initElements(driver, AetnaHome.class);
//        homeObj1.register();
//        Thread.sleep(5000);
//
//    }




















}
