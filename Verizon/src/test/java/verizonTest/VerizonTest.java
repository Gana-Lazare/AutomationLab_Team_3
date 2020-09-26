package verizonTest;

import common.WebAPI;
//import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import verizonhome.VerizonHome;
import org.testng.annotations.Test;
public class VerizonTest extends WebAPI {

    VerizonHome verizonHome;
    @BeforeMethod
    public void getInit(){ verizonHome = PageFactory.initElements(driver,VerizonHome.class);
    }

    @Test
    public void StoreTest() throws InterruptedException {
      verizonHome.storeMethod();
      sleepFor(3);
    }
    @Test
    public void StoreNearMeTest(){
        verizonHome.storeMethod();
        verizonHome.StoreNearMeMethod();
    }@Test
    public void searchBoxTest(){
        verizonHome.searchBox("43202");

    }@Test
    public void  verifyPageTitleTest(){
        verizonHome.verifyPageTitle();
    }
    @Test
    public void verifyMapPageTitleTest(){
        verizonHome.verifyMapPageTitle();
    }
    @Test
    public void enterZipCodeTest(){
        verizonHome.enterZipCode("43202");
    }
    @Test
    public void  verizonButtonMethodTest(){
        verizonHome.verizonButtonMethod();
    }
    @Test
    public void scrollDownTest() throws InterruptedException {
        verizonHome.scrollDown();
    }
    @Test
    public void screenMethodTest(){
        verizonHome.screenMethod();
    }
    @Test
    public void mouseHoverByXpathTest(){
        verizonHome.mouseHoverByXpath("Why verizon");
    }
    @Test
    public void verifyPageTitleWhyVerizonTest(){
        verizonHome.verifyPageTitleWhyVerizon();

    }



}
