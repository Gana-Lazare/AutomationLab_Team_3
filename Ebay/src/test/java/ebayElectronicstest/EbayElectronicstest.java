package ebayElectronicstest;

import common.WebAPI;
import ebayElectronics.EbayElectronics;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayElectronicstest extends WebAPI {
EbayElectronics ebayElectronics;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        ebayElectronics = PageFactory.initElements(driver, EbayElectronics.class);
        // registrationPage = PageFactory.initElements(driver,SignUpPage.class);
    }
    @Test
    public void testSearchBoxCheck() {
        ebayElectronics.electronicsButtonCheck();
        //homePage.validateSearchText(); assertpart
    }
}
