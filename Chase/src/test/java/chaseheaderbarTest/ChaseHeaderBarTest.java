package chaseheaderbarTest;

import common.WebAPI;
import chaseheaderBar.ChaseHeaderBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class ChaseHeaderBarTest extends WebAPI {
    ChaseHeaderBar chaseHeaderBar;

    @BeforeMethod
    public void getInit() {
        chaseHeaderBar = PageFactory.initElements(driver,ChaseHeaderBar.class);
    }



}
