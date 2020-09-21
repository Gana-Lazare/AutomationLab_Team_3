package hiltonHotelPageTest;

import common.WebAPI;
import hiltonhotelHome.HiltonHotelHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HiltonHotelTest extends WebAPI {
    HiltonHotelHome hiltonHomeHotel;

    @BeforeMethod
    public void getInit() {
        hiltonHomeHotel = PageFactory.initElements(driver, HiltonHotelHome.class);
    }


    @Test
    public void metingAndEventTest() throws InterruptedException {
        hiltonHomeHotel.metingAndEventMethod();
    }
    @Test
    public void ourBrandTest() throws InterruptedException {
        hiltonHomeHotel.metingAndEventMethod();
        hiltonHomeHotel.OurBrandTab();
    }
    @Test(enabled = false)
    public void takeScreenShotTest() throws IOException, InterruptedException {
        Thread.sleep(2000);
        hiltonHomeHotel.takeScreenShot();
    }
    @Test
    public void mouseHoverByXpathTest(){
        hiltonHomeHotel.mouseHoverByXpath();
    }
    @Test
    public void mouseHoverByXpath1Test() throws InterruptedException {
        hiltonHomeHotel.metingAndEventMethod();
        hiltonHomeHotel.mouseHoverByXpath1();
    }
    @Test
    public void mouseHoverFindAHotelTest() throws InterruptedException {
        hiltonHomeHotel.metingAndEventMethod();
        hiltonHomeHotel.mouseHoverFindAHotelMethod();
    }
}