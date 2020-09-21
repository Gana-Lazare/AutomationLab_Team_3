package hiltonHotelTest;

import common.WebAPI;
import hiltonhotelOffers.HiltonHotelOffers;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HiltonHotelTest extends WebAPI {

    HiltonHotelOffers hiltonhotelOffers;

    @BeforeMethod // to use the driver to open the browser
    public void getInit1() {
        hiltonhotelOffers = PageFactory.initElements(driver, HiltonHotelOffers.class);
    }


    @Test
    public void opinionButtonCheckTest(){
        hiltonhotelOffers.OfferButtonCheck();
        hiltonhotelOffers.validateSearchText();
    }


}
