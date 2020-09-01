package ebayhometest;

import common.WebAPI;
import ebayhome.EbayHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ebayhometest extends WebAPI {
EbayHome ebayHome ;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        ebayHome = PageFactory.initElements(driver,EbayHome.class);
        // registrationPage = PageFactory.initElements(driver,SignUpPage.class);
    }
    @Test
    public void AdancedButtonClickTest() {
        ebayHome.advancedButtonClick();
        ebayHome.assertAdvancedButtonClick();
    }
}
