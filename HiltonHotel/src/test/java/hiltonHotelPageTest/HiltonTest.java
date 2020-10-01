package hiltonHotelPageTest;


import common.WebAPI;


import hiltonhotelHome.HiltonHotelHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class HiltonTest extends WebAPI {


    @Test(priority = 1)
    public void locationButtonTest() throws InterruptedException {
        HiltonHotelHome home = PageFactory.initElements(driver, HiltonHotelHome.class);
        home.locationButtonMethod();
        Thread.sleep(5000);

    }
//    @Test
//    public void joinButtonTest() throws InterruptedException {
//        locationButtonTest();
//        HiltonHotelHome homeObj = PageFactory.initElements(driver, HiltonHotelHome.class);
//        homeObj.joinButtonMethod();
//        Thread.sleep(5000);
//
//    }

    @Test
    public void searchBoxTest() throws InterruptedException {
        locationButtonTest();
        HiltonHotelHome homeObj1 = PageFactory.initElements(driver, HiltonHotelHome.class);
        homeObj1.searchBoxMethod();
        Thread.sleep(5000);

    }



}


