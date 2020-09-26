package aetnaHomePageTest;

import aetnahome.AetnaHome;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class AetnaHomePageTest extends WebAPI {
AetnaHome aetnaHome;



    @Test
    public void searchBoxTest() throws InterruptedException {
        AetnaHome homeObj1 = PageFactory.initElements(driver, AetnaHome.class);
        homeObj1.searchBox();
        Thread.sleep(3000);
    }
    @Test
    public static void checkForPartnersTest() throws InterruptedException {
        dropDownTest();
        AetnaHome homeObj2 = PageFactory.initElements(driver, AetnaHome.class);
        homeObj2.checkForPartners();
    }
    @Test
    public static void dropDownTest() throws InterruptedException {
        AetnaHome homeObj = PageFactory.initElements(driver,AetnaHome.class);
        homeObj.dropDown();
        Thread.sleep(3000);
    }
    @Test
    public void forAgentsBrokersTest() throws InterruptedException {
      dropDownTest();
        WebElement forAgentsBrokers;
        AetnaHome home = PageFactory.initElements(driver,AetnaHome.class);
        home.forAgentsBrokers();
        Thread.sleep(3000);

    }
    @Test
      public void forPartnersTest() throws InterruptedException {
        dropDownTest();
        WebElement forPartners;
        AetnaHome home = PageFactory.initElements(driver,AetnaHome.class);
        home.forPartners();
        Thread.sleep(3000);
    }

    @Test
    public void loginButtonTest() throws InterruptedException {
        AetnaHome home =PageFactory.initElements(driver,AetnaHome.class);
        home.loginButton();
        Thread.sleep(3000);
    }
    @Test
    public void AetnaExploreSiteTest() throws InterruptedException {
        AetnaHome home =PageFactory.initElements(driver,AetnaHome.class);
        home.aetnaExploreSiteMethod();
        Thread.sleep(8000);
    }
//    @Test
//    public void searchBox1Test() throws InterruptedException {
//        searchBoxTest();
//        AetnaHome home =PageFactory.initElements(driver,AetnaHome.class);
//        home.searchBox1();
//        Thread.sleep(5000);
//    }
    @Test
    public void siteMapTest() throws InterruptedException {
        AetnaHome home =PageFactory.initElements(driver,AetnaHome.class);
        home.siteMap();
        Thread.sleep(3000);
    }
    @Test
    public void screenShotWindowsTest() throws IOException {
        AetnaHome home4 =PageFactory.initElements(driver,AetnaHome.class);
        home4.screenShotWindows();
    }
    @Test
    public void solutionTest() throws InterruptedException {

        forAgentsBrokersTest();
        AetnaHome home5 =PageFactory.initElements(driver,AetnaHome.class);
        home5.solution();
        Thread.sleep(3000);
    }
    @Test
    public void getCoronVirusTest() throws InterruptedException {
        forAgentsBrokersTest();
        AetnaHome home5 =PageFactory.initElements(driver,AetnaHome.class);
        home5.getCoronVirusMethod();

    }@Test
    public void aetnaComTest(){
      aetnaHome.aetnaCom();
    }
    @Test
    public void forProviderTest(){
        aetnaHome.forProviderMethod();
    }
    @Test
    public void forEmployerTest(){
        aetnaHome.forEmployerMethod();
    }
    @Test
    public void forAgentTest(){
        aetnaHome.forAgentMethod();
    }


}
