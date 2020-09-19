package JetBlueHometest;

import common.WebAPI;
import jetblueHome.JetBlueHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class JetBlueHometest extends WebAPI {
    JetBlueHome jetBlueHome;
    @BeforeMethod // to use the driver to open the browser
    public void getInit() throws InterruptedException {
        jetBlueHome = PageFactory.initElements(driver, JetBlueHome.class);

    }


}
