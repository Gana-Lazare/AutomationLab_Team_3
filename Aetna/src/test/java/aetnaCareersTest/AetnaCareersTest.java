package aetnaCareersTest;

import aetnaHome.AetnaCareers;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AetnaCareersTest extends WebAPI {


    AetnaCareers aetnaHome;

    @BeforeMethod // to use the driver to open the browser
    public void getInit1() {
        aetnaHome = PageFactory.initElements(driver, AetnaCareers.class);
    }

    @Test(timeOut = 4000)
    public void testCollectiblesAndArtButtonCheck() {
        aetnaHome.careersButtonCheck();
        aetnaHome.validateCareersTextText();
    }
}
