package ebayCollectiblesTest;

import common.WebAPI;
import ebayCollectiblesArt.EbayCollectibles;
import ebayElectronics.EbayElectronics;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayCollectiblesTest extends WebAPI {

        EbayCollectibles ebayCollectibles;

        @BeforeMethod // to use the driver to open the browser
        public void getInit1() {
            ebayCollectibles = PageFactory.initElements(driver, EbayCollectibles.class);
            // registrationPage = PageFactory.initElements(driver,SignUpPage.class);
        }
        @Test
        public void testCollectiblesButtonCheck() {
            ebayCollectibles.collectiblesButtonCheck();
            //homePage.validateSearchText(); assertpart
        }
}
