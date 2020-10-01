package verizonTestHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import verizonhome.VerizonHome;

import java.io.IOException;

public class VerizonTest extends VerizonHome{
    static WebDriver driver;
    VerizonHome verizonHome;
    @BeforeMethod
    public void getInit() throws IOException { verizonHome = PageFactory.initElements(driver,VerizonHome.class);
    verizonHome.openBrowser();
    }


    @Test
    public void supportTest() throws InterruptedException {
        verizonHome.supportMethod();
        Thread.sleep(3000);
    }
    @Test
    public void homeSupportTest(){
        verizonHome.supportMethod();
       verizonHome.homeSupportMethod();
    }@Test
    public void validateImageTest(){
        verizonHome.validateImage();

    }
    @Test
    public void searchBoxTest(){
        verizonHome.searchBoxMethod();

    }
}
